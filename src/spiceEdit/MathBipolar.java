package spiceEdit;

public class MathBipolar extends MathMain
{

	public final double bipolarCalcTf(double frequency)
	{
		return 1/(6.28 * frequency * 10E6);
	}
}
