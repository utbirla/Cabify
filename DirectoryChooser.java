package cabmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DirectoryChooser extends JFrame {
    private JLabel selectedFilesLabel;
    
    public DirectoryChooser() {
        setTitle("Directory Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        selectedFilesLabel = new JLabel();
        selectedFilesLabel.setVerticalAlignment(JLabel.TOP);
        add(selectedFilesLabel, BorderLayout.CENTER);
        
        JButton selectDirectoryButton = new JButton("Select Directory");
        selectDirectoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select a Directory");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = fileChooser.showOpenDialog(DirectoryChooser.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedDirectory = fileChooser.getSelectedFile();
                    selectedFilesLabel.setText("Selected files in " + selectedDirectory.getAbsolutePath() + ":\n");
                    for (File file : selectedDirectory.listFiles()) {
                        selectedFilesLabel.setText(selectedFilesLabel.getText() + file.getName() + "\n");
                    }
                }
            }
        });
        add(selectDirectoryButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new DirectoryChooser();
    }
}
