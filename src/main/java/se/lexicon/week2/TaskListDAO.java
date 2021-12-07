package se.lexicon.week2;

import java.util.Arrays;

public class TaskListDAO {

    public static String[] taskList = {"Clean Kids Room", "Make Food", "Go Shop Food"};

    public static void main(String[] args) {
//        printTasks(taskList);

//       String arrayAsString = arrayToString(taskList);
//
//        System.out.println(arrayAsString);


//        taskList = addTask("Fuel the Car", taskList);
//        printTasks(taskList);

//        System.out.println(findTask("ClEaN BathRooM", taskList));
//
//        taskList = addTask("Clean Bathroom", taskList);
//
//        System.out.println(findTask("ClEaN BathRooM", taskList));

        String[] tasksOfTheDay = {"java.util.Array Lecture", "Working with exercises", "Send exercises to Teacher"};

       taskList = addTask(taskList, tasksOfTheDay);

       taskList = addTask(taskList, "Eat Breakfast", "Eat Lunch");

        System.out.println(taskList);
        System.out.println(Arrays.toString(taskList));

    }

    public static String findTask(String taskToFind, String[] source){
        //Look through all elements
        for (String taskToCheck: source) {
            //Verify of it's a match
            if (taskToCheck.equalsIgnoreCase(taskToFind))
                return taskToCheck;
        }

        //Otherwise, give default message
        return "Could Not Find any Match";
    }

    public static String findTask(final String[] source, String taskToFind){
        String[] temp = Arrays.copyOf(source, source.length);
        Arrays.sort(temp);
        int elementFoundOnIndexPosition = Arrays.binarySearch(temp, taskToFind);

        if (elementFoundOnIndexPosition < 0) {
            return null;
        }
        return temp[elementFoundOnIndexPosition];
    }

    public static String[] addTask(String taskToAdd, String[] addToArray){

        String[] newArray = Arrays.copyOf(addToArray, addToArray.length +1);

        newArray[newArray.length -1] = taskToAdd; //newArray[3] = "Fuel the Car"
        //         0               1            2                3
        //["Clean Kids Room", "Make Food", "Go Shop Food", "Fuel the Car"]

        return newArray;
    }

    public static String[] addTask(String[] source, String ...elementsToAdd){
        String[] newArray = Arrays.copyOf(source, source.length + elementsToAdd.length);
        //i - end of source, where to start adding element,
        //j - The new element to add.
        for (int i = source.length, j = 0; i < newArray.length;i++, j++){
            newArray[i] = elementsToAdd[j];
        }
        return newArray;
    }


    public static void printTasks(String[] tasksToPrint){
        String toPrint = "[ ";

        for (int i=0; i < tasksToPrint.length; i++){
            toPrint = toPrint.concat(tasksToPrint[i] + ", ");
        }
        System.out.println(toPrint + "]");
    }


    public static String arrayToString(String[] taskList){

        String tasks = "[ ";

        for (String task : taskList) {
            tasks = tasks.concat(task + ", ");
        }

        return tasks + "]";

    }


}
