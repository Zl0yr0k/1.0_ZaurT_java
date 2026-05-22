package record_enum;

public class PostCell {

    Dimensions sizeCell;
    StatusCell statusCell;
    boolean parcel = true;
    Shipment shipmentInMassive = null;

    public PostCell(double length, double width, double height) {
        sizeCell = new Dimensions(length, width, height);
    }

    public PostCell(double length, double width, double height, StatusCell statusCell) {
        this(length, width, height);
        this.statusCell = statusCell;
    }

    boolean hasShipment() {
        if (parcel == false) {
            System.out.println("Ячейка занята");
            return false;
        } else {
            System.out.println("Ячейка пустая");
            return true;
        }
    }

    private boolean checkDimensionsCellAndShipment(Shipment shipment) {
        boolean checkSize = shipment.dimensions().length() <= sizeCell.length() &&
                shipment.dimensions().width() <= sizeCell.width() &&
                shipment.dimensions().height() <= sizeCell.height();
        if (checkSize) {
            System.out.println("Размеры подходят");
            return true;
        } else {
            System.out.println("Размеры не подходят");
            return false;
        }
    }

    boolean canAcceptShipment(Shipment shipment) {

        if (statusCell == StatusCell.WORK && hasShipment() && checkDimensionsCellAndShipment(shipment)) {
            shipmentInMassive = shipment;
            System.out.println("Посылка размещена в ячейке");
            parcel = false;
            return true;
        } else {
            System.out.println("Посылка не размещена");
            return false;
        }
    }

    private void extractShipment() {

    }

    private void turnMaintenanceMode() {

    }

    private void turnWorkingMode() {
    }

}
