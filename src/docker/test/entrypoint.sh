#!/bin/sh

Xvfb :1 -screen 0 1280x800x24 &

java -jar /opt/test/selenium-server-standalone.jar

