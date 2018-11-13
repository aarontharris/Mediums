package com.ath.medium.futureyou;

public class ShrinkRayAdvanced implements RayGun {
    private boolean charged = false;
    private ComplicatedGizmo internals;

    public ShrinkRayAdvanced() {
        internals = new ComplicatedGizmo();
    }

    public void setRayColor(float freqHz) {
        internals.remodulateHarmonicBalancers(freqHz);
        internals.recalibrateDoomsdayPumpers(freqHz / 1000f);
    }

    public synchronized boolean isCharged() {
        return charged;
    }

    public synchronized void recharge() {
        charged = true;
    }

    @Override
    public synchronized void fire() {
        internals.activate();
        charged = false;
    }
}
