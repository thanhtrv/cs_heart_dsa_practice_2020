# quarantine2020
This is repository for storing what I did to practice my problem solving skills for DSA problems during the staying at home during Covid 19. 

# Time Complexity Resource - details comparisions

https://www.bigocheatsheet.com/

# Data Structure Reviews
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

### DFS depth first search


### BFS breath first search

# Notes by categories




