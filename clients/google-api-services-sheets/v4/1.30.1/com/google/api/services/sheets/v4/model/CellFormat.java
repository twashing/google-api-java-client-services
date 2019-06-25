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
 * The format of a cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CellFormat extends com.google.api.client.json.GenericJson {

  /**
   * The background color of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color backgroundColor;

  /**
   * The borders of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Borders borders;

  /**
   * The horizontal alignment of the value in the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String horizontalAlignment;

  /**
   * How a hyperlink, if it exists, should be displayed in the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hyperlinkDisplayType;

  /**
   * A format describing how number values should be represented to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NumberFormat numberFormat;

  /**
   * The padding of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Padding padding;

  /**
   * The direction of the text in the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textDirection;

  /**
   * The format of the text in the cell (unless overridden by a format run).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat textFormat;

  /**
   * The rotation applied to text in a cell
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextRotation textRotation;

  /**
   * The vertical alignment of the value in the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verticalAlignment;

  /**
   * The wrap strategy for the value in the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wrapStrategy;

  /**
   * The background color of the cell.
   * @return value or {@code null} for none
   */
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background color of the cell.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public CellFormat setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The borders of the cell.
   * @return value or {@code null} for none
   */
  public Borders getBorders() {
    return borders;
  }

  /**
   * The borders of the cell.
   * @param borders borders or {@code null} for none
   */
  public CellFormat setBorders(Borders borders) {
    this.borders = borders;
    return this;
  }

  /**
   * The horizontal alignment of the value in the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * The horizontal alignment of the value in the cell.
   * @param horizontalAlignment horizontalAlignment or {@code null} for none
   */
  public CellFormat setHorizontalAlignment(java.lang.String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

  /**
   * How a hyperlink, if it exists, should be displayed in the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getHyperlinkDisplayType() {
    return hyperlinkDisplayType;
  }

  /**
   * How a hyperlink, if it exists, should be displayed in the cell.
   * @param hyperlinkDisplayType hyperlinkDisplayType or {@code null} for none
   */
  public CellFormat setHyperlinkDisplayType(java.lang.String hyperlinkDisplayType) {
    this.hyperlinkDisplayType = hyperlinkDisplayType;
    return this;
  }

  /**
   * A format describing how number values should be represented to the user.
   * @return value or {@code null} for none
   */
  public NumberFormat getNumberFormat() {
    return numberFormat;
  }

  /**
   * A format describing how number values should be represented to the user.
   * @param numberFormat numberFormat or {@code null} for none
   */
  public CellFormat setNumberFormat(NumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    return this;
  }

  /**
   * The padding of the cell.
   * @return value or {@code null} for none
   */
  public Padding getPadding() {
    return padding;
  }

  /**
   * The padding of the cell.
   * @param padding padding or {@code null} for none
   */
  public CellFormat setPadding(Padding padding) {
    this.padding = padding;
    return this;
  }

  /**
   * The direction of the text in the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextDirection() {
    return textDirection;
  }

  /**
   * The direction of the text in the cell.
   * @param textDirection textDirection or {@code null} for none
   */
  public CellFormat setTextDirection(java.lang.String textDirection) {
    this.textDirection = textDirection;
    return this;
  }

  /**
   * The format of the text in the cell (unless overridden by a format run).
   * @return value or {@code null} for none
   */
  public TextFormat getTextFormat() {
    return textFormat;
  }

  /**
   * The format of the text in the cell (unless overridden by a format run).
   * @param textFormat textFormat or {@code null} for none
   */
  public CellFormat setTextFormat(TextFormat textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  /**
   * The rotation applied to text in a cell
   * @return value or {@code null} for none
   */
  public TextRotation getTextRotation() {
    return textRotation;
  }

  /**
   * The rotation applied to text in a cell
   * @param textRotation textRotation or {@code null} for none
   */
  public CellFormat setTextRotation(TextRotation textRotation) {
    this.textRotation = textRotation;
    return this;
  }

  /**
   * The vertical alignment of the value in the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerticalAlignment() {
    return verticalAlignment;
  }

  /**
   * The vertical alignment of the value in the cell.
   * @param verticalAlignment verticalAlignment or {@code null} for none
   */
  public CellFormat setVerticalAlignment(java.lang.String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

  /**
   * The wrap strategy for the value in the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getWrapStrategy() {
    return wrapStrategy;
  }

  /**
   * The wrap strategy for the value in the cell.
   * @param wrapStrategy wrapStrategy or {@code null} for none
   */
  public CellFormat setWrapStrategy(java.lang.String wrapStrategy) {
    this.wrapStrategy = wrapStrategy;
    return this;
  }

  @Override
  public CellFormat set(String fieldName, Object value) {
    return (CellFormat) super.set(fieldName, value);
  }

  @Override
  public CellFormat clone() {
    return (CellFormat) super.clone();
  }

}
