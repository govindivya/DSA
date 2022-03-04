package govindProject;


import java.sql.ResultSet;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JScrollPane;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class Marks extends JFrame
{
    JTextArea t1;
    JPanel p1;
    
    Marks() {
    }
    
    Marks(final String str) {
        this.setSize(500, 600);
        this.setLayout(new BorderLayout());
        this.p1 = new JPanel();
        this.t1 = new JTextArea(50, 15);
        final JScrollPane jsp = new JScrollPane(this.t1);
        this.t1.setFont(new Font("Senserif", 2, 18));
        this.add(this.p1, "North");
        this.add(jsp, "Center");
        this.setLocation(450, 200);
        this.mark(str);
    }
    
    public void mark(final String s) {
        try {
            final conn c = new conn();
            this.t1.setText("\tResult of Examination\n\nSubject\n");
            final ResultSet rs1 = c.s.executeQuery("select * from subject where rollno=" + s);
            if (rs1.next()) {
                this.t1.append("\n\t" + rs1.getString("subject1"));
                this.t1.append("\n\t" + rs1.getString("subject2"));
                this.t1.append("\n\t" + rs1.getString("subject3"));
                this.t1.append("\n\t" + rs1.getString("subject4"));
                this.t1.append("\n\t" + rs1.getString("subject5"));
                this.t1.append("\n-----------------------------------------");
                this.t1.append("\n");
            }
            final ResultSet rs2 = c.s.executeQuery("select * from marks where rollno=" + s);
            if (rs2.next()) {
                this.t1.append("\nMarks\n\n\t" + rs2.getString("marks1"));
                this.t1.append("\n\t" + rs2.getString("marks2"));
                this.t1.append("\n\t" + rs2.getString("marks3"));
                this.t1.append("\n\t" + rs2.getString("marks4"));
                this.t1.append("\n\t" + rs2.getString("marks5"));
                this.t1.append("\n-----------------------------------------");
                this.t1.append("\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        new Marks().setVisible(true);
    }
}


 