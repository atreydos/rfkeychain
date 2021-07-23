package io.atreydos.rfkeychain.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rf_keys")
data class RFKey(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: Type,
    @ColumnInfo(name = "group_id") val groupId: Long
) {

    enum class Type { OPEN, CLOSE, STOP }

}
