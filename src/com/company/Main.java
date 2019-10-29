package com.company;

public class Main {

    public static void main(String[] args) {

        int [] numbersArray = {1,2,3,4,5,6,7,8,9,10};

        for (int i = numbersArray.length -1; i >=0; i--) {
            // 10 - 1 = 9; 9 is less than 0
            // position 9 goes down and prints the element within "10"
            // 9 hits the condition and 'i--" substracting 1
            // 8 is less than 0, goes down and prints 9
            // we now have 10, 9 printed
            //etc etc etc until were are at numbers length = -1 where it breaks the loop
            // the result will print every element from 10 to 1


                System.out.println(numbersArray[i]);
            }
        }
    }


//7. Declare an array with the numbers 1-10.
// Print the numbers 1-10 backwards from the array.
