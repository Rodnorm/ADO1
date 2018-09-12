package ado1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserPreferences {
    
    static String  userName = "fulano", password = "******";
    static boolean userProfileHelper;
    static String  userProfile = "";
    static String  timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm").format(new Date());
    
    public  UserPreferences() {}
    
    public static String[] getSession(){
        
        if (userProfileHelper){
            userProfile = "Administrador ";
            userProfileHelper = false;
        }else{
            userProfile = "Operador";
            userProfileHelper = true;
        }
        String[] session = {
            userName, password, userProfile, timeStamp 
        };
        return session;
    }
    
}
