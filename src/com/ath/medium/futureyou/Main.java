package com.ath.medium.futureyou;

public class Main {

    public static void demonstrate() {
        ShrinkRay ray1 = new ShrinkRay();
        // ray1 is confusing -- perhaps I'll look what others did and copy/paste their code?

        ShrinkRayAdvanced ray2 = new ShrinkRayAdvanced();
        if (!ray2.isCharged())
            ray2.recharge();
        ray2.fire();
    }

}
