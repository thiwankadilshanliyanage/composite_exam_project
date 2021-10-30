
import java.util.ArrayList;



/**
 *
 * @author Thiwanka
 */
public class Test {

    public static void main(String[] args) {
       
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
        
    }
    
}
