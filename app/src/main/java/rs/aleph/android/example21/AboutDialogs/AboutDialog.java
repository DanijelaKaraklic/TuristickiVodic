package rs.aleph.android.example21.AboutDialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class AboutDialog extends AlertDialog.Builder{

	public AboutDialog(Context context) {
        super(context);
		
		setTitle("About");
	    setMessage("This application was made by Danijela Karaklic");
	    setCancelable(false);
	    
	    setPositiveButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				dialog.dismiss();
			}
		});
	    
	    setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
			}
		});
	}
	
	
	public AlertDialog prepareDialog(){
		AlertDialog dialog = create();
		dialog.setCanceledOnTouchOutside(false);
		
		return dialog;
	}
	
}
