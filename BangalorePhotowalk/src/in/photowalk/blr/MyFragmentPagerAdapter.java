package in.photowalk.blr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter 
{

	final int PAGE_COUNT = 2;
	 /** Constructor of the class */
	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		MyFragment myFragment = new MyFragment();
        Bundle data = new Bundle();
        data.putInt("current_page", arg0+1);
        myFragment.setArguments(data);
		return myFragment;
	}
	/** Returns the number of pages */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_COUNT;
	}
	 @Override
	    public CharSequence getPageTitle(int position) {
	        return "Page #" + ( position + 1 );
	    }

	
}
