/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sheets.v4.model;

/**
 * A coordinate in a sheet. All indexes are zero-based.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GridCoordinate extends com.google.api.client.json.GenericJson {

  /**
   * The column index of the coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnIndex;

  /**
   * The row index of the coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowIndex;

  /**
   * The sheet this coordinate is on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sheetId;

  /**
   * The column index of the coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnIndex() {
    return columnIndex;
  }

  /**
   * The column index of the coordinate.
   * @param columnIndex columnIndex or {@code null} for none
   */
  public GridCoordinate setColumnIndex(java.lang.Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

  /**
   * The row index of the coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowIndex() {
    return rowIndex;
  }

  /**
   * The row index of the coordinate.
   * @param rowIndex rowIndex or {@code null} for none
   */
  public GridCoordinate setRowIndex(java.lang.Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

  /**
   * The sheet this coordinate is on.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSheetId() {
    return sheetId;
  }

  /**
   * The sheet this coordinate is on.
   * @param sheetId sheetId or {@code null} for none
   */
  public GridCoordinate setSheetId(java.lang.Integer sheetId) {
    this.sheetId = sheetId;
    return this;
  }

  @Override
  public GridCoordinate set(String fieldName, Object value) {
    return (GridCoordinate) super.set(fieldName, value);
  }

  @Override
  public GridCoordinate clone() {
    return (GridCoordinate) super.clone();
  }

}
