import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

public class Practice6 extends JFrame {
   ImageIcon icon1 = new ImageIcon("cherry.jpg");
   JCheckBox cherry1 = new JCheckBox("체리",icon1);
   JRadioButton cherry2 = new JRadioButton("체리",icon1);
   JSlider slider = new JSlider(0,200);
   JSpinner spinner;
   String[] month = { "January","Febuary","March","April","May","June","July","August","September","October"
         , "November","December" };
   
   String[] fruit = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry"};
   ImageIcon [] images = {
		   new ImageIcon("apple.jpg"),                   
		   new ImageIcon("banana.jpg"),
		   new ImageIcon("orange.jpg"),
		   new ImageIcon("lemon.jpg")
                     };
   
   JComboBox<String> combo;
   JList mylist= new JList(fruit); 
   JList mylist2= new JList(images); 
   JList mylist3= new JList(fruit); 
   public Practice6() {
      
      setTitle("20175099 이태엽 ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      GridLayout grid = new GridLayout(10,10);
      grid.setVgap(10);
      slider.setMajorTickSpacing(50); 
      slider.setMinorTickSpacing(10); 
      slider.setPaintTicks(true); 
      slider.setPaintLabels(true); 
      SpinnerListModel L = new SpinnerListModel(month);
      spinner = new JSpinner(L);
      combo = new JComboBox<String>(fruit);
      mylist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      mylist.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      mylist.setVisibleRowCount(2);
      JScrollPane scrollPane = new JScrollPane(mylist);
      JScrollPane scrollPane2 = new JScrollPane(mylist2);
      cherry1.setBorderPainted(true);
      cherry1.setSelectedIcon(icon1);
      cherry2.setBorderPainted(true);
      cherry2.setSelectedIcon(icon1);
            
      Container c = getContentPane();
      c.setLayout(grid);
      c.add(new JButton("버튼"));
      c.add(new JCheckBox("사과"));
      c.add(new JCheckBox("배",true));
      c.add(cherry1);
      c.add(new JRadioButton("사과"));
      c.add(new JRadioButton("배",true));
      c.add(cherry2);
      c.add(slider);
      c.add(new JLabel(" 이름:"));
      c.add(new JTextField(""));
      c.add(new JLabel(" 학과:"));
      c.add(new JTextField(""));
      c.add(new JLabel(" 주소:"));
      c.add(new JTextField("서울시..."));
      c.add(new JLabel("Enter the password: "));
      c.add(new JPasswordField(""));
      c.add(new JLabel("Month: "));
      c.add(spinner);
      c.add(new JTextArea("hello"));
      c.add(combo);   
      c.add(mylist3);
      c.add(scrollPane2);
      c.add(scrollPane);
      setSize(1000,1000);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Practice6();
   }
}