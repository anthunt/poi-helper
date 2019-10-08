package anthunt.poi.helper;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class AbstractXSSFCellStyleConfiguration
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
  
  protected abstract XSSFCellStyleModel setDefaultCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setLeftRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setHilightBoldCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setHilightBoldLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setHilightBoldRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setFirstHeaderCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setFirstHeaderLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setFirstHeaderRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSecondHeaderCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSecondHeaderLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSecondHeaderRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setThirdHeaderCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setThirdHeaderLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setThirdHeaderRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSubLastRowCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSubLastRowLeftThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected abstract XSSFCellStyleModel setSubLastRowRightThinCellStyleModel(XSSFCellStyleModel paramXSSFCellStyleModel);
  
  protected void initialize(XSSFWorkbook xssfWorkbook)
  {
    XSSFCellStyleBuilder xssfCellStyleMaker = new XSSFCellStyleBuilder(xssfWorkbook);
    this.DEFAULT = xssfCellStyleMaker.buildXSSFCellStyle(setDefaultCellStyleModel(new XSSFCellStyleModel()));
    this.LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.LEFT_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setLeftRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.HILIGHT_BOLD = xssfCellStyleMaker.buildXSSFCellStyle(setHilightBoldCellStyleModel(new XSSFCellStyleModel()));
    this.HILIGHT_BOLD_LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setHilightBoldLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.HILIGHT_BOLD_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setHilightBoldRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.FIRST_HEADER = xssfCellStyleMaker.buildXSSFCellStyle(setFirstHeaderCellStyleModel(new XSSFCellStyleModel()));
    this.FIRST_HEADER_LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setFirstHeaderLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.FIRST_HEADER_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setFirstHeaderRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.SECOND_HEADER = xssfCellStyleMaker.buildXSSFCellStyle(setSecondHeaderCellStyleModel(new XSSFCellStyleModel()));
    this.SECOND_HEADER_LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setSecondHeaderLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.SECOND_HEADER_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setSecondHeaderRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.THIRD_HEADER = xssfCellStyleMaker.buildXSSFCellStyle(setThirdHeaderCellStyleModel(new XSSFCellStyleModel()));
    this.THIRD_HEADER_LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setThirdHeaderLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.THIRD_HEADER_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setThirdHeaderRightThinCellStyleModel(new XSSFCellStyleModel()));
    this.SUB_LAST_ROW = xssfCellStyleMaker.buildXSSFCellStyle(setSubLastRowCellStyleModel(new XSSFCellStyleModel()));
    this.SUB_LAST_ROW_LEFT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setSubLastRowLeftThinCellStyleModel(new XSSFCellStyleModel()));
    this.SUB_LAST_ROW_RIGHT_THIN = xssfCellStyleMaker.buildXSSFCellStyle(setSubLastRowRightThinCellStyleModel(new XSSFCellStyleModel()));
  }
  
  public XSSFCellStyle getDefaultCellStyle()
  {
    return this.DEFAULT;
  }
  
  public XSSFCellStyle getLeftThinCellStyle()
  {
    return this.LEFT_THIN;
  }
  
  public XSSFCellStyle getRightThinCellStyle()
  {
    return this.RIGHT_THIN;
  }
  
  public XSSFCellStyle getLeftRightThinCellStyle()
  {
    return this.LEFT_RIGHT_THIN;
  }
  
  public XSSFCellStyle getHilightBoldCellStyle()
  {
    return this.HILIGHT_BOLD;
  }
  
  public XSSFCellStyle getHilightBoldLeftThinCellStyle()
  {
    return this.HILIGHT_BOLD_LEFT_THIN;
  }
  
  public XSSFCellStyle getHilightBoldRightThinCellStyle()
  {
    return this.HILIGHT_BOLD_RIGHT_THIN;
  }
  
  public XSSFCellStyle getFirstHeaderCellStyle()
  {
    return this.FIRST_HEADER;
  }
  
  public XSSFCellStyle getFirstHeaderLeftThinCellStyle()
  {
    return this.FIRST_HEADER_LEFT_THIN;
  }
  
  public XSSFCellStyle getFirstHeaderRightThinCellStyle()
  {
    return this.FIRST_HEADER_RIGHT_THIN;
  }
  
  public XSSFCellStyle getSecondHeaderCellStyle()
  {
    return this.SECOND_HEADER;
  }
  
  public XSSFCellStyle getSecondHeaderLeftThinCellStyle()
  {
    return this.SECOND_HEADER_LEFT_THIN;
  }
  
  public XSSFCellStyle getSecondHeaderRightThinCellStyle()
  {
    return this.SECOND_HEADER_RIGHT_THIN;
  }
  
  public XSSFCellStyle getThirdHeaderCellStyle()
  {
    return this.THIRD_HEADER;
  }
  
  public XSSFCellStyle getThirdHeaderLeftThinCellStyle()
  {
    return this.THIRD_HEADER_LEFT_THIN;
  }
  
  public XSSFCellStyle getThirdHeaderRightThinCellStyle()
  {
    return this.THIRD_HEADER_RIGHT_THIN;
  }
  
  public XSSFCellStyle getSubLastRowCellStyle()
  {
    return this.SUB_LAST_ROW;
  }
  
  public XSSFCellStyle getSubLastRowLeftThinCellStyle()
  {
    return this.SUB_LAST_ROW_LEFT_THIN;
  }
  
  public XSSFCellStyle getSubLastRowRightThinCellStyle()
  {
    return this.SUB_LAST_ROW_RIGHT_THIN;
  }
}
