package dom_5;

import java.util.Scanner;

public class Main {
    // Құжатты динамикалық құру әдісі
    public static DocumentCreator getDocumentCreator(String documentType) {
        switch (documentType.toLowerCase()) {
            case "report":
                return new ReportCreator();
            case "resume":
                return new ResumeCreator();
            case "letter":
                return new LetterCreator();
            case "invoice":
                return new InvoiceCreator();
            default:
                throw new IllegalArgumentException("Құжаттың белгісіз түрі.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Құжат түрін енгізіңіз (report, resume, letter, invoice) :");
        String documentType = scanner.nextLine();

        try {
            DocumentCreator creator = getDocumentCreator(documentType);
            Document document = creator.createDocument();
            document.open();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
