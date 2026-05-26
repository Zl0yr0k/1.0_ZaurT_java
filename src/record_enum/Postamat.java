package record_enum;

import java.util.ArrayList;

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
    boolean statusOfParcel;

    void putShipment(Shipment shipment) {

        for (int i = 0; i < cells.length; i++){
            if (cells[i]==null){
                continue;
            }
            if (cells[i].putShipment(shipment)){
                System.out.println("Посылка размещена в ячейке " + i );
                statusOfParcel = true;
                return;
            }
            System.out.println("___________");
        }

        if (!statusOfParcel) {
            System.out.println("Посылка в итоге не размещена. Нет подходящих ячеек");
        }

    }

    void getShipment(int numberOfCell) {

    }

    void weightAllShipments() {

    }
}


