package com.app.chefbook.Model.ServiceModel.ResponseModel


import com.google.gson.annotations.SerializedName

data class Profile(
    val cover: String,
    val description: String,
    val followerCount: Int,
    val fullName: String,
    val postCount: Int,
    val profilePicture: String,
    val profilePosts: List<ProfilePost>,
    val userName: String
)

{
    data class ProfilePost(
        val commentCount: String,
        val description: String,
        val id: String,
        val pictureUrl: String,
        val rateNumber: String,
        val title: String
    )
}