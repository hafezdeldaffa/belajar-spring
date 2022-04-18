package com.belajarspring.belajarspring;

import lombok.Data;

@Data
public class Database {
  private static Database database;

  public static Database getInstance() {
    if (database == null) {
      database = new Database();
    }
    return database;
  }

  private Database() {

  }
}
