package edu.cs3500.spreadsheets.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.text.View;

public class ViewModel extends BasicWorksheet {
  public ViewModel() {
    super(new Map<Coord, Cell>());
    this.getEvaluatedCells();
  }
}
