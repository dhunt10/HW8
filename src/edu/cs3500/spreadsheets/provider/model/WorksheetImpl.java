package edu.cs3500.spreadsheets.provider.model;

import edu.cs3500.spreadsheets.model.BasicWorksheet;
import edu.cs3500.spreadsheets.model.Coord;
import java.util.Map;

public class WorksheetImpl implements Worksheet {

  BasicWorksheet basicWorksheet;
  public WorksheetImpl(BasicWorksheet basicWorksheet) {
    this.basicWorksheet = basicWorksheet;
  }

  @Override
  public void evaluateAll() throws IllegalArgumentException {
    basicWorksheet.getEvaluatedCells();
  }

  @Override
  public String getCellAtRaw(int i, int i1) throws IllegalArgumentException {
    return basicWorksheet.getCurrSpreadSheet().get(new Coord(i, i1)).getRawString();
  }

  @Override
  public String getCellAtEvaluated(int i, int i1) throws IllegalArgumentException {
    return basicWorksheet.getCurrSpreadSheet().get(new Coord(i, i1)).getEvaluatedData().toString();
  }

  @Override
  public void changeCellContentsOrReplaceCell(Coord c, String contents) {
    basicWorksheet.getCellAt(c).setRawString(contents);
  }

  public BasicWorksheet getBasicWorksheet() {
    return basicWorksheet;
  }


  @Override
  public Map<Coord, BasicCell> getRawSpreadsheet() {
    return ViewModelImpl.mapConverter(basicWorksheet.getCurrSpreadSheet());
  }
}
