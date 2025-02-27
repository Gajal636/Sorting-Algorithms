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



