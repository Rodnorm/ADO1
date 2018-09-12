package ado1;

public class ADO1 {

    public static void main(String[] args) {

        
        UserPreferences uP = new UserPreferences();
        
        String[] result =  uP.getSession();
        
        for (int i = 0; i< uP.getSession().length; i++){
            System.out.println(uP.getSession()[i]);
        }
    }    
}
