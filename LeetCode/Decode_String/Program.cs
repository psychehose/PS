// See https://aka.ms/new-console-template for more information

using Decode_String;

Solution solution = new Solution();

var r1= solution.DecodeString("100[leetcode]");
var r2 = solution.DecodeString("53[aba]");
var r3 = solution.DecodeString("3[a]2[bc]");


Console.WriteLine(r1);
Console.WriteLine(r2);
Console.WriteLine(r3);

