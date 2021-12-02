package se.lexicon;

public class WhatIsYourRole {

    public static void main(String[] args) {

        //Guest, Employee, Manager, Ceo
        String role = "Manager";

        switch (role){

            case "Guest":
                System.out.println("Hello, welcome let me show you around!");
                break;
            case "Employee":
                System.out.println("Hello, welcome back, here are today's tasks.");
                break;
            case "Manager":
                System.out.println("Hello, Here is the report from yesterday!");
                break;
            case "Ceo":
                System.out.println("Hello, here is the report about the company's health.");
                break;
            default:
                System.out.println("Hm.. does not recognize that role");
        }

    }
}
