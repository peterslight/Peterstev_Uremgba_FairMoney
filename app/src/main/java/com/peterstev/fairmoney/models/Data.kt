package com.peterstev.fairmoney.models


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = Data.USERS_TABLE_NAME)
data class Data(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: String,
    @ColumnInfo(name = "email")
    @SerializedName("email")
    val email: String?,
    @ColumnInfo(name = "firstName")
    @SerializedName("firstName")
    val firstName: String?,
    @ColumnInfo(name = "lastName")
    @SerializedName("lastName")
    val lastName: String?,
    @ColumnInfo(name = "picture")
    @SerializedName("picture")
    val picture: String?,
    @ColumnInfo(name = "title")
    @SerializedName("title")
    val title: String?
) {
    companion object {
        const val USERS_TABLE_NAME = "users"
    }
}