public class CharacterCounter {
    private String string;

    public CharacterCounter(String string) {
        this.string = string;
    }

    public int count(char character) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}
