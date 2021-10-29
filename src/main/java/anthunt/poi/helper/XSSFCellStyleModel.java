package anthunt.poi.helper;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;

public class XSSFCellStyleModel
{
  private BorderStyle borderTop;
  private BorderStyle borderLeft;
  private BorderStyle borderRight;
  private BorderStyle borderBottom;
  private HorizontalAlignment horizontalAlignment;
  private VerticalAlignment verticalAlignment;
  private XSSFFonts fontGenerator;
  private XSSFFont font;
  private FillPatternType fillPatternType;
  private XSSFColor fillForegroundColor;
  private XSSFCellStyle xssfCellStyle;
  
  public BorderStyle getBorderTop()
  {
    return this.borderTop;
  }
  
  public void setBorderTop(BorderStyle borderTop)
  {
    this.borderTop = borderTop;
  }
  
  public BorderStyle getBorderLeft()
  {
    return this.borderLeft;
  }
  
  public void setBorderLeft(BorderStyle borderLeft)
  {
    this.borderLeft = borderLeft;
  }
  
  public BorderStyle getBorderRight()
  {
    return this.borderRight;
  }
  
  public void setBorderRight(BorderStyle borderRight)
  {
    this.borderRight = borderRight;
  }
  
  public BorderStyle getBorderBottom()
  {
    return this.borderBottom;
  }
  
  public void setBorderBottom(BorderStyle borderBottom)
  {
    this.borderBottom = borderBottom;
  }
  
  public HorizontalAlignment getHorizontalAlignment()
  {
    return this.horizontalAlignment;
  }
  
  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment)
  {
    this.horizontalAlignment = horizontalAlignment;
  }
  
  public VerticalAlignment getVerticalAlignment()
  {
    return this.verticalAlignment;
  }
  
  public void setVerticalAlignment(VerticalAlignment verticalAlignment)
  {
    this.verticalAlignment = verticalAlignment;
  }
  
  public XSSFFonts getFontGenerator()
  {
    return this.fontGenerator;
  }
  
  public void setFontGenerator(XSSFFonts fontGenerator)
  {
    this.fontGenerator = fontGenerator;
  }
  
  public XSSFFont getFont()
  {
    return this.font == null ? this.fontGenerator.getXSSFFont() : this.font;
  }
  
  public void setFont(XSSFFont font)
  {
    this.font = font;
  }
  
  public FillPatternType getFillPatternType()
  {
    return this.fillPatternType;
  }
  
  public void setFillPatternType(FillPatternType fillPatternType)
  {
    this.fillPatternType = fillPatternType;
  }
  
  public XSSFColor getFillForegroundColor()
  {
    return this.fillForegroundColor;
  }
  
  public void setFillForegroundColor(XSSFColor fillForegroundColor)
  {
    this.fillForegroundColor = fillForegroundColor;
  }
  
  public XSSFCellStyle getXssfCellStyle()
  {
    return this.xssfCellStyle;
  }
  
  public void setXssfCellStyle(XSSFCellStyle xssfCellStyle)
  {
    this.xssfCellStyle = xssfCellStyle;
  }
}
