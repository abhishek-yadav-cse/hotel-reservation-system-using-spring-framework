package com.abhishekyadav.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.abhishekyadav.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}