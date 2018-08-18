
package com.company;

import java.util.*;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Dublin");
        placesToVisit.add("Clane");
        placesToVisit.add("Maynooth");
        placesToVisit.add("Cork");
        placesToVisit.add("Belfast");

        printList(placesToVisit);

        placesToVisit.add(1, "Killarney");
        printList(placesToVisit);

        placesToVisit.remove(1);
        printList(placesToVisit);

    }


private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
    System.out.println("========================");
}

public static boolean addInOrder(LinkedList <String> linkedList, String newCity){
    ListIterator<String> stringListIterator = linkedList.listIterator();

    while (stringListIterator.hasNext()) {
        int comparison = stringListIterator.next().compareTo(newCity);
        if (comparison == 0){
            //equal, do not add
            System.out.println(newCity + "is already included as a destination");
            return false;

        }

        else if(comparison > 0){
            // new city should appear before this one

            stringListIterator.previous();
            stringListIterator.add(newCity);
            return true;
        }

        else if(comparison <0){
            //move on to next city
        }

    }

    stringListIterator.add(newCity);
    return true;

}

private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in teh itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }





}


}




