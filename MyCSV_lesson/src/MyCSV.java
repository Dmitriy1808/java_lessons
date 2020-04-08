import java.io.FileWriter;

public class MyCSV {

    private static Developer[] developers = new Developer[1000];
    private static Manager[] managers = new Manager[1000];
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
        Integer count = 0;
        for (Integer i = 0; i < 10; i++) {
            for (Integer j = 0; j < 10; j++) {
                for (Integer k = 0; k < 10; k++) {
                    developers[count] = new Developer();
                    managers[count] = new Manager();
                    developers[count].setId(count);
                    managers[count].setId(count);
                    String devName = makeName(devNames[i], devSurnames[j], devLastnames[k]);
                    String manName = makeName(manNames[i], manSurnames[j], manLastnames[k]);
                    developers[count].setName(devName);
                    managers[count].setName(manName);
                    developers[count].setEmail("devops" + count + "@test.com");
                    managers[count].setEmail("managers" + count + "@test.com");
                    count++;
                }
            }
        }
        FileWriter fwDev = new FileWriter("devops.csv");
        FileWriter fwMan = new FileWriter("managers.csv");
        for (int i = 0; i < 1000; i++) {
            fwDev.write(developers[i].toCSV());
            fwDev.write('\n');
            fwMan.write(managers[i].toCSV());
            fwMan.write('\n');
        }
        fwMan.close();
        fwDev.close();
    }
}