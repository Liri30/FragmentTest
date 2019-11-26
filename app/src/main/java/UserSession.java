import android.content.Context;
import android.content.SharedPreferences;

public class UserSession {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    //Shared pref mode
    int PRIVATE_MODE = 0;

    //Sharedpref file name
    private static final String PREF_NAME = "UserSessionPref";

    public void setUser(String user){
        editor.putString("user", user);
        editor.commit();
    }

    public String getUser(){
        return sharedPreferences.getString("user","default");
    }
}
