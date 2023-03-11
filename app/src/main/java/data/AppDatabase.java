package data;


import androidx.room.RoomDatabase;
import androidx.room.Database;

@Database(entities = {RegionEntity.class, CountryEntity.class}, version = 2)

public abstract class AppDatabase extends RoomDatabase {
    public abstract RegionDao regionDao();
    public abstract CountryDao countriesDAO();
}
