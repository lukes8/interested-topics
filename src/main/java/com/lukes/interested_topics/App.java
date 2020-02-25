package com.lukes.interested_topics;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        sparkCode();
    }

    private static void sparkCode() {
        SparkConf sparkConf = new SparkConf().setAppName("World Count").setMaster("local").set("spark.executor.memory", "2g");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);

        String fileName = "sample1.txt";
        JavaRDD inputFile = sc.textFile(fileName);
//        JavaRDD wordsList = inputFile.flatMap(content -> Arrays.asList(content.split(" ").iterator());
    }
}
