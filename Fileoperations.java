import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Fileoperations {

         public static  ArrayList<ScoreLine> scoreLines = new ArrayList<>();

        public static void write(String name,int experience) {

            try {
                File file = new File("leaderBoard.txt");
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file.getName(), true);
               ScoreLine scoreLine= new ScoreLine(name , experience);
                fileWriter.write(scoreLine.getName() + " - " + scoreLine.getExperience() + "\n");
                fileWriter.close();
            } catch (IOException e) {
                return;
            }
        }

        public static void read() {
            try { File file = new File("leaderBoard.txt");
                scoreLines.clear();
                FileReader fileReader = new FileReader(file.getName());
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                for (int i = 0; i < Files.lines(Paths.get(file.getName())).count(); i++) {
                    String[] strings = bufferedReader.readLine().split(" - ");
                    scoreLines.add(new ScoreLine(strings[0], Integer.parseInt(strings[1])));
                }
                bufferedReader.close();
            } catch (IOException e) {
                return;
            }
            scoreLines.sort(new CompareScorline());

        }
        public static void displayLeaderBoard(){System.out.println("Leaderboard:");
        read();
        if(scoreLines.size()<5){
            for (int i = 0; i < scoreLines.size(); i++) {
                System.out.println(scoreLines.get(i).getName() + " - " + scoreLines.get(i).getExperience());
            }}
        else{
            for (int i = 0; i < 5; i++) {
                System.out.println(scoreLines.get(i).getName() + " - " + scoreLines.get(i).getExperience());
            }}}
        }



