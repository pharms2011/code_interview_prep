package com.google.easy;

import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class NumUniqueEmails {
    /*
    * Runtime: 11 ms
    * Memory Usage: 46.9 MB
    *
    * 04-08-22
    * */
    public static int numUniqueEmails(String[] emails) {
        Set set = new TreeSet();

        for (int i = 0; i<emails.length; i++) {
            String email = emails[i];
            if (true) {
                String sanitizeEmail = sanitizeEmail(email);
                set.add(sanitizeEmail);
            }

        }

        return set.size();

    }

    public static String sanitizeEmail(String email) {

        int firstPlus = email.indexOf('+');
        int atLocation = email.indexOf('@');
        int emailLength = email.length();
        String domain = email.substring(atLocation, emailLength);
        String emailStart;
        if(firstPlus != -1){
            emailStart = email.substring(0,firstPlus);
        }
        else{
            emailStart = email.substring(0,atLocation);
        }
        emailStart = emailStart.replace(".", "" );
        return emailStart + domain;
    }

    public static boolean isValidEmail(String email) {
        int atLocation = email.indexOf('@');
        int emailLength = email.length();
        String domain = email.substring(atLocation, emailLength);
        if (domain.indexOf('.') != domain.lastIndexOf('.')) {
            return false;
        }
        return true;
    }
}
