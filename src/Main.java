import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String filePath = "spamdata-testnolabel-E16.arff";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            // Swallow that shit
        }
    }

    private static void PredictBest(){}
    private static void PredictWorst(){}
}
