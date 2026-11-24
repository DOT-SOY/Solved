using System;

namespace boj
{
    class Program
    {
        static void Main(string[] args)
        {
	        string vNumbers = Console.ReadLine();
		int[] result = Array.ConvertAll(vNumbers.Split(' '), int.Parse);
            	Console.WriteLine( (result[0] + result[1] ) % result[2]);
            	Console.WriteLine( ((result[0] % result[2] ) + (result[1] % result[2] )) % result[2]);
            	Console.WriteLine( (result[0] * result[1] ) % result[2]);
            	Console.WriteLine( ((result[0] % result[2] ) * (result[1] % result[2] )) % result[2]);
        }
    }
}