package se.lexicon.week2;

public class TaskListDAO {

    public static String[] taskList = {"Clean Kids Room", "Make Food", "Go Shop Food"};

    public static void main(String[] args) {
//        printTasks(taskList);

//       String arrayAsString = arrayToString(taskList);
//
//        System.out.println(arrayAsString);


//        taskList = addTask("Fuel the Car", taskList);
//        printTasks(taskList);

        System.out.println(findTask("ClEaN BathRooM", taskList));

        taskList = addTask("Clean Bathroom", taskList);

        System.out.println(findTask("ClEaN BathRooM", taskList));


    }


    public static String findTask(String taskToFind, String[] source){
        //Look through all elements
        for (String taskToCheck: source) {

            //Verify of it's a match
            if (taskToCheck.equalsIgnoreCase(taskToFind))
                return taskToCheck;
        }

        //Otherwise give default message
        return "Could Not Find any Match";
    }







    public static String[] addTask(String taskToAdd, String[] addToArray){

        String[] newArray = new String[addToArray.length + 1]; // [null, null, null, null]

        // addToArray : ["Clean Kids Room", "Make Food", "Go Shop Food"]
        // newArray :  [null, null, null, null]
        // Iteration 1 : ["Clean Kids Room", null, null, null]
        // Iteration 2 : ["Clean Kids Room", "Make Food", null, null]
        // Iteration 3 : ["Clean Kids Room", "Make Food", "Go Shop Food", null]
        for (int i = 0; i<addToArray.length; i++){
            newArray[i] = addToArray[i];
        }

        newArray[newArray.length -1] = taskToAdd; //newArray[3] = "Fuel the Car"
        //         0               1            2                3
        //["Clean Kids Room", "Make Food", "Go Shop Food", "Fuel the Car"]

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
