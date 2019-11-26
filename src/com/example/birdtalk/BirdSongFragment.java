package com.example.birdtalk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BirdSongFragment extends Fragment {
	private AudioPlayer player = new AudioPlayer();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_bird_song, container, false);
		
		initPlayButton(view);
		initStopButton(view);
		
		return view;
	}
	
	public void initPlayButton(View view)
	{
		Button button = (Button)view.findViewById(R.id.button_play);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				player.play(getActivity());
			}
		});
	}
	
	public void initStopButton(View view)
	{
		Button button = (Button)view.findViewById(R.id.button_stop);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				player.stop();
			}
		});
	}
	
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		player.stop();
	}
}
