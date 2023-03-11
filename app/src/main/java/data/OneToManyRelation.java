package data;



import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class OneToManyRelation {
    @Embedded
    public RegionEntity region;
    @Relation(
            parentColumn = "id",
            entityColumn = "countryId"
    )
    public List<CountryEntity> countries;
}
