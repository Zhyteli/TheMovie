package com.zhytel.kirill.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    private var uniqueId: Int = 0,
    @SerializedName("adult")
    @Expose
    private val adult: Boolean = false,

    @SerializedName("id")
    @Expose
    private val id: Int = 0,

    @SerializedName("vote_count")
    @Expose
    private val voteCount: Int = 0,

    @SerializedName("title")
    @Expose
    private val title: String? = null,

    @SerializedName("original_title")
    @Expose
    private val originalTitle: String? = null,

    @SerializedName("overview")
    @Expose
    private val overview: String? = null,

    @SerializedName("popularity")
    @Expose
    private val popularity: Double = 0.0,

    @SerializedName("poster_path")
    @Expose
    private val posterPath: String? = null,
    private val bigPosterPath: String? = null,

    @SerializedName("backdrop_path")
    @Expose
    private val backdropPath: String? = null,

    @SerializedName("vote_average")
    @Expose
    private val voteAverage: Double = 0.0,

    @SerializedName("release_date")
    @Expose
    private val releaseDate: String? = null,
) {
}