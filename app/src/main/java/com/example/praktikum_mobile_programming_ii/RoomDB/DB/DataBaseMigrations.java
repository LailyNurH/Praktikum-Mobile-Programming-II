package com.example.praktikum_mobile_programming_ii.RoomDB.DB;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class DataBaseMigrations {
    public static final Migration MIGRATION_1_TO_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE mahasiswa ADD COLUMN gambar TEXT DEFAULT ''");
        }
    };

}
