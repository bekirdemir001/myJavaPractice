package javaPractice.statistics.averages;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class ArithmeticMeanInSimpleSeries {

    /*
    Arithmetic Mean: Type a program that calculate the arithmetic mean of simple series. Use Excel read!
     */

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BigDecimal arithmeticMean;
        String countryName = "";

        do {
            System.out.println("Enter a European Country name");
            System.out.println("Press Q for exist");
            countryName = scanner.nextLine();

            if (countryName.equalsIgnoreCase("Q")){
                System.out.println("***************** Good Bye! ******************");
                break;
            }

            boolean isCountryExist = isCountryExist(countryName);
            if (!isCountryExist){
                System.out.println("This country is not exist in European Countries");
                System.out.println("Please try again!");
                break;
            }

            arithmeticMean = getArithmeticMean(countryName);
            System.out.println("The arithmetic mean of " + countryName + "= " + arithmeticMean);

        }while (true);


    }

    //Create a method that calculate arithmetic mean of simple series
    public static BigDecimal getArithmeticMean(String country) throws IOException {

        List<Double> intList = getPopulationData(country);
        double arithmeticMean = 0.0;
        int sum = 0;

        for (Double w : intList){
            sum += w;
        }

        arithmeticMean = (double) sum / intList.size();

        BigDecimal bigDecimal = BigDecimal.valueOf(arithmeticMean);
        BigDecimal formattedNumber = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        return formattedNumber;
    }

    //Check European Country is in the Excel Directory and get row number
    public static boolean isCountryExist(String country) throws IOException {

        boolean isExist = false;

        String path = "src/main/resources/europeanCountriesPopulations(2014-2022).xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("europeanPopulations");

        int sumOfRows = sheet.getLastRowNum();

        for (int i = 0; i <= sumOfRows; i++){

            String cellStringValue = sheet.getRow(i).getCell(0).toString();

            if (cellStringValue.equalsIgnoreCase(country)){
                isExist = true;
            }
        }

        return isExist;
    }
    public static int getCountryIndex(String country) throws IOException {

        int rowIndex = -1;

        String path = "src/main/resources/europeanCountriesPopulations(2014-2022).xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("europeanPopulations");

        int sumOfRows = sheet.getLastRowNum();

        for (int i = 0; i <= sumOfRows; i++){

            String cellStringValue = sheet.getRow(i).getCell(0).toString();

            if (cellStringValue.equalsIgnoreCase(country)){
                rowIndex = sheet.getRow(i).getCell(0).getRowIndex();
            }
        }

        return rowIndex;
    }

    //Get data from Excel Sheets and add them into a list.
    public static List<Double> getPopulationData(String str) throws IOException {

        List<Double> list = new ArrayList<>();
        int rowIndex = getCountryIndex(str);

        String path = "./src/main/resources/europeanCountriesPopulations(2014-2022).xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("europeanPopulations");
        Row row = sheet.getRow(rowIndex);

        int columnCount = row.getLastCellNum();

        for (int i = 1; i < columnCount; i++){
            list.add(row.getCell(i).getNumericCellValue());
        }

        return list;
    }

}