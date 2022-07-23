import React from "react";
import { View } from "react-native";
import BoardgameItem from "./BoardgameItem";


export default function BoardgameList({boardgames}) {
    const boardgamesItems = boardgames.map((boardgame, index) => {
        return <BoardgameItem boardgame={boardgame} key={index}/>
    });

    return (
        <View>
            {boardgamesItems}
        </View>
    )
}