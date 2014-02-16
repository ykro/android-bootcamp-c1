package com.elementalgeeks.bootcampsw.activities;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.elementalgeeks.bootcampsw.R;
import com.elementalgeeks.bootcampsw.fragments.AboutFragment;

public class MainActivity extends FragmentActivity {	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.main, new AboutFragment()).commit();
	}
}