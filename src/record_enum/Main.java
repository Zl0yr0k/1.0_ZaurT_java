package record_enum;

public class Main {
    public static void main() {
       Postamat postamat = new Postamat();
       Shipment shipment1 = new Shipment(new Dimensions(30,30,30),10.54,"Super parcel Petya");
        Shipment shipment2 = new Shipment(new Dimensions(10,10,30),10.78,"Super parcel Vasya");
       postamat.putShipment(shipment1);
        System.out.println("__________________________________2 ");
        postamat.putShipment(shipment2);

        postamat.toShow();
        postamat.getShipment(3);
        postamat.toShow();
        postamat.toShowStatusAllCells();
        postamat.cells[3].turnMaintenanceMode();
        postamat.putShipment(shipment2);
        postamat.putShipment(shipment2);
        postamat.toShowStatusAllCells();
        System.out.println("_________________________________");
        postamat.cells[6].turnWorkingMode();
        postamat.putShipment(shipment2);
        postamat.toShowStatusAllCells();
    }
}
