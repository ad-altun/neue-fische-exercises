package org.example;

public class Main {
    public static void main(String[] args) {

        Car carMazda = new Car("Mazda", "Cx-30", "sand",
                        2024, 90);

        Car carMazda2 = new Car("Mazda", "Cx-30", "sand",
                2024, 90);

        Car carRenault =  new Car("Renault", "Twingo", "blue",
                        2015, 60);

//        String carMazda = car.toString();
        System.out.println(carMazda);
//        carMazda.start();
//        carMazda.accelerate(50);

        System.out.println();

        System.out.println(carMazda == carMazda2);
        System.out.println(carMazda.equals(carMazda2));
        System.out.println(carMazda == carRenault);
        System.out.println(carMazda.equals(carRenault));

        System.out.println(carMazda);
        System.out.println(carMazda2);

    }
}