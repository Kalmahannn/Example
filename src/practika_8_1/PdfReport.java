package practika_8_1;

public class PdfReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для PDF.");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для PDF.");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение PDF отчета.");
    }
}

