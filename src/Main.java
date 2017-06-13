import weka.WekaWrapper;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String filePath = "spamdata-testnolabel-E16.arff";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            Instances data = new Instances(bufferedReader);
            bufferedReader.close();

            data.setClassIndex(data.numAttributes() - 1);

            WekaWrapper wrapper = new WekaWrapper();
            NaiveBayes naiveBayes = (NaiveBayes) SerializationHelper.read(new FileInputStream("NaiveBayesModel.model"));

            System.out.println("NaiveBayes----------------------------------------------------------------------");
            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
                System.out.println(naiveBayes.classifyInstance(e.nextElement()));
            }

            System.out.println("J48 Tree  ----------------------------------------------------------------------");
            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
                System.out.println(wrapper.classifyInstance(e.nextElement()));
            }

        } catch (Exception e){
            // Swallow that shit
            System.out.println(e);
        }
    }

    private static void PredictBest(){}
    private static void PredictWorst(){}
}
