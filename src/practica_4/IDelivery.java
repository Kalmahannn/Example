package practica_4;

public interface IDelivery {
    void deliverOrder(Order order);
}

 class CourierDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Тапсырыс курьермен жеткізіледі.");
    }
}

 class PostDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Тапсырыс пошта арқылы жеткізіледі.");
    }
}

class PickUpPointDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Тапсырыс қабылдау пунктінде алуға дайын.");
    }
}


