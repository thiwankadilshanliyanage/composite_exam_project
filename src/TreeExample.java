import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;  
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.tree.DefaultMutableTreeNode;  
import sun.security.ec.ECKeyFactory;
public class TreeExample {  
JFrame f;  
TreeExample(){  
    f=new JFrame();   
    DefaultMutableTreeNode document=new DefaultMutableTreeNode("Document");  
    DefaultMutableTreeNode pic=new DefaultMutableTreeNode("Picture");  
    DefaultMutableTreeNode app=new DefaultMutableTreeNode("Application");  
    DefaultMutableTreeNode server=new DefaultMutableTreeNode("Server.pdf");  
    DefaultMutableTreeNode Graphics=new DefaultMutableTreeNode("Graphics");  
    DefaultMutableTreeNode illustrator=new DefaultMutableTreeNode("Illustrator.exe");  
    DefaultMutableTreeNode unity=new DefaultMutableTreeNode("Unity.exe");  
    DefaultMutableTreeNode blender=new DefaultMutableTreeNode("Blender.exe");  
    document.add(pic);  
    document.add(app);  
    document.add(server); 
    app.add(Graphics);
    app.add(unity);
    app.add(blender);
    Graphics.add(illustrator);
    DefaultMutableTreeNode profile=new DefaultMutableTreeNode("profile.jpg");  
    
    pic.add(profile);       
    JTree jt=new JTree(document);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreeExample();  
    
    ActionListener doc = new ActionListener() {
        public void actionPerformed(java.awt.event.MouseEvent evt) {
            if(evt.getClickCount()==2){
                System.out.println("ABC");
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
}}  
//abstract class Abstractfile{
//    String name;
//    int value;
//
//    public Abstractfile(String name, int value) {
//        this.name = name;
//        this.value = value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public abstract int getValue();
//        
//    
//    
//    
//}
//
//class File extends Abstractfile{
//    
//    public File(String name, int value) {
//        super(name, value);
//    }
//
//    @Override
//    public int getValue() {
//        return value;
//    }
//    
//}
//
//class folder extends Abstractfile{
//    
//    public folder(String name, int value) {
//        super(name, value);
//    }
//    
//    ArrayList<AbstractFile> abstractFileList = new ArrayList<>();
//    
//    public void addFile(AbstractFile abstractFile){
//        abstractFileList.add(abstractFile);
//    }
//
//    @Override
//    public int getValue() {
//        int v = this.value;
//        for(AbstractFile abstractFile : abstractFileList){
//            v+=abstractFile.getValue();
//        }
//        return v;
//    }
//    
//}