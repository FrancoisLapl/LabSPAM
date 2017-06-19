import weka.WekaWrapper;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;

import java.io.*;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        if (args.length == 0){
            System.out.println("No file path provided, exiting.");
            return;
        }

        String filePath = args[0];

        Instances data = getInstances(filePath);

        data.setClassIndex(data.numAttributes() - 1);

        // Setup both classifiers
        WekaWrapper wrapper = new WekaWrapper();
        NaiveBayes naiveBayes = null;
        try {
            naiveBayes = (NaiveBayes) SerializationHelper.read(new FileInputStream("NaiveBayesModel.model"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("NaiveBayes----------------------------------------------------------------------");
            BufferedWriter worstWriter = new BufferedWriter(new FileWriter("EquipeF-moins.txt"));

            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
//                System.out.println(naiveBayes.classifyInstance(e.nextElement()));
                worstWriter.write(String.valueOf((int)naiveBayes.classifyInstance(e.nextElement())));
                worstWriter.newLine();
            }

            worstWriter.close();

            System.out.println("J48 Tree  ----------------------------------------------------------------------");
            BufferedWriter bestWriter = new BufferedWriter(new FileWriter("EquipeF-plus.txt"));

            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
//                System.out.println(wrapper.classifyInstance(e.nextElement()));
                bestWriter.write(String.valueOf((int)wrapper.classifyInstance(e.nextElement())));
                bestWriter.newLine();
            }

            bestWriter.close();

        } catch (Exception e){
            System.out.println("Oups, something went wrong.");
        }


//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
//
//            Instances data = new Instances(bufferedReader);
//            bufferedReader.close();
//
//            data.setClassIndex(data.numAttributes() - 1);
//
//            WekaWrapper wrapper = new WekaWrapper();
//            NaiveBayes naiveBayes = (NaiveBayes) SerializationHelper.read(new FileInputStream("NaiveBayesModel.model"));
//
//            System.out.println("NaiveBayes----------------------------------------------------------------------");
//            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
//                System.out.println(naiveBayes.classifyInstance(e.nextElement()));
//            }
//
//            System.out.println("J48 Tree  ----------------------------------------------------------------------");
//            for (Enumeration<Instance> e = data.enumerateInstances(); e.hasMoreElements();) {
//                System.out.println(wrapper.classifyInstance(e.nextElement()));
//            }
//
//        } catch (Exception e){
//            // Swallow that shit
//            System.out.println(e);
//        }
    }

    private static Instances getInstances(String filePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            Instances instances = new Instances(bufferedReader);
            bufferedReader.close();
            return instances;
        } catch (Exception e){
            System.out.println("Could not open file.");
            return null;
        }
    }

    private static void PredictBest(){}
    private static void PredictWorst(){}
}
