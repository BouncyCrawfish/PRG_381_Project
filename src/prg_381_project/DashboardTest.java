/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg_381_project;

import javax.swing.JFrame;

public class DashboardTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DashboardPanel());
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}

