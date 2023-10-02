import javax.swing.Jframe;

public class MyFrame extends Jframe 
{
    public myFrame() {
        setSize(640,400);
        setLocation(1920,0);
        setTitles("Jframe");
        setVisible(true);
    }

    public static void main(String[] args){
        new MyFrame();
    }
}