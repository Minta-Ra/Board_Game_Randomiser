import React from "react";
import { Text } from "react-native";


export default function BoardgameItem({boardgame}) {

    return (
        <Text>
            Title: {boardgame.title}
            Playing time: {boardgame.playingTime}
            Number of players: {boardgame.numOfPlayers}
        </Text>
    )
}
