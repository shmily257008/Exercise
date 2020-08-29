package poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiWriteTest {
    public static void main(String[] args) throws IOException {
        String path="E:\\Project\\Exercise";
        //1. 创建一个工作簿
        Workbook workbook=new XSSFWorkbook();
        //2. 创建一个工作表
        Sheet sheet=workbook.createSheet("Test07");
        //3. 创建一行
        Row row=sheet.createRow(0);
        //4.创建单元格(第0行，第0个)
        Cell cell=row.createCell(0);
        cell.setCellValue("第一列");
        Cell cell1=row.createCell(1);
        cell1.setCellValue("第二列");
        String time=new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        Row row1=sheet.createRow(1);
        Cell cell12=row1.createCell(0);
        cell12.setCellValue(time);

        //生成一个表，生成一个流
        FileOutputStream fileOutputStream=new FileOutputStream("Test07.xlsx");
        //输出liu
        workbook.write(fileOutputStream);
        //关闭流
        fileOutputStream.close();
        System.out.println("文件路径是"+path);
        //System.out.println("文件名是"+);
        System.out.println("文件生成完毕");



    }
}
