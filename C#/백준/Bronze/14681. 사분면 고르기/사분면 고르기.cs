using System;

namespace boj
{
    class Program
    {
        static void Main(string[] args)
        {
	        int vX = int.Parse(Console.ReadLine());
		    int vY = int.Parse(Console.ReadLine());

	    	if ( vX * vY >  0)
			{
				Console.WriteLine(vX > 0 && vY > 0 ? "1" : "3");
			}
			else
			{
				Console.WriteLine(vX > 0 ? "4" : "2");
			}
	    }
    }
}