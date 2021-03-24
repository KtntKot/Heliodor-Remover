package kot;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<File> heliodors = new ArrayList<>();
        final String raty = System.getenv("APPDATA");
        final String szczurLocalization =  raty+"\\.minecraft"; //zostawione gdyby hel i odor mial folder w .mc
        final String VersionSzczur =  raty+"\\.minecraft\\versions\\Heliodor";
        heliodors.add(new File(szczurLocalization+"\\Heliodor"));
        heliodors.add(new File(VersionSzczur+"\\Heliodor.jar"));
        heliodors.add(new File(VersionSzczur+"\\Heliodor.json"));
        heliodors.add(new File(VersionSzczur+"\\heliodor_assets\\font.ttf"));
        heliodors.add(new File(VersionSzczur+"\\heliodor_assets\\font2.ttf"));
        heliodors.add(new File(VersionSzczur+"\\heliodor_assets\\icons.ttf"));
        heliodors.add(new File(VersionSzczur+"\\heliodor_assets\\Verdana.ttf"));
        heliodors.add(new File(VersionSzczur));
        int ratyWykryte = 0;
        for(File f : heliodors){
            if(f.exists()){
                ratyWykryte++;
                f.delete();
            }
        }
        System.out.println("Wykryto "+ratyWykryte+"! Zostaly one usuniete z systemu! Have a nice day! =)");
    }
}
