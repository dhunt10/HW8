package edu.cs3500.spreadsheets.controller;

import edu.cs3500.spreadsheets.model.Coord;
import edu.cs3500.spreadsheets.model.Spreadsheet;
import edu.cs3500.spreadsheets.provider.model.ViewModel;
import edu.cs3500.spreadsheets.provider.model.Worksheet;
import edu.cs3500.spreadsheets.provider.view.EditableViewInterface;
import edu.cs3500.spreadsheets.view.CompositeViewButtonActions;
import edu.cs3500.spreadsheets.view.CompositeViewMouseActions;
import edu.cs3500.spreadsheets.view.IView;
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
        //cancelActionPerformed(e);
        confirmActionPerformed(e);
      }
    });

    evi.setMouseListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println(evi.getSelectedCell());
    evi.setInput(model.getCellAtRaw(evi.getSelectedCell().row, evi.getSelectedCell().col));
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
    evi.clearInputString();
  }

  public void confirmActionPerformed(ActionEvent e) {
    model.changeCellContentsOrReplaceCell(evi.getSelectedCell(), evi.getInputString());
    evi.changeCell();
    System.out.println(evi.getInputString());
  }


}
