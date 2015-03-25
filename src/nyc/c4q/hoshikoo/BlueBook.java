package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/24/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static void main(String[] args) {

        // 1. Create a Scanner for user input.
        Scanner input = new Scanner(System.in);
        // 2. Create an ArrayList that holds type Car.
        ArrayList <Car> cars = new ArrayList();


        // 3. Create a few new Car objects and add them to the ArrayList.
        Car car1 = new Car ("Toyota", "Corolla", 1999, 1000);
        Car car2 = new Car ("CarMakeA", "CarModelA", 2010, 5000);
        Car car3 = new Car ("CarMakeB", "CarModelB", 2011, 6000);
        Car car4 = new Car ("CarMakeC", "CarModelC", 2012, 7000);
        Car car5 = new Car ("CarMakeD", "CarModelD", 2013, 8000);
        Car car6 = new Car ("CarMakeE", "CarModelE", 2014, 9000);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println(cars.get(0).getMake());

        // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.

        System.out.println("What is your car's make?");
        String carMake = input.next();

       System.out.println("What is your "+carMake+"'s model?");
        String carModel = input.next();

       System.out.println("What is your "+carMake+ " " +carModel+"'s year?");
       int carYear = input.nextInt();




        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
        for (int i = 0; i <cars.size(); i++){
            Car c = cars.get(i);
            if (carMake.equals(c.getMake())){
                if (carModel.equals(c.getModel())){
                    if(carYear == c.getYear()){
                        System.out.println(carYear + " " +carMake+ " " +carModel+" is worth $"+c.getPrice());
                    }
                }
            }
        }

        // 6. Print the price of that car.
    }
}