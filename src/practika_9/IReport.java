package practika_9;
import java.time.LocalDate;
public interface IReport {
    String generate();
}



class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Sales Report Data";
    }
}

class UserReport implements IReport {
    @Override
    public String generate() {
        return "User Report Data";
    }
}



 abstract class ReportDecorator implements IReport {
    protected IReport report;

    public ReportDecorator(IReport report) {
        this.report = report;
    }

    @Override
    public String generate() {
        return report.generate();
    }
}



class DateFilterDecorator extends ReportDecorator {
    private LocalDate startDate;
    private LocalDate endDate;

    public DateFilterDecorator(IReport report, LocalDate startDate, LocalDate endDate) {
        super(report);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String generate() {
        return "Filtered by dates (" + startDate + " - " + endDate + "): " + super.generate();
    }
}

 class SortingDecorator extends ReportDecorator {
    private String sortBy;

    public SortingDecorator(IReport report, String sortBy) {
        super(report);
        this.sortBy = sortBy;
    }

    @Override
    public String generate() {
        return "Sorted by " + sortBy + ": " + super.generate();
    }
}

 class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return "Exported to CSV: " + super.generate();
    }
}

 class PdfExportDecorator extends ReportDecorator {
    public PdfExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return "Exported to PDF: " + super.generate();
    }
}
