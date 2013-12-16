package in.photowalk.blr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class SubmitpageFragment extends Fragment
{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		/** Getting the arguments to the Bundle object */
        Bundle data = getArguments();
        
        
        
	}	
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View v = inflater.inflate(R.layout.submitmain, container,false);
		// TODO Auto-generated method stub
		EditText nameField = (EditText) v.findViewById(R.id.EditTextName);
		final String name = nameField.getText().toString();
			
		EditText emailField = (EditText) v.findViewById(R.id.EditTextEmail);
		final String email = emailField.getText().toString();
		
		EditText feedbackField = (EditText) v.findViewById(R.id.EditTextFeedbackBody);
		final String feedback = feedbackField.getText().toString();
		
		Spinner feedbackSpinner = (Spinner)v.findViewById(R.id.SpinnerFeedbackType);
		final String feedbackType = feedbackSpinner.getSelectedItem().toString();

		
		CheckBox responseCheckbox = (CheckBox) v.findViewById(R.id.CheckBoxResponse);
		final boolean bRequiresResponse = responseCheckbox.isChecked();
		Button submit=(Button)v.findViewById(R.id.ButtonSendFeedback);
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				
				// Take the fields and format the message contents
						String subject = formatFeedbackSubject(feedbackType);
						String message = formatFeedbackMessage(feedbackType, name,
								 email, feedback, bRequiresResponse);
							
							// Create the message
							sendFeedbackMessage(subject, message);
			}
		});
		
		
		return v;
		
	
	}
	
public String formatFeedbackSubject(String feedbackType) {
		
		String strFeedbackSubjectFormat = getResources().getString(
				R.string.feedbackmessagesubject_format);

		String strFeedbackSubject = String.format(strFeedbackSubjectFormat, feedbackType);
		
		return strFeedbackSubject;

	}
	
	protected String formatFeedbackMessage(String feedbackType, String name,
			String email, String feedback, boolean bRequiresResponse) {
		
		String strFeedbackFormatMsg = getResources().getString(
				R.string.feedbackmessagebody_format);

		String strRequiresResponse = getResponseString(bRequiresResponse);

		String strFeedbackMsg = String.format(strFeedbackFormatMsg,
				feedbackType, feedback, name, email, strRequiresResponse);
		
		return strFeedbackMsg;

	}
	

	protected String getResponseString(boolean bRequiresResponse)
	{
		if(bRequiresResponse==true)
		{
			return getResources().getString(R.string.feedbackmessagebody_responseyes);
		} else {
			return getResources().getString(R.string.feedbackmessagebody_responseno);
		}
			
	}

	public void sendFeedbackMessage(String subject, String message) {

		Intent messageIntent = new Intent(android.content.Intent.ACTION_SEND);

		String aEmailList[] = { "admin@aditlal.net" };
		messageIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);

		messageIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);

		messageIntent.setType("plain/text");
		messageIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);

		startActivity(messageIntent);
	}


}
