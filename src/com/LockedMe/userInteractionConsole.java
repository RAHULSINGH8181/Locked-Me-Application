package com.LockedMe;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class userInteractionConsole {
private static void displayMainMenu(){
System.out.println("---------------------------------------------------");
System.out.println("Main Menu:");
System.out.println("\t1. View the list of existing file");
System.out.println("\t2. File Manager [Add | Delete | Search]");
System.out.println("\t3. Quit Locked Me");
System.out.println("---------------------------------------------------");
System.out.println("Enter your choice to execute the operation (1 - 3): ");
}
private static void displayFileManagerMenu(){
System.out.println("---------------------------------------------------");
System.out.println("File Manager Menu:");
System.out.println("\t1. Add a file");
System.out.println("\t2. Delete a file");
System.out.println("\t3. Search for a file");
System.out.println("\t4. Return to main menu");
System.out.println("---------------------------------------------------");
System.out.println("Enter your choice to execute the operation (1 - 4): ");
}
public static void userConsole() throws FileNotFoundException {
Scanner scanInput = new Scanner(System.in);
int userChoise;
do {
displayMainMenu();
userChoise = scanInput.nextInt();
switch(userChoise){
case 1:
filesViewer view = new filesViewer();
view.getFilesList();
break;
case 2:
int subChoise;
do {
displayFileManagerMenu();
subChoise = scanInput.nextInt();
BusinessLevelOperation ops = new BusinessLevelOperation();
switch (subChoise) {
case 1:
ops.addFile();
break;
case 2:
ops.deleteFile();
break;
case 3:
ops.searchFile();
break;
case 4:
System.out.println("Return to Main Menu");
break;
default:
System.out.println("Invalid Input Retry");
}
}while(subChoise!=4);
break;
case 3:
System.out.println("Exit Application");
break;
default:
System.out.println("Invalid Input Retry");
}
}while(userChoise!=3);
}
}
