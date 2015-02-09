package taos.sonidosanimalesfree.proyecto;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import taos.sonidosanimalesfree.proyecto.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class About extends Activity {

	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

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
		Intent intent = new Intent(this, MainMenu.class);
		startActivity(intent);
		this.finish();
	}

	public void onFrom(View view) {
		Toast toast = Toast.makeText(getApplicationContext(),
				"Andalucia (Spain)", Toast.LENGTH_SHORT);
		toast.show();
	}

	public void onEmail(View view) {
		Toast toast = Toast.makeText(getApplicationContext(),
				"taosworldgames@gmail.com", Toast.LENGTH_SHORT);
		toast.show();
	}

	public void onStudy(View view) {
		Toast toast = Toast
				.makeText(
						getApplicationContext(),
						"Ingeniero en informatica + Master Informatico en telecomunicaciones y programacion web.",
						Toast.LENGTH_SHORT);
		toast.show();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
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