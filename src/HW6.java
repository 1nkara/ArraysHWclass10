public class HW6 {
    public static void main(String[] args) {/*
        Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.
                Then print all values from that array using 2 different loops
                and calculate how many total countries been stored.*/
        String[][]country={{"USA","Canada","Mexico"},
                {"Brazil","Columbia","Argentina"},
                {"France","Norway","Finland","Italy"},
                {"Kazakhstan","South Korea","Japan"},
                {"Ghana","Kenya","Nigeria"}
        };
        for(int i=0;i<country.length;i++){
            for(int j=0;j<country[i].length;j++){
                System.out.print(country[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] country1:country) {
        for (String country2 : country1) {
            System.out.print(country2 + " ");
        }
        System.out.println();
    }

    }
}
