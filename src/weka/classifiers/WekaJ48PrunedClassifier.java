// Generated with Weka 3.8.1
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Mon Jun 12 17:13:57 EDT 2017

package weka.classifiers;

public class WekaJ48PrunedClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaJ48PrunedClassifier.N7c16a59445(i);
        return p;
    }
    static double N7c16a59445(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 0.0) {
            p = WekaJ48PrunedClassifier.N5963888a46(i);
        } else if (((Double) i[6]).doubleValue() > 0.0) {
            p = WekaJ48PrunedClassifier.N7738715288(i);
        }
        return p;
    }
    static double N5963888a46(Object []i) {
        double p = Double.NaN;
        if (i[52] == null) {
            p = 1;
        } else if (((Double) i[52]).doubleValue() <= 0.06) {
            p = WekaJ48PrunedClassifier.N119af42f47(i);
        } else if (((Double) i[52]).doubleValue() > 0.06) {
            p = WekaJ48PrunedClassifier.N3d66003f83(i);
        }
        return p;
    }
    static double N119af42f47(Object []i) {
        double p = Double.NaN;
        if (i[51] == null) {
            p = 1;
        } else if (((Double) i[51]).doubleValue() <= 0.25) {
            p = WekaJ48PrunedClassifier.N1b51d57c48(i);
        } else if (((Double) i[51]).doubleValue() > 0.25) {
            p = WekaJ48PrunedClassifier.N3cb01a7a75(i);
        }
        return p;
    }
    static double N1b51d57c48(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= 0.03) {
            p = WekaJ48PrunedClassifier.N52a2e98749(i);
        } else if (((Double) i[15]).doubleValue() > 0.03) {
            p = WekaJ48PrunedClassifier.N7857e2e164(i);
        }
        return p;
    }
    static double N52a2e98749(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.0) {
            p = WekaJ48PrunedClassifier.N17400c8150(i);
        } else if (((Double) i[10]).doubleValue() > 0.0) {
            p = WekaJ48PrunedClassifier.N7019ec7d61(i);
        }
        return p;
    }
    static double N17400c8150(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 1;
        } else if (((Double) i[55]).doubleValue() <= 25.0) {
            p = 1;
        } else if (((Double) i[55]).doubleValue() > 25.0) {
            p = WekaJ48PrunedClassifier.N513db9ca51(i);
        }
        return p;
    }
    static double N513db9ca51(Object []i) {
        double p = Double.NaN;
        if (i[23] == null) {
            p = 1;
        } else if (((Double) i[23]).doubleValue() <= 0.04) {
            p = WekaJ48PrunedClassifier.N44527ca452(i);
        } else if (((Double) i[23]).doubleValue() > 0.04) {
            p = 0;
        }
        return p;
    }
    static double N44527ca452(Object []i) {
        double p = Double.NaN;
        if (i[24] == null) {
            p = 1;
        } else if (((Double) i[24]).doubleValue() <= 0.04) {
            p = WekaJ48PrunedClassifier.N1795b7853(i);
        } else if (((Double) i[24]).doubleValue() > 0.04) {
            p = 1;
        }
        return p;
    }
    static double N1795b7853(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= 0.05) {
            p = WekaJ48PrunedClassifier.N164a7bd254(i);
        } else if (((Double) i[17]).doubleValue() > 0.05) {
            p = 1;
        }
        return p;
    }
    static double N164a7bd254(Object []i) {
        double p = Double.NaN;
        if (i[30] == null) {
            p = 1;
        } else if (((Double) i[30]).doubleValue() <= 0.24) {
            p = WekaJ48PrunedClassifier.N2a05633855(i);
        } else if (((Double) i[30]).doubleValue() > 0.24) {
            p = 1;
        }
        return p;
    }
    static double N2a05633855(Object []i) {
        double p = Double.NaN;
        if (i[54] == null) {
            p = 1;
        } else if (((Double) i[54]).doubleValue() <= 8.666) {
            p = WekaJ48PrunedClassifier.N7de59d8056(i);
        } else if (((Double) i[54]).doubleValue() > 8.666) {
            p = 0;
        }
        return p;
    }
    static double N7de59d8056(Object []i) {
        double p = Double.NaN;
        if (i[18] == null) {
            p = 1;
        } else if (((Double) i[18]).doubleValue() <= 0.85) {
            p = WekaJ48PrunedClassifier.N368cbbdf57(i);
        } else if (((Double) i[18]).doubleValue() > 0.85) {
            p = 1;
        }
        return p;
    }
    static double N368cbbdf57(Object []i) {
        double p = Double.NaN;
        if (i[26] == null) {
            p = 0;
        } else if (((Double) i[26]).doubleValue() <= 0.37) {
            p = WekaJ48PrunedClassifier.N735dc23758(i);
        } else if (((Double) i[26]).doubleValue() > 0.37) {
            p = 1;
        }
        return p;
    }
    static double N735dc23758(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.25) {
            p = WekaJ48PrunedClassifier.N72c073c759(i);
        } else if (((Double) i[2]).doubleValue() > 0.25) {
            p = 1;
        }
        return p;
    }
    static double N72c073c759(Object []i) {
        double p = Double.NaN;
        if (i[49] == null) {
            p = 1;
        } else if (((Double) i[49]).doubleValue() <= 0.04) {
            p = WekaJ48PrunedClassifier.N2318f98260(i);
        } else if (((Double) i[49]).doubleValue() > 0.04) {
            p = 0;
        }
        return p;
    }
    static double N2318f98260(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 0;
        } else if (((Double) i[55]).doubleValue() <= 37.0) {
            p = 0;
        } else if (((Double) i[55]).doubleValue() > 37.0) {
            p = 1;
        }
        return p;
    }
    static double N7019ec7d61(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 0.54) {
            p = WekaJ48PrunedClassifier.N6dc8d43362(i);
        } else if (((Double) i[16]).doubleValue() > 0.54) {
            p = 0;
        }
        return p;
    }
    static double N6dc8d43362(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.1) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 0.1) {
            p = WekaJ48PrunedClassifier.N1c67dc0663(i);
        }
        return p;
    }
    static double N1c67dc0663(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.43) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 0.43) {
            p = 1;
        }
        return p;
    }
    static double N7857e2e164(Object []i) {
        double p = Double.NaN;
        if (i[26] == null) {
            p = 1;
        } else if (((Double) i[26]).doubleValue() <= 0.02) {
            p = WekaJ48PrunedClassifier.N4792839265(i);
        } else if (((Double) i[26]).doubleValue() > 0.02) {
            p = 1;
        }
        return p;
    }
    static double N4792839265(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.27) {
            p = WekaJ48PrunedClassifier.N6c50ae1f66(i);
        } else if (((Double) i[10]).doubleValue() > 0.27) {
            p = 0;
        }
        return p;
    }
    static double N6c50ae1f66(Object []i) {
        double p = Double.NaN;
        if (i[34] == null) {
            p = 1;
        } else if (((Double) i[34]).doubleValue() <= 0.1) {
            p = WekaJ48PrunedClassifier.N4ef5d87f67(i);
        } else if (((Double) i[34]).doubleValue() > 0.1) {
            p = 1;
        }
        return p;
    }
    static double N4ef5d87f67(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.07) {
            p = WekaJ48PrunedClassifier.N9f26baa68(i);
        } else if (((Double) i[1]).doubleValue() > 0.07) {
            p = 1;
        }
        return p;
    }
    static double N9f26baa68(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 0.0) {
            p = WekaJ48PrunedClassifier.N5aafe71569(i);
        } else if (((Double) i[1]).doubleValue() > 0.0) {
            p = 0;
        }
        return p;
    }
    static double N5aafe71569(Object []i) {
        double p = Double.NaN;
        if (i[36] == null) {
            p = 0;
        } else if (((Double) i[36]).doubleValue() <= 0.0) {
            p = WekaJ48PrunedClassifier.N33e69a0970(i);
        } else if (((Double) i[36]).doubleValue() > 0.0) {
            p = 1;
        }
        return p;
    }
    static double N33e69a0970(Object []i) {
        double p = Double.NaN;
        if (i[43] == null) {
            p = 0;
        } else if (((Double) i[43]).doubleValue() <= 0.32) {
            p = WekaJ48PrunedClassifier.N53b08a2a71(i);
        } else if (((Double) i[43]).doubleValue() > 0.32) {
            p = 1;
        }
        return p;
    }
    static double N53b08a2a71(Object []i) {
        double p = Double.NaN;
        if (i[40] == null) {
            p = 0;
        } else if (((Double) i[40]).doubleValue() <= 0.07) {
            p = WekaJ48PrunedClassifier.N490514cd72(i);
        } else if (((Double) i[40]).doubleValue() > 0.07) {
            p = 1;
        }
        return p;
    }
    static double N490514cd72(Object []i) {
        double p = Double.NaN;
        if (i[41] == null) {
            p = 0;
        } else if (((Double) i[41]).doubleValue() <= 0.9) {
            p = WekaJ48PrunedClassifier.N6cb7c5b773(i);
        } else if (((Double) i[41]).doubleValue() > 0.9) {
            p = 1;
        }
        return p;
    }
    static double N6cb7c5b773(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 0;
        } else if (((Double) i[55]).doubleValue() <= 46.0) {
            p = WekaJ48PrunedClassifier.N6b862cfa74(i);
        } else if (((Double) i[55]).doubleValue() > 46.0) {
            p = 1;
        }
        return p;
    }
    static double N6b862cfa74(Object []i) {
        double p = Double.NaN;
        if (i[29] == null) {
            p = 0;
        } else if (((Double) i[29]).doubleValue() <= 0.12) {
            p = 0;
        } else if (((Double) i[29]).doubleValue() > 0.12) {
            p = 1;
        }
        return p;
    }
    static double N3cb01a7a75(Object []i) {
        double p = Double.NaN;
        if (i[41] == null) {
            p = 0;
        } else if (((Double) i[41]).doubleValue() <= 0.6) {
            p = WekaJ48PrunedClassifier.N5d72d25d76(i);
        } else if (((Double) i[41]).doubleValue() > 0.6) {
            p = 1;
        }
        return p;
    }
    static double N5d72d25d76(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 1;
        } else if (((Double) i[55]).doubleValue() <= 8.0) {
            p = WekaJ48PrunedClassifier.Nf3a2e3977(i);
        } else if (((Double) i[55]).doubleValue() > 8.0) {
            p = WekaJ48PrunedClassifier.N69de91d879(i);
        }
        return p;
    }
    static double Nf3a2e3977(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= 0.21) {
            p = WekaJ48PrunedClassifier.N558132d878(i);
        } else if (((Double) i[15]).doubleValue() > 0.21) {
            p = 0;
        }
        return p;
    }
    static double N558132d878(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 0.18) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 0.18) {
            p = 0;
        }
        return p;
    }
    static double N69de91d879(Object []i) {
        double p = Double.NaN;
        if (i[45] == null) {
            p = 0;
        } else if (((Double) i[45]).doubleValue() <= 0.14) {
            p = WekaJ48PrunedClassifier.N2275468480(i);
        } else if (((Double) i[45]).doubleValue() > 0.14) {
            p = 1;
        }
        return p;
    }
    static double N2275468480(Object []i) {
        double p = Double.NaN;
        if (i[24] == null) {
            p = 0;
        } else if (((Double) i[24]).doubleValue() <= 0.39) {
            p = WekaJ48PrunedClassifier.N7ce0ef1581(i);
        } else if (((Double) i[24]).doubleValue() > 0.39) {
            p = 1;
        }
        return p;
    }
    static double N7ce0ef1581(Object []i) {
        double p = Double.NaN;
        if (i[51] == null) {
            p = 0;
        } else if (((Double) i[51]).doubleValue() <= 0.312) {
            p = WekaJ48PrunedClassifier.N20ab15a382(i);
        } else if (((Double) i[51]).doubleValue() > 0.312) {
            p = 0;
        }
        return p;
    }
    static double N20ab15a382(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 1;
        } else if (((Double) i[55]).doubleValue() <= 21.0) {
            p = 1;
        } else if (((Double) i[55]).doubleValue() > 21.0) {
            p = 0;
        }
        return p;
    }
    static double N3d66003f83(Object []i) {
        double p = Double.NaN;
        if (i[24] == null) {
            p = 0;
        } else if (((Double) i[24]).doubleValue() <= 0.23) {
            p = WekaJ48PrunedClassifier.N35af207184(i);
        } else if (((Double) i[24]).doubleValue() > 0.23) {
            p = WekaJ48PrunedClassifier.N3b5862e087(i);
        }
        return p;
    }
    static double N35af207184(Object []i) {
        double p = Double.NaN;
        if (i[55] == null) {
            p = 0;
        } else if (((Double) i[55]).doubleValue() <= 15.0) {
            p = WekaJ48PrunedClassifier.N4ecce99685(i);
        } else if (((Double) i[55]).doubleValue() > 15.0) {
            p = 0;
        }
        return p;
    }
    static double N4ecce99685(Object []i) {
        double p = Double.NaN;
        if (i[20] == null) {
            p = 1;
        } else if (((Double) i[20]).doubleValue() <= 0.2) {
            p = WekaJ48PrunedClassifier.N3632ebe186(i);
        } else if (((Double) i[20]).doubleValue() > 0.2) {
            p = 0;
        }
        return p;
    }
    static double N3632ebe186(Object []i) {
        double p = Double.NaN;
        if (i[17] == null) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() <= 0.21) {
            p = 1;
        } else if (((Double) i[17]).doubleValue() > 0.21) {
            p = 0;
        }
        return p;
    }
    static double N3b5862e087(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 0.23) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 0.23) {
            p = 0;
        }
        return p;
    }
    static double N7738715288(Object []i) {
        double p = Double.NaN;
        if (i[36] == null) {
            p = 0;
        } else if (((Double) i[36]).doubleValue() <= 0.1) {
            p = 0;
        } else if (((Double) i[36]).doubleValue() > 0.1) {
            p = WekaJ48PrunedClassifier.N5e91a67a89(i);
        }
        return p;
    }
    static double N5e91a67a89(Object []i) {
        double p = Double.NaN;
        if (i[26] == null) {
            p = 0;
        } else if (((Double) i[26]).doubleValue() <= 0.1) {
            p = 0;
        } else if (((Double) i[26]).doubleValue() > 0.1) {
            p = 1;
        }
        return p;
    }
}
