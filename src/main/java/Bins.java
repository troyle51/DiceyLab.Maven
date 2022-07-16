import java.util.ArrayList;
import java.util.Arrays;

public class Bins {
    private Integer maxBin;
    private Integer minBin;
    //private Integer increment;
    private Integer[] binsArr = new Integer[11];


    public Bins() {
//        this.minBin = minBin;
//        this.maxBin = maxBin;
        //this.increment = increment;
    }

    public Integer[] getBinsArr() {
        return binsArr;
    }

    public Integer[] createBin() {
        //Integer[] binsArr = new Integer[11];
        for(int i = 0; i < binsArr.length; i++){
            this.binsArr[i] = 0;
        }
        //System.out.println(Arrays.toString(this.binsArr));
        return this.binsArr;
    }

    //take results of dice toss, find the corresponding
    // array index equals to
    // the number increment that index by 1.

    public void incrementBin(int increment){
        /*
        * [0] = 2
        * [1] = 3
        * [2] = 4
        * [3] = 5
        * [4] = 6
        * [5] = 7
        * [6] = 8
        * [7] = 9
        * [8] = 10
        * [9] = 11
        * [10] = 12
        * */
        //for(int i = 0; i<this.binsArr.length; i++) {

            if (increment == 2) {
                this.binsArr[0]++;
            }
            if (increment == 3) {
                this.binsArr[1]++;
            }
            if (increment == 4) {
                this.binsArr[2]++;
            }
            if (increment == 5) {
                this.binsArr[3]++;
            }
            if (increment == 6) {
                this.binsArr[4]++;
            }
            if (increment == 7) {
                this.binsArr[5]++;
            }
            if (increment == 8) {
                this.binsArr[6]++;
            }
            if (increment == 9) {
                this.binsArr[7]++;
            }
            if (increment == 10) {
                this.binsArr[8]++;
            }
            if (increment == 11) {
                this.binsArr[9]++;
            }
            if (increment == 12) {
                this.binsArr[10]++;
            }
        //}
        //System.out.println(Arrays.toString(this.binsArr));
        //return this.binsArr;
    }
}
