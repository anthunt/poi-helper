package anthunt.poi.helper;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class XSSFCellStyles
{
  public XSSFCellStyle DEFAULT;
  public XSSFCellStyle LEFT_THIN;
  public XSSFCellStyle RIGHT_THIN;
  public XSSFCellStyle LEFT_RIGHT_THIN;
  public XSSFCellStyle HILIGHT_BOLD;
  public XSSFCellStyle HILIGHT_BOLD_LEFT_THIN;
  public XSSFCellStyle HILIGHT_BOLD_RIGHT_THIN;
  public XSSFCellStyle FIRST_HEADER;
  public XSSFCellStyle FIRST_HEADER_LEFT_THIN;
  public XSSFCellStyle FIRST_HEADER_RIGHT_THIN;
  public XSSFCellStyle SECOND_HEADER;
  public XSSFCellStyle SECOND_HEADER_LEFT_THIN;
  public XSSFCellStyle SECOND_HEADER_RIGHT_THIN;
  public XSSFCellStyle THIRD_HEADER;
  public XSSFCellStyle THIRD_HEADER_LEFT_THIN;
  public XSSFCellStyle THIRD_HEADER_RIGHT_THIN;
  public XSSFCellStyle SUB_LAST_ROW;
  public XSSFCellStyle SUB_LAST_ROW_LEFT_THIN;
  public XSSFCellStyle SUB_LAST_ROW_RIGHT_THIN;
  
  public XSSFCellStyles(XSSFWorkbook xssfWorkbook, AbstractXSSFCellStyleConfiguration xssfCellStyleConfiguration)
  {
    init(xssfWorkbook, xssfCellStyleConfiguration);
  }
  
  private void init(XSSFWorkbook xssfWorkbook, AbstractXSSFCellStyleConfiguration xssfCellStyleConfiguration)
  {
    XSSFFonts.initialize(xssfWorkbook);
    xssfCellStyleConfiguration.initialize(xssfWorkbook);
    
    this.DEFAULT = xssfCellStyleConfiguration.getDefaultCellStyle();
    this.LEFT_THIN = xssfCellStyleConfiguration.getLeftThinCellStyle();
    this.RIGHT_THIN = xssfCellStyleConfiguration.getRightThinCellStyle();
    this.LEFT_RIGHT_THIN = xssfCellStyleConfiguration.getLeftRightThinCellStyle();
    this.HILIGHT_BOLD = xssfCellStyleConfiguration.getHilightBoldCellStyle();
    this.HILIGHT_BOLD_LEFT_THIN = xssfCellStyleConfiguration.getHilightBoldLeftThinCellStyle();
    this.HILIGHT_BOLD_RIGHT_THIN = xssfCellStyleConfiguration.getHilightBoldRightThinCellStyle();
    this.FIRST_HEADER = xssfCellStyleConfiguration.getFirstHeaderCellStyle();
    this.FIRST_HEADER_LEFT_THIN = xssfCellStyleConfiguration.getFirstHeaderLeftThinCellStyle();
    this.FIRST_HEADER_RIGHT_THIN = xssfCellStyleConfiguration.getFirstHeaderRightThinCellStyle();
    this.SECOND_HEADER = xssfCellStyleConfiguration.getSecondHeaderCellStyle();
    this.SECOND_HEADER_LEFT_THIN = xssfCellStyleConfiguration.getSecondHeaderLeftThinCellStyle();
    this.SECOND_HEADER_RIGHT_THIN = xssfCellStyleConfiguration.getSecondHeaderRightThinCellStyle();
    this.THIRD_HEADER = xssfCellStyleConfiguration.getThirdHeaderCellStyle();
    this.THIRD_HEADER_LEFT_THIN = xssfCellStyleConfiguration.getThirdHeaderLeftThinCellStyle();
    this.THIRD_HEADER_RIGHT_THIN = xssfCellStyleConfiguration.getThirdHeaderRightThinCellStyle();
    this.SUB_LAST_ROW = xssfCellStyleConfiguration.getSubLastRowCellStyle();
    this.SUB_LAST_ROW_LEFT_THIN = xssfCellStyleConfiguration.getSubLastRowLeftThinCellStyle();
    this.SUB_LAST_ROW_RIGHT_THIN = xssfCellStyleConfiguration.getSubLastRowRightThinCellStyle();
  }
}
