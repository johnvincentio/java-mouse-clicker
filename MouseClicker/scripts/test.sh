#!/bin/sh
#
# script to run Mouse Clicker
#
# DEV_HOME=/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-coder/Coder
DEV_HOME=/Users/jv/tmp/aaa/Test
#
cd $DEV_HOME
#
MYCP=$DEV_HOME/bin
#
# java -cp $MYCP -Xdock:name="Application Coder" io.johnvincent.appcoder.App

# java -cp $MYCP com.johnvincentio.main.Main
# java -cp $MYCP com.johnvincentio.main.T2 4510 797 $DELAY
# java -cp $MYCP com.johnvincentio.main.T2 $DELAY $PERIOD

DELAY=2		# Delay in seconds
PERIOD=5	# Period in seconds

java -cp $MYCP io.johnvincent.clicker.Main $DELAY $PERIOD
