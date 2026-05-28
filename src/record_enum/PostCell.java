package record_enum;

public class PostCell {

    final Dimensions sizeCell;
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
            System.out.println("Посылка не размещена " + statusCell);
            return false;
        }
    }
    private boolean   canAcceptShipment(Shipment shipment) {
        return  isWorkOrFree() && !hasShipment() && checkDimensionsCellAndShipment(shipment);
    }

    private boolean isWorkOrFree () {
        return (statusCell == StatusCell.WORK || statusCell == StatusCell.FREE );
    }

     boolean hasShipment() {
        if (statusCell == StatusCell.OCCUPIED) {
            System.out.println("Ячейка занята");
            return true;
        } else {
            System.out.println("Ячейка пустая");
            return false;
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

    void extractShipment() {
        switch (statusCell){
            case OCCUPIED -> {
                statusCell = StatusCell.FREE;
            }
        }
    }

     void turnMaintenanceMode() {
        switch (statusCell){
            case FREE,WORK -> {
                statusCell = StatusCell.AT_MAINTENANCE;
            }
            case OCCUPIED -> {
                System.out.println("Ячейка занята");
            }
            case AT_MAINTENANCE -> {
                System.out.println("Уже на обслуживании");
            }
        }
    }

     void turnWorkingMode() {
        switch (statusCell){
            case FREE,WORK -> {
                System.out.println("Ячейка рабочая");
            }
            case OCCUPIED -> {
                System.out.println("Ячейка занята");
            }
            case AT_MAINTENANCE -> {
                statusCell = StatusCell.WORK;
            }
        }
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
