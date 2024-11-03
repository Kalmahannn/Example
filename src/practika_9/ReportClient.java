package practika_9;
import java.time.LocalDate;
public class ReportClient {
    public static void main(String[] args) {
        IReport report = new SalesReport();
        report = new DateFilterDecorator(report, LocalDate.now().minusDays(30), LocalDate.now());
        report = new SortingDecorator(report, "date");
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());
    }
}


interface IInternalDeliveryService {
    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
}



 class InternalDeliveryService implements IInternalDeliveryService {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Delivering order: " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Status of order " + orderId;
    }
}



 class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("Shipping item: " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "Tracking shipment " + shipmentId;
    }
}

class ExternalLogisticsServiceB {
    public void sendPackage(String packageInfo) {
        System.out.println("Sending package: " + packageInfo);
    }

    public String checkPackageStatus(String trackingCode) {
        return "Status of package " + trackingCode;
    }
}



 class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA externalService;

    public LogisticsAdapterA(ExternalLogisticsServiceA externalService) {
        this.externalService = externalService;
    }

    @Override
    public void deliverOrder(String orderId) {
        int itemId = Integer.parseInt(orderId);
        externalService.shipItem(itemId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        int shipmentId = Integer.parseInt(orderId);
        return externalService.trackShipment(shipmentId);
    }
}

 class LogisticsAdapterB implements IInternalDeliveryService {
    private ExternalLogisticsServiceB externalService;

    public LogisticsAdapterB(ExternalLogisticsServiceB externalService) {
        this.externalService = externalService;
    }

    @Override
    public void deliverOrder(String orderId) {
        externalService.sendPackage(orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return externalService.checkPackageStatus(orderId);
    }
}


class DeliveryServiceFactory {
    public static IInternalDeliveryService getDeliveryService(String serviceType) {
        switch (serviceType) {
            case "internal":
                return new InternalDeliveryService();
            case "externalA":
                return new LogisticsAdapterA(new ExternalLogisticsServiceA());
            case "externalB":
                return new LogisticsAdapterB(new ExternalLogisticsServiceB());
            default:
                throw new IllegalArgumentException("Unknown service type: " + serviceType);
        }
    }
}


 class DeliveryClient {
    public static void main(String[] args) {
        IInternalDeliveryService deliveryService = DeliveryServiceFactory.getDeliveryService("externalA");
        deliveryService.deliverOrder("123");
        System.out.println(deliveryService.getDeliveryStatus("123"));
    }
}
