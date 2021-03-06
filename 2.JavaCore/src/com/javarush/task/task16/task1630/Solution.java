package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private StringBuilder fileContent = new StringBuilder();
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent.toString();
        }
        public void run(){
            try
            {
                BufferedReader in = new BufferedReader(new FileReader(fileName));
                String fin;
                while ((fin = in.readLine()) != null){
                    fileContent.append(fin).append(" ");
                }
                in.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        }
    }

    public static interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
