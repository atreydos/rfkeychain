package io.atreydos.rfkeychain.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rf_key_groups")
data class RFKeyGroup(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
)
