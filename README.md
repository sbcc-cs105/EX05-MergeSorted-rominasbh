## Exercise: MergeSorted (25 Points)

The project name of this exercise is **MergeSorted**.

The purpose of this assignment is to apply what you have learned about 
arrays and vectors, as well as continue to use the concepts
you have already learned. Additionally, you learn about how to create your
own header files and implementation files.

### Problem Description

Write a method

```java
public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,    ArrayList<Integer> b)
```

that merges two sorted array lists, producing a new sorted array list. Keep an index into each array list, indicating how much of it has been processed already. Each time, append the smallest unprocessed element from either array list, then advance the index. For example, if a is

`1 4 9 16`

and b is

`4 7 9 9 11`

then mergeSorted returns the array list

`1 4 4 7 9 9 9 11 16`

### Getting Started

The first thing you will need to do is accept the invitation to this 
assignment from GitHub Classroom. You can click 
[here](https://classroom.github.com/a/fN5EKlqn) to accept the 
invitation, and get started.

Be sure that you accept the invitation first and use the URL to your new project when you clone it in CLion. After copying
the URL into the clipboard, in CLion click **VCS -> Checkout from Version Control -> Git**. Paste the URL into the **URL** box of the _Clone Repository_ dialog box and press **Clone**.

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **MergeSorted.java**. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: MergeSorted
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Allan Knight
 */
package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This code is a solution for the MergeSorted assignment.
 *
 */
public class MergeSorted {

	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        // your code goes here
    }
}
```

Now go through **MergeSorted.java**, add the proper headers as in past assighments and then change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed.

Once you've written your code run the code by single clicking on **MergeSorted.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?
### Running the code for this project

Running this code should be straightforward. In the drop-down 
menu in the upper right-hand corner you should see a *Run
Configuration* called `EX05-MergeSorted [run]`. Make sure this 
configuration is selected and press the play button next to it.
In the **Run** view below the code you should see the output 
of running the program. It should look something like this:

Using the test input, your output should look like:

```
1 2 2 2 4 4 5 5 5 7 8 

Process finished with exit code 0
```

Success! Now you can move on to testing your code.

### Testing the code for this project

Testing the code for this project is similar to running your code
as outlined above. In the drop-down menu in the upper right-hand
corner select the target `EX05-MergeSorted [test]` and press the 
play button next to it. In the **Run** view below the code you should
see the output of running these tests. It should look something
like this:

```bash
Testing started at 9:48 PM ...
9:48:26 PM: Executing task 'test'...

> Task :wrapper
BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
Your program's functionality scores 20 out of 20.

The assignment is worth a total of 25 where the remainder of 5 points
comes from grading related to documentation, algorithms, and other
criteria.
BUILD SUCCESSFUL in 1s
3 actionable tasks: 1 executed, 2 up-to-date
9:48:28 PM: Task execution finished 'test'.
```

### Pushing your code to GitHub

Now you need to turn in your code by sending, or pushing, your code to GitHub. You created a 
GitHub repository when you started the assignment. Now you need to take your local code changes
and send them to GitHub so that you can turn it in and have it graded in the next step in the
work flow.

The first step is to commit your code locally. This tell git what files you want to turn in. In 
this case you only need to turn in the contents of `MergeSorted.java`. In the Project view, right-
click **EX05-MergeSorted** and then select **Git -> Commit Directory...**. In the dialog box that
pops up, be sure only `MergeSorted.java` is selected and that there is some text in the _Commit 
Message_ box. A good commit message would be something like `Committing code to get a good grade`.

Once the commit is finished, which is a purely local action, you need to send that commit to 
GitHub. This is called the push phase of the process. Again right-click on **EX05-MergeSorted**.
Then select **Git -> Repository -> Push**. In the dialog box that pops up, push the **Push** button
and that should be it. You should see a message that says the push was successful. In the next
step you'll confirm that your code is working and then submit it for a grade.

### Turning in and Grading your code

Go back to LazyGrader and login again, if needed. Press the _Build_ button next to 
**EX05-MergeSorted** for this course. This will send a command to Jenkins to download your code
from GitHub and test it. If all goes well and all the tests pass, the ball next to the _Build_
will turn blue. If some of the tests don't pass the ball will be yellow. If the ball is grey,
that means you have not run the tests before and your project is not ready for grading.

Once the Jenkins status is blue or yellow, press the _Grade_ button for **EX05-MergeSorted**.
This will read the results from Jenkins and send your grade to Canvas. Once the notification in 
LazyGrader says the grade has been posted, you should see your grade on Canvas.

That's it, once you've submitted your grade, you are done. I will add points later, after I
inspect your code. For example, most projects will be out of a total of 25 points, but after 
pressing the _Grade_ button, Canvas will show 20 points. I will add up to 5 points after I have
looked at your code and am conviced it is original.
