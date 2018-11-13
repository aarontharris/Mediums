package com.ath.medium.futureyou;

public class ShrinkRay extends ComplicatedGizmo implements RayGun {
    private boolean charged = false;

    public ShrinkRay() {
    }

    public void setRayColor(float freqHz) {
        this.remodulateHarmonicBalancers(freqHz);
        this.recalibrateDoomsdayPumpers(freqHz / 1000f);
    }

    public synchronized boolean isCharged() {
        return charged;
    }

    public synchronized void recharge() {
        charged = true;
    }

    @Override
    public synchronized void activate() {
        super.activate();
        charged = false;
    }

    @Override
    public void fire() {
        activate();
    }
}
