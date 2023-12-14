
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Logger.getInstance().log("Managing hotel...");
        System.out.println("Managing hotel...");

        // create hotel rooms
        HotelRoom one = new HotelRoom(101);
        HotelRoom two = new HotelRoom(102);
        HotelRoom three = new HotelRoom(103);
        HotelRoom four = new HotelRoom(104);
        HotelRoom five = new HotelRoom(105);

        // create hotel floors
        HotelFloor f1 = new HotelFloor(1);

        HotelRoom six = new HotelRoom(106);
        HotelRoom seven = new HotelRoom(107);
        HotelRoom eight = new HotelRoom(108);
        HotelRoom nine = new HotelRoom(109);
        HotelRoom ten = new HotelRoom(110);

        HotelFloor f2 = new HotelFloor(2);

        // add hotel rooms to hotel floors
        f1.addHotelRoom(one);
        f1.addHotelRoom(two);
        f1.addHotelRoom(three);
        f1.addHotelRoom(four);
        f1.addHotelRoom(five);

        f2.addHotelRoom(six);
        f2.addHotelRoom(seven);
        f2.addHotelRoom(eight);
        f2.addHotelRoom(nine);
        f2.addHotelRoom(ten);
        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        f1.clean();
        f1.book("Safaricom");
        // behaviors
    }
}