package record_enum;

public class PostCell {

    Dimensions sizeCell;
    StatusCell statusCell = StatusCell.FREE;
    Shipment shipmentInMassive = null;

    public PostCell(double length, double width, double height) {
        sizeCell = new Dimensions(length, width, height);
    }

    public PostCell(double length, double width, double height, StatusCell statusCell) {
        this(length, width, height);
        this.statusCell = statusCell;
    }

    boolean putShipment (Shipment shipment) {
        if (canAcceptShipment(shipment)) {
            statusCell = StatusCell.OCCUPIED;
            shipmentInMassive = shipment;
            return true;
        } else {
            System.out.println("Посылка не размещена");
            System.out.println(statusCell);
            return false;
        }
    }
    private boolean   canAcceptShipment(Shipment shipment) {
        return  isWorkOrFree() && hasShipment() && checkDimensionsCellAndShipment(shipment);
    }

    private boolean isWorkOrFree () {
        return (statusCell == StatusCell.WORK || statusCell == StatusCell.FREE );
    }

    private boolean hasShipment() {
        if (statusCell == StatusCell.OCCUPIED) {
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

    boolean extractShipment() {
        if (isWorkOrFree()) {
            System.out.println("Ячейка пустая и работает");
        } else {
            statusCell = StatusCell.FREE;
            return true;
        }
        return false;
    }

    private void turnMaintenanceMode() {

    }

    private void turnWorkingMode() {
    }

    @Override
    public String toString() {
        return "PostCell{" +
                ", shipmentInMassive=" + shipmentInMassive +
                "sizeCell=" + sizeCell +
                ", statusCell=" + statusCell +
                '}';
    }
}
