package dom10_1;

class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}

