public class Gnirts implements CharSequence {
    String content;

    public Gnirts(String inputString) {
        this.content = inputString;
    }

    @Override
    public int length() {
        return this.content.length();
    }

    @Override
    public char charAt(int i) {
        return this.content.charAt(this.content.length() - i - 1);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        String subSeq = "";
        int j = this.content.length() - i - 1;
        int k = this.content.length() - i1 - 1;
        if (i < i1) {
            while (j != k - 1) {
                subSeq += (Character.toString(this.content.charAt(j)));
                j--;
            }
        }
        if (i > i1) {
            while (j != k + 1) {
                subSeq += (Character.toString(this.content.charAt(j)));
                j++;
            }
        }
        return subSeq;
    }

    @Override
    public String toString() {
        content.subSequence(0, 1);
        return "Gnirts: " + subSequence(0, content.length() - 1).toString();
    }
}

