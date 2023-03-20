public class Programmer extends Human {
    public int experience; // открытое поле отражает количество лет в опыте програмиста

    public Programmer(int age, boolean is_worker, int experience) {
        super(age, is_worker);
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {

            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }


            Programmer that = (Programmer) obj;
            return this.age == that.age && this.is_worker == that.is_worker
            && this.experience == that.experience;

        }
    }

