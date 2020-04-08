import java.util.*;

public class Main {

        private static Developer[] developers = new Developer[1000000];
        private static String[] devNames = {"Etan", "Rodzher", "Dzhoshua", "Solomon", "Beverli", "Piter", "Gregori", "Harri", "Metyu", "Erl"};
        private static String[] devSurnames = {"Hardi", "Smit", "Hadson", "Hovard", "Kempbell", "Huver", "Patrik", "Hanter", "Stouks", "Mosli"};
        private static String[] devLastnames ={"Leyn", "Uolton", "Sheferd", "Dzhonston", "Ford", "Dzheyms", "Pol", "Pirson", "Uoker", "Miller"};

        public static String makeName(String name, String surname, String lastname) {
            return String.join(" ", name, surname, lastname);
        }

        public static void main(String[] args) throws Exception {

            for(int i = 0; i < 1_000_000; i++) {
                developers[i] = new Developer();
                developers[i].setId(i);
                String devName = makeName(devNames[(int) (Math.random() * 10)], devSurnames[(int) (Math.random() * 10)], devLastnames[(int) (Math.random() * 10)]);
                developers[i].setName(devName);
                developers[i].setEmail("devops" + i + "@test.com");
            }

            List<Developer> devops_arr_list = new ArrayList<Developer>();
            Long startTime = System.nanoTime();
            for (Integer i = 0; i < 1_000_000; i++) {
                devops_arr_list.add(developers[i]);
            }
            Long stopTime = System.nanoTime();
            System.out.println("ArrayList.add time: " + (double)(stopTime - startTime) / 1_000_000_000);

            List<Developer> devops_linked_list = new LinkedList<>();
            Long start = System.nanoTime();
            for (int i = 0; i < 1_000_000; i++) {
                devops_linked_list.add(developers[i]);
            }
            Long stop = System.nanoTime();
            System.out.println("LinkedList.add time: " + (double)(stop - start) / 1_000_000_000);

            Set<Developer> treeSet = new TreeSet<Developer>(new DevComparator());
            Long startTime1 = System.nanoTime();
            for (int i = 0; i < 1_000_000; i++) {
                treeSet.add(developers[i]);
            }
            Long stopTime1 = System.nanoTime();
            System.out.println("TreeSet.add time: " + (double)(stopTime1 - startTime1) / 1_000_000_000);

            HashSet<Developer> hashSet = new HashSet<>();
            Long start1 = System.nanoTime();
            for (int i = 0; i < 1_000_000; i++) {
                hashSet.add(developers[i]);
            }
            Long stop1 = System.nanoTime();
            System.out.println("HashSet.add time: " + (double)(stop - start) / 1_000_000_000);
    }
}
