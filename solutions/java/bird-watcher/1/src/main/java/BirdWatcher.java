
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int length = this.birdsPerDay.length;
        return this.birdsPerDay[length - 1];
    }

    public void incrementTodaysCount() {
        int length = this.birdsPerDay.length;
        this.birdsPerDay[length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (i < numberOfDays) {
                count = count + this.birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                countBusyDays++;
            }
        }
        return countBusyDays;
    }
}
