package dom10_1;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Document.txt", 100);
        FileSystemComponent file2 = new File("Photo.jpg", 200);
        FileSystemComponent file3 = new File("Video.mp4", 1000);

        Directory folder1 = new Directory("My Documents");
        Directory folder2 = new Directory("Media");

        folder1.addComponent(file1);
        folder2.addComponent(file2);
        folder2.addComponent(file3);
        folder1.addComponent(folder2);

        folder1.display();
        System.out.println("Total size: " + folder1.getSize() + " KB");
    }
}

