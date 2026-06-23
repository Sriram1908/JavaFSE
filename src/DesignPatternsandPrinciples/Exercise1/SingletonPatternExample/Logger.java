package DesignPatternsandPrinciples.Exercise1.SingletonPatternExample;

import java.util.*;

public class Logger {

    private static Logger instance;     //ps of itself

    private Logger(){  //cons
        
    }

    public static Logger getLogger(){  //` get method
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
    }


}


