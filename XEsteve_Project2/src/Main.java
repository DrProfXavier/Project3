import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bender = new Scanner(System.in);
        //String userTest = bender.next();
        //char[] charArray = userTest.toCharArray();//
        //int[] decimalValues = convertChars(charArray);


        Scanner robot = new Scanner(System.in);
        System.out.println("Please input a string to be sorted");
        String userString = robot.next();

        System.out.println("Please select the option you would like to see\n");
        System.out.println("1. Display character frequencies alphabetically");
        System.out.println("2. Display sorted frequencies");
        System.out.println("3. Show types of character frequencies");
        System.out.println("4. Exit");

        int userChoice = robot.nextInt();

        switch (userChoice)
        {
            case 1:
                char[] charArray = userString.toCharArray();
                int[] ASCIIarray = new int[userString.length()];
                int count;
                for (count = 0; count <= userString.length() - 1; count++)
                {
                    ASCIIarray[count] = (int) charArray[count];
                }
                //COMMMENCE THE SORT
                int n = ASCIIarray.length;
                int k;
                for (int m = n; m >= 0; m--)//for (j = 0; j < ASCIIarray.length; j++)
                    for (int i = 0; i < n -1; i++)
                    {
                        k = i + 1;
                        if (ASCIIarray[i] > ASCIIarray[k])
                        {
                            int temp;
                            temp = ASCIIarray[i];
                            ASCIIarray[i] = ASCIIarray[k];
                            ASCIIarray[k] = temp;
                        }
                    }
                    for (int z = 0; z < ASCIIarray.length; z++)
                    {
                        System.out.print(ASCIIarray[z] + ", "); //prints out each element of the array as _, _ , _,, must convert ASCII to char
                    }
                break;

            case 2:
                break;

            case 3:
                int txtChars = 0;
                int numChars = 0;
                int whiteSpace = 0;
                int symbols = 0;
                charArray = userString.toCharArray();
                ASCIIarray = new int[userString.length()];

                for (int element : ASCIIarray)
                {
                    if (element >= 47 && element <= 57)
                    {
                        numChars++;
                    }
                    //Check if the current elem is a symbol
                    else if ((element >= 58 && element <= 64) || (element >= 91 && element <= 96) || (element >= 123 && element <= 126))
                    {
                        symbols++;
                    }
                    //Check if its a letter
                    else if ((element >= 65 && element <= 90) || (element >= 97 && element <= 122))
                    {
                        txtChars++;
                    }
                    else if (element == 32)
                    {
                        whiteSpace++;
                    }
                }
                System.out.println("Textual Character count: " + txtChars);
                System.out.println("Numerical Character count: " + numChars);
                System.out.println("WhiteSpace Character count: " + whiteSpace);
                System.out.println("Symbol Character count: " + symbols + "\n");


                break;

            case 4:
                break;
            default:
                System.out.println("Error, bad input, please enter a number 1-4");
        }
    }

    /*public static char[] ASCIItoChar (int[] ASCIIvalues)
    {
        char[] convChars = new char[ASCIIvalues.length];

        for (int count = 0; count < ASCIIvalues.length; count++)
        {
            convChars[count] = (char) ASCIIvalues[count];
        }
        return convChars;
    }*/


    /*
    public void frequencySort(int[] ASCIIval)

    {
        int i,j= 0;
        int n;
        for (j = 0; j < ASCIIval.length; j++)
        /*{
            int iMin = j;
            for (i = j + 1; i < ASCIIval.length; i++) {
                if (ASCIIval[i] < ASCIIval[iMin]) {
                    iMin = i;
                }
            }

            if (iMin != j)
            {
                int temp = ASCIIval[j];
                ASCIIval[j] = ASCIIval[iMin];
                ASCIIval[iMin] = temp;
            }
        }

        char [] sortedFrequency = ASCIItoChar(ASCIIval);
        for (int count = 0; count < sortedFrequency.length; count++)
        {
        }
     */


    /*
    public static int[] convertChars(char[] userString) //convert char array from main.12 to ASCII

    {
        int[] ASCIIval = new int[userString.length]; //What to put into []?
        int count = 0;
        for (count = 0; count <= userString.length - 1; count++)
        {
            ASCIIval[count] = (int) userString[count];
        }

        return ASCIIval;
    }
    */

    /*private void charTypes(int[] ASCIIval)  //Done???
    {
        int txtChars = 0;
        int numChars = 0;
        int whiteSpace = 0;
        int symbols = 0;
        int count = 0;

        for (int element : ASCIIval)
        {
            if (element >= 47 && element <= 57)
            {
                numChars++;
            }
            //Check if the current elem is a symbol
            else if ((element >= 58 && element <= 64) || (element >= 91 && element <= 96) || (element >= 123 && element <= 126))
            {
                symbols++;
            }
            //Check if its a letter
            else if ((element >= 65 && element <= 90) || (element >= 97 && element <= 122))
            {
                txtChars++;
            }
            else if (element == 32)
            {
                whiteSpace++;
            }
        }
        System.out.println("Textual Character count: " + txtChars);
        System.out.println("Numerical Character count: " + numChars);
        System.out.println("WhiteSpace Character count: " + whiteSpace);
        System.out.println("Symbol Character count: " + symbols + "\n");

    }*/



}