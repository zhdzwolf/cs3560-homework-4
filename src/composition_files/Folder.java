package composition_files;

import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder() {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public String getFolderName() {
        return folderName;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
    public ArrayList<File> getFiles() {
        return files;
    }

    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }
    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }
    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        print("");
    }

    private void print(String indent) {
        System.out.println(indent + "Folder: " + folderName);

        for (File file : files) {
            System.out.println(indent + "\tFile: " + file.getFileName());
        }

        for (Folder folder : subFolders) {
            folder.print(indent + "\t");
        }
    }

}
