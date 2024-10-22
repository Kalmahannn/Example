package practika_8_1;

public abstract class ReportGenerator {
    public void generateReport() {
        gatherData();
        formatData();
        if (customerWantsSave()) {
            saveReport();
        }
    }

    protected abstract void gatherData();
    protected abstract void formatData();
    protected abstract void saveReport();

    protected boolean customerWantsSave() {
        return true;
    }
}

