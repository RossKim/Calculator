package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Integer result = 0;
	private Integer inputNumber = 0;
	private CalculMode mode = CalculMode.CAL_INIT;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void calculateStackNumber() {
		this.result = CalculMode.calculate(this.result, this.inputNumber,
				this.mode);
		((TextView) findViewById(R.id.display)).setText(String
				.valueOf(this.result));
		this.inputNumber = 0;
	}

	public void clickedNumber(View view) {
		Integer val = Integer.parseInt((String) ((Button) view).getText());
		inputNumber = inputNumber * 10 + val;
		((TextView) findViewById(R.id.display)).setText(String
				.valueOf(inputNumber));
	}

	public void clickedAC(View view) {
		result = 0;
		inputNumber = 0;
		mode = CalculMode.CAL_INIT;
		((TextView) findViewById(R.id.display)).setText("0");
	}

	public void clickedC(View view) {
		inputNumber = 0;
		((TextView) findViewById(R.id.display)).setText("0");
	}

	public void clickedSign(View view) {
		inputNumber = -inputNumber;
		((TextView) findViewById(R.id.display)).setText(String
				.valueOf(inputNumber));
	}

	public void clickedMul(View view) {
		calculateStackNumber();
		this.mode = CalculMode.CAL_MUL;
	}

	public void clickedDiv(View view) {
		calculateStackNumber();
		this.mode = CalculMode.CAL_DIV;
	}

	public void clickedSub(View view) {
		calculateStackNumber();
		this.mode = CalculMode.CAL_SUB;
	}

	public void clickedAdd(View view) {
		calculateStackNumber();
		this.mode = CalculMode.CAL_ADD;
	}

	public void clickedEqual(View view) {
		calculateStackNumber();
		this.mode = CalculMode.CAL_EQUAL;
	}
}
