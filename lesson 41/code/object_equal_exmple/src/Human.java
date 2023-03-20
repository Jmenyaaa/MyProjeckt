public class Human {
    public int age; // открытое поле, отвечает за возраст
    public boolean is_worker; // открытое поле класса, отвечает за статус работает или нет

    public Human(int age, boolean is_worker) {
        this.age = age;
        this.is_worker = is_worker;
    }
    @Override
    public  boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }


            Human that = (Human) obj;
            return this.age == that.age && this.is_worker == that.is_worker;

    }
}
