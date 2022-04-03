#!/bin/bash

#ln -s ~/build/stock-game-1.0.1.jar ~/apps/stock-game/stock-game.jar
java -Dfile.encouding=UTF-8 \
   -Dspring.config.additional-location="file:$HOME/apps/stock-game/" \
   -jar ~/apps/stock-game/stock-game.jar
