public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    public int differenceInYears(MyDate dateToCompare) {
        //Create clone of this object so we do not alter actual object attributes
        MyDate dateClone = new MyDate(this.day, this.month, this.year);
        MyDate comparedDate = new MyDate(dateToCompare.day, dateToCompare.month, dateToCompare.year);
        
        if (comparedDate.earlier(dateClone)) {
            int nDays = 0;
            
            while (!comparedDate.equals(dateClone)) {
                if (comparedDate.day == 30 && comparedDate.month == 12) {
                    nDays++;
                    comparedDate.day = 1;
                    comparedDate.month = 1;
                    comparedDate.year ++;
                } else if (comparedDate.day == 30) { //swap this condition as first?
                    nDays++;
                    
                    comparedDate.day = 1;
                    comparedDate.month++;
                }
                
                nDays++;
                comparedDate.day++;
            }
                    
            System.out.println(nDays);
            return nDays / 360;
        } else {
            int nDays = 0;
            
            while (!dateClone.equals(comparedDate)) {
                if (dateClone.day == 30 && dateClone.month == 12) {
                    nDays++;
                    
                    dateClone.day = 1;
                    dateClone.month = 1;
                    dateClone.year++;
                } else if (dateClone.day == 30) {
                    nDays++;
                    
                    dateClone.day = 1;
                    dateClone.month++;
                }
                
                nDays++;
                dateClone.day++;       
            }
            
            System.out.println(nDays);
            return nDays / 360;
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        //If we are comparing to itself then return true
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof MyDate)) {
            return false;
        }
        
        //Type cast to specific object so we can compare
        MyDate date = (MyDate) obj;
        
        return (Integer.compare(day, date.day) == 0 && Integer.compare(month, date.month) == 0
                && Integer.compare(year, date.year) == 0);
    }

}
