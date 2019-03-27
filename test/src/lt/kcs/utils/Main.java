package lt.kcs.utils;

import java.util.Scanner;

// Description: This is the Java course first exam. See Facebook post for details.
// Author: Michael Hall

public class Main {

    public static int LastElt(int[] arr) {
        // Returns the last element of an array of ints.
        return arr[arr.length - 1];
    }

    ////////////////////////////////
    // The counting methods.
    // The following counts really should be done with lambda functions, but we haven't gotten to that yet.

    public static int CountSmallerThanLast(int[] arr) {
        // Returns the number of elements that are smaller than the final element of the input array.
        int theLastElt = LastElt(arr);
        int result = 0;
        for (int elt : arr) {
            if (elt < theLastElt)
                result++;
        }
        return result;
    }


    public static int CountEven(int[] arr) {
        // Input: an array of ints.
        // Returns: the number of elements that are even.
        int result = 0;
        for (int elt : arr) {
            if (elt % 2 == 0)
                result++;
        }
        return result;
    }

    public static int CountDivisibleByLength(int[] arr) {
        // Input: an array of ints.
        // Returns: the number of elements that are divisible by the length.
        int result = 0;
        int size = arr.length;
        for (int elt : arr) {
            if (elt % size == 0)
                result++;
        }
        return result;
    }

    public static int CountBiggerThanLeft(int[] arr) {
        // Input: an array of ints.
        // Requires: arr.length >= 1
        // Returns: the number of elements that are bigger than their left neighbor.
        int result = 0;
        // We start from i=1, because i=0 is an automatic fail, plus it would cause an error.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                result++;
        }
        return result;
    }


    ////////////////////////////////////////////////////////////
    // The array building methods.

    public static int[] SmallerThanLast(int[] arr) {
        // Input: an array of ints
        // Returns: an array of elements that are smaller than the final element of the input array.
        int count = CountSmallerThanLast(arr);
        int theLastElt = LastElt(arr);
        int[] result = new int[count];
        int counted = 0;
        for (int elt : arr) {
            if (elt < theLastElt) {
                result[counted] = elt;
                counted++;
            }
        }
        return result;
    }

    public static int[] EvenElts(int[] arr) {
        // Input: an array of ints.
        // Returns: an array of ints of only the even elements.
        int count = CountEven(arr);
        int[] result = new int[count];
        int counted = 0;
        for (int elt : arr) {
            if (elt % 2 == 0) {
                result[counted] = elt;
                counted++;
            }
        }
        return result;
    }

    public static int[] DivisibleByLength(int[] arr) {
        // Input: an array of ints.
        // Returns: an array of elements that are divisible by the length of the input array.
        int count = CountDivisibleByLength(arr);
        int[] result = new int[count];
        int size = arr.length;
        int counted = 0;
        for (int elt : arr) {
            if (elt % size == 0) {
                result[counted] = elt;
                counted++;
            }
        }
        return result;
    }


    public static int[] BiggerThanLeft(int[] arr) {
        // Input: an array of ints.
        // Requires: arr.length >= 1
        // Returns: an array of elements that are bigger than their left neighbor.
        int count = CountBiggerThanLeft(arr);
        int[] result = new int[count];
        int counted = 0;
        // We start from i=1, because i=0 is an automatic fail, plus it would cause an error.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result[counted] = arr[i];
                counted++;
            }
        }
        return result;
    }


    public static void printArray(int[] arr) {
        // Prints the array.
        System.out.print("{");
        boolean first = true;
        for (int elt : arr) {
            if (first) {
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(elt);
        }
        System.out.println("}");
    }

    /////////////////////////////////////////////////////////////
    // The problems:

    public static void problem1() {
        // Simple hello world problem.

        System.out.println("Hello World");
        System.out.println("This is my first test.");
        System.out.println("I hope this will a good one!");

    }

    public static void problem2() {
        // Four part array problem, see assignment.
        System.out.println("Enter a number between 1 and 20 for array size:");
        Scanner scan = new Scanner(System.in);
        boolean okay = false;
        int size = 0;
        // loop until user enters a number between 1 and 20 inclusive
        while (!okay) {
            size = scan.nextInt();
            if ((size >= 1) && (size <= 20)) {
                okay = true;
            } else {
                System.out.println("Outside 1-20 range, re-enter.");
            }
        }
        // create the array of the specified size
        int arr[] = new int[size];
        // fill in the array with user-supplied values
        int elt = 0;
        System.out.println("Enter the elements, one on each line:");
        for (int i = 0; i < size; i++) {
            elt = scan.nextInt();
            arr[i] = elt;
        }
        int[] arrSmall = SmallerThanLast(arr);
        System.out.println("The elements smaller than the last are:");
        printArray(arrSmall);
        int[] arrEven = EvenElts(arr);
        System.out.println("The even elements are:");
        printArray(arrEven);
        int[] arrDivisibleByLength = DivisibleByLength(arr);
        System.out.println("The elements evenly divisible by the length are:");
        printArray(arrDivisibleByLength);
        int[] arrBiggerThanLeft = BiggerThanLeft(arr);
        System.out.println("The elements that are bigger than their left neighbor are:");
        printArray(arrBiggerThanLeft);
    }

    public static int megaMin(int int1, int int2, int int3) {
        // min of three ints
        return(Math.min(Math.min(int1, int2), int3));
    }

    public static void problem3() {
        // nasty long word problem in Lithuanian, see assignment.

        // Step 1: read the data. Warning: no error checking. Data must be in good format.
        System.out.println("Enter carp data. (For format see test.)");
        Scanner scan = new Scanner(System.in);
        int numberStacks = scan.nextInt();
        int[] sheetsArr = new int[numberStacks];
        char[] colorArr = new char[numberStacks];
        String colorCode = "";
        int stackSize = 0;
        int countG = 0;
        int countZ = 0;
        int countR = 0;
        for (int thisStack = 0; thisStack < numberStacks; thisStack++) {
            colorCode = scan.next();
            stackSize = scan.nextInt();
            // collate the data
            switch (colorCode) {
                case "G":
                    countG += stackSize;
                    break;
                case "Z":
                    countZ += stackSize;
                    break;
                case "R":
                    countR += stackSize;
                    break;
                default:
                    System.out.println("Error: ignoring unknown color code: " + colorCode);
            }
        }

        // Step 2: count the flags and print the number
        int theMin = megaMin(countG, countZ, countR);
        // Flags have two sides, so odd number gets "rounded" down.
        if (theMin % 2 == 1) {
            theMin--;
        }
        int flags = theMin / 2;
        System.out.println(flags);

        // Step 3: print the remainders
        int remG = countG - theMin;
        int remZ = countZ - theMin;
        int remR = countR - theMin;
        System.out.println("G = " + remG);
        System.out.println("Z = " + remZ);
        System.out.println("R = " + remR);
    }

    public static void main(String[] args) {
        // write your code here
        problem1();
        problem2();
        problem3();
    }
}