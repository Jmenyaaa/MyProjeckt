public class Main {
    public static void main(String[] args) {
        System.out.println("Список участников Bmx контеста");
        Contest contest1 = new Contest("Yewhenii", "Skrebov", "26.12.2003", "Waldemar str 25, Berlin 10999", "+49176543276", "Keine", "Amateur");
        Contest contest2 = new Contest("Dmitry", "Chabanov", "12.9.2002", "Hermann str 19, Berlin 10997", "+49176435376", "Keine", "Pro,Amateur"  );
        Contest contest3 = new Contest("Felix","Prangenberg","03.09.1995","Oranien str 56, Köln 18764", "+491767654305", "WeThePeople, Eclat, Monster, Vans, Kunstformbmxshop, OurHouse, Doomedbrand", "Pro");
        System.out.println(contest1);
        System.out.println(contest2);
        System.out.println(contest3);
        /*

        Contest myContest = new Contest();
        myContest.name = "Yewhenii";
        myContest.lastName = "Skrebov";
        myContest.Birthday = "26.12.2003";
        myContest.Adress = "Waldemar str 25, Berlin 10999";
        myContest.mobileNumber = "+49176543276";
        myContest.Klasse = "Amateur";
        myContest.sponsors = "Keine";

        Contest myContest1 = new Contest();
        myContest1.name = "Dmitry";
        myContest1.lastName = "Chabanov";
        myContest1.Birthday = "12.9.2002";
        myContest1.Adress = "Hermann str 19, Berlin 10997";
        myContest1.mobileNumber = "+49176435376";
        myContest1.Klasse = "Pro,Amateur";
        myContest1.sponsors = "Keine";

        Contest myContest2 = new Contest();
        myContest2.name = "Felix";
        myContest2.lastName = "Prangenberg";
        myContest2.Birthday = "03.09.1995";
        myContest2.Adress = "Oranien str 56, Köln 18764";
        myContest2.mobileNumber = "+491767654305";
        myContest2.Klasse = "Pro";
        myContest2.sponsors = "WeThePeople, Eclat, Monster, Vans, Kunstformbmxshop, OurHouse, Doomedbrand";

        System.out.println(myContest.toString());
        System.out.println(myContest1.toString());
        System.out.println(myContest2.toString());
        */

    }
}