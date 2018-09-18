class Tulip {
	public static void main(String args[]) {
		double[][] inputs = new double[][] { { 5, 8, 12, 11, 9, 8, 7, 10, 11, 13 } };
		double[] opts = new double[] { 3 };
		double[][] outputs = new double[inputs.length][inputs[0].length];
		
		int ret = Tulip.sma.call(inputs, opts, outputs);
		System.out.printf("offset=%d:,", ret);
		for (int i = 0; i <  outputs[0].length; ++i) {
			System.out.printf("%f,", outputs[0][i]);
		}
	}
	
	
	static Tulip abs = new Tulip("abs", "Vector Absolute Value", 0);
	static Tulip acos = new Tulip("acos", "Vector Arccosine", 1);
	static Tulip ad = new Tulip("ad", "Accumulation/Distribution Line", 2);
	static Tulip add = new Tulip("add", "Vector Addition", 3);
	static Tulip adosc = new Tulip("adosc", "Accumulation/Distribution Oscillator", 4);
	static Tulip adx = new Tulip("adx", "Average Directional Movement Index", 5);
	static Tulip adxr = new Tulip("adxr", "Average Directional Movement Rating", 6);
	static Tulip ao = new Tulip("ao", "Awesome Oscillator", 7);
	static Tulip apo = new Tulip("apo", "Absolute Price Oscillator", 8);
	static Tulip aroon = new Tulip("aroon", "Aroon", 9);
	static Tulip aroonosc = new Tulip("aroonosc", "Aroon Oscillator", 10);
	static Tulip asin = new Tulip("asin", "Vector Arcsine", 11);
	static Tulip atan = new Tulip("atan", "Vector Arctangent", 12);
	static Tulip atr = new Tulip("atr", "Average True Range", 13);
	static Tulip avgprice = new Tulip("avgprice", "Average Price", 14);
	static Tulip bbands = new Tulip("bbands", "Bollinger Bands", 15);
	static Tulip bop = new Tulip("bop", "Balance of Power", 16);
	static Tulip cci = new Tulip("cci", "Commodity Channel Index", 17);
	static Tulip ceil = new Tulip("ceil", "Vector Ceiling", 18);
	static Tulip cmo = new Tulip("cmo", "Chande Momentum Oscillator", 19);
	static Tulip cos = new Tulip("cos", "Vector Cosine", 20);
	static Tulip cosh = new Tulip("cosh", "Vector Hyperbolic Cosine", 21);
	static Tulip crossany = new Tulip("crossany", "Crossany", 22);
	static Tulip crossover = new Tulip("crossover", "Crossover", 23);
	static Tulip cvi = new Tulip("cvi", "Chaikins Volatility", 24);
	static Tulip decay = new Tulip("decay", "Linear Decay", 25);
	static Tulip dema = new Tulip("dema", "Double Exponential Moving Average", 26);
	static Tulip di = new Tulip("di", "Directional Indicator", 27);
	static Tulip div = new Tulip("div", "Vector Division", 28);
	static Tulip dm = new Tulip("dm", "Directional Movement", 29);
	static Tulip dpo = new Tulip("dpo", "Detrended Price Oscillator", 30);
	static Tulip dx = new Tulip("dx", "Directional Movement Index", 31);
	static Tulip edecay = new Tulip("edecay", "Exponential Decay", 32);
	static Tulip ema = new Tulip("ema", "Exponential Moving Average", 33);
	static Tulip emv = new Tulip("emv", "Ease of Movement", 34);
	static Tulip exp = new Tulip("exp", "Vector Exponential", 35);
	static Tulip fisher = new Tulip("fisher", "Fisher Transform", 36);
	static Tulip floor = new Tulip("floor", "Vector Floor", 37);
	static Tulip fosc = new Tulip("fosc", "Forecast Oscillator", 38);
	static Tulip hma = new Tulip("hma", "Hull Moving Average", 39);
	static Tulip kama = new Tulip("kama", "Kaufman Adaptive Moving Average", 40);
	static Tulip kvo = new Tulip("kvo", "Klinger Volume Oscillator", 41);
	static Tulip lag = new Tulip("lag", "Lag", 42);
	static Tulip linreg = new Tulip("linreg", "Linear Regression", 43);
	static Tulip linregintercept = new Tulip("linregintercept", "Linear Regression Intercept", 44);
	static Tulip linregslope = new Tulip("linregslope", "Linear Regression Slope", 45);
	static Tulip ln = new Tulip("ln", "Vector Natural Log", 46);
	static Tulip log10 = new Tulip("log10", "Vector Base-10 Log", 47);
	static Tulip macd = new Tulip("macd", "Moving Average Convergence/Divergence", 48);
	static Tulip marketfi = new Tulip("marketfi", "Market Facilitation Index", 49);
	static Tulip mass = new Tulip("mass", "Mass Index", 50);
	static Tulip max = new Tulip("max", "Maximum In Period", 51);
	static Tulip md = new Tulip("md", "Mean Deviation Over Period", 52);
	static Tulip medprice = new Tulip("medprice", "Median Price", 53);
	static Tulip mfi = new Tulip("mfi", "Money Flow Index", 54);
	static Tulip min = new Tulip("min", "Minimum In Period", 55);
	static Tulip mom = new Tulip("mom", "Momentum", 56);
	static Tulip msw = new Tulip("msw", "Mesa Sine Wave", 57);
	static Tulip mul = new Tulip("mul", "Vector Multiplication", 58);
	static Tulip natr = new Tulip("natr", "Normalized Average True Range", 59);
	static Tulip nvi = new Tulip("nvi", "Negative Volume Index", 60);
	static Tulip obv = new Tulip("obv", "On Balance Volume", 61);
	static Tulip ppo = new Tulip("ppo", "Percentage Price Oscillator", 62);
	static Tulip psar = new Tulip("psar", "Parabolic SAR", 63);
	static Tulip pvi = new Tulip("pvi", "Positive Volume Index", 64);
	static Tulip qstick = new Tulip("qstick", "Qstick", 65);
	static Tulip roc = new Tulip("roc", "Rate of Change", 66);
	static Tulip rocr = new Tulip("rocr", "Rate of Change Ratio", 67);
	static Tulip round = new Tulip("round", "Vector Round", 68);
	static Tulip rsi = new Tulip("rsi", "Relative Strength Index", 69);
	static Tulip sin = new Tulip("sin", "Vector Sine", 70);
	static Tulip sinh = new Tulip("sinh", "Vector Hyperbolic Sine", 71);
	static Tulip sma = new Tulip("sma", "Simple Moving Average", 72);
	static Tulip sqrt = new Tulip("sqrt", "Vector Square Root", 73);
	static Tulip stddev = new Tulip("stddev", "Standard Deviation Over Period", 74);
	static Tulip stderr = new Tulip("stderr", "Standard Error Over Period", 75);
	static Tulip stoch = new Tulip("stoch", "Stochastic Oscillator", 76);
	static Tulip stochrsi = new Tulip("stochrsi", "Stochastic RSI", 77);
	static Tulip sub = new Tulip("sub", "Vector Subtraction", 78);
	static Tulip sum = new Tulip("sum", "Sum Over Period", 79);
	static Tulip tan = new Tulip("tan", "Vector Tangent", 80);
	static Tulip tanh = new Tulip("tanh", "Vector Hyperbolic Tangent", 81);
	static Tulip tema = new Tulip("tema", "Triple Exponential Moving Average", 82);
	static Tulip todeg = new Tulip("todeg", "Vector Degree Conversion", 83);
	static Tulip torad = new Tulip("torad", "Vector Radian Conversion", 84);
	static Tulip tr = new Tulip("tr", "True Range", 85);
	static Tulip trima = new Tulip("trima", "Triangular Moving Average", 86);
	static Tulip trix = new Tulip("trix", "Trix", 87);
	static Tulip trunc = new Tulip("trunc", "Vector Truncate", 88);
	static Tulip tsf = new Tulip("tsf", "Time Series Forecast", 89);
	static Tulip typprice = new Tulip("typprice", "Typical Price", 90);
	static Tulip ultosc = new Tulip("ultosc", "Ultimate Oscillator", 91);
	static Tulip var = new Tulip("var", "Variance Over Period", 92);
	static Tulip vhf = new Tulip("vhf", "Vertical Horizontal Filter", 93);
	static Tulip vidya = new Tulip("vidya", "Variable Index Dynamic Average", 94);
	static Tulip volatility = new Tulip("volatility", "Annualized Historical Volatility", 95);
	static Tulip vosc = new Tulip("vosc", "Volume Oscillator", 96);
	static Tulip vwma = new Tulip("vwma", "Volume Weighted Moving Average", 97);
	static Tulip wad = new Tulip("wad", "Williams Accumulation/Distribution", 98);
	static Tulip wcprice = new Tulip("wcprice", "Weighted Close Price", 99);
	static Tulip wilders = new Tulip("wilders", "Wilders Smoothing", 100);
	static Tulip willr = new Tulip("willr", "Williams %R", 101);
	static Tulip wma = new Tulip("wma", "Weighted Moving Average", 102);
	static Tulip zlema = new Tulip("zlema", "Zero-Lag Exponential Moving Average", 103);

	public Tulip(String name,String desc,int ind) {
		this.name=name;
		this.desc=desc;
		this.ind=ind;
	}
	/*
	 * @input inputs 2d double array
	 * @options option array
	 * @outputs output array,same size with inputs
	 * @return offset(-1 if false)*/
	public int call(double[][] inputs, double[] options, double[][] outputs) {
		return ncall(this.ind,inputs,options,outputs);
	}
	public String name;
	public String desc;
	public int ind;
	native int ncall(int ind, double[][] inputs, double[] options, double[][] outputs);

	static {
		System.loadLibrary("tuliplib");
	}
}
