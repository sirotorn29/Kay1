package sirotorn.kay1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button button;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = input.getText().toString();
                if (!message.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,page2.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
                }
            }
        });
    }
}
