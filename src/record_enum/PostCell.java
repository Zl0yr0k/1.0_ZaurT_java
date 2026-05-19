package record_enum;

public class PostCell {

    Dimensions sizeCell ;
    StatusCell statusCell;
    boolean parcel;

    public PostCell(double length, double width, double height){
        sizeCell = new Dimensions(length,width,height);
    }
    public PostCell (double length, double width, double height, StatusCell statusCell){
        this (length,width,height);
        this.statusCell = statusCell;
    }

    boolean hasShipment () {

        return false;
    }
    boolean canAcceptShipment(Shipment shipment) {

        return false;
    }
    private void  extractShipment() {

    }
    private void turnMaintenanceMode() {

    }
    private  void turnWorkingMode(){}

}
