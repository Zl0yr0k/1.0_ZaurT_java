package record_enum;

public class Postamat {

    PostCell[] cells = new PostCell[10];

    {
        cells[0] = new PostCell(20, 10, 30, StatusCell.WORK);
        cells[1] = new PostCell(25, 20, 40, StatusCell.WORK);
        cells[3] = new PostCell(100, 35, 35, StatusCell.WORK);
       // cells[3] = new PostCell(10, 25, 35, StatusCell.WORK);
        cells[4] = new PostCell(100, 35, 35, StatusCell.WORK);
        cells[6] = new PostCell(100, 25, 35, StatusCell.AT_MAINTENANCE);
        cells[9] = new PostCell(100, 25, 35, StatusCell.AT_MAINTENANCE);
    }

    void putShipment(Shipment shipment) {

        for (PostCell ps : cells) {
            if (ps==null){
                //System.out.println("Эта ячейка null");
                System.out.println("________________");
                continue;
            }
            if (ps.putShipment(shipment)){
                System.out.println("Посылка размещена в ячейке");
                return;
            }
                System.out.println("___________");

        }

    }

    void getShipment(int numberOfCell) {

    }

    void weightAllShipments() {

    }
}


