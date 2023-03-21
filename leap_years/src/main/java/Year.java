public class Year {

    int date;
    public Year(int date) {
        this.date = date;
    }

    public boolean checkLeap() {
        if (date % 400 == 0) {
            return true;
        }
        else if (date % 400 != 0 && date % 100 == 0) {
            return false;
        }
        else if (date % 4 == 0 && date % 100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
