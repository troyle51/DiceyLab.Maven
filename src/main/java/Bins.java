import java.util.ArrayList;

public class Bins {
    private Integer maxBin;
    private Integer minBin;
    private Integer increment;
    private Integer[] binsArr = new Integer[10];


    public Bins() {
//        this.minBin = minBin;
//        this.maxBin = maxBin;
    }

    public Integer[] createBin() {
        Integer[] binsArr = new Integer[10];
        for(int i = 0; i < binsArr.length; i++){
            this.binsArr[i] = 0;
        }
        return this.binsArr;
    }

    //take results of dice toss, find the corresponding
    // array index equals to
    // the number increment that index by 1.

    public Integer[] incrementBin(int increment){
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

        if (increment == 2 ){
            this.binsArr[0]+=1;
        }if (increment == 3 ){
            this.binsArr[1]+=1;
        }if (increment == 4 ){
            this.binsArr[2]+=1;
        }if (increment == 5 ){
            this.binsArr[3]+=1;
        }if (increment== 6 ){
            this.binsArr[4]+=1;
        }if (increment == 7 ){
            this.binsArr[5]+=1;
        }if (increment == 8 ){
            this.binsArr[6]+=1;
        }if (increment == 9 ){
            this.binsArr[7]+=1;
        }if (increment == 10 ){
            this.binsArr[8]+=1;
        }if (increment == 11 ){
            this.binsArr[9]+=1;
        }if (increment == 12 ){
            this.binsArr[10]+=1;
        }
        return this.binsArr;
    }
}
