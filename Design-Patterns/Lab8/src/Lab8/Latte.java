package Lab8;

import Condiment.Condiment;
import java.util.Scanner;

public class Latte extends Coffee{

private String latte="LATTE";

public Latte(String name,int price)

{

super(name,price);

}

public String getName()

{

return latte;

}

public void start()

{

String input;

getEnv().setCoffeeType(latte);

setCondiment(new Condiment());

do{

System.out.println("Do you want to add condiments \n 0. No\n 1.Sugar\n 2.Cream\n 3.Milk\n");

Scanner myObj= new Scanner(System.in); // Create a Scanner object

input = myObj.nextLine();

if(input!=null)

{

setCondimentPrice(Float.parseFloat(getCondiment().addCondiment(input)));

}

}while(!input.equalsIgnoreCase("0"));


getEnv().setPowerLed(1); 

getEnv().setTypeLed(3);

getEnv().setGrindingTime(9);


getEnv().setTemperature(250);

getEnv().holdTemperature(4);

getEnv().wait(15);

getEnv().done();

getEnv().computePrice(this);

}



}