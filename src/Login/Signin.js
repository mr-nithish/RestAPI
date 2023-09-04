import React from 'react'
import logo from '../asserts/z.png'

export default function Signin() {
  return (
    <div className='container-fluid flex justify-center items-center h-screen bg-black'>
        <div class="flex flex-col lg:flex-row">
            <div class='bg-black'>
                <img src={logo} alt='logo' className="w-full object-cover"/>
            </div>
            <div class='bg-black'>
                <h1 className='tracking-widest head text-white text-center lg:mt-24'>Delivery Made Personal, Just for You</h1>
                <div>
                    <h2 className='mt-5 tracking-widest text-white head'>Name</h2>
                    <input type="text" className="mt-3 border-2 rounded-lg mx-auto border-white p-2 text-center" placeholder="Name"/>
                </div>
                <div>
                    <h2 className='mt-5 tracking-widest text-white head'>Email</h2>
                    <input type="email" className="mt-3 border-2 rounded-lg mx-auto border-white p-2 text-center" placeholder="Email"/>
                </div>
                <div>
                    <h2 className='mt-5 tracking-widest text-white head'>Address</h2>
                    <input type="text" className="mt-3 border-2 rounded-lg mx-auto border-white p-2 text-center" placeholder="Address"/>
                </div>
                <div>
                    <h2 className='mt-5 tracking-widest text-white head'>Mobile Number</h2>
                    <input type="text" className="mt-3 border-2 rounded-lg mx-auto border-black p-2 text-center" placeholder="Mobile number"/>
                </div>
                <div>
                    <h2 className='mt-5 tracking-widest text-white head'>Password</h2>
                    <input type="password" className="mt-3 border-2 rounded-lg mx-auto border-white p-2 text-center" placeholder="Password"/>
                </div>
                <button className="mt-3 tracking-widest border-2 rounded-lg mx-auto text-white head border-white p-2 text-center">NEXT</button>
            </div>
        </div>
    </div>
  )
}
