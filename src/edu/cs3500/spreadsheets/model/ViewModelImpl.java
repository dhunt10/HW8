package edu.cs3500.spreadsheets.model;

import java.util.Map;

public class ViewModelImpl implements ViewModel {

  public ViewModelImpl() {

  }

  @Override
  public Map<Coord, BasicCell> getRawSpreadsheet() {
    return null;
  }

  @Override
  public String getCellAtRaw(int i, int i1) throws IllegalArgumentException {
    return null;
  }

  @Override
  public String getCellAtEvaluated(int i, int i1) throws IllegalArgumentException {
    return null;
  }
}
