package data;




import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "countries",
        indices = {@Index(value = {"name"},unique = true)},
        foreignKeys = {@ForeignKey(entity = RegionEntity.class,
                parentColumns = "id",
                childColumns = "countryId") }
)
public class CountryEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "countryId")
    public long countryId;
}
