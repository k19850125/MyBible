package samuelchung.mybible;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button newTestament,oldTestament;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("中文聖經");
        findView();
        setListener();
    }

    private void setListener() {
        newTestament.setOnClickListener(listener);
        oldTestament.setOnClickListener(listener);
    }

    private void findView() {
        newTestament = (Button)findViewById(R.id.newTestament);
        oldTestament = (Button)findViewById(R.id.oldTestament);
    }

    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
                if(view==newTestament){
                    Intent intent = new Intent(MainActivity.this,NewTestament.class);
                    startActivity(intent);
                }else if(view==oldTestament){
                    Intent intent = new Intent(MainActivity.this,OldTestament.class);
                    startActivity(intent);
                }
        }
    };
}
