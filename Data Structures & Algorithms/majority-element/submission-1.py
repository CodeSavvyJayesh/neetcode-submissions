class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # we have given the list of the elements 
        freq = {}
        n = len(nums)
        for i in range(n):
            if nums[i] not in freq:
                freq[nums[i]] = 1
            else:
                freq[nums[i]]+= 1
            
            if freq[nums[i]]>n//2:
                return nums[i]
        