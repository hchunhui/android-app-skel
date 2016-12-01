package org.example;
import android.widget.TextView;

public final class main extends android.app.Activity
{
	public void onCreate(final android.os.Bundle activity_state)
	{
		super.onCreate(activity_state);
		final TextView tv = new TextView(main.this);
		tv.setText("hello world, " + getResources().getString(R.string.appLabel));
		setContentView(tv);
	}
}
