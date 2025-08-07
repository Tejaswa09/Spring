package com.xworkz.excelworking;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InstituteRunner {
    public static void main(String[] args) {
       //String filePath = "C:/Users/tejas/OneDrive/Desktop/Institute.xlsx";
        File filePath = new File("C:\\Users\\tejas\\OneDrive\\Desktop\\Institute.xlsx");

        try{
            FileInputStream excelFile = new FileInputStream(filePath);
            System.out.println("File found");

            try(Workbook workbook = new XSSFWorkbook(excelFile)){

                Sheet sheet = workbook.getSheet("TrainerSheet");
                if (sheet == null) {
                    System.out.println("Sheet 'Trainer sheet Not Found' not found!");
                    return;
                }

                System.out.println("Successfully loaded sheet: " + sheet.getSheetName());

                int lastRow = sheet.getLastRowNum();

                Object[][] newTrainers ={
                        {1,"Devendra","Java Full Stack",18},
                        {2,"Omkar","Java Full Stack",25},

                };

                for (Object[] trainee: newTrainers ){
                    Row newRow = sheet.createRow(++lastRow);
                    int cel = 0;
                    for (Object obj:trainee){
                        Cell cell = newRow.createCell(cel++);
                        if (obj instanceof String) cell.setCellValue((String) obj);
                        else if (obj instanceof Integer) cell.setCellValue((Integer) obj);
                    }
                }
                try (FileOutputStream outFile = new FileOutputStream(filePath)) {
                    workbook.write(outFile);
                    System.out.println("Workbook updated and saved.");
                }
                System.out.println("Two new rows have been appended.");

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.print(cell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.print(cell.getNumericCellValue() + "\t");
                                break;
                            case BOOLEAN:
                                System.out.print(cell.getBooleanCellValue() + "\t");
                                break;
                            case FORMULA:
                                System.out.print(cell.getCellFormula() + "\t");
                                break;
                            default:
                                System.out.print("NULL\t");
                        }
                    }
                    System.out.println(); // new line after each row
                }
                System.out.println("----------");


            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
