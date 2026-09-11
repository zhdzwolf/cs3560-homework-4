import composition_files.*;

public static void main(String[] args) {
    Folder mainFolder = new Folder();
    mainFolder.setFolderName("php_demo1");

    Folder subFolder1 = new Folder();
    subFolder1.setFolderName("Source Files");
    Folder subFolder2 = new Folder();
    subFolder2.setFolderName(".phalcon");
    Folder subFolder3 = new Folder();
    subFolder3.setFolderName("app");
    Folder subFolder4 = new Folder();
    subFolder4.setFolderName("config");
    Folder subFolder5 = new Folder();
    subFolder5.setFolderName("controllers");
    Folder subFolder6 = new Folder();
    subFolder6.setFolderName("library");
    Folder subFolder7 = new Folder();
    subFolder7.setFolderName("migrations");
    Folder subFolder8 = new Folder();
    subFolder8.setFolderName("models");
    Folder subFolder9 = new Folder();
    subFolder9.setFolderName("views");
    Folder subFolder10 = new Folder();
    subFolder10.setFolderName("cache");
    Folder subFolder11 = new Folder();
    subFolder11.setFolderName("public");
    Folder subFolder12 = new Folder();
    subFolder12.setFolderName("Include Path");
    Folder subFolder13 = new Folder();
    subFolder13.setFolderName("Remote Files");

    File file1 = new File();
    file1.setFileName(".htaccess");
    File file2 = new File();
    file2.setFileName(".htrouter.php");
    File file3 = new File();
    file3.setFileName(".index.html");

    mainFolder.addSubFolder(subFolder1);
    subFolder1.addSubFolder(subFolder2);
    subFolder1.addSubFolder(subFolder3);
    subFolder3.addSubFolder(subFolder4);
    subFolder3.addSubFolder(subFolder5);
    subFolder3.addSubFolder(subFolder6);
    subFolder3.addSubFolder(subFolder7);
    subFolder3.addSubFolder(subFolder8);
    subFolder3.addSubFolder(subFolder9);
    subFolder1.addSubFolder(subFolder10);
    subFolder1.addSubFolder(subFolder11);
    subFolder11.addFile(file1);
    subFolder11.addFile(file2);
    subFolder11.addFile(file3);
    mainFolder.addSubFolder(subFolder12);
    mainFolder.addSubFolder(subFolder13);

    mainFolder.print(); // print out the full tree, initially


}
