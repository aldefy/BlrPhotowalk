package in.photowalk.blr;

import android.app.Application;

import com.pushbots.push.Pushbots;

public class MyApplication extends Application {
    private String SENDER_ID="798256687080";
	private String PUSHBOTS_APPLICATION_ID="52b0d9114deeae486b00000e";

	@Override
    public void onCreate() {
        super.onCreate();
        Pushbots.init(this, SENDER_ID,PUSHBOTS_APPLICATION_ID);
     }
 }