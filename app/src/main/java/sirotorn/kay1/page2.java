package sirotorn.kay1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView textView;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        textView = (TextView)findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            message = bundle.getString("message");
            textView.setText(message);
        }
    }
}
