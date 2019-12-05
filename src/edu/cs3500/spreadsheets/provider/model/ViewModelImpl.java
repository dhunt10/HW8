package edu.cs3500.spreadsheets.provider.model;

import edu.cs3500.spreadsheets.controller.CompositeSpreadsheetController;
import edu.cs3500.spreadsheets.model.Cell;
import edu.cs3500.spreadsheets.model.Coord;
import edu.cs3500.spreadsheets.model.Spreadsheet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ViewModelImpl implements ViewModel {

  Worksheet basicWorksheet;
  public ViewModelImpl(Worksheet basicWorksheet) {
    this.basicWorksheet = basicWorksheet;
  }

  @Override
  public Map<Coord, BasicCell> getRawSpreadsheet() {
    return basicWorksheet.getRawSpreadsheet();
    //Map<Coord, BasicCell> adaptee = new HashMap<>();
    //adaptee = mapConverter(basicWorksheet.getCurrSpreadSheet());
    //return adaptee;
  }

  public static Map<Coord, BasicCell> mapConverter(Map<Coord, edu.cs3500.spreadsheets.model.Cell> map) {
    Map<Coord, BasicCell> adaptee = new HashMap<>();
    Iterator mapIterator = map.entrySet().iterator();
    while (mapIterator.hasNext()) {
      Map.Entry mapElement = (Map.Entry)mapIterator.next();
      BasicCell bc = new BasicCell((Cell) mapElement.getValue());
      adaptee.put((Coord) mapElement.getKey(), bc);
    }

    return adaptee;
  }

  public static Map<Coord, edu.cs3500.spreadsheets.model.Cell> reverseMapConverter(Map<Coord, BasicCell> map) {
    Map<Coord, edu.cs3500.spreadsheets.model.Cell> adaptee = new HashMap<>();
    Iterator mapIterator = map.entrySet().iterator();
    while (mapIterator.hasNext()) {
      Map.Entry mapElement = (Map.Entry)mapIterator.next();
      Cell bc = new edu.cs3500.spreadsheets.model.Cell((Coord) mapElement.getValue());
      adaptee.put((Coord) mapElement.getKey(), bc);
    }

    return adaptee;
  }

  @Override
  public String getCellAtRaw(int i, int i1) throws IllegalArgumentException {
    //Coord coord = new Coord(i, i1);
    //return basicWorksheet.getCellAt(coord).getRawString();
    return basicWorksheet.getCellAtRaw(i, i1);
  }

  @Override
  public String getCellAtEvaluated(int i, int i1) throws IllegalArgumentException {
    //Coord coord = new Coord(i, i1);
    //return basicWorksheet.getCellAt(coord).getEvaluatedData().toString();
    return basicWorksheet.getCellAtEvaluated(i, i1);
  }
}
