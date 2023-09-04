import React from 'react'
import { useState, useEffect } from 'react';

export default function Sender() {
    
    const [receiver, setReceiver] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedreceiver = '2';
          setReceiver(fetchedreceiver);
        }, 1000); 
    }, []);

    const [delsender, setDelSender] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetcheddelsender = '1';
          setDelSender(fetcheddelsender);
        }, 1000); 
    }, []);

    const [statussender, setstatusSender] = useState('');
    useEffect(() => {
        setTimeout(() => {
          const fetchedstatsender = 'Delivered';
          setstatusSender(fetchedstatsender);
        }, 1000); 
    }, []);

  return (
    <div class="bg-green-400">
        <h1>Sent Packages</h1>
        <h1>ReceiverId : {receiver}</h1>
        <h1>DeliverymanId : {delsender}</h1>
        <h1>Status : {statussender}</h1>
    </div>
  )
}
