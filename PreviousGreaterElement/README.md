# GeeksforGeeksStack

Given an array of distinct integers, find closest position wise greater on left of every element.
If there is no greater element on left, them print -1 

                                    
                                    Example
Input: array[] = {15, 10, 18, 12, 4, 6, 2, 8}
Output:         -1, 15, -1, 18, 12, 12, 6, 12


Input: array[] = {8, 10, 12}
Output:         -1, -1, -1


Input: array[] = {12, 10, 8}
Output:     -1, 12, 10

Methond 1: A simple solution is to run two nested loops, The outer loop picks an element one by one. The inner loop, find the previous element that is greater.

Method 2: Using Stack data structure