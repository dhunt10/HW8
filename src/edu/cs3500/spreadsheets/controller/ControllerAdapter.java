package edu.cs3500.spreadsheets.controller;

import edu.cs3500.spreadsheets.model.Spreadsheet;
import edu.cs3500.spreadsheets.view.CompositeViewButtonActions;
import edu.cs3500.spreadsheets.view.CompositeViewMouseActions;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class ControllerAdapter implements SpreadsheetController,
    CompositeViewMouseActions, CompositeViewButtonActions {

  @Override
  public void updateProgram(String coordinate, String inString, Spreadsheet s) {

  }

  @Override
  public void setX(int x) {

  }

  @Override
  public void setY(int y) {

  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void mouseClicked(MouseEvent e) {

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
}
