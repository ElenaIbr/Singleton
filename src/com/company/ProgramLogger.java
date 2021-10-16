package com.company;

public class ProgramLogger {

    public static ProgramLogger programLogger;
    public static String logFile = "This is log file \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){

    }

    public void addLogInfo(String info){
        logFile += info + "\n";
    }

    public void showLogInfo(){
        System.out.println(logFile);
    }
}
