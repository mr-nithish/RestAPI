import React from 'react'
import { useState, useEffect } from 'react';

export default function Receiver() {

    const [sender, setSender] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedsender = '1';
          setSender(fetchedsender);
        }, 1000); 
    }, []);

    const [delreceiver, setDelReceiver] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetcheddelreceiver = '2';
          setDelReceiver(fetcheddelreceiver);
        }, 1000); 
    }, []);

    const [statusreceiver, setstatusReceiver] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedstatreceiver = 'Not Yet Dispatched';
          setstatusReceiver(fetchedstatreceiver);
        }, 1000); 
    }, []);

  return (
    <div class="bg-fuchsia-500 mt-5">
        <h1>Received Packages</h1>
        <h1>SenderId : {sender}</h1>
        <h1>DeliverymanId : {delreceiver}</h1>
        <h1>Status : {statusreceiver}</h1>
    </div>
  )
}
