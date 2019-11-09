package com.study.tools;

import java.io.File;
import java.nio.file.Files;

public class DuplicateFileDeleter
{
    public static final String PARENT_PATH = "G:/ÏÄÒæ¹ú";
    
    public static void main(String[] args) {
        int i = 1;
        File file = new File(PARENT_PATH);
        System.out.println(file.listFiles().length); 
        for (File file2 : file.listFiles()) {
            if (file2.list() == null) {
                continue;
            }
//            System.out.println( i + "-" +  .length); 
//            i++;
            for(File file3: file2.listFiles()){
                if(file3.getName().indexOf("(2)") != -1) {
                    System.out.println(file3.getName());
                    file3.delete();
                }
            }
        }
    }
}
