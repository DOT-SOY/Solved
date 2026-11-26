using System;

namespace boj
{
    class Program
    {
        static void Main(string[] args)
        {
	        string vNums = Console.ReadLine();
	    	long[] num = Array.ConvertAll(vNums.Split(' '), long.Parse);

		    Console.WriteLine( num[0] + num[1] + num[2] );
	    }
    }
}