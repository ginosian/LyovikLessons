package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int integerGenerator (int lowEnd, int highEnd){

        int randomInteger;
        Random random = new Random();
        randomInteger = random.nextInt(highEnd - lowEnd) + lowEnd;
        return randomInteger;
    }

    public static int [] reorderMyArray (int myArray[], boolean index) {

        if (index == true){
            int temp = 0;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = i+1; j <myArray.length ; j++) {
                    if (myArray[i] < myArray[j]){
                        temp = myArray[i];
                        myArray[i] = myArray [j];
                        myArray[j] = temp;
                    }

                }

            }
        }
        else if (index == false){
            int temp = 0;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = i+1; j <myArray.length ; j++) {
                    if (myArray[i] > myArray[j]){
                        temp = myArray[i];
                        myArray[i] = myArray [j];
                        myArray[j] = temp;
                    }

                }

            }
        }
        return myArray;
    }


    public static void main(String[] args) {

       /** ****************************************************************************************** **/
        //Konsloc vercnel tiv, konsoloc vercnel tvi qanakutyamb andamner, hashvel dranc tvabanakn mijiny, mecaguyn ev
        //pokraguyn arjekner@, cucadrel drank ev ays amen@ aranc array ogtagorcelu

       /** Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputQuantity = scanner.nextInt();

        if (inputQuantity == 0 || inputQuantity < 1){
            System.out.println("Invalid number");
            return;
        }

        // DEBIL SHUN! :D

        else {
            System.out.println("Enter " + inputQuantity + " members value");
            int sum = 0;
            int nextmember = 0;
            int temp = 0;

            for (int i = 0; i < inputQuantity; i++) {

                nextmember = scanner.nextInt();
                temp = nextmember;
                sum = sum + temp;


            }
            System.out.println(sum);
            System.out.println("The average of the members is " + sum / inputQuantity);

        }**/

        /** ****************************************************************************************** **/

        //Stexcel mi funkcia vor@ vorpes argument kstana 2 amboxch tiv` verevi ev nerqevi sahman` low end and high end:
        //funkcian kveradarcni nshvac sahmanum patahakan amboxch tiv:
        //Stexcel amboxch tveri miachap array, chap@ vercnel konsolic ev konsoloc vercnel inicializacman mijakayq@
        // aynuhetev inicializcnel array@ very nshvac mijakayqi patahakan tverov

        /** Scanner scanner   = new Scanner(System.in);
        System.out.println("Enter Low End");
        int lowEnd = scanner.nextInt();
        System.out.println("Enter High End");
        int highEnd = scanner.nextInt();
        int randomInteger = integerGenerator(lowEnd, highEnd);
        System.out.println("LowEnd = " + lowEnd + "\t" + "HighEnd = " + highEnd);
        System.out.println("RandomNumber = " + randomInteger);

        System.out.println("Enter array size");

        int arraySize = scanner.nextInt();


        int [] myArray = new int [arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = integerGenerator(lowEnd, highEnd);
            System.out.println("Array " + i + " is " + myArray[i]);

        }**/

        /** ****************************************************************************************** **/
        // grel funkcia vor@ vorpes argument kstana amboxch tveri array ev boolean a8=eq: Ete boolean@ true e
        //apa funkcian trvac array@ kdasavori achman kargov, ete ete hakark@

       /** int [] myArray = new int [5];
        myArray[0] = 8;
        myArray[1] = 5;
        myArray[2] = 4;
        myArray[3] = 9;
        myArray[4] = 3;

        boolean index = true;

        reorderMyArray(myArray, index);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Array " + i + " = " + myArray[i]);
        }**/
        /** ****************************************************************************************** **/

        //stexcel mi cragir vor@ kunena konsolayin menyu vor@ hnaravorutyun kta ogtvel hetevyal hramanneric
        //Avelacnel ashxatox
        //Heracnel ashxatox
        //Cwucadrel ashxatoxneri cucak@ manramasnutyamb
        //Durs gal cragric
        //Ashxatox@ nkaragrvum e anunov azganunov tariqov serov ev ashxatavardzov

        System.out.println("please enter action");
        System.out.println();
        System.out.println("1. Add employee");
        System.out.println("2. Delete employee");
        System.out.println("3. Show employee information");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

       /** switch (userInput){
            case 1:;
                break;
            case 2;
                break;
            case 3;
                break;
            case 4;
                return;**/





        }




    }

