class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        odd = set()
        left = 0
        longest = 0

        for right in range(len(s)):
            while s[right] in odd:
                odd.remove(s[left])
                left+=1

            odd.add(s[right])
            longest = max(longest, right - left + 1)
        
        return longest