package stronger.bigger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class Main extends Activity implements OnClickListener {
    Button hands;
    Button center;
    Button legs;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_1);
        
        hands = (Button) findViewById(R.id.hands);
        hands.setOnClickListener(this);    
        
        center = (Button) findViewById(R.id.center);
        center.setOnClickListener(this);
        
        legs = (Button) findViewById(R.id.legs);
        legs.setOnClickListener(this);
       
    }
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.hands:
          Intent hands = new Intent(this, Hands.class);
          startActivity(hands);
          break;
        case R.id.center:
           Intent center = new Intent(this, Center.class);
           startActivity(center);
           break;        
    	case R.id.legs:
        Intent legs = new Intent(this, Legs.class);
        startActivity(legs);
        break;
        }
      }
}