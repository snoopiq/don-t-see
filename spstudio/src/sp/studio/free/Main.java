package sp.studio.free;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class Main extends Activity implements OnClickListener{
    Button start;
    Button about;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frst_page);
        
        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(this);    
        
        about = (Button) findViewById(R.id.about);
        about.setOnClickListener(this);
        
    }

      public void onClick(View v) {
        switch (v.getId()) {
        case R.id.start:
          Intent start = new Intent(this, Personaj.class);
          startActivity(start);
          break;
        case R.id.about:
           Intent about = new Intent(this, About.class);
           startActivity(about);
           break;
        }
      }
}