package Let;

class LetBroj {

    private int[] brojDomacegLeta = new int[] {110001};
    private int[] brojKontinentalnogLeta = new int[] {2200001, 2200002, 2200003, 2200004, 2200005, 2200006, 2200007};
    private int[] brojInterkontinentalnogLeta = new int[] {3300001, 3300002, 3300003, 3300004, 3300005, 3300006};

    int[] getResults(int i) {
        switch(i) {
            case 1:
                return brojDomacegLeta;
            case 2:
                return brojKontinentalnogLeta;
            case 3:
                return brojInterkontinentalnogLeta;
            default:
                return new int[0];
        }
    }

}