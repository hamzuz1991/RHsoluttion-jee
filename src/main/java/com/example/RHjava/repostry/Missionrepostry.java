package com.example.RHjava.repostry;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.RHjava.persist.Mission;

public interface Missionrepostry extends JpaRepository<Mission,Long> {

}
