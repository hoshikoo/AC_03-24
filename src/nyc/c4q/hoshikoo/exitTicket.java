package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/24/15.
 */

import java.util.ArrayList;


public class exitTicket {

    public static void main(String[] args) {
        // Call the needed constructor.
        ArrayList <String> classmates = new ArrayList();
        classmates.add("Joseph");
        classmates.add("Nathan");

        // How would you ask the program if classmates included your name?


        System.out.println(classmates.contains("Hoshiko"));
        System.out.println(classmates.size());
    }

}
