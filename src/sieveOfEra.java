import java.util.Scanner;

public class sieveOfEra {

    public static int[] createSequence(int n) {
        int[] sequence = new int[n - 1];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i + 2;
        }
        return sequence;

    }

    public static void crossOutHigherMultiples(int[] temArr, int n) {
        if (temArr == null) {
            return;
        }
        for (int i = 0; i < temArr.length; i++) {
            int numArr = temArr[i];
            if (numArr != 0) {
                if ((numArr % n == 0) && (numArr != n)) {
                    temArr[i] = 0;
                }
            }

        }
    }

    public static int[] sieve(int n) {
        int[] sieveArr = createSequence(n);

        for (int i = 0; i < n - 2; i++) {
            crossOutHigherMultiples(sieveArr, i + 2);
        }

        return sieveArr;
    }

    public static String sequenceToString(int[] temArr) {

        String newString = "";

        if (temArr == null) {
            return "";
        }

        for (int i = 0; i < temArr.length; i++) {

            int arrNum = temArr[i];

            newString = newString + ((arrNum == 0) ? "[" + Integer.toString(i+2)  + "], " : Integer.toString(arrNum) + ", ");

        }
        return newString;
    }

    public static String nonCrossedOutSubseqToString(int[] temArr) {
        String newString = "";

        if (temArr == null) {
            return "";
        }

        for (int i = 0; i < temArr.length; i++) {
            int arrNum = temArr[i];

            newString = newString + ((arrNum == 0) ? "" : Integer.toString(arrNum) + ", ");

        }
        return newString;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean finished = false;
        int num = 0;
        boolean prime = true;

        Scanner input = new Scanner(System.in);

        do {

            System.out.printf("Enter int >= 2 : ");

            if (input.hasNextInt()) {
                num = input.nextInt();

                if (num >= 2) {
                    finished = true;
                } else
                    System.out.printf("\nError: Enter a valid integer");
            } else {
                System.out.printf("\nError: Enter integer");
                input.next();

            }
        } while (!finished);

        int sequence[] = createSequence(num);

        for (int i = 0; i < sequence.length; i++) {
            if (i == (sequence.length - 1)) {
                sequence[i] = i + 2;
                System.out.print(sequence[i]);
            } else {
                sequence[i] = i + 2;
                System.out.print(sequence[i] + ", ");

            }

        }

        int[] primeSequence = createSequence(num);

        for(int index=2; index<=num; index++)
        {

            int i = 2;

            if (index%i==0 && index!=2)
            {
                crossOutHigherMultiples(primeSequence, index);
                String eachString = sequenceToString(primeSequence);
                System.out.print("\n" + eachString);
                return;
            }


            if (index==2)
            {
                crossOutHigherMultiples(primeSequence, index);
                String eachString = sequenceToString(primeSequence);
                System.out.print("\n" + eachString);
                return;

            }

            i++;


        }



        int temArr[] = sieve(num);

        String stringPrime = nonCrossedOutSubseqToString(temArr);
        System.out.println("\n" + stringPrime);

    }

}