package in.photowalk.blr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
	       /*View v = inflater.inflate(R.layout.myfragment_layout, container,false);
	        TextView tv = (TextView ) v.findViewById(R.id.tv);
	        tv.setText("You are viewing the page #" + mCurrentPage + "\n\n" + "Swipe Horizontally left / right");
	        return v;*/
		 switch(mCurrentPage)
	      {
	      case 1: 
	    	  View page1= inflater.inflate(R.layout.photosmain, container,false);
	    	  return page1;
	      case 2:
	    	  View page2=inflater.inflate(R.layout.eventsmain, container,false);
	    	  return page2;
	    	  default:
	    		  View v = inflater.inflate(R.layout.myfragment_layout, container,false);
				  return v;
	    		  
	    		  
	      }
	    	  
		 
	    }
	  
	
	
}
