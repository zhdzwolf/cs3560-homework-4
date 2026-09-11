package composition_files;

public class File {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void print() {
        System.out.println("File name: " + getFileName());
    }
}
