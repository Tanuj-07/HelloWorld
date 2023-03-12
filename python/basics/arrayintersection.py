# for i in nums1:
#     for j in nums2:
#         numLoops +=1
#         if i ==j:
#             if i in same:
#                 continue
#             else:
#                 same.append(i)
nums1 = [1, 6, 3, 6, 5,10]
nums2 = [10, 9, 8, 7, 6, 5]
nums1copy = nums1.copy()
same = []
numloops = 0
nums1_dict = dict(zip(nums1, nums1copy))
print(nums1_dict)
for i in nums2:
    numloops += 1
    if nums1_dict.__contains__(i):
        same.append(i)
print(same)
print("Loop count ", numloops)
