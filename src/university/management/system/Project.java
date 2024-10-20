
package university.management.system;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Project extends JFrame  implements ActionListener{
    
    Project(){
        setSize(1540, 850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar nb = new JMenuBar();
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        nb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        newInformation.add(studentInfo);
        
        
        JMenu details = new JMenu("view Details");
        details.setForeground(Color.RED);
        nb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("view Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        details.add(studentdetails);
        
        //leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        nb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem(" Faculty leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem(" Student leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave);
        
        //leave detalis
        JMenu leaveDetails = new JMenu("Leave Deails");
        leaveDetails.setForeground(Color.RED);
        nb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem(" Faculty leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem(" Student leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(studentleavedetails);
        
        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        nb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem(" Examination Details");
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem(" Enter Marks ");
        entermarks.setBackground(Color.WHITE);
        exam.add(entermarks);
        
        //UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        nb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem(" Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem(" Update Student Details ");
        updatestudentinfo.setBackground(Color.WHITE);
       updateInfo.add(updatestudentinfo);
        
        //fee
        JMenu fee = new JMenu("fee Details");
        fee.setForeground(Color.BLUE);
        nb.add(fee);
        
        JMenuItem feestructure = new JMenuItem(" Fee Structure");
        feestructure.setBackground(Color.WHITE);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem(" Student Fee Form  ");
        feeform.setBackground(Color.WHITE);
         fee .add(feeform);
        
        //Utility
        JMenu utility = new JMenu(" Utility");
         utility.setForeground(Color.RED);
        nb.add( utility);
        
        JMenuItem notepad = new JMenuItem(" Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem(" Calculator ");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
         utility .add(calc);
         
         //Exit
        JMenu exit = new JMenu(" Exit");
         exit.setForeground(Color.BLUE);
        nb.add( exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        
        
        setJMenuBar(nb);
        
        setVisible(true);
    }
     public void actionPerformed(ActionEvent  ae){
         String msg = ae.getActionCommand();
           if(msg.equals("Exit")) {
             setVisible(false);
         // Change "Calculator" to "Calculator "
} else if (msg.equals(" Calculator ")) {
    try {
        Runtime.getRuntime().exec("calc.exe");
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception properly in your application
    }
} else if (msg.equals(" Notepad")) {
    try {
        Runtime.getRuntime().exec("notepad.exe");
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception properly in your application
    }
}
}




    public static void main(String[] args) {
        new Project();
    }
    
}
