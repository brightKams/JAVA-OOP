public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY ;

        if( day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Yay it's almost Friday\n");
        } else {
            System.out.println("Friday's still far!\n");
        }
        for(DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
            System.out.println(myDay);
        };
    }

    
}
