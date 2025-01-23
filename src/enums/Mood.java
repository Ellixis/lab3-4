package enums;

// Enum для состояний человека
public enum Mood {
    SCARED("испуганный"), CALM("спокойный"), DETERMINED("определившийся");
    private final String mood;

    Mood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return this.mood;
    }
}