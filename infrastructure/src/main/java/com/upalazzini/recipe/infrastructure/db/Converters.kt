package com.upalazzini.recipe.infrastructure.db

import androidx.room.TypeConverter
import java.util.*

class Converters {
    @TypeConverter
    fun fromUUIDToString(uuid: UUID): String {
        return uuid.toString()
    }

    @TypeConverter
    fun fromStringToUUID(value: String): UUID {
        return UUID.fromString(value)
    }

    @TypeConverter
    fun fromListToString(list: List<String>): String{
        return list.joinToString(",")
    }

    @TypeConverter
    fun fromStringToList(value: String): List<String>{
        return value.split(",")
    }
}