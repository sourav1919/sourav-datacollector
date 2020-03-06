public class enummeth {
    enum season{
        WINTER(6),SUMMER(8),HAMA(81);
        private int value;
        private season(int value){
            this.value=value;
        }
    }
    public static void main(String[]kinglord) {
        for (season s : season.values()) {
            System.out.println(s + "=" + s.value);
        }
        System.out.print("----method and constructor with enum----");
    }

}
