package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public class ComputerFactory2 {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}