package view;

import java.awt.*;
import javax.swing.*;

class EntryPoint {
    public EntryPoint() {
        JFrame mainWindow = new JFrame("ППВИС Лаб. работа 1");
        mainWindow.getContentPane().setLayout(new FlowLayout());
        mainWindow.setSize(850, 700);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FirstPage firstTask = new FirstPage();
        SecondPage secondTask = new SecondPage();
        ThirdPage thirdTask = new ThirdPage();
        ForthPage forthTask = new ForthPage();
        FifthPage fifthTask = new FifthPage();
        TableForRunner newTask = new TableForRunner();


        mainWindow.add(firstTask.getPanel());
        mainWindow.add(secondTask.getPanel());
        mainWindow.add(thirdTask.getPanelAddRadioSelected());
        mainWindow.add(forthTask.getSelectCheckBoxPane());
        mainWindow.add(fifthTask.getPanelTableChangeWithButtons());
        mainWindow.add(newTask.getPanelForTableRunnerTask());

        mainWindow.setVisible(true);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntryPoint();
            }
        });
    }
};
