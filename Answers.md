# Answers
- Why does `LinkedStack` not require an explicit constructor?  
An explicit constructor is not needed because with a LinkedList, the nodes are added individually and
with this class LinkedStack, the interface has already been implemented.

- What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?  
The methods `push` and `isEmpty` used in `LinkedStack` have the complexity of O(1), except for the methods `peek`, `pop`, and `asList`, which
have a complexity of O(n). In `ReverseLines`, the complexity would be O(n).

- How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list 
- but the `asList` method uses constant time and space?  
We could have implemented `LinkedStack` by ...

- Is it better for `push` and `pop` to return the item or the stack itself? Briefly discuss the pros and cons of each design.   
It is better for `push` and `pop` to return the items in the stack because each item of the stack is its own separate
part, so using these methods allows one to separate and obtain the parts in a new/reverse/same way. If one returned the stack
itself, one would only have information about the top item of the stack. Looking at each item with `push` and
`pop` makes it easier to understand what is happening to the stack as it is returned and printed out once again. 

