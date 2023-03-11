package data;





import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CountryDao {

    @Query("SELECT * FROM countries")
    List<CountryEntity> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertCountry(CountryEntity country);
}