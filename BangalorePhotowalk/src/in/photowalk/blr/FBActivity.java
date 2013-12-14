package in.photowalk.blr;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FBActivity extends FragmentActivity
{
	private MainFBFragment mainFBFragment;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    if (savedInstanceState == null) {
	        // Add the fragment on initial activity setup
	        mainFBFragment = new MainFBFragment();
	        getSupportFragmentManager()
	        .beginTransaction()
	        .add(android.R.id.content, mainFBFragment)
	        .commit();
	    } else {
	        // Or set the fragment from restored state info
	        mainFBFragment = (MainFBFragment) getSupportFragmentManager()
	        .findFragmentById(android.R.id.content);
	    }
	}
	
	//The authentication flow initializes the Facebook SDK, 
	//opens the session and requests basic permissions.
	

	
	
	

}
