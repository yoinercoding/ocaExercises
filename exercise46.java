import java.io.*;
public class exercise46 {

    /*
    *       The code attempts try to read a file, but it doesn't exists:
    */

    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            int value = Integer.parseInt(line);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");  //<---- Entra primero por aca ya que no encuentra el file
                                                        // y seguido ejecuta el Finally
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");

        } catch (IOException e) {
            System.out.println("An I/O error ocurred");

        } finally {
            System.out.println("End");
        }
    }
    /*
    *       Which of the following is true about the above code?
    *   a- It will print "file not found" and "End"  <---- Correct answer
    *   b- It will print "Invalid number format" and "End"
    *   c- It will print "End" and "And I/O error ocurred"
    *   d- It will not compile
    *   e- It will compile but not print anything
    *   f- It will print "File not found" and "Invalid number format" and "End"
     */
}
