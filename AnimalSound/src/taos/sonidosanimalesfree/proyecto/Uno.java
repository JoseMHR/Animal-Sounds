package taos.sonidosanimalesfree.proyecto;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import taos.sonidosanimalesfree.proyecto.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Uno extends Activity {

	private InterstitialAd interstitial;
	MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uno);

		// Buscar AdView como recurso y cargar una solicitud.
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-4116840717941176/8109995641");
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);
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
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sardilla);
		mediaPlayer.start();
	}

	public void onButton2Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.svaca);
		mediaPlayer.start();
	}

	public void onButton3Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.scaballo);
		mediaPlayer.start();
	}

	public void onButton4Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.scabra);
		mediaPlayer.start();
	}

	public void onButton5Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.scerdo);
		mediaPlayer.start();
	}

	public void onButton6Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sdelfin);
		mediaPlayer.start();
	}

	public void onButton7Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.selefante);
		mediaPlayer.start();
	}

	public void onButton8Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sfoca);
		mediaPlayer.start();
	}

	public void onButton9Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sgallo);
		mediaPlayer.start();
	}

	public void onButton10Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sgato);
		mediaPlayer.start();
	}

	public void onButton11Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sleon);
		mediaPlayer.start();
	}

	public void onButton12Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.smono);
		mediaPlayer.start();
	}

	public void onButton13Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.soso);
		mediaPlayer.start();
	}

	public void onButton14Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.soveja);
		mediaPlayer.start();
	}

	public void onButton15Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.spaloma);
		mediaPlayer.start();
	}

	public void onButton16Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.spato);
		mediaPlayer.start();
	}

	public void onButton17Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sperro);
		mediaPlayer.start();
	}

	public void onButton18Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.srana);
		mediaPlayer.start();
	}

	public void onButton19Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sserpiente);
		mediaPlayer.start();
	}

	public void onButton20Click(View view) {
		if (mediaPlayer != null)
			mediaPlayer.stop();
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sburro);
		mediaPlayer.start();
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
