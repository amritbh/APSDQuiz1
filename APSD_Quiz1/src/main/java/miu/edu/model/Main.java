package miu.edu.model;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
        Contact[] contacts = {
                new Contact("Amrit", "Bhattarai", "ABC LLC", "DevOps Engineer",
                        Arrays.asList(new PhoneNumber("666-133-777", "Home")),
                        Arrays.asList(new EmailAddress("amrit.bhattarai@outlook.com", "Home"),
                                new EmailAddress("amritb@abc.com", "Work"))),
                new Contact("Manish", "Basnet", "Apple", "Sr. Software Engineer",
                        Arrays.asList( ),
                        Arrays.asList()),
                new Contact("Ramesh", "Thapa", "Google", "Manager",
                        Arrays.asList(new PhoneNumber("333-116-3333", "Work")),
                        Arrays.asList(new EmailAddress("ramesh@google.com", "Work")))
        };

        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));
//        for (Contact c : contacts) {
//            System.out.println(c);
//        }
        Gson gson = new Gson();
        for (Contact c : contacts) {
            System.out.println(gson.toJson(c));
        }
    }
}