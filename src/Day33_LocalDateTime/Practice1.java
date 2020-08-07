package Day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {

        String[] friends = {"Violetta","Sayera", "Maria", "Diana", "Tania"};
        LocalDate[] birthDays = {
                LocalDate.of(1995,4,13),
                LocalDate.of(1990,5,10),
                LocalDate.of(1995,7,6),
                LocalDate.of(1995,3,7),
                LocalDate.of(1984,10,4)
        };


        for( int i =0; i <= friends.length-1; i++){
            System.out.println(friends[i]+" : "+birthDays[i]);
        }
        System.out.println("=================================");

        for( LocalDate each: birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);

        }
    }
}
