package practika_8_1;

public class HtmlReport extends ReportGenerator {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для HTML.");
    }

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для HTML.");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение HTML отчета.");
    }
}

