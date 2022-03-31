package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	A Growing Rivalry
    Time Limit: 1 sec
    Memory Limit: 128000 kB
    Problem Statement
    Nutan and Tusla are both students at Newton School. They are both among the best students in
    the class. In order to know who is better among them, a game was organised. The game consisted of
    L rounds, where L is an odd integer. The student winning more rounds than the other was declared the winner.

    You would be given a string of odd length L in which each character is 'N' or 'T'. If the ith character is
    'N', then the ith round was won by Nutan, else if the character is 'T' it was won by Tusla. Print "Nutan''
    if Nutan has won more rounds than Tusla, else print "Tusla'' if Tusla has won more rounds than Nutan.

    Note: You have to print everything without quotes.
    Input
    The first line of the input contains a single integer L — the number of rounds (1 ≤ L ≤ 100 and L is odd).
    The second line contains a string S of length L. Each character of S is either 'N' or 'T'.
    Output
    Print "Nutan" or "Tusla" according to the input.
    Example
    Sample Input:
    3
    NNT
    Sample Output:
    Nutan
 */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int countN=0,countT=0;
        String str = sc.next();
        str = str.toUpperCase();
        if(str.length()==l){
            for(int i=0;i<l;i++){
                if(str.charAt(i)=='N' || str.charAt(i)=='T'){
                    if(str.charAt(i)=='N'){
                        countN++;
                    }
                    else if(str.charAt(i)=='T'){
                        countT++;
                    }
                }
            }
            if(countN>countT){
                System.out.println("Nutan");
            }
            else{
                System.out.println("Tusla");
            }
        }

    }
}