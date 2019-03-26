package org.jetbrains.kotlinworkshop.introduction._9Functional

import org.jetbrains.kotlinworkshop.introduction._Shared.*


// Removing for Loop

fun topAlbums_v1(albums: List<Album>): List<Album> {
    val hits = arrayListOf<Album>()
    for (album in albums) {
        if (album.chartUK == 1 || album.chartUS == 1) {
            hits.add(album)
        }
    }
    return hits
}

// Moving towards a functional approach (passing moving part)

fun topAlbums_v2(albums: List<Album>): List<Album> {
    val hits = arrayListOf<Album>()
    albums.forEach { album ->
        if (album.chartUK == 1 || album.chartUS == 1) {
            hits.add(album)
        }
    }
    return hits
}

// Clean up

fun topAlbums_v3(albums: List<Album>): List<Album> {
    val hits = arrayListOf<Album>()
    albums.forEach {
        if (it.chartUK == 1 || it.chartUS == 1) {
            hits.add(it)
        }
    }
    return hits
}

// Focusing on actual intent

fun topAlbums_v4(albums: List<Album>): List<Album> {
    return albums.filter { album ->
        (album.chartUK == 1 || album.chartUS == 1)
    }
}

