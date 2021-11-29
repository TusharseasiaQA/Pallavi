package ApachePackage;




        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.OutputStream;
        import org.apache.poi.hssf.usermodel.HSSFWorkbook;
        import org.apache.poi.ss.usermodel.Row;
        import org.apache.poi.ss.usermodel.Sheet;
        import org.apache.poi.ss.usermodel.Workbook;


public class CreateSheet {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Workbook wb = new HSSFWorkbook();
        try  (OutputStream fileOut = new FileOutputStream("C:\\Users\\Dell\\Desktop\\Book1.xls")) {
            Sheet sheet1 = wb.createSheet("First Sheet");
            Sheet sheet2 = wb.createSheet("Second Sheet");
           wb.write(fileOut);

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}