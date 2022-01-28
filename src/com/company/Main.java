//Leke Obayemi
//Exercise 1
// 1/20/22

package com.company;

public class Main {

    public static void main(String[] args) {
	    String city = "Columbus";
        int code = 43215;
        double temps[] = {32, 25, 27, 40, 45};
        double avgTemps = (temps[0] + temps[1] + temps[2] + temps[3] + temps[4]) / temps.length;
        System.out.print("City: " + city + " Zip Code: " + code + " Average High Temperature " + avgTemps); //Prints Zip code, average temperature, and city
    }
}
