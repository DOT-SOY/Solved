namespace boj
{
    class Program
    {
        static void Main(string[] args)
        {
	        int vTnum = int.Parse(Console.ReadLine());
			int vBnum = int.Parse(Console.ReadLine());

			int hundreds = vBnum / 100;
			int tens = (vBnum / 10) % 10; 
			int ones = vBnum % 10;
			
			Console.WriteLine( vTnum * ones );
			Console.WriteLine( vTnum * tens );
			Console.WriteLine( vTnum * hundreds );
			Console.WriteLine( vTnum * hundreds * 100 + vTnum * tens * 10 + vTnum * ones);
		}
    }
}