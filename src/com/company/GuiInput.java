package com.company;
import javax.swing.*;
public class GuiInput {
    public static void main(String[] args){
       /* JOptionPane.showMessageDialog(null, "Hello!");
        //String myText = JOptionPane.showInputDialog("What's your name?");
        ////JOptionPane.showMessageDialog(null,"Hello!"+myText+"!!!");

       // Double height = Double.parseDouble(sHeight);
        //Integer( or Long) .parseInt(Long)(SHeight);
        Double height = null;
        while(height == null) {
            try { //instukcja ktora moze powodac wyrzucenie wyjatku
                String sHeight = JOptionPane.showInputDialog("What is yout height");
                height = Double.parseDouble(sHeight);
            } catch(NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, ne.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "Your height is n: "+height/100);

        */int res=-1;
        while(res!=0){
        res=JOptionPane.showConfirmDialog(null, "Are you sure?");
        JOptionPane.showMessageDialog(null, "Result:" +res);
        }
    }
}
