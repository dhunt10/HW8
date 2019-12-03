package edu.cs3500.spreadsheets.provider.model;

import edu.cs3500.spreadsheets.model.Formula;
import edu.cs3500.spreadsheets.model.SexpToFormula;
import edu.cs3500.spreadsheets.sexp.Parser;
import edu.cs3500.spreadsheets.sexp.Sexp;

public class BasicCell implements Cell {
  edu.cs3500.spreadsheets.model.Cell c;

  public BasicCell(edu.cs3500.spreadsheets.model.Cell c) {
    this.c = c;
  }

  @Override
  public String getRawInput() {
    return c.getRawString();
  }

  @Override
  public String getEvaluatedInput() throws IllegalArgumentException {
    return c.getEvaluatedData().toString();
  }

  @Override
  public void setEvaluatedValue(Sexp val) {

  }
}
