#!/bin/bash
SERVICE="java"
if pgrep -x "$SERVICE" >/dev/null
then
    echo "$SERVICE is running"
else
    echo "$SERVICE stopped"
    # uncomment to start nginx if stopped
    # systemctl start nginx
    # mail  
    # starting the service
java -Xms128m -Xmx256m -XX:CMSInitiatingOccupancyFraction=70 -XX:MaxMetaspaceSize=128m -jar communication-hub-api-0.0.1-SNAPSHOT* &
fi

