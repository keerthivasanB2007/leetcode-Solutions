/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"*/

class Solution {
public:
    string reverseVowels(string s) {
         string vow1;
         
        vector<int> in;
        int m=0;
         for(int i=0;i<s.length();i++){
            char ch=s[i];
            if(ch=='a'||ch=='A' || ch=='e'|| ch=='E'|| ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                vow1+=ch;
                in.push_back(i);
                m++;
            }
         }
       
         reverse(vow1.begin(),vow1.end());
         for(int i=0;i<m;i++){
           s[in[i]]=vow1[i];
         }   
          return s;
    }
   
};