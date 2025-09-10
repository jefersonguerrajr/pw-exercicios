package org.jeferson.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger instance;

    private final List<String> logs;

    private Logger(){
        this.logs = new ArrayList<>();
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void addLog(String log){
        this.logs.add(log);
    }

    public List<String> getLogs(){
        return logs;
    }

    public void printAllLogs(){
        logs.forEach(System.out::println);
        logs.clear();
    }

}
