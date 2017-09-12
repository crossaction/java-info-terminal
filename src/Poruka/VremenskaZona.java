package Poruka;

class VremenskaZona {

    // Zaboravio sam gde je trebalo da se ubaci ovo. Mozda da se u objekat Let ubaci GMT 0 vreme, i onda modifikuje
    // sa +2 posto smo trenutno u toj zoni. Mozda bi korisnik mogao da bira vremensku zonu? Trenutno ne mogu da
    // izbalansiram korisno/naporno-za-rad. Ako smislis neki lak nacin za ovo, bilo bi lepo da ima.
    private int[] vremenskeZone = new int[]{-12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7,
            8, 9, 10, 11, 12};

    public int[] getZone() {
        return vremenskeZone;
    }

}
