package com.example;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
  public static void main(String[] args) {
      
      JFrame frame = new JFrame("Solitaire Game");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 600);
      frame.setVisible(true);
      
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      frame.add(mainPanel);

      // north
      JPanel topPanel = new JPanel();
      JLabel titleLabel = new JLabel("Luke's Solitaire");
      topPanel.add(titleLabel);
      mainPanel.add(topPanel);

      // west
      JPanel leftPanel = new JPanel();
      JLabel pileLabel = new JLabel("Pile");
      leftPanel.add(pileLabel);
      mainPanel.add(leftPanel);

      // Center 
      JPanel playArea = new JPanel();
      playArea.setLayout(new BoxLayout(playArea, BoxLayout.X_AXIS));
      for (int i = 1; i <= 7; i++) {
          JPanel stackPanel = new JPanel();
          JLabel stackLabel = new JLabel("Stack " + i);
          stackPanel.add(stackLabel);
          playArea.add(stackPanel);
      }
      mainPanel.add(playArea);

      // south
      JPanel bottomPanel = new JPanel();
      JLabel bottomLabel = new JLabel("Have fun");
      bottomPanel.add(bottomLabel);
      mainPanel.add(bottomPanel);
  }
}