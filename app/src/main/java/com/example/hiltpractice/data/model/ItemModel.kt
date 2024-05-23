package com.example.hiltpractice.data.model


import com.google.gson.annotations.SerializedName

data class ItemModel(
    @SerializedName("additional_information")
    val additionalInformation: Any? = Any(),
    @SerializedName("age_max")
    val ageMax: Int? = 0,
    @SerializedName("age_min")
    val ageMin: Int? = 0,
    @SerializedName("age_range")
    val ageRange: String? = "",
    @SerializedName("aliases")
    val aliases: List<String?>? = listOf(),
    @SerializedName("build")
    val build: Any? = Any(),
    @SerializedName("caution")
    val caution: String? = "",
    @SerializedName("complexion")
    val complexion: Any? = Any(),
    @SerializedName("coordinates")
    val coordinates: List<Any?>? = listOf(),
    @SerializedName("dates_of_birth_used")
    val datesOfBirthUsed: List<String?>? = listOf(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("details")
    val details: String? = "",
    @SerializedName("eyes")
    val eyes: String? = "",
    @SerializedName("eyes_raw")
    val eyesRaw: String? = "",
    @SerializedName("field_offices")
    val fieldOffices: List<String?>? = listOf(),
    @SerializedName("files")
    val files: List<FileModel?>? = listOf(),
    @SerializedName("hair")
    val hair: String? = "",
    @SerializedName("hair_raw")
    val hairRaw: String? = "",
    @SerializedName("height_max")
    val heightMax: Int? = 0,
    @SerializedName("height_min")
    val heightMin: Int? = 0,
    @SerializedName("@id")
    val id: String? = "",
    @SerializedName("images")
    val images: List<ImageModel?>? = listOf(),
    @SerializedName("languages")
    val languages: List<String?>? = listOf(),
    @SerializedName("legat_names")
    val legatNames: Any? = Any(),
    @SerializedName("locations")
    val locations: Any? = Any(),
    @SerializedName("modified")
    val modified: String? = "",
    @SerializedName("nationality")
    val nationality: String? = "",
    @SerializedName("ncic")
    val ncic: Any? = Any(),
    @SerializedName("occupations")
    val occupations: List<String?>? = listOf(),
    @SerializedName("path")
    val path: String? = "",
    @SerializedName("person_classification")
    val personClassification: String? = "",
    @SerializedName("place_of_birth")
    val placeOfBirth: String? = "",
    @SerializedName("possible_countries")
    val possibleCountries: Any? = Any(),
    @SerializedName("possible_states")
    val possibleStates: Any? = Any(),
    @SerializedName("poster_classification")
    val posterClassification: String? = "",
    @SerializedName("publication")
    val publication: String? = "",
    @SerializedName("race")
    val race: String? = "",
    @SerializedName("race_raw")
    val raceRaw: String? = "",
    @SerializedName("remarks")
    val remarks: String? = "",
    @SerializedName("reward_max")
    val rewardMax: Int? = 0,
    @SerializedName("reward_min")
    val rewardMin: Int? = 0,
    @SerializedName("reward_text")
    val rewardText: String? = "",
    @SerializedName("scars_and_marks")
    val scarsAndMarks: String? = "",
    @SerializedName("sex")
    val sex: String? = "",
    @SerializedName("status")
    val status: String? = "",
    @SerializedName("subjects")
    val subjects: List<String?>? = listOf(),
    @SerializedName("suspects")
    val suspects: Any? = Any(),
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("uid")
    val uid: String? = "",
    @SerializedName("url")
    val url: String? = "",
    @SerializedName("warning_message")
    val warningMessage: String? = "",
    @SerializedName("weight")
    val weight: String? = "",
    @SerializedName("weight_max")
    val weightMax: Int? = 0,
    @SerializedName("weight_min")
    val weightMin: Int? = 0
)