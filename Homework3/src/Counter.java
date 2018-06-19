
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter
{
    private File inputFile;
    
    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }
   
    //counts the number of lines in the text file
    public int countLines()
    {
        int count = 0;
        
        try{
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNextLine()){
        		in.nextLine();
        		count++;
        	}
        }
        catch(FileNotFoundException e){
        	System.out.println("File was not found");
//        	e.getStackTrace();
        }
        
        return count;
    }

    
    
    //counts the number of words in the text file
    public int countWords()
    {
        int count = 0;
        
        try{
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNext()){
        		in.next();
        		count++;
        	}
        }
        catch(FileNotFoundException e){
        	System.out.println("File was not found");
//        	e.getStackTrace();
        }
        
        return count;
    }

    
    //counts the number of characters in the text file including whitespaces
    public int countChars()
    {
        int count = 0;
        try{
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNextLine()){
        		String line = in.nextLine();
        		count += line.length();
        	}
        }
        catch(FileNotFoundException e){
        	System.out.println("File was not found");
        }
        
        return count;
    }
}

