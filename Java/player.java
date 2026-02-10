package Java;

public class player {
    public int run =0;
    public static int teamrun =0;
    public void hit_four(){
        run =run +4;
        teamrun +=4;
    }
    public void hit_six(){
        run =run +6;
        teamrun +=6;
    }

    public static void main(String[] args) {
        System.out.println("Team Run : " + player.teamrun);
        player sabed = new player();
        player sujon = new player();
        sabed.hit_four();
        sabed.hit_six();
        sujon.hit_six();
        System.out.println("Sabed Run : " + sabed.run);
        System.out.println("Sujon Run : " + sujon.run);
        System.out.println("Team Run : " + player.teamrun);
    }
}