package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/24/15.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class NameTracker {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        Scanner input = new Scanner(System.in);


        System.out.println("Please give me some names:");
        for (int i=0; i<5; i++){
            names.add(input.next().toLowerCase());
        }

        System.out.println(names.size()); // 5
        System.out.println(names);
        System.out.println("Your name(s) are saved!");
        System.out.println("Your " +names.size()+" name(s) are saved!");

        //System.out.println(names.get(4));

        for (int i=(names.size())-1; i>=0; i--){
            System.out.println(names.get(i));
        }

        System.out.println("Search for a name:");

        System.out.println(names.contains(input.next().toLowerCase()));
    }
}
