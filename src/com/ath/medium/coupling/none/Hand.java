package com.ath.medium.coupling.none;

public class Hand {

    public enum FingerPosition {
        thumb, index, middle, ring, pinky
    }

    public static class Finger {
        FingerPosition position;
        float lengthMillimeters;
    }

    public Finger getThumb() {
        return null;
    }

    public Finger getIndex() {
        return null;
    }

    public Finger getMiddle() {
        return null;
    }

    public Finger getRing() {
        return null;
    }

    public Finger getPinky() {
        return null;
    }

}

