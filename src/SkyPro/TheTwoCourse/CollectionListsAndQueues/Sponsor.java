package SkyPro.TheTwoCourse.CollectionListsAndQueues;

class Sponsor {
    private final String sponsorName;          // ФИО» спонсора
    private final int AmountOfSupport;         // сумма поддержки

    public Sponsor(String sponsorName, int amountOfSupport) {
        this.sponsorName = sponsorName;
        AmountOfSupport = amountOfSupport;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getAmountOfSupport() {
        return AmountOfSupport;
    }

    void sponsorTheRace() {
        System.out.printf("Спонсор %s, выделил сумму %d",sponsorName,AmountOfSupport);
    }

}
