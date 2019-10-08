package anthunt.poi.helper;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class XSSFCellStyleBuilder
{
  private XSSFWorkbook xssfWorkbook;
  
  public XSSFCellStyleBuilder(XSSFWorkbook xssfWorkbook)
  {
    this.xssfWorkbook = xssfWorkbook;
  }
  
  protected XSSFCellStyle buildXSSFCellStyle(XSSFCellStyleModel xssfCellStyleModel)
  {
    XSSFCellStyle xssfCellStyle = this.xssfWorkbook.createCellStyle();
    xssfCellStyle.setBorderTop(xssfCellStyleModel.getBorderTop());
    xssfCellStyle.setBorderLeft(xssfCellStyleModel.getBorderLeft());
    xssfCellStyle.setBorderBottom(xssfCellStyleModel.getBorderBottom());
    xssfCellStyle.setBorderRight(xssfCellStyleModel.getBorderRight());
    xssfCellStyle.setAlignment(xssfCellStyleModel.getHorizontalAlignment());
    xssfCellStyle.setVerticalAlignment(xssfCellStyleModel.getVerticalAlignment());
    xssfCellStyle.setFont(xssfCellStyleModel.getFont());
    if (xssfCellStyleModel.getFillPattern() != null) {
      xssfCellStyle.setFillPattern(xssfCellStyleModel.getFillPattern().shortValue());
    }
    if (xssfCellStyleModel.getFillForegroundColor() != null) {
      xssfCellStyle.setFillForegroundColor(xssfCellStyleModel.getFillForegroundColor());
    }
    xssfCellStyle.setWrapText(true);
    return xssfCellStyle;
  }
}
