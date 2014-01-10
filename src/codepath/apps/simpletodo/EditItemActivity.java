package codepath.apps.simpletodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_item);
		
    	EditText etEditItem = (EditText)findViewById(R.id.etEditItem);
    	String initialText = getIntent().getStringExtra("initialText");
    	etEditItem.setText(initialText);
    	etEditItem.setSelection(initialText.length());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_item, menu);
		return true;
	}
	
	public void saveEdit(View v) {
    	Intent data = new Intent();
    	EditText etEditItem = (EditText)findViewById(R.id.etEditItem);
    	data.putExtra("edited", etEditItem.getText().toString());
		setResult(RESULT_OK, data);
		finish();
	}
}
