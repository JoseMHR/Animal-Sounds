package taos.sonidosanimalesfree.proyecto;

import java.util.Random;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import taos.sonidosanimalesfree.proyecto.R;
import android.graphics.Color;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class Dos extends Activity {

	private InterstitialAd interstitial;
	Random r = new Random();
	MediaPlayer mediaPlayer;
	private ImageButton button1;
	private ImageButton button2;
	private ImageButton button3;
	private ImageButton button4;
	int res;
	int a0;
	int a1;
	int a2;
	int a3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dos);

		// Buscar AdView como recurso y cargar una solicitud.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		button1 = (ImageButton) findViewById(R.id.button1);
		button2 = (ImageButton) findViewById(R.id.button2);
		button3 = (ImageButton) findViewById(R.id.button3);
		button4 = (ImageButton) findViewById(R.id.button4);

		this.setGame();

		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-4116840717941176/8109995641");
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);
	}

	public void setGame() {
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		button1.setBackgroundResource(R.drawable.myboton);
		button2.setBackgroundResource(R.drawable.myboton);
		button3.setBackgroundResource(R.drawable.myboton);
		button4.setBackgroundResource(R.drawable.myboton);

		a0 = r.nextInt(20);
		a1 = r.nextInt(20);
		while (a1 == a0) {
			a1 = r.nextInt(20);
		}
		a2 = r.nextInt(20);
		while ((a2 == a0) || (a2 == a1)) {
			a2 = r.nextInt(20);
		}
		a3 = r.nextInt(20);
		while ((a3 == a0) || (a3 == a1) || (a3 == a2)) {
			a3 = r.nextInt(20);
		}

		this.setImage(button1, a0);
		this.setImage(button2, a1);
		this.setImage(button3, a2);
		this.setImage(button4, a3);

		int i = r.nextInt(4);
		switch (i) {
		case 0:
			this.res = a0;
			break;
		case 1:
			this.res = a1;
			break;
		case 2:
			this.res = a2;
			break;
		case 3:
			this.res = a3;
			break;
		}
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = setSound(res);
		mediaPlayer.start();
	}

	public void onMainClick(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		Intent intent = new Intent(this, MainMenu.class);
		startActivity(intent);
		this.finish();
	}

	public void onButton1Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a0) {
			button1.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
		} else {
			button1.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a1) {
			button2.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
		} else {
			button2.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a2) {
			button3.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
		} else {
			button3.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		if (res == a3) {
			button4.setBackgroundColor(Color.GREEN);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.aplausos);
			;
		} else {
			button4.setBackgroundColor(Color.RED);
			mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.abucheo);
			;
		}
		mediaPlayer.start();
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				mediaPlayer.stop();
				setGame();
			}
		}, 2000);
	}

	public MediaPlayer setSound(int num) {
		switch (num) {
		case 0:
			return MediaPlayer.create(getBaseContext(), R.raw.sardilla);
		case 1:
			return MediaPlayer.create(getBaseContext(), R.raw.sburro);
		case 2:
			return MediaPlayer.create(getBaseContext(), R.raw.scaballo);
		case 3:
			return MediaPlayer.create(getBaseContext(), R.raw.scabra);
		case 4:
			return MediaPlayer.create(getBaseContext(), R.raw.scerdo);
		case 5:
			return MediaPlayer.create(getBaseContext(), R.raw.sdelfin);
		case 6:
			return MediaPlayer.create(getBaseContext(), R.raw.selefante);
		case 7:
			return MediaPlayer.create(getBaseContext(), R.raw.sfoca);
		case 8:
			return MediaPlayer.create(getBaseContext(), R.raw.sgallo);
		case 9:
			return MediaPlayer.create(getBaseContext(), R.raw.sgato);
		case 10:
			return MediaPlayer.create(getBaseContext(), R.raw.sleon);
		case 11:
			return MediaPlayer.create(getBaseContext(), R.raw.smono);
		case 12:
			return MediaPlayer.create(getBaseContext(), R.raw.soso);
		case 13:
			return MediaPlayer.create(getBaseContext(), R.raw.soveja);
		case 14:
			return MediaPlayer.create(getBaseContext(), R.raw.spaloma);
		case 15:
			return MediaPlayer.create(getBaseContext(), R.raw.spato);
		case 16:
			return MediaPlayer.create(getBaseContext(), R.raw.sperro);
		case 17:
			return MediaPlayer.create(getBaseContext(), R.raw.srana);
		case 18:
			return MediaPlayer.create(getBaseContext(), R.raw.sserpiente);
		case 19:
			return MediaPlayer.create(getBaseContext(), R.raw.svaca);
		}
		return MediaPlayer.create(getBaseContext(), R.raw.svaca);
	}

	public void setImage(ImageButton button, int num) {
		switch (num) {
		case 0:
			button.setImageResource(R.drawable.sardilla);
			break;
		case 1:
			button.setImageResource(R.drawable.sburro);
			break;
		case 2:
			button.setImageResource(R.drawable.scaballo);
			break;
		case 3:
			button.setImageResource(R.drawable.scabra);
			break;
		case 4:
			button.setImageResource(R.drawable.scerdo);
			break;
		case 5:
			button.setImageResource(R.drawable.sdelfin);
			break;
		case 6:
			button.setImageResource(R.drawable.selefante);
			break;
		case 7:
			button.setImageResource(R.drawable.sfoca);
			break;
		case 8:
			button.setImageResource(R.drawable.sgallo);
			break;
		case 9:
			button.setImageResource(R.drawable.sgato);
			break;
		case 10:
			button.setImageResource(R.drawable.sleon);
			break;
		case 11:
			button.setImageResource(R.drawable.smono);
			break;
		case 12:
			button.setImageResource(R.drawable.soso);
			break;
		case 13:
			button.setImageResource(R.drawable.soveja);
			break;
		case 14:
			button.setImageResource(R.drawable.spaloma);
			break;
		case 15:
			button.setImageResource(R.drawable.spato);
			break;
		case 16:
			button.setImageResource(R.drawable.sperro);
			break;
		case 17:
			button.setImageResource(R.drawable.srana);
			break;
		case 18:
			button.setImageResource(R.drawable.sserpiente);
			break;
		case 19:
			button.setImageResource(R.drawable.svaca);
			break;
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (mediaPlayer != null)
				mediaPlayer.stop();
			Intent intent = new Intent();
			intent.setClass(this, MainMenu.class);
			startActivity(intent);
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}

}
