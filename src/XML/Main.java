package XML;
public class Main {
    public static void main(String[] args) {
        try {
            // Create XML file
            XmlUtils.createXML();
            System.out.println("XML file created.");

            // Create, write, read, and delete a text file
            FileUtils.createFile();
            FileUtils.writeInFile("Hello, Java!");
            FileUtils.readFromFile();
            //FileUtils.deleteFile(); // Uncomment to delete the file

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
