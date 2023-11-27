import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist =new ArrayList <String>();
        desertIslandPlaylist.add("Wabebe");
        desertIslandPlaylist.add("Pekejeng");
        desertIslandPlaylist.add("Lewa");
        desertIslandPlaylist.add("Isabela");
        desertIslandPlaylist.add("Guy like me");
        desertIslandPlaylist.add("Girl like me");

        desertIslandPlaylist.remove("Girl like me");

        String a = "Pekejeng";
        String b = "Wabebe";

        desertIslandPlaylist.set(0, a);
        desertIslandPlaylist.set(1, b);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());



    }

}