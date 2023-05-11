import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Train train1 = new Train(1, "Гомель-Хойники", 150, Status.OnMyWay, 150, 100, IsEmpty.EMPTY);
        System.out.println(train1.toString());
        //метод смены статуса
        System.out.println("выберите статус поезда: \n1)В пути \n2)Загружается \n3)Разгружается");
        int k = in.nextInt();
        train1.statusChange(k);
        //метод смены статуса груза
        System.out.println("выберите статус загруженности поезда: \n1)Загружен \n2)Пустой");
        k = in.nextInt();
        train1.setIsEmpty(k);
        //вызов метода загрузк
        train1.loading();
        //вызов метода разгрузки
        train1.unloading();
        //вызов метода просчета топлива на маршрут
        train1.departure();
        //вызов метода заправки поезда
        train1.refueling();

    }
}