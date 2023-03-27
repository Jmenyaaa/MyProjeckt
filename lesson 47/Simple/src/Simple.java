import javax.swing.*;
public class Simple {
    JFrame f;
    Simple(){
        f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);
        f.add(b);

        JButton b1=new JButton("click me too!");//creating instance of JButton
        b1.setBounds(105,200,150, 40);

        f.add(b);//adding button in JFrame
        f.add(b1); // adding another buttom in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    public static void main(String[] args) {
        new Simple();
    }
}