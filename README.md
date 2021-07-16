# Be a better programmer!

# Time Complexity Resource - details comparisions

https://www.bigocheatsheet.com/

# Data Structures & Algorithms Reviews
## Array
2 pointer techniques
## String
### Sliding Window
[x] A sliding window is an abstract concept commonly used in array/string problems
[x] A window is a range of elements in the array/string which usually defined by the start and end indices, i.e. [i, j)[i,j) (left-closed, right-open).
[x] A sliding window is a window "slides" its two boundaries to the certain direction/For example, if we slide [i, j)[i,j) to the right by 11 element, then it becomes [i+1, j+1)[i+1,j+1) (left-closed, right-open).




#### Extra
```
By using HashSet as a sliding window, checking if a character in the current can be done in O(1).
```

## Directe access tables 
Direct access tables are very simple data structures which can store data in key value pair form. But it does not work in all the cases. It works only when the keys are integers which are drawn from a set of m elements. Let's say a set of integers from zero to m minus one. Another assumption is that each of the keys that we use is unique. For example, no two records can have the same key value. This is very easy to implement. We just use a regular area of size m. So that its index ranges from zero to m minus one, and the index of the area can be used for the key, and the satellite data corresponding to that key may be stored at that particular index. So we can think of it that we have a set of distinct keys which may range from zero to m minus one and the data associated with the key can be inserted or searched or deleted directly using the index of the area which is equal to that key. What about if the key set is very large? Well, then we need a very large area, right? Or, even worse, what if the key data set is not very large, but the range of values is very large? 

## Hash Table 
https://www.tutorialspoint.com/data_structures_algorithms/hash_data_structure.htm

data is stored in an array format, where each data value has its own unique index value
it becomes a data structure in which insertion and search operations are very fast irrespective of the size of the data
Hash Table uses an array as a storage medium and uses hash technique to generate an index where an element is to be inserted or is to be located from.

Adding a node to the hash table costs only O(1)O(1) time.
Hash Table Applications
Hash tables are implemented where

constant time lookup and insertion is required
cryptographic applications
indexing data is required

## Recursive approach notes

```
Space complexity : O(n). The extra space comes from implicit stack space due to recursion. The recursion could go up to n levels deep.
or 
Space complexity : The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in  O ( n ) O(n). Therefore, space complexity due to recursive calls on the stack is  O ( n ) O(n) in the worst case.
```
## Linked List

### Why Linked List?
Arrays can be used to store linear data of similar types, but arrays have the following limitations.
1) The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage.
2) Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted.

### Advantages over arrays
1) Dynamic size
2) Ease of insertion/deletion

## Hash Map

 the structure set, which provides in/contains operation in \mathcal{O}(1)O(1) time in average case.
 
In the case of HashMap, it replaces the old value with the new one.

In the case of HashSet, the item isn't inserted.

## Tree / BST
### Need to know about Binary Tree
```
Understand the difference between different tree traversal methods;
Be able to solve preorder, inorder and postorder traversal recursively;
Be able to solve preorder, inorder and postorder traversal iteratively;
Be able to do level traversal using BFS
```

***Depth of recursion is n => O(n) for space complexity

### DFS depth first search
#### Stack and DFS
##### Recursion
It seems like we don't have to use any stacks when we implement DFS recursively. But actually, we are using the implicit stack provided by the system, also known as the Call Stack.

In computer science, a call stack is a stack data structure that stores information about the active subroutines of a computer program. This kind of stack is also known as an execution stack, program stack, control stack, run-time stack, or machine stack, and is often shortened to just "the stack". Although maintenance of the call stack is important for the proper functioning of most software, the details are normally hidden and automatic in high-level programming languages. Many computer instruction sets provide special instructions for manipulating stacks.

### BFS breath first search



# Notes by categories




