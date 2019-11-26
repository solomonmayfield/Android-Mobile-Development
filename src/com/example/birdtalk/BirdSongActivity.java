package com.example.birdtalk;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class BirdSongActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new BirdSongFragment();
	}

}
