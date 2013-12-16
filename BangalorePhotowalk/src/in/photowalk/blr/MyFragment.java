package in.photowalk.blr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MyFragment extends Fragment 
{

	  int mCurrentPage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		/** Getting the arguments to the Bundle object */
        Bundle data = getArguments();
 
        /** Getting integer data of the key current_page from the bundle */
        mCurrentPage = data.getInt("current_page", 0);
	}
	
	 @Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	       View v = inflater.inflate(R.layout.myfragment_layout, container,false);
	       
	        return v;
		/* switch(mCurrentPage)
	      {
	    case 1: 
	    	  	View page1= inflater.inflate(R.layout.mainpage1, container,false);
	    	  		
	    	        return page1;	
	    	
	    	        
	    	    	  
	 
	      default:
	    		    View v = inflater.inflate(R.layout.myfragment_layout, container,false);
				    return v;
	    		  
	    		  
	      }*/
		 
		 
	    }
	  
	
	
}
