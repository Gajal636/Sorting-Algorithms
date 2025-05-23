Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

How It Works-

Start at the beginning of the list.
Compare the first two elements.
If the first element is greater than the second, swap them.
Move to the next pair and repeat the comparison and swap if needed.
Continue this process until the largest element moves to the end.
Repeat the entire process for the remaining unsorted elements.
The algorithm stops when no swaps are needed.

Complexity Analysis-

Time Complexity:
Best Case: O(n) (when the list is already sorted)
Worst Case: O(n^2) (when the list is sorted in reverse order)
Average Case: O(n^2)

Space Complexity:
O(1) (since it is an in-place sorting algorithm).

Advantages-

Simple and easy to understand.
Requires no additional memory (in-place sorting).

Disadvantages-

Inefficient for large datasets.
High time complexity compared to more advanced sorting algorithms like Quick Sort or Merge Sort.
Use Cases
Useful for small datasets where simplicity is more important than efficiency.
Suitable for educational purposes to understand sorting concepts.

Selection sort-

Selection Sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the array and swapping it with the first unsorted element. This process continues until the entire array is sorted.

Algorithm-

Start with the first element as the minimum.
Iterate through the rest of the array to find the smallest element.
Swap the smallest element found with the first element.
Move to the next element and repeat the process for the remaining unsorted part of the array.
Continue until the entire array is sorted.

Complexity Analysis-

Best Case Time Complexity: O(n²) (even when the array is already sorted)
Worst Case Time Complexity: O(n²)
Average Case Time Complexity: O(n²)
Space Complexity: O(1) (in-place sorting algorithm)

Advantages-

Simple and easy to implement.
Works well for small datasets.

Disadvantages-

Inefficient for large datasets due to O(n²) time complexity.
Not stable (does not maintain the relative order of equal elements).

Insertion Sort -

Insertion Sort is a simple and efficient sorting algorithm that works similarly to sorting playing cards in your hands. It builds the sorted array one element at a time by inserting each element into its correct position.

Algorithm:
Start with the second element (index 1) and compare it with the previous elements.
Shift the elements that are greater than the current element to the right.
Insert the current element at its correct position.
Repeat for all elements in the array.

Time Complexity:
Best Case (Already Sorted): 
𝑂(𝑛^2)
Average Case: 
𝑂(𝑛^2)
Worst Case (Reverse Sorted): 
𝑂(n^2)
Space Complexity: 
𝑂(1)
O(1) (In-place sorting)

Quick Sort-

QuickSort is a divide-and-conquer sorting algorithm that works by selecting a pivot element and partitioning the array into two subarrays:
Elements less than the pivot
Elements greater than the pivot
These subarrays are then recursively sorted.

How it works-

Pick a pivot element (commonly first, last, or middle element).
Partition the array such that elements smaller than the pivot move to its left, and elements greater move to its right.
Recursively apply QuickSort on the left and right subarrays.
The base case is when the subarray has one or zero elements.

Time Complexity

Best/Average Case: 
𝑂(𝑛log𝑛)
O(nlogn) (when pivot divides array evenly)

Worst Case: 
𝑂(𝑛2)O(n2) (when pivot is always smallest or largest element)

Space Complexity
𝑂(log⁡𝑛)O(logn) (for recursive calls in best case)
𝑂(𝑛)O(n) (in worst case, due to recursion depth)


Merge Sort-
Merge Sort is a divide and conquer sorting algorithm that works by recursively splitting an array into two halves, sorting each half, and then merging them back together in sorted order.

Algorithm Steps:
Divide: Split the array into two halves until each sub-array has only one element.

Conquer: Recursively sort each half.

Merge: Combine the sorted halves back into a single sorted array.

Time Complexity:
Best Case: 
O(𝑛log⁡𝑛)O(nlogn)

Average Case: 
𝑂(𝑛log𝑛)O(nlogn)

Worst Case: 
𝑂(𝑛log⁡𝑛)O(nlogn)

Space Complexity: 
𝑂(𝑛)O(n) (extra space required for merging)
