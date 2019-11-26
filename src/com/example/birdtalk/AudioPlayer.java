package com.example.birdtalk;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class AudioPlayer 
{
	private MediaPlayer player;
	
	public void play(Context context)
	{
		stop();
		
		player = MediaPlayer.create(context, R.raw.bird);
		
		player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				stop();
			}
		});
		player.start();
	}
	
	public void stop()
	{
		if(player != null)
		{
			player.release();
			player = null;
		}
	}
}
