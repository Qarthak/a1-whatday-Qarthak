# WhatDay

This simple Android app asks the user for a date in the Gregorian calendar and returns the day of the week for that date.

Assignment 1: What Day App

Project Name : What Day App

Sarthak Chaudhary

2019A7PS0125G

f20190125@goa.bits-pilani.ac.in


Given the year, month and date, this app calculate the day. It uses the Calender utility of java in the backend to perform this calculation. The inputs are all 1-indexed numbers and the output is the day name if the input is correct and an error message if it’s not.
I found a few bugs along the way like the app crashing for decimal inputs because I was using Double.parseDouble instead of Integer.parseInt, but I managed to fix all the ones I found.


I completed task 1 by looking at the testcases and writing code to make them pass. Then I added more testcases and made them pass. Then I went through slack to make sure that the testcases I created are not incorrect and then I checked a few things on my phone as it felt faster than writing tests.
For task 2, I had already copied the testcase that was not in DataModelTest so I knew it would work. It surprisingly did not and after seeing the correct output on my phone, I cleared the cache and it somehow worked. 


Most of the What Day screen was interactable, which I somehow did not notice when I was running it on my laptop. I wish there was a Ctrl and + for mobiles that increased the size of all elements. I did see magnification in the accessibility options so maybe that’s it. The phone is unusable with the side gestures as the gestures also now require two fingers(one even took three) to trigger. I had to stop the first time and turn on the bottom three buttons in order to use it. The assistant was pretty useful when I used What Day as it was the only way for me to tell whether I selected the correct box. The repetitive “do this to do this” was pretty irritating but otherwise the experience was ok. The assistant keep telling me about all my notifications and was nonstop talking which was not pleasant.


I also realized for the first time how obtrusive certain apps were which toggle GBoard as soon as you open them, like my app drawer which brings up the keyboard along with apps when you swipe up but doesn’t go away when you swipe down. Things felt quite clumsy and I opened a lot of apps accidentally.
Accessibility Scanner gave the following suggestions:
Consider making the clickable item larger. I fixed it with padding


Sources used:

https://stackoverflow.com/questions/1075895/how-can-i-catch-all-the-exceptions-that-will-be-thrown-through-reading-and-writi

https://www.javatpoint.com/java-util-calendar

https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html

https://stackoverflow.com/questions/5270272/how-to-determine-day-of-week-by-passing-specific-date

https://stackoverflow.com/questions/226910/how-to-sanity-check-a-date-in-java

https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java



The test-driven approach is nice at the start when we’re making changes and it fails previous tests.Towards the end, I had enough test cases to cover most things so I just tested the rest on my phone and they were working so I didn’t add them. The test-driven approach was mostly helpful since I got to know when any new changes failed previously working testcases. I used the monkey app and found that my app crashes when I put in a decimal value as I used double parsing instead of integer parsing. I fixed that easily and everything worked again. Another bug at the very start was getting the wrong day because our input is 1 indexed but the calender is 0 indexed

It took me ~12 hours.
 It’s my first app though and the calender documentation caused a lot of doubts

8/10 difficulty
Mostly since the calender documentation is irritating and the priority of errors was arbitrary and spread between messages in slack
