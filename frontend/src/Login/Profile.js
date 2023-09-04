import React from 'react'
import { useState, useEffect } from 'react';
import axios from 'axios';

export default function Profile() {

    const [name, setName] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedname = 'Nithish';
          setName(fetchedname);
        }, 1000); 
    }, []);

    const [phone, setPhone] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedphone = '727721euec105@gmail.com';
          setPhone(fetchedphone);
        }, 1000); 
    }, []);

    const [password, setPassword] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedpassword = 'skcet123';
          setPassword(fetchedpassword);
        }, 1000); 
    }, []);
  return (
    <div>
        <h1>Profile</h1>
        <h1>Name : {name}</h1>
        <h1>Phone : {phone}</h1>
        <h1>Password : {password}</h1>
    </div>
  )
}
