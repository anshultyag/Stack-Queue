package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyStack<Integer> myStack = new MyStack<>();
        MyStack<Integer> myFirstNode = new MyNode<>(70);
        MyStack<Integer> mySecondNode = new MyNode<>(30);
        MyStack<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, peak);
    }
}
