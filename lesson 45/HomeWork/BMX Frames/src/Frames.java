public class Frames implements Comparable<Frames>{
    String name;
    double TopTubeLenght;
    double ChainStayLenght;
    double HeadTubeAngle;
    double StandoverHeight;
    String color;


    public Frames(String name, double topTubeLenght, double chainStayLenght, double headTubeAngle, double standoverHeight, String color) {
        this.name = name;
        TopTubeLenght = topTubeLenght;
        ChainStayLenght = chainStayLenght;
        HeadTubeAngle = headTubeAngle;
        StandoverHeight = standoverHeight;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", TopTubeLenght=" + TopTubeLenght +
                ", ChainStayLenght=" + ChainStayLenght +
                ", HeadTubeAngle=" + HeadTubeAngle +
                ", StandoverHeight=" + StandoverHeight +
                ", color=" + color +'\n';
    }

    @Override
    public int compareTo(Frames anotherFrame) { // сигнатура метода тип возвращаемого значения наименование метожа и параметры
        if (this.ChainStayLenght == anotherFrame.ChainStayLenght) { // условие сравнения по площи дома
            return 0; // возвращает 0 если площи равны
        } else if (anotherFrame.ChainStayLenght > this.ChainStayLenght) {
            return -1; // возвращает -1 если одна площадь менше другой
        } else {
            return 1; // возвращает -1 если площадь меньше другой

        }
    }
}
