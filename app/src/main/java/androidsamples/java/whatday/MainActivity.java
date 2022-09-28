package androidsamples.java.whatday;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	
	private EditText dateField;
	private EditText monthField;
	private EditText yearField;
	private Button checkButton;
	private TextView dayField;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		checkButton=findViewById(R.id.btn_check);
		
		dateField=findViewById(R.id.editDate);
		monthField=findViewById(R.id.editMonth);
		yearField=findViewById(R.id.editYear);
		
		dayField=findViewById(R.id.txt_display);
		
		checkButton.setOnClickListener(
		v -> {
			String yearStr= yearField.getText().toString();
			String monthStr=monthField.getText().toString();
			String dateStr=dateField.getText().toString();
			DateModel.initialize(yearStr,monthStr,dateStr);
			dayField.setText(DateModel.getMessage());
		});
		
	}
	
	
}