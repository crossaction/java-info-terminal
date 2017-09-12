package Let;

class LetCena {

    // Tri niza isto kao u LetBroj klasi.
    private int[] cenaDomacegLeta = new int[] {100};
    private int[] cenaKontinentalnogLeta = new int[] {150, 200, 210, 220, 230, 250, 300};
    private int[] cenaInterkontinentalnogLeta = new int[] {440, 520, 560, 620, 700, 840};

    int[] getResults(int i) {
        switch(i) {
            case 1:
                return cenaDomacegLeta;
            case 2:
                return cenaKontinentalnogLeta;
            case 3:
                return cenaInterkontinentalnogLeta;
            default:
                return new int[0];
        }
    }
}
