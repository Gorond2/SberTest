package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lets begin");
        System.out.println("");

        String[] inpMass = new String[] {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50",
                "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29",
                "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        // Создаём объекты "Машины"
        Car carMass[] = new Car[inpMass.length];
        for (int i = 0; i < inpMass.length; i++){
            carMass[i] = new Car(inpMass[i]);
        }

        // роводим операции на объектами "Машины"
        for (int i = 0; i < inpMass.length; i++){
            System.out.println("Машина №" + i);

            System.out.println("codeCar: " + carMass[i].codeCar);
            System.out.println("gosNomer: " + carMass[i].gosNomer);
            System.out.println("probeg: " + carMass[i].probeg);
            System.out.println("addParam: " + carMass[i].addParam);

            System.out.println("======================");
        }

        //String inpStr = new String("C200_1-120-1200");
        //Car carUnit = new Car(inpStr);
//
//        System.out.println("codeCar: " + carUnit.codeCar);
//        System.out.println("gosNomer: " + carUnit.gosNomer);
//        System.out.println("probeg: " + carUnit.probeg);
//        System.out.println("addParam: " + carUnit.addParam);

    }
}

