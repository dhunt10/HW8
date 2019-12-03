package edu.cs3500.spreadsheets.provider.view;

import edu.cs3500.spreadsheets.model.Cell;
import edu.cs3500.spreadsheets.model.Coord;
import edu.cs3500.spreadsheets.view.GridPanel;
import edu.cs3500.spreadsheets.view.IView;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Map;

public class ViewAdapter implements IView{

  EditableView adaptee;

  public ViewAdapter(EditableView adaptee){
    this.adaptee = adaptee;
  }

  @Override
  public void saveTo(String filePath) {
      throw new UnsupportedOperationException("Not a textual view!");
  }

  @Override
  public void display() {
      adaptee.makeView();
  }

  @Override
  public String buildTextView() {
    throw new UnsupportedOperationException("Not a textual view!");
  }

  @Override
  public GridPanel getCells() {
    throw new UnsupportedOperationException("Client uses Table not GridPanel!");
  }

  @Override
    public void newState(Map<Coord, Cell> newSheet) {

  }
}
