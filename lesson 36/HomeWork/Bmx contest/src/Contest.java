public class Contest {
    String name;
    String lastName;
    String Birthday;
    String Adress;
    String mobileNumber;
    String sponsors;
    String Klasse;

    @Override
    public String toString() {
        return "Участник:" +
                "name-" + name +
                ", lastName-" + lastName +
                ", Birthday=" + Birthday +
                ", Adress=" + Adress +
                ", mobileNumber=" + mobileNumber +
                ", sponsors=" + sponsors +
                ", Klasse" + Klasse ;
    }
    public Contest(String name, String lastName, String Birthday, String Adress, String mobileNumber, String sponsors, String Klasse) {
        this.name = name;
        this.lastName = lastName;
        this.Birthday = Birthday;
        this.Adress = Adress;
        this.mobileNumber = mobileNumber;
        this.sponsors = sponsors;
        this.Klasse = Klasse;
    }
}
