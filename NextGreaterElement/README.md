# GeeksforGeeksStack

# Given an array, print the Next Greater Element Next Greater Element(NGE) for every element

The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 

                                    Example 1:
        
Input: arr[] = [ 4 , 5 , 2 , 25 ]
Output:     4  –>   5
            5  –>   25
            2  –>   25
            25 –>   -1

                                    Example 2:
Input: arr[] = [13 , 7, 6 , 12]
Output:  13  –>  -1
          7  –>  12
          6  –>  12
         12  –> -1                                   

Method 1 : Using Array which is navie.

    Traverse The array from index 0 to end.
    For each element start another loop from index i+1 to end.
    If a greater element is found in the second loop then print it and break the loop, else print -1. 


Method 2: Using Stack

The idea is to store the elements for which we have to find the next greater element in a stack and while traversing the array, if we find a greater element, we will pair it with the elements from the stack till the top element of the stack is less than the current element.


Follow the steps mentioned below to implement the idea:

Push the first element to stack.
Pick the rest of the elements one by one and follow the following steps in the loop. 
Mark the current element as next.
If the stack is not empty, compare top most element of stack with next.
If next is greater than the top element, Pop element from the stack. next is the next greater element for the popped element.
Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements.
Finally, push the next in the stack.
After the loop in step 2 is over, pop all the elements from the stack and print -1 as the next element for them. 

