package anthunt.poi.helper;

import java.awt.Color;
import org.apache.poi.xssf.usermodel.XSSFColor;

 enum XSSFColors
{
  HEAD_COLOR(102, 102, 41)
  ,  SUB_HEAD_COLOR(153, 153, 102)
  ,  SECOND_SUB_HEAD_COLOR(204, 204, 153)
  ,  BROWN_COLOR(204, 153, 41);
  
  private XSSFColor xssfColor;
  
  private XSSFColors(int R, int G, int B)
  {
    this.xssfColor = new XSSFColor(new Color(R, G, B));
  }
  
  protected XSSFColor getXSSFColor()
  {
    return this.xssfColor;
  }
}
