package bsu.rfe.java.group7.lab2.Ramnenok.varС1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.image.ImageObserver;
import java.lang.StrictMath;
import java.text.AttributedCharacterIterator;

import static java.lang.Math.*;

public class Main_Frame extends JFrame {
    private static final int width = 1300;
    private static final int height = 500;
    private JTextField result_field;
    private JTextField x_field;
    private JTextField y_field;
    private JTextField z_field;
    private JLabel image;
    private ButtonGroup radioButtons = new ButtonGroup();
    private Box formula_type = Box.createHorizontalBox();
    private ButtonGroup radioMemoryButtons = new ButtonGroup();
    private Box hBoxMemoryType = Box.createHorizontalBox();
    private JTextField memoryTextField;
    int formula_number = 1;
    private int memoryId = 1;

    private Double mem1 = 0.0;
    private Double mem2 = 0.0;
    private Double mem3 = 0.0;


    public Double formula1(Double x, Double y, Double z) {

        return Math.sin(Math.log(y) + Math.sin(Math.PI * Math.pow(y, 2))) * Math.pow(Math.pow(x, 2) + Math.sin(z) + Math.exp(Math.cos(z)), 1 / 4);
    }

    public Double formula2(Double x, Double y, Double z) {
        return Math.pow(Math.cos(Math.exp(x)) + Math.log(Math.pow(1 + y, 2)) + Math.pow(Math.exp(Math.cos(x)) + Math.pow(Math.sin(Math.PI * z), 2), 1 / 2) + Math.pow(1 / x, 1 / 2) + Math.cos(Math.pow(y, 2)), Math.sin(z));
    }

}