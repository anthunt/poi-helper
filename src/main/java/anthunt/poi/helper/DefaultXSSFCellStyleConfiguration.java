package anthunt.poi.helper;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class DefaultXSSFCellStyleConfiguration
  extends AbstractXSSFCellStyleConfiguration
{
  protected XSSFCellStyleModel setDefaultCellStyleModel(XSSFCellStyleModel defaultCellStyleModel)
  {
    defaultCellStyleModel.setBorderTop(BorderStyle.THIN);
    defaultCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    defaultCellStyleModel.setBorderRight(BorderStyle.HAIR);
    defaultCellStyleModel.setBorderBottom(BorderStyle.THIN);
    defaultCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    defaultCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    defaultCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return defaultCellStyleModel;
  }
  
  protected XSSFCellStyleModel setLeftThinCellStyleModel(XSSFCellStyleModel leftThinCellStyleModel)
  {
    leftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    leftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    leftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    leftThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    leftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    leftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    leftThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return leftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setRightThinCellStyleModel(XSSFCellStyleModel rightThinCellStyleModel)
  {
    rightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    rightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    rightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    rightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    rightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    rightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    rightThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return rightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setLeftRightThinCellStyleModel(XSSFCellStyleModel leftRightThinCellStyleModel)
  {
    leftRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    leftRightThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    leftRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    leftRightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    leftRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    leftRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    leftRightThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return leftRightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setHilightBoldCellStyleModel(XSSFCellStyleModel hilightBoldCellStyleModel)
  {
    hilightBoldCellStyleModel.setBorderTop(BorderStyle.THIN);
    hilightBoldCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    hilightBoldCellStyleModel.setBorderRight(BorderStyle.HAIR);
    hilightBoldCellStyleModel.setBorderBottom(BorderStyle.THIN);
    hilightBoldCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    hilightBoldCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    hilightBoldCellStyleModel.setFontGenerator(XSSFFonts.BOLD_FONT);
    hilightBoldCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    hilightBoldCellStyleModel.setFillForegroundColor(XSSFColors.BROWN_COLOR.getXSSFColor());
    return hilightBoldCellStyleModel;
  }
  
  protected XSSFCellStyleModel setHilightBoldLeftThinCellStyleModel(XSSFCellStyleModel hilightBoldLeftThinCellStyleModel)
  {
    hilightBoldLeftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    hilightBoldLeftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    hilightBoldLeftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    hilightBoldLeftThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    hilightBoldLeftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    hilightBoldLeftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    hilightBoldLeftThinCellStyleModel.setFontGenerator(XSSFFonts.BOLD_FONT);
    hilightBoldLeftThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    hilightBoldLeftThinCellStyleModel.setFillForegroundColor(XSSFColors.BROWN_COLOR.getXSSFColor());
    return hilightBoldLeftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setHilightBoldRightThinCellStyleModel(XSSFCellStyleModel hilightBoldRightThinCellStyleModel)
  {
    hilightBoldRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    hilightBoldRightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    hilightBoldRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    hilightBoldRightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    hilightBoldRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    hilightBoldRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    hilightBoldRightThinCellStyleModel.setFontGenerator(XSSFFonts.BOLD_FONT);
    hilightBoldRightThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    hilightBoldRightThinCellStyleModel.setFillForegroundColor(XSSFColors.BROWN_COLOR.getXSSFColor());
    return hilightBoldRightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setFirstHeaderCellStyleModel(XSSFCellStyleModel firstHeaderCellStyleModel)
  {
    firstHeaderCellStyleModel.setBorderTop(BorderStyle.THIN);
    firstHeaderCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    firstHeaderCellStyleModel.setBorderRight(BorderStyle.HAIR);
    firstHeaderCellStyleModel.setBorderBottom(BorderStyle.THIN);
    firstHeaderCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    firstHeaderCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    firstHeaderCellStyleModel.setFontGenerator(XSSFFonts.HEADER_FONT);
    firstHeaderCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    firstHeaderCellStyleModel.setFillForegroundColor(XSSFColors.HEAD_COLOR.getXSSFColor());
    return firstHeaderCellStyleModel;
  }
  
  protected XSSFCellStyleModel setFirstHeaderLeftThinCellStyleModel(XSSFCellStyleModel firstHeaderLeftThinCellStyleModel)
  {
    firstHeaderLeftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    firstHeaderLeftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    firstHeaderLeftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    firstHeaderLeftThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    firstHeaderLeftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    firstHeaderLeftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    firstHeaderLeftThinCellStyleModel.setFontGenerator(XSSFFonts.HEADER_FONT);
    firstHeaderLeftThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    firstHeaderLeftThinCellStyleModel.setFillForegroundColor(XSSFColors.HEAD_COLOR.getXSSFColor());
    return firstHeaderLeftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setFirstHeaderRightThinCellStyleModel(XSSFCellStyleModel firstHeaderRightThinCellStyleModel)
  {
    firstHeaderRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    firstHeaderRightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    firstHeaderRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    firstHeaderRightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    firstHeaderRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    firstHeaderRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    firstHeaderRightThinCellStyleModel.setFontGenerator(XSSFFonts.HEADER_FONT);
    firstHeaderRightThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    firstHeaderRightThinCellStyleModel.setFillForegroundColor(XSSFColors.HEAD_COLOR.getXSSFColor());
    return firstHeaderRightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSecondHeaderCellStyleModel(XSSFCellStyleModel secondHeaderCellStyleModel)
  {
    secondHeaderCellStyleModel.setBorderTop(BorderStyle.THIN);
    secondHeaderCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    secondHeaderCellStyleModel.setBorderRight(BorderStyle.HAIR);
    secondHeaderCellStyleModel.setBorderBottom(BorderStyle.THIN);
    secondHeaderCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    secondHeaderCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    secondHeaderCellStyleModel.setFontGenerator(XSSFFonts.BOLD_WHITE_FONT);
    secondHeaderCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    secondHeaderCellStyleModel.setFillForegroundColor(XSSFColors.SUB_HEAD_COLOR.getXSSFColor());
    return secondHeaderCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSecondHeaderLeftThinCellStyleModel(XSSFCellStyleModel secondHeaderLeftThinCellStyleModel)
  {
    secondHeaderLeftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    secondHeaderLeftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    secondHeaderLeftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    secondHeaderLeftThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    secondHeaderLeftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    secondHeaderLeftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    secondHeaderLeftThinCellStyleModel.setFontGenerator(XSSFFonts.BOLD_WHITE_FONT);
    secondHeaderLeftThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    secondHeaderLeftThinCellStyleModel.setFillForegroundColor(XSSFColors.SUB_HEAD_COLOR.getXSSFColor());
    return secondHeaderLeftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSecondHeaderRightThinCellStyleModel(XSSFCellStyleModel secondHeaderRightThinCellStyleModel)
  {
    secondHeaderRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    secondHeaderRightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    secondHeaderRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    secondHeaderRightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    secondHeaderRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    secondHeaderRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    secondHeaderRightThinCellStyleModel.setFontGenerator(XSSFFonts.BOLD_WHITE_FONT);
    secondHeaderRightThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    secondHeaderRightThinCellStyleModel.setFillForegroundColor(XSSFColors.SUB_HEAD_COLOR.getXSSFColor());
    return secondHeaderRightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setThirdHeaderCellStyleModel(XSSFCellStyleModel thirdHeaderCellStyleModel)
  {
    thirdHeaderCellStyleModel.setBorderTop(BorderStyle.THIN);
    thirdHeaderCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    thirdHeaderCellStyleModel.setBorderRight(BorderStyle.HAIR);
    thirdHeaderCellStyleModel.setBorderBottom(BorderStyle.THIN);
    thirdHeaderCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    thirdHeaderCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    thirdHeaderCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    thirdHeaderCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    thirdHeaderCellStyleModel.setFillForegroundColor(XSSFColors.SECOND_SUB_HEAD_COLOR.getXSSFColor());
    return thirdHeaderCellStyleModel;
  }
  
  protected XSSFCellStyleModel setThirdHeaderLeftThinCellStyleModel(XSSFCellStyleModel thirdHeaderLeftThinCellStyleModel)
  {
    thirdHeaderLeftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    thirdHeaderLeftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    thirdHeaderLeftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    thirdHeaderLeftThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    thirdHeaderLeftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    thirdHeaderLeftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    thirdHeaderLeftThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    thirdHeaderLeftThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    thirdHeaderLeftThinCellStyleModel.setFillForegroundColor(XSSFColors.SECOND_SUB_HEAD_COLOR.getXSSFColor());
    return thirdHeaderLeftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setThirdHeaderRightThinCellStyleModel(XSSFCellStyleModel thirdHeaderRightThinCellStyleModel)
  {
    thirdHeaderRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    thirdHeaderRightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    thirdHeaderRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    thirdHeaderRightThinCellStyleModel.setBorderBottom(BorderStyle.THIN);
    thirdHeaderRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    thirdHeaderRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    thirdHeaderRightThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    thirdHeaderRightThinCellStyleModel.setFillPatternType(FillPatternType.NO_FILL);
    thirdHeaderRightThinCellStyleModel.setFillForegroundColor(XSSFColors.SECOND_SUB_HEAD_COLOR.getXSSFColor());
    return thirdHeaderRightThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSubLastRowCellStyleModel(XSSFCellStyleModel subLastRowCellStyleModel)
  {
    subLastRowCellStyleModel.setBorderTop(BorderStyle.THIN);
    subLastRowCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    subLastRowCellStyleModel.setBorderRight(BorderStyle.HAIR);
    subLastRowCellStyleModel.setBorderBottom(BorderStyle.DOUBLE);
    subLastRowCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    subLastRowCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    subLastRowCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return subLastRowCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSubLastRowLeftThinCellStyleModel(XSSFCellStyleModel subLastRowLeftThinCellStyleModel)
  {
    subLastRowLeftThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    subLastRowLeftThinCellStyleModel.setBorderLeft(BorderStyle.THIN);
    subLastRowLeftThinCellStyleModel.setBorderRight(BorderStyle.HAIR);
    subLastRowLeftThinCellStyleModel.setBorderBottom(BorderStyle.DOUBLE);
    subLastRowLeftThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    subLastRowLeftThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    subLastRowLeftThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return subLastRowLeftThinCellStyleModel;
  }
  
  protected XSSFCellStyleModel setSubLastRowRightThinCellStyleModel(XSSFCellStyleModel subLastRowRightThinCellStyleModel)
  {
    subLastRowRightThinCellStyleModel.setBorderTop(BorderStyle.THIN);
    subLastRowRightThinCellStyleModel.setBorderLeft(BorderStyle.HAIR);
    subLastRowRightThinCellStyleModel.setBorderRight(BorderStyle.THIN);
    subLastRowRightThinCellStyleModel.setBorderBottom(BorderStyle.DOUBLE);
    subLastRowRightThinCellStyleModel.setHorizontalAlignment(HorizontalAlignment.CENTER);
    subLastRowRightThinCellStyleModel.setVerticalAlignment(VerticalAlignment.TOP);
    subLastRowRightThinCellStyleModel.setFontGenerator(XSSFFonts.DEFAULT_FONT);
    return subLastRowRightThinCellStyleModel;
  }
}
