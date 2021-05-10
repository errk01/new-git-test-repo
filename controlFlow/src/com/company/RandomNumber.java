package com.company;

public class RandomNumber {

    public static void printLottoNumber () {

        int[] lottery = new int[5];
        int randomNum;
        c1:
        for (int i = 0; i < 5; i++) {
            // Random number created here.
            randomNum = (int) (Math.random() * 50);
            if(randomNum == 0) {
                continue c1;
            }
            for (int x = 0; x < i; x++) {
                // Here, code checks if same random number generated before.
                if (lottery[x] == randomNum )
                {
                    // If random number is same, another number generated.
                    randomNum = (int) (Math.random() * 50);
                    x = -1; // restart the loop
                }

            }
            lottery[i] = randomNum;
        }

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " " );
    }
}
