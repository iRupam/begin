/*
 * Problem Statement
Alexa and Bob play a game of Numbers. Both of them are given two arrays with n numbers each. The player having more unique numbers win the game. Find the winner of the game.
Input
The first line of the input consists of an integer n. The next two lines of the input consist of n space-separated integers each that Alexa and Bob have respectively i.e. The first n integers represent the elements of Alexa's array and the next n integers represent the elements of Bob's array.

Constraints
1 ≤ n ≤ 100
1 ≤ ai ≤ 103
Output
Print Alexa if the number of unique elements in Alexa's array is more than that of Bob's array else print Bob.
Example
Sample Input 1
3
4 4 2
5 3 4
Sample Output 1
Bob

Sample Input 1
4
5 6 7 10
2 3 3 2

Sample Output 1
Alexa
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class uniqueNumberGame{
    public static void main(String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int noOfInt = in.nextInt();
        int numOfAlexa[] = new int[noOfInt];
        int numOfBob[] = new int[noOfInt];
        int uniqAlexa = 1;
        int uniqBob = 1;

        for (int i = 0; i < noOfInt; i++) {
            numOfAlexa[i] = in.nextInt();
        }

        for (int j = 0; j < noOfInt; j++) {
            numOfBob[j] = in.nextInt();
        }

        for (int k = 1; k < noOfInt; k++) {
            int l = 0;
            for (l = 0; l < k; l++) {
                if (numOfAlexa[k] == numOfAlexa[l]) {
                    break;
                }
            }
            if (k == l) {
                uniqAlexa++;
            }
        }
        for (int m = 1; m < noOfInt; m++) {
            int n = 0;
            for (n = 0; n < m; n++) {
                if (numOfBob[m] == numOfBob[n]) {
                    break;
                }
            }
            if (m == n) {
                uniqBob++;
            }
        }
        if (uniqAlexa > uniqBob) {
            System.out.println("Alexa");
        } else {
            System.out.println("Bob");
        }
    in.close();
    }
}
