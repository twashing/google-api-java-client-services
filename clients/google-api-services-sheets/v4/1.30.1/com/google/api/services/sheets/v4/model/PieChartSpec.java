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
 * A pie chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PieChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The data that covers the domain of the pie chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData domain;

  /**
   * Where the legend of the pie chart should be drawn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String legendPosition;

  /**
   * The size of the hole in the pie chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pieHole;

  /**
   * The data that covers the one and only series of the pie chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData series;

  /**
   * True if the pie is three dimensional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean threeDimensional;

  /**
   * The data that covers the domain of the pie chart.
   * @return value or {@code null} for none
   */
  public ChartData getDomain() {
    return domain;
  }

  /**
   * The data that covers the domain of the pie chart.
   * @param domain domain or {@code null} for none
   */
  public PieChartSpec setDomain(ChartData domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Where the legend of the pie chart should be drawn.
   * @return value or {@code null} for none
   */
  public java.lang.String getLegendPosition() {
    return legendPosition;
  }

  /**
   * Where the legend of the pie chart should be drawn.
   * @param legendPosition legendPosition or {@code null} for none
   */
  public PieChartSpec setLegendPosition(java.lang.String legendPosition) {
    this.legendPosition = legendPosition;
    return this;
  }

  /**
   * The size of the hole in the pie chart.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPieHole() {
    return pieHole;
  }

  /**
   * The size of the hole in the pie chart.
   * @param pieHole pieHole or {@code null} for none
   */
  public PieChartSpec setPieHole(java.lang.Double pieHole) {
    this.pieHole = pieHole;
    return this;
  }

  /**
   * The data that covers the one and only series of the pie chart.
   * @return value or {@code null} for none
   */
  public ChartData getSeries() {
    return series;
  }

  /**
   * The data that covers the one and only series of the pie chart.
   * @param series series or {@code null} for none
   */
  public PieChartSpec setSeries(ChartData series) {
    this.series = series;
    return this;
  }

  /**
   * True if the pie is three dimensional.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getThreeDimensional() {
    return threeDimensional;
  }

  /**
   * True if the pie is three dimensional.
   * @param threeDimensional threeDimensional or {@code null} for none
   */
  public PieChartSpec setThreeDimensional(java.lang.Boolean threeDimensional) {
    this.threeDimensional = threeDimensional;
    return this;
  }

  @Override
  public PieChartSpec set(String fieldName, Object value) {
    return (PieChartSpec) super.set(fieldName, value);
  }

  @Override
  public PieChartSpec clone() {
    return (PieChartSpec) super.clone();
  }

}
