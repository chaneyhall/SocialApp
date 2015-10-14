package com.fdu.socialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final User user = (User) getApplication();
        super.onCreate(savedInstanceState);
        if (user.isLogin()){
            Intent intent = new Intent(this, Main.class);
            startActivity(intent);
            finish();
        }
        setContentView(R.layout.activity_login);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View view){
        final User user = (User) getApplication();
        user.login();
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        finish();
    }
}
