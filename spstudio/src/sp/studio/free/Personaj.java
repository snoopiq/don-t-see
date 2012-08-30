package sp.studio.free;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Personaj extends Activity implements OnClickListener {
	
	Button hair;
	Button eyes;
	Button mouth;
	Button shirt;
	Button hands;
	Button legs;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skin);
		
		hair = (Button) findViewById(R.id.hair);
	    hair.setOnClickListener(this);
	    
		eyes = (Button) findViewById(R.id.eyes);
	    eyes.setOnClickListener(this);
	    
		mouth = (Button) findViewById(R.id.mouth);
	    mouth.setOnClickListener(this);
		
		shirt = (Button) findViewById(R.id.shirt);
	    shirt.setOnClickListener(this);
	    
		hands = (Button) findViewById(R.id.hands);
	    hands.setOnClickListener(this);
	    
		legs = (Button) findViewById(R.id.legs);
	    legs.setOnClickListener(this);
	}
	  public void onClick(View v) {
		    switch (v.getId()) {
		    
		    case R.id.hair:	
		    	Intent hair = new Intent(this, hair.class);
		    	startActivity(hair);
		    	break;
		    	
		    case R.id.eyes:
		    	Intent eyes = new Intent(this, eyes.class);
		    	startActivity(eyes);
		    	break;
			
		    case R.id.mouth:
		    	Intent mouth = new Intent(this, mouth.class);
		    	startActivity(mouth);
		    	break;
		    	
		    case R.id.shirt:
		    	Intent shirt = new Intent(this, shirt.class);
		    	startActivity(shirt);
		    	break;
		    	
		    case R.id.hands:
			    Intent hands = new Intent(this, hands.class);
			    startActivity(hands);
			    break;  
			    
		    case R.id.legs:
			    Intent legs = new Intent(this, legs.class);
			    startActivity(legs);
			    break;
		    	
		    default:
		      break;
		    }
	  }
}