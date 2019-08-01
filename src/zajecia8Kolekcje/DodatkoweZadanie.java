package zajecia8Kolekcje;

import java.io.*;
import java.util.*;

/**
 *
 * Napisz program TODO, założenia:
 * 1. Program ma menu:
 * - 1. dodaj notatkę
 * - 2. skasuj notatkę (po wyborze, należy podać numer notatki)
 * - 3. lista notatek
 * - 4. skasuj wszystkie notatki (powinno sie wyświetlić "czy napewno? T/N")
 * - 0. zamyka program (powinno sie wyświetlić "czy napewno? T/N")
 * - przy próbie wpisania litery program informuje o złym wyborze numeru menu i wyświetla menu ponownie.
 * 2. Program nie pozwoli dodać dwóch notatek o tej samej nazwie (albo Map z if, albo Set)
 * 3. *Program wyświtla aktualną ilość notatek pod menu głównym.
 * 4. **Program wyświetla losową notatkę po wciśnięciu przycisku 8.
 * 5. **Program zlicza wszystkie słowa użyte we wszystkich notatkach. Przycisk 7.
 * ***Rozszerzenie nieobowiązkowe, można dodać tą funkcję podczas dalszej nauki Javy :slightly_smiling_face: :
 * 1. Program aktualizuje notatki do pliku po wciśnięciu przycisku 9.
 * 2. Podczas startu, program wczytuje wszystkie notatki do pamięci z pliku.
 * Wskazówki:
 * - pomocne może być użycie pętki do while, Map<String, String>, iteracji po mapach.
 * - pisz program w metodach w klasie Main i implementuj je do metody main()
 * - Typ Scanner możesz uzywać również w metodach, nie tylko w statycznej main();
 *
 */


public class DodatkoweZadanie {

    public static void main(String[] args) throws InterruptedException, IOException {

        smartThing();

    }


    public static HashMap<Integer, String> smartThing() throws InterruptedException, IOException {
        HashMap<Integer, String> smartThing = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList("0","1","2","3","4","8","9"));

        int optionSelectedByUser;
        String noteGivenByUser;
        int counter = -1;
        int numberGivenByUser;

        updateFile(smartThing);

        displayMenu();
        System.out.println("Current number of notes: " + smartThing.size());

        for (; ; ) {

            try {
                optionSelectedByUser = scanUserInput();
            } catch (Exception e) {
                System.out.println("You have selected option which does not exist.");
                System.out.println("Please select new option.\n\n\n");
                continue;
            }

            String decissionMadeByUser;
            System.out.println("Selected option: " + optionSelectedByUser);


            if (optionSelectedByUser == 1) {
                System.out.println("Please write note you would like to add.");
                Scanner scanner2 = new Scanner(System.in);
                noteGivenByUser = scanner2.nextLine();

                while ((smartThing.containsValue(noteGivenByUser))) {
                    System.out.println("Note given by you already exist.");
                    System.out.println("Please enter new note.");
                    Scanner scannerDuplicate = new Scanner(System.in);
                    noteGivenByUser = scannerDuplicate.nextLine();
                }
                counter++;
                smartThing.put(counter, noteGivenByUser);
                System.out.println("You have successfully added note.");
                System.out.println(counter + ": " + smartThing.get(counter));
                displayMenu();
                System.out.println("Current number of notes: " + smartThing.size());
                continue;

            } else if (optionSelectedByUser == 2) {
                System.out.println("Please select index of note you would like to remove.");
                Scanner scanner3 = new Scanner(System.in);
                numberGivenByUser = scanner3.nextInt();
                smartThing.remove(numberGivenByUser);
                System.out.println("Note with number: " + numberGivenByUser + " was successfully removed.");
            } else if (optionSelectedByUser == 3) {
                displayMenu();
                System.out.println("Current number of notes: " + smartThing.size());
                System.out.println("List of all notes: ");
                for (int i = 0; i < smartThing.size(); i++) {
                    System.out.println(i + ": " + smartThing.get(i));
                }
            } else if (optionSelectedByUser == 4) {
                System.out.println("Are you sure you want to remove all notes?");
                System.out.println("Please type \"Y\" in case of Yes and \"N\" in case of No.");
                Scanner scanner4 = new Scanner(System.in);
                decissionMadeByUser = scanner4.nextLine().toLowerCase();
                if (decissionMadeByUser.equals("y")) {
                    smartThing.clear();
                }            displayMenu();
                System.out.println("Current number of notes: " + smartThing.size());
            } else if (optionSelectedByUser == 0) {
                System.out.println("Are you sure you want to remove all notes?");
                System.out.println("Please type \"Y\" in case of Yes and \"N\" in case of No.");
                Scanner scanner5 = new Scanner(System.in);
                decissionMadeByUser = scanner5.nextLine().toLowerCase();
                if (decissionMadeByUser.equals("y")) {
                    System.out.println("Thank you for play :)");
                    Thread.sleep(1000);
                    break;
                }
            } else if (optionSelectedByUser == 8) {
                if (smartThing.size() == 0) {
                    System.out.println("There is no notes. Please add any.\n\n\n");
                    displayMenu();
                    continue;
                } else {
                    Random random = new Random();
                    int test1 = random.nextInt(smartThing.size());
                    System.out.println(test1 + ": " + smartThing.get(test1));
                }
                displayMenu();
                System.out.println("Current number of notes: " + smartThing.size());

            } else if (optionSelectedByUser == 9) {
                System.out.println(smartThing);
                System.out.println("Please select which note you would like to update.\n");
                //scanUserInput();
                numberGivenByUser = scanUserInput();
                System.out.println("\nPlease type updated note.");
                Scanner scanner5 = new Scanner(System.in);
                noteGivenByUser = scanner5.nextLine();
                smartThing.replace(numberGivenByUser, smartThing.get(numberGivenByUser), noteGivenByUser);
                System.out.println("You have successfully updated note.");
                displayMenu();
                System.out.println("Current number of notes: " + smartThing.size());
            }
        }return smartThing;

    }

    public static String displayMenu() {
        System.out.println("******************** MENU ********************\n");
        System.out.println("\nPlease select one of following options");
        System.out.println("   1. Add new note");
        System.out.println("   2. Remove note");
        System.out.println("   3. List of notes");
        System.out.println("   4. Remove all notes");
        System.out.println("   8. Display random note");
        System.out.println("   9. Update selected note");
        System.out.println("   0. Close the program\n\n\n");
        String x = "0";
        return x;
    }

    public static int scanUserInput () {
        int option = -1;

        Scanner scanner = new Scanner(System.in);

        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You have selected option which does not exist.");
            System.out.println("Please select new option.\n\n\n");
        }
        return option;
    }


    public static void updateFile(HashMap<Integer, String> hashMap) throws IOException {
        Map<Integer, String> ldapContent = new HashMap<>();
        Properties properties = new Properties();


        File fileChecker = new File(System.getProperty("user.dir") + "/resources/notes.txt");
        System.out.println(fileChecker);
        //File fileChecker = new File("/Users/lisek/IdeaProjects/Szkolenie/resources/notes.txt");
        //File[] matches = fileChecker.listFiles((dir1, name) -> name.startsWith("notes") && name.endsWith(".txt"));
        if (!fileChecker.exists()) {
            System.out.println("File not exist");
            System.out.println(fileChecker);
            fileChecker.createNewFile();
            //properties.store(new FileOutputStream("/Users/lisek/IdeaProjects/Szkolenie/resources/notes.txt"), null);

        } else {
            System.out.println("File does exist");
            //File fileCreator = new File("/Users/lukasz/IdeaProjects/Szkolenie/resources/notes.txt");
            properties.store(new FileOutputStream("/Users/lukasz/IdeaProjects/Szkolenie/resources/notes.txt"), null);

        }
        properties.store(new FileOutputStream("/Users/lukasz/IdeaProjects/Szkolenie/resources/notes.txt"), null);

        properties.putAll(ldapContent);

    }
}
