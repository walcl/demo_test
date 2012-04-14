package org.adw.launcher2.actions;

import android.app.Activity;
import android.os.Bundle;

public class RunActionActivity extends Activity {

	public static final String ACTION_LAUNCHERACTION = "org.adw.launcher2.ACTION_LAUNCHERACTION";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LauncherActions.getInstance().launch(getIntent());
		finish();
	}
}
