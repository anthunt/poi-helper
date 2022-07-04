package anthunt.poi.helper;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFHelper
{
  private XSSFWorkbook xssfWorkbook;
  private XSSFCellStyles xssfCellStyles;
  
  public XSSFHelper(XSSFWorkbook xssfWorkbook)
  {
    this(xssfWorkbook, new DefaultXSSFCellStyleConfiguration());
  }
  
  public XSSFHelper(XSSFWorkbook xssfWorkbook, AbstractXSSFCellStyleConfiguration xssfCellStyleConfiguration)
  {
    setXSSFWorkbook(xssfWorkbook);
    setXSSFCellStyles(new XSSFCellStyles(xssfWorkbook, xssfCellStyleConfiguration));
  }
  
  private void setXSSFWorkbook(XSSFWorkbook xssfWorkbook)
  {
    this.xssfWorkbook = xssfWorkbook;
  }
  
  private XSSFCellStyles getXSSFCellStyles()
  {
    return this.xssfCellStyles;
  }
  
  private void setXSSFCellStyles(XSSFCellStyles xssfCellStyles)
  {
    this.xssfCellStyles = xssfCellStyles;
  }
  
  public XSSFRow createRow(XSSFSheet sheet)
  {
    return createRow(sheet, 0);
  }
  
  public XSSFRow createRow(XSSFSheet sheet, int rowShift)
  {
    return sheet.createRow(sheet.getLastRowNum() + rowShift);
  }
  
  public void setCell(XSSFRow row, String value, XSSFCellStyle cellStyle)
  {
    XSSFCell cell = row.createCell(row.getLastCellNum() == -1 ? 0 : row.getLastCellNum());
    cell.setCellValue(value);
    cell.setCellStyle(cellStyle);
  }
  
  public void setCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().DEFAULT);
  }
  
  public void setCell(XSSFRow row, int cellNum, String value)
  {
    row.getCell(cellNum).setCellValue(value);
  }
  
  public void setLeftThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().LEFT_THIN);
  }
  
  public void setRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().RIGHT_THIN);
  }
  
  public void setLeftRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().LEFT_RIGHT_THIN);
  }
  
  public void setBrownBoldCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().HILIGHT_BOLD);
  }
  
  public void setBrownBoldLeftThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().HILIGHT_BOLD_LEFT_THIN);
  }
  
  public void setBrownBoldRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().HILIGHT_BOLD_RIGHT_THIN);
  }
  
  public void setHeadCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().FIRST_HEADER);
  }
  
  public void setHeadLeftThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().FIRST_HEADER_LEFT_THIN);
  }
  
  public void setHeadRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().FIRST_HEADER_RIGHT_THIN);
  }
  
  public void setSubHeadCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().SECOND_HEADER);
  }
  
  public void setSubHeadLeftThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().SECOND_HEADER_LEFT_THIN);
  }
  
  public void setSubHeadRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().SECOND_HEADER_RIGHT_THIN);
  }
  
  public void setSecondSubHeadCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().THIRD_HEADER);
  }
  
  public void setSecondSubHeadLeftThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().THIRD_HEADER_LEFT_THIN);
  }
  
  public void setSecondSubHeadRightThinCell(XSSFRow row, String value)
  {
    setCell(row, value, getXSSFCellStyles().THIRD_HEADER_RIGHT_THIN);
  }
  
  public void setAutoSizeColumn()
  {
    int iSheetCount = this.xssfWorkbook.getNumberOfSheets();
    XSSFSheet sheet = null;
    XSSFRow row = null;
    int iCellCount = 0;
    for (int iSheetIndex = 0; iSheetIndex < iSheetCount; iSheetIndex++)
    {
      sheet = this.xssfWorkbook.getSheetAt(iSheetIndex);
      row = sheet.getRow(sheet.getLastRowNum());
      if (row != null)
      {
        iCellCount = row.getLastCellNum();
        for (int iCol = 0; iCol < iCellCount; iCol++)
        {
          sheet.autoSizeColumn((short)iCol);
          int width = sheet.getColumnWidth(iCol) + 512;
          //System.out.println("Width : " + width);
          width = width > 60000 ? 60000 : width;
          sheet.setColumnWidth(iCol, width);
        }
      }
    }
  }
  
  public void setSubLastRowStyle(XSSFRow row)
  {
    for (int iCol = 0; iCol < row.getLastCellNum(); iCol++)
    {
      XSSFCell cell = row.getCell(iCol);
      XSSFCellStyle cellStyle = cell.getCellStyle();
      if (BorderStyle.THIN == cellStyle.getBorderLeft()) {
        cell.setCellStyle(getXSSFCellStyles().SUB_LAST_ROW_LEFT_THIN);
      } else if (BorderStyle.THIN == cellStyle.getBorderRight()) {
        cell.setCellStyle(getXSSFCellStyles().SUB_LAST_ROW_RIGHT_THIN);
      } else {
        cell.setCellStyle(getXSSFCellStyles().SUB_LAST_ROW);
      }
    }
  }
}
