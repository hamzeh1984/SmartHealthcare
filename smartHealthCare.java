package weka.classifiers;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class WekaWrapper
  extends AbstractClassifier {

  /**
   * Returns only the toString() method.
   *
   * @return a string describing the classifier
   */
  public String globalInfo() {
    return toString();
  }

  /**
   * Returns the capabilities of this classifier.
   *
   * @return the capabilities
   */
  public Capabilities getCapabilities() {
    weka.core.Capabilities result = new weka.core.Capabilities(this);

    result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * only checks the data against its capabilities.
   *
   * @param i the training data
   */
  public void buildClassifier(Instances i) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(i);
  }

  /**
   * Classifies the given instance.
   *
   * @param i the instance to classify
   * @return the classification result
   */
  public double classifyInstance(Instance i) throws Exception {
    Object[] s = new Object[i.numAttributes()];
    
    for (int j = 0; j < s.length; j++) {
      if (!i.isMissing(j)) {
        if (i.attribute(j).isNominal())
          s[j] = new String(i.stringValue(j));
        else if (i.attribute(j).isNumeric())
          s[j] = new Double(i.value(j));
      }
    }
    
    // set class value to missing
    s[i.classIndex()] = null;
    
    return smartHealthCare.classify(s);
  }

  /**
   * Returns the revision string.
   * 
   * @return        the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("1.0");
  }

  /**
   * Returns only the classnames and what classifier it is based on.
   *
   * @return a short description
   */
  public String toString() {
    return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.8.2).\n" + this.getClass().getName() + "/smartHealthCare";
  }

  /**
   * Runs the classfier from commandline.
   *
   * @param args the commandline arguments
   */
  public static void main(String args[]) {
    runClassifier(new WekaWrapper(), args);
  }
}

class smartHealthCare {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = smartHealthCare.N53d332f40(i);
    return p;
  }
  static double N53d332f40(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= 6.0) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > 6.0) {
    p = smartHealthCare.N64f4a2621(i);
    } 
    return p;
  }
  static double N64f4a2621(Object []i) {
    double p = Double.NaN;
    if (i[25] == null) {
      p = 2;
    } else if (((Double) i[25]).doubleValue() <= 64.0) {
    p = smartHealthCare.N5eca400f2(i);
    } else if (((Double) i[25]).doubleValue() > 64.0) {
    p = smartHealthCare.N257223e88(i);
    } 
    return p;
  }
  static double N5eca400f2(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 2;
    } else if (i[16].equals("t")) {
    p = smartHealthCare.N1e038f813(i);
    } else if (i[16].equals("f")) {
      p = 0;
    } 
    return p;
  }
  static double N1e038f813(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 2;
    } else if (i[22].equals("t")) {
    p = smartHealthCare.N548d5a274(i);
    } else if (i[22].equals("f")) {
      p = 1;
    } 
    return p;
  }
  static double N548d5a274(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 2;
    } else if (i[7].equals("f")) {
    p = smartHealthCare.N15ab15665(i);
    } else if (i[7].equals("t")) {
    p = smartHealthCare.N1b900edf7(i);
    } 
    return p;
  }
  static double N15ab15665(Object []i) {
    double p = Double.NaN;
    if (i[19] == null) {
      p = 2;
    } else if (((Double) i[19]).doubleValue() <= 2.3) {
      p = 2;
    } else if (((Double) i[19]).doubleValue() > 2.3) {
    p = smartHealthCare.N19ede5e46(i);
    } 
    return p;
  }
  static double N19ede5e46(Object []i) {
    double p = Double.NaN;
    if (i[17] == null) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() <= 15.0) {
      p = 0;
    } else if (((Double) i[17]).doubleValue() > 15.0) {
      p = 2;
    } 
    return p;
  }
  static double N1b900edf7(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() <= 49.0) {
      p = 0;
    } else if (((Double) i[21]).doubleValue() > 49.0) {
      p = 2;
    } 
    return p;
  }
  static double N257223e88(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (i[2].equals("f")) {
    p = smartHealthCare.N683f02059(i);
    } else if (i[2].equals("t")) {
      p = 0;
    } 
    return p;
  }
  static double N683f02059(Object []i) {
    double p = Double.NaN;
    if (i[16] == null) {
      p = 1;
    } else if (i[16].equals("t")) {
    p = smartHealthCare.N1e0b082310(i);
    } else if (i[16].equals("f")) {
      p = 0;
    } 
    return p;
  }
  static double N1e0b082310(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (i[7].equals("f")) {
    p = smartHealthCare.N5f60bcb11(i);
    } else if (i[7].equals("t")) {
      p = 0;
    } 
    return p;
  }
  static double N5f60bcb11(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 1;
    } else if (((Double) i[21]).doubleValue() <= 150.0) {
    p = smartHealthCare.N312f15fe12(i);
    } else if (((Double) i[21]).doubleValue() > 150.0) {
      p = 0;
    } 
    return p;
  }
  static double N312f15fe12(Object []i) {
    double p = Double.NaN;
    if (i[21] == null) {
      p = 2;
    } else if (((Double) i[21]).doubleValue() <= 48.0) {
    p = smartHealthCare.N219016f413(i);
    } else if (((Double) i[21]).doubleValue() > 48.0) {
      p = 1;
    } 
    return p;
  }
  static double N219016f413(Object []i) {
    double p = Double.NaN;
    if (i[22] == null) {
      p = 0;
    } else if (i[22].equals("t")) {
      p = 0;
    } else if (i[22].equals("f")) {
      p = 2;
    } 
    return p;
  }
}
