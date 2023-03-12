package com.LockedMe;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class BusinessLevelOperation {
private String userDirectory = System.getProperty("user.dir")+ "\\fileStorage\\";
public void addFile() {
System.out.println("Enter the file which you wish to add:");
Scanner scan = new Scanner(System.in);
String fileName = scan.nextLine();
File fileObject = new File(userDirectory+ fileName);
try {
if(fileObject.createNewFile()) {
System.out.println(fileName + " file is added to the directory");
}
else {
System.out.println("This file is already exists");
}
} catch (IOException e) {
e.printStackTrace();
}
}
public void deleteFile() {
System.out.println("Enter the file name you wish to delete:");
Scanner scan=new Scanner(System.in);
String fileName = scan.nextLine();
File F= new File(userDirectory + fileName);
if(F.delete())
System.out.println(fileName + " is Deleted!");
else
System.out.println("File Not Found");
}
public void searchFile() {
Scanner scan= new Scanner(System.in);
File directory = new File(userDirectory);
System.out.println("Enter the file name you need to lookup:");
String fileName=scan.nextLine();
String[] files=directory.list();
int flag=0;
for (String file : files) {
if (file.equals(fileName)) {
flag=1;
System.out.println(file + " File found");
}
}
if(flag==0) {
System.out.println("File not found");
}}}