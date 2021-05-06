package de.hfu;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String kleinbuchstaben = input.nextLine();
        input.close();

        System.out.println(kleinbuchstaben.toUpperCase(Locale.ROOT));
    }
}
