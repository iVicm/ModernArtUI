package course.lab.ivicm.modernartui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private int color1;
    private int color2;
    private int color3;
    private int color4;
    private int color5;
    private int color6;

    private LinearLayout block1;
    private LinearLayout block2;
    private LinearLayout block3;
    private LinearLayout block4;
    private LinearLayout block5;
    private LinearLayout block6;

    private SeekBar seekBar;

    private MoreInfoDialogFragment moreInfoDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        block1 = (LinearLayout) findViewById(R.id.col1_1);
        block2 = (LinearLayout) findViewById(R.id.col1_2);
        //block3 = (LinearLayout) findViewById(R.id.col1_3);
        block4 = (LinearLayout) findViewById(R.id.col2_1);
        block5 = (LinearLayout) findViewById(R.id.cell_1);
        //block6 = (LinearLayout) findViewById(R.id.cell_2);

        color1 = getResources().getColor(R.color.block1);
        color2 = getResources().getColor(R.color.block2);
        //color3 = getResources().getColor(R.color.block3);
        color4 = getResources().getColor(R.color.block4);
        color5 = getResources().getColor(R.color.block5);
        //color6 = getResources().getColor(R.color.block6);

        moreInfoDialogFragment = new MoreInfoDialogFragment();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser){
                block1.setBackgroundColor(color1+progresValue*10000);
                block2.setBackgroundColor(color2+progresValue*100);
                //block3.setBackgroundColor(color3+progresValue*100);
                block4.setBackgroundColor(color4+progresValue*1000);
                block5.setBackgroundColor(color5+progresValue*10);
                //block6.setBackgroundColor(color6+progresValue*100000);
            }

            @Override
        public void onStartTrackingTouch(SeekBar seekBar){

            }

            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.more_info) {
            moreInfoDialogFragment.show(getFragmentManager(),"More Info");
        }

        return super.onOptionsItemSelected(item);
    }
}
