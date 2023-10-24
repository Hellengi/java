public class Main {
    public static void main(String[] args) {
        season s = season.Summer;
        System.out.println("Information about loved season: " + s + ", temperature - " + s.getTemp() + "\n" + s.getDescription());
        lovedSeason(s);
        System.out.println();
        for(season x : season.values()){
            System.out.println("All information: " + x + ", temperature - " + x.getTemp() + "\n" + x.getDescription());
        }
    }
    public enum season {
        Winter(-5), Spring(11),
        Summer (22){
            @Override
            public String getDescription(){
                return "Теплое время года";
            }
        }, Autumn(8);
        private final double temp;

        season(double temp){
            this.temp = temp;
        }
        public double getTemp(){
            return temp;
        }
        public String getDescription(){
            return "Холодное время года";
        }
    }
    public static void lovedSeason(season s){
        switch (s){
            case Winter -> System.out.println("I love winter");
            case Spring -> System.out.println("I love spring");
            case Summer -> System.out.println("I love summer");
            case Autumn -> System.out.println("I love autumn");
        }
    }
}