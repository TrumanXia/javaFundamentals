package xyg.study.exception;

import java.awt.print.PageFormat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException extends Exception
{
    private Logger logger = Logger.getLogger("MyException");
    
    public void logException(Exception e){
//        StringWriter writer = new StringWriter();
//        printStackTrace(e.);
    }
}
