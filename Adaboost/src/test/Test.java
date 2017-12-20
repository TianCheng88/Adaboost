package test;

import java.io.File;
import java.io.IOException;

import com.classifiers.boosting.Adaboost;

public class Test {

	public static void main(String[] args) {

		File file = new File("D:/tjcProjs/gitProjs/Adaboost/Adaboost/resources/trainSamples.psv");
		Adaboost boosting;

		try {
			boosting = Adaboost.train(file, 10, 10, 0);
			int label = boosting.classify("1.|2.1".split("\\|"));
			System.out.println("Data-Label[1|2.1] = " + label);
			int label2 = boosting.classify("1.5|1.3".split("\\|"));
			System.out.println("Data-Label[1.5|1.3] = " + label2);
			int label3 = boosting.classify("1.5|0.3".split("\\|"));
			System.out.println("Data-Label[1.5|0.3] = " + label3);
			int label4 = boosting.classify("0.5|0.3".split("\\|"));
			System.out.println("Data-Label[0.5|0.3] = " + label4);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
