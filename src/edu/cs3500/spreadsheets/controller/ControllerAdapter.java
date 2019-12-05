package edu.cs3500.spreadsheets.controller;

import edu.cs3500.spreadsheets.model.Coord;
import edu.cs3500.spreadsheets.provider.model.Worksheet;
import edu.cs3500.spreadsheets.provider.view.EditableViewInterface;
import edu.cs3500.spreadsheets.view.CompositeViewButtonActions;
import edu.cs3500.spreadsheets.view.CompositeViewMouseActions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ControllerAdapter implements
    CompositeViewMouseActions, CompositeViewButtonActions {

  private Worksheet model;
  private EditableViewInterface evi;
  //private IView adapter;

  public ControllerAdapter(Worksheet model, EditableViewInterface evi){
    this.evi = evi;
    this.model = model;
    evi.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        confirmActionPerformed(e);
      }
    });

    /*evi.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        cancelActionPerformed(e);
      }
    });*/
    evi.setMouseListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void mouseClicked(MouseEvent e) {

    evi.setSelectedCell(new Coord(e.getX()/75 + 1, e.getY()/20 + 1));
    evi.setInput(model.getCellAtRaw(evi.getSelectedCell().col, evi.getSelectedCell().row));
  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }

  /**
   * Perform action when cancel button is clicked.
   * @param e button click for cancel button.
   */
  public void cancelActionPerformed(ActionEvent e) {
    evi.setInput(model.getCellAtRaw(evi.getSelectedCell().col, evi.getSelectedCell().row));
  }

  /**
   *
   * @param e
   */
  public void confirmActionPerformed(ActionEvent e) {
    model.changeCellContentsOrReplaceCell(evi.getSelectedCell(), evi.getInputString());
    evi.changeCell();
  }


}
