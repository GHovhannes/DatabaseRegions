package data;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface RegionDao {
    @Transaction
    @Query("SELECT * FROM regions")
    List<OneToManyRelation> getAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertRegion(RegionEntity region);
}
