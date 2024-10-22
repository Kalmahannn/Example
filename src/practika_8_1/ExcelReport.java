package practika_8_1;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для Excel.");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для Excel.");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение Excel отчета.");
    }
}

