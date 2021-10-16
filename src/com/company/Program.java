package com.company;

public class Program {

    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().showLogInfo();
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().showLogInfo();
    }

}
