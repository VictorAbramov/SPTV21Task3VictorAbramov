package sptv21task3victorabramov;
import java.util.Scanner;
public class SPTV21Task3VictorAbramov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scanner.nextLine();
        System.out.println("Фамилия: ");
        String surname = scanner.nextLine();
        System.out.println("Личный код: ");
        String isikukood = scanner.nextLine();
        
        String fullYear = null;
        String gender = isikukood.substring(0,1);
        int genderInt = Integer.valueOf(gender);
        
        if (genderInt == 5 || genderInt == 6){
            fullYear = "20" + isikukood.substring(1,3);
        }
        else if (genderInt == 3 || genderInt == 4){
            fullYear = "19" + isikukood.substring(1,3);
    }
        String fullMonth = null;
        String month = isikukood.substring(3,5);
        int monthInt = Integer.valueOf(month);
        
        if (monthInt == 1){
            fullMonth = "января";
        }
        if (monthInt == 2){
            fullMonth = "февраля";
        }
        if (monthInt == 3){
            fullMonth = "марта";
        }
        if (monthInt == 4){
            fullMonth = "апреля";
        }
        if (monthInt == 5){
            fullMonth = "мая";
        }
        if (monthInt == 6){
            fullMonth = "июня";
        }
        if (monthInt == 7){
            fullMonth = "июля";
        }
        if (monthInt == 8){
            fullMonth = "авгуса";
        }
        if (monthInt == 9){
            fullMonth = "сентября";
        }
        if (monthInt == 10){
            fullMonth = "октября";
        }
        if (monthInt == 11){
            fullMonth = "ноября";
        }     
        if (monthInt == 12){
            fullMonth = "декабря";
        }    
        
        String fullNumber = null;
        String number = isikukood.substring(5,7);
        int numberInt = Integer.valueOf(number);
        fullNumber = isikukood.substring(5,7);
        
        
        System.out.println(name + " " + surname + " родился " + fullNumber + " " + fullMonth + " " + fullYear + " года.")
    }

        
        
    }
    

