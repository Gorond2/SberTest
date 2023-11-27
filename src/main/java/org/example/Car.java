package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    Integer codeCar;
    Integer gosNomer;
    Integer probeg;
    Integer addParam;

    public Car(String incomeNumber /*Integer codeCar, Integer gosNomer, Integer probeg, Integer addParam*/) {
        //C<CODE_CAR>_гос номер-Пробег-(доп. параметр)
        //Pattern regExPat = Pattern.compile("^C[0-9]+_"); // шаблон
        //Matcher sourceStr = regExPat.matcher(incomeNumber);
        try {


            this.codeCar = Integer.valueOf(incomeNumber.substring(1, 4));

            // "C200_1-120-1200"
            //  012345678901234
            //System.out.println("Начало: " + (incomeNumber.indexOf("_") + 1));
            //System.out.println("Конец: " + (incomeNumber.indexOf("-")));
            this.gosNomer = Integer.valueOf(incomeNumber.substring(incomeNumber.indexOf("_") + 1, incomeNumber.indexOf("-")));

            int firstIncome = incomeNumber.indexOf("-");
            int lastIncome = incomeNumber.lastIndexOf("-");
           // выясняю: первое вхождение "-" - оно же последнее?
            if (firstIncome == lastIncome) {
                this.probeg = Integer.valueOf(incomeNumber.substring(firstIncome + 1, incomeNumber.length()));
            } else {
                this.probeg = Integer.valueOf(incomeNumber.substring((firstIncome + 1), lastIncome));
                this.addParam = Integer.valueOf(incomeNumber.substring((lastIncome + 1), incomeNumber.length()));
            }
        }
        catch (Exception allExc) {
            System.out.println("В строке : " + allExc.getStackTrace()[0].getLineNumber() + " Ошибка: " + allExc.getMessage());
        }
        //this.codeCar = codeCar;
        //this.gosNomer = gosNomer;
        //this.probeg = probeg;
        //this.addParam = addParam;
    }
}
