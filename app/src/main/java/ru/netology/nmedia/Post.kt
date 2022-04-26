package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val date: String,
    var likes: Int = 0,
    var likedByMe: Boolean = false,
    var shares: Int = 0,
    var views: Int = 0
)