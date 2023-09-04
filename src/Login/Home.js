import React from 'react'
import Sender from './Sender'
import Receiver from './Receiver'
import Profile from './Profile'
import Button from './Button'

export default function Home() {
  return (
    <div>
        <div class="grid grid-cols-3 gap-4 p-5">
            <div class="col-span-2 sm:col-span-1 bg-blue-300 p-4"> 
                <Profile/>
            </div>
            <div class="col-span-2 sm:col-span-1 bg-green-300 p-4"> 
                <Button/>
            </div>
            <div class="col-span-2 sm:col-span-1 bg-yellow-300 p-4"> 
                <div>
                    <Sender/>
                </div>
                <div>
                    <Receiver/>
                </div>
            </div>
        </div>
    </div>
  )
}
