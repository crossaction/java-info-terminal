package Let;

class LetDestinacija {

    // Tri niza isto kao u LetBroj i LetCena klasama.
    private String[] domaceDestinacije = new String[] {"Nis, Srbija"};
    private String[] kontinentalneDestinacije = new String[] {"Podgorica, Crna Gora", "Zagreb, Hrvatska",
            "Ljubljana, Slovenija", "Bec, Austrija", "Amsterdam, Holandija", "Stokholm, Svedska", "London, Engleska"};
    private String[] interKontinentalneDestinacije = new String[] {"Njujork, S.A.D.", "Toronto, Kanada", "Peking, Kina",
            "Tokio, Japan", "Melburn, Australija", "Velington, Novi Zeland"};

    String[] getResults(int i) {
        switch(i) {
            case 1:
                return domaceDestinacije;
            case 2:
                return kontinentalneDestinacije;
            case 3:
                return interKontinentalneDestinacije;
        }
        return new String[0];
    }

}
