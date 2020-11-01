public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        if (earlier(compared)) {
            return compared.differenceInYears(this);
        }
        return calculateDifference(compared);
    }

    private int calculateDifference(MyDate verrattava) {
        int vuosiPois = 0;

        if (this.month < verrattava.month) {
            vuosiPois = 1;
        } else if (this.month == verrattava.month && this.day < verrattava.day) {
            vuosiPois = 1;
        }

        return this.year - verrattava.year - vuosiPois;
    }

}
