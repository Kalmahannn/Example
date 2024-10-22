package practika_8_1;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PdfReport();
        ReportGenerator excelReport = new ExcelReport();
        ReportGenerator htmlReport = new HtmlReport();

        pdfReport.generateReport();
        excelReport.generateReport();
        htmlReport.generateReport();
    }
}
