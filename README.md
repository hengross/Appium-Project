# Appium-Project
automation to Andriod devices with Appium testing.

this project containt tests to android devises.
the tests are:

  1. post text on facebook
  2. post text on twitter
  3. post picture on facebook and twitter - the code exists, but the method of tap has not been implemented on appium server yet.

Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites

read the installation guide to make sure you have installed all programs you need.
  1. Read and follow the instructions in the "Installation Guide" to run appium project
  2. to capturing packets on you android device, download the "Guide to Recordings" file and follow the instructions there

until finished

for examples of data you need to get in the end of your testing take a look at those files:
we run 10 text posts on facebook and upload data from this running. you can learn what you need to get at the end with that.
  1. "runningData1" - 10 text posts we postet on facebook (contains the time of the post, content, and type of post)
  2. "deviceData" - to see the output of the hardware of the device we used in the current running.
  3. "test.pcap" - open this file with WireShark to see the packets we capture in the current running. 

Built With

Appium Server
Maven - Dependency Management
Android Studio - Used to run the tests (all test are written in java selenium)

Authors

Hen Gross
Yossi Gabriel
Nofar Goresh
