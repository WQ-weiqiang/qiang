#!/bin/sh

echo "start process"
 java -Duser.timezone=GMT+08 -Dfile.encoding=UTF-8 -Dname=ROMA-AGV-SIMULATION -server -Xms128M -Xmx512M -XX:MetaspaceSize=128M -XX:MaxMetaspaceSize=256M -XX:+HeapDumpOnOutOfMemoryError -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -jar AGV-Simulation-1.0.0-SQA-1.jar 
