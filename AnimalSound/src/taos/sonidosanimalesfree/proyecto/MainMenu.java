package taos.sonidosanimalesfree.proyecto;

import taos.sonidosanimalesfree.proyecto.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.gms.ads.*;

public class MainMenu extends Activity {

	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);

		// AdView
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-4116840717941176/8109995641");
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);
	}

	public void onUnoClick(View view) {
		Intent intent = new Intent(this, Uno.class);
		startActivity(intent);
		this.finish();
	}

	public void onDosClick(View view) {
		Intent intent = new Intent(this, Dos.class);
		startActivity(intent);
		this.finish();
	}

	public void onAboutClick(View view) {
		Intent intent = new Intent(this, About.class);
		startActivity(intent);
		this.finish();
	}

	public void onExitClick(View view) {
		displayInterstitial();
		this.finish();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			displayInterstitial();
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
