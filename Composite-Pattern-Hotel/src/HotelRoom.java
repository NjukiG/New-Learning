class HotelRoom implements HotelRoomInterface {

    private int roomNum;

    public HotelRoom(int roomNum){
        this.roomNum = roomNum;
    }
    public void book(String guestName) {
//        Logger.getInstance().log("Booked a room for " + guestName);
        System.out.println("Booked a room for " + guestName);
    }

    public void clean() {
//        Logger.getInstance().log("Cleaned room");
        System.out.println("Cleaned room");
    }
}