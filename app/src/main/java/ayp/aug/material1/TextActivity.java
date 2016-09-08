package ayp.aug.material1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
private static final String TAG = "TextActivity";
    protected static final String TEXT = "TEXT";
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        mTextView = (TextView) findViewById(R.id.display_text);

        if(getIntent() != null){
            mTextView.setText(getIntent().getStringExtra(TEXT));
        }

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_on_main);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        if(ab != null){
         ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Log.d(TAG,"BACK HOME !");
            supportFinishAfterTransition();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
