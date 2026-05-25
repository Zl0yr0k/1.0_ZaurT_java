package record_enum;

public class Main {
    public static void main() {
       Postamat postamat = new Postamat();
       Shipment shipment1 = new Shipment(new Dimensions(30,30,30),10,"Super parcel");
        Shipment shipment2 = new Shipment(new Dimensions(10,30,30),10,"Super parcel");
       postamat.putShipment(shipment1);
        System.out.println("__________________________________2 ");
        postamat.putShipment(shipment2);
    }
}
