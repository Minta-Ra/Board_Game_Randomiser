import React from "react";
import { Text, View } from 'react-native';
import {useEffect, useState} from "react";
// import BoardgameList from "../components/BoardgameList";


export default function BoardgameContainer() {

    const [boardgames, setBoardgames] = useState([]);

    useEffect(() => {
        getBoardgames();
    }, []);

    async function getBoardgames() {
        const res = await fetch('http://localhost:8080/boardgames');
        const boardgames = await res.json();
        setBoardgames(boardgames);
    };

    return (
        <Text>BoardgameContainer</Text>
    );

}