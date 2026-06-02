package outer.com;

import inner.SmartWatch;

public class FitnessWatch extends SmartWatch {

    @Override
    protected void showFeatures() {
        System.out.println("Shows fitness tracking features");
    }
}