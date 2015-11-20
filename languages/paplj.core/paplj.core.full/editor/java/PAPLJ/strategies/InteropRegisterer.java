package PAPLJ.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

import PAPLJ.strategies.runprogram_0_0;

public class InteropRegisterer extends JavaInteropRegisterer {
    public InteropRegisterer() {
        super(new Strategy[] { java_strategy_0_0.instance, runprogram_0_0.instance  });
    }
}
