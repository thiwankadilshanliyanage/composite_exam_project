
import java.util.ArrayList;



/**
 *
 * @author Thiwanka
 */
public class Test {

    public static void main(String[] args) {
       
        Folder folder = new Folder("Document", 0);
        file server = new file("Server.pdf", (int) 2.8);
        Folder picture = new Folder("Picture", 0);
        file profile = new file("profile", (int) 1.2);
        Folder app = new Folder("Application", 0);
        Folder graphics = new Folder("Graphics", 0);
        file Illustrator = new file("Illustrator.exe", 4250);
        file unity = new file("unity.exe", (int) 820.5);
        file blender = new file("blender.exe", (int) 218.2);
        
        folder.addFile(server);
        folder.addFile(picture);
        folder.addFile(app);
        picture.addFile(profile);
        app.addFile(graphics);
        graphics.addFile(Illustrator);
        app.addFile(unity);
        app.addFile(blender);
        
        System.out.println(folder.getValue());
        
        
        
    }
    
}

abstract class AbstractFile{
    String name;
    int value;

    public AbstractFile(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public abstract int getValue();
        
    
    
    
}

class file extends AbstractFile{
    
    public file(String name, int value) {
        super(name, value);
    }

    @Override
    public int getValue() {
        return value;
    }
    
}

class Folder extends AbstractFile{
    
    public Folder(String name, int value) {
        super(name, value);
    }
    
    ArrayList<AbstractFile> abstractFileList = new ArrayList<>();
    
    public void addFile(AbstractFile abstractFile){
        abstractFileList.add(abstractFile);
    }

    @Override
    public int getValue() {
        int v = this.value;
        for(AbstractFile abstractFile : abstractFileList){
            v+=abstractFile.getValue();
        }
        return v;
    }
    
}
