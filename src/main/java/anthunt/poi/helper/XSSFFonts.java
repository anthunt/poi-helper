package anthunt.poi.helper;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public enum XSSFFonts
{
	 DEFAULT_FONT(false, "맑은 고딕", IndexedColors.BLACK.getIndex(), (short)9)
  ,  BOLD_FONT(true, "맑은 고딕", IndexedColors.BLACK.getIndex(), (short)9)
  ,  BOLD_WHITE_FONT(true, "맑은 고딕", IndexedColors.WHITE.getIndex(), (short)9)
  ,  HEADER_FONT(true, "맑은 고딕", IndexedColors.WHITE.getIndex(), (short)10);

  private boolean isBold;
  private String fontName;
  private short color;
  private short fontHeightInPoints;
  private XSSFFont xssfFont;
  
  private XSSFFonts(boolean isBold, String fontName, short color, short fontHeightInPoints)
  {
    this.isBold = isBold;
    this.fontName = fontName;
    this.color = color;
    this.fontHeightInPoints = fontHeightInPoints;
  }
  
  protected static void initialize(XSSFWorkbook xssfWorkbook)
  {
    XSSFFonts[] xssfFontGenerators = values();
    for (XSSFFonts xssfFontGenerator : xssfFontGenerators) {
      xssfFontGenerator.create(xssfWorkbook);
    }
  }
  
  private void create(XSSFWorkbook xssfWorkbook)
  {
    this.xssfFont = xssfWorkbook.createFont();
    this.xssfFont.setBold(this.isBold);
    this.xssfFont.setFontName(this.fontName);
    this.xssfFont.setColor(this.color);
    this.xssfFont.setFontHeightInPoints(this.fontHeightInPoints);
  }
  
  protected XSSFFont getXSSFFont()
  {
    return this.xssfFont;
  }
}
