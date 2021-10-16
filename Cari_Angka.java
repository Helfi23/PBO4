/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo4;

/**
 *
 * @author Helfi Apriliyandi F
 */
 import java.util.Scanner;
public class Cari_Angka {
   public static void main(String[] args) {
    int angka;
    int TutupPalindrome;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Angka : ");
    angka = input.nextInt();

    if (angka <= 10) {
      TutupPalindrome = 11;
    }

    TutupPalindrome = findClosestPalindrome(angka);
    System.out.println("Palindrome terdekat adalah : " + TutupPalindrome);
  }

  
  public static int findClosestPalindrome(int number) {
    int TutupPalindrome = 0;

    while (!isPalindrome(number)) {
      number++;
    }

    return number;
  }

  public static boolean isPalindrome(int number) {
    int reversedNumber = reverseNumber(number);
    return reversedNumber == number;
  }

  public static int reverseNumber(int number) {
    int reversedNumber = 0;

    while (number != 0) {
      int remainNumber = number % 10;
      reversedNumber = reversedNumber * 10 + remainNumber;
      number = number / 10;
    }

    return reversedNumber;
  }
}
