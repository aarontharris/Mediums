package com.ath.medium.coupling.none;

public class Glove {

    public enum GlovePosition {
        thumb, index, middle, ring, pinky
    }

    public static class GloveHole {
        GlovePosition position;
        float lengthMillimeters;
    }

    public GloveHole getThumb() {
        return null;
    }

    public GloveHole getIndex() {
        return null;
    }

    public GloveHole getMiddle() {
        return null;
    }

    public GloveHole getRing() {
        return null;
    }

    public GloveHole getPinky() {
        return null;
    }

}

