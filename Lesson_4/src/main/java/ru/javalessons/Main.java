package main.java.ru.javalessons;

import java.util.*;

public class Main {
    
    private static String[] devNames = {"Etan", "Rodzher", "Dzhoshua", "Solomon", "Beverli", "Piter", "Gregori", "Harri", "Metyu", "Erl"};
    private static String[] devSurnames = {"Hardi", "Smit", "Hadson", "Hovard", "Kempbell", "Huver", "Patrik", "Hanter", "Stouks", "Mosli"};
    private static String[] devLastnames ={"Leyn", "Uolton", "Sheferd", "Dzhonston", "Ford", "Dzheyms", "Pol", "Pirson", "Uoker", "Miller"};
    private static String[] manNames = {"Ronald", "Dzhulian", "Garri", "Lourens", "Dzhulius", "Dzhon", "Demen", "Marvin", "Alan", "Frensis"};
    private static String[] manSurnames = {"Peyn", "Allen", "Porter", "Pitts", "Fauler", "Grir", "Byorns", "Beyts", "Barton", "Lester"};
    private static String[] manLastnames = {"Saymon", "Mark", "Moris", "Dzhonatan", "Gordon", "Dzhordzh", "Maykl", "Dzhordzh", "Ronald", "Piter"};

    public static String makeName(String name, String surname, String lastname) {
        return String.join(" ", name, surname, lastname);
    }

    public static void main(String[] args) throws Exception {

        Developer dev_0 = new Developer(0, makeName(devNames[0], devSurnames[0], devLastnames[0]), "devops@test.com", 17);//(int) (Math.random() * 100));
        Developer dev_1 = new Developer(1, makeName(devNames[1], devSurnames[1], devLastnames[1]), "devops@test.com", 59);//(int) (Math.random() * 100));
        Developer dev_2 = new Developer(2, makeName(devNames[2], devSurnames[2], devLastnames[2]), "devops@test.com", 57);//(int) (Math.random() * 100));

        Manager man_0 = new Manager(0, makeName(manNames[0], manSurnames[0], manLastnames[0]), "managers@test.com", 52);//(int) (Math.random() * 100));
        Manager man_1 = new Manager(1, makeName(manNames[1], manSurnames[1], manLastnames[1]), "managers@test.com", 62);//(int) (Math.random() * 100));
        Manager man_2 = new Manager(2, makeName(manNames[2], manSurnames[2], manLastnames[2]), "managers@test.com", 53);//(int) (Math.random() * 100));

        Statistic<Developer> devKPI = new Statistic<>();
        Statistic<Manager> manKPI = new Statistic<>();

        Developer dev = devKPI.getMinKPI(dev_0, dev_1, dev_2);
        dev.print();
        dev = devKPI.getMaxKPI(dev_0, dev_1, dev_2);
        dev.print();
        dev = devKPI.getAvgKPI(dev_0, dev_1, dev_2);
        dev.print();

        System.out.println();

        Manager man = manKPI.getMinKPI(man_0, man_1, man_2);
        man.print();
        man = manKPI.getMaxKPI(man_0, man_1, man_2);
        man.print();
        man = manKPI.getAvgKPI(man_0, man_1, man_2);
        man.print();
    }
}
