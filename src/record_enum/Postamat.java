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
    boolean statusOfParcel;

    void putShipment(Shipment shipment) {

        for (int i = 0; i < cells.length; i++){
            if (isNull(i)){
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

        if (numberOfCell < 0 || numberOfCell >= cells.length) {
            System.out.println("Не верное значение ячейки");
            return;
        }

        if (isNull(numberOfCell)){
            return;
        }
        System.out.println("Тут выполниться код открытия ячейки");
        cells[numberOfCell].extractShipment();
        System.out.println("Ячейка открыта. Можно забирать посылку");
    }


    void toShow() {
        for (int i = 0; i < cells.length; i++) {
            if (isNull(i)){
                continue;
            }
            if (cells[i].statusCell == StatusCell.OCCUPIED) {
                System.out.println("В ячейке " + i + " лежит посылка " + cells[i].toString() );
            }
        }

    }

    void weightAllShipments() {

    }

    private boolean isNull (int numberOfCell) {
       if (cells[numberOfCell] == null){
           //System.out.println("Ячейка не существует null");
           return true;
       }
       return false;
    }
}


