package com.LockedMe;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class filesViewer {
private List<String> filesList= new ArrayList<String>();
private String userDirectory = System.getProperty("user.dir") + "\\fileStorage\\";
private File[] files = new File(userDirectory).listFiles();
public void getFilesList() {
for(File file : files) {
if(file.isFile()) {
filesList.add(file.getName());
}
}
Collections.sort(filesList);
filesList.forEach(System.out::println);
}
}