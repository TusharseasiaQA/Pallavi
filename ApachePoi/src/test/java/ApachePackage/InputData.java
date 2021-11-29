package ApachePackage;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputData {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook wb = new HSSFWorkbook();
        FileOutputStream file = new FileOutputStream("C:\\Users\\Dell\\Desktop\\input.xls");

       HSSFSheet sheet = wb.createSheet("input");
        Row r;
        r=sheet.createRow(0);
        r.createCell(0).setCellValue("SEASIA");
        wb.write(file);
       for(int i=1;i<=10;i++){
            r=sheet.createRow(i);
            r.createCell(0).setCellValue(i);
wb.write(file);
        }
        System.out.println("DATA ENTERED SUCCESSFULLY");
        int rc=sheet.getLastRowNum();
        for (int i=1;i<rc;i++){
            int data=(int) sheet.getRow(i).getCell(0).getNumericCellValue();
            System.out.println(data);
        }
        FileOutputStream f=new FileOutputStream("C:\\Users\\Dell\\Desktop\\input.xls");
        wb.write(f);
    }}
