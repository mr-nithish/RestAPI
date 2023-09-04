import React from 'react'
import { useState } from 'react';

export default function Button() {

    const [isDialogOpen, setIsDialogOpen] = useState(false);

    const openDialog = () => {
        setIsDialogOpen(true);
    };
    
    const closeDialog = () => {
        setIsDialogOpen(false);
    };

    const [textInput, setTextInput] = useState('');
    const [isSubmitted, setIsSubmitted] = useState(false);

    const handleInputChange = (e) => {
        setTextInput(e.target.value);
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        
        if (textInput.trim() === '') {
        alert('Please fill in the text box.'); 
        } else {
        setIsSubmitted(true);
        }
    };

  return (
    <div>
        <button onClick={openDialog} className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
            Add Parcel
        </button>
            {isDialogOpen && (
            <div className="fixed z-10 inset-0 overflow-y-auto">
                <div className="flex items-center justify-center min-h-screen pt-4 px-4 pb-20 text-center sm:block sm:p-0">
                    <div className="fixed inset-0 transition-opacity" aria-hidden="true">
                        <div className="absolute inset-0 bg-gray-500 opacity-75"></div>
                        </div>
                        <span className="hidden sm:inline-block sm:align-middle sm:h-screen" aria-hidden="true">
                        &#8203;
                        </span>
                        <div className="inline-block align-bottom bg-white rounded-lg text-left overflow-hidden shadow-xl transform transition-all sm:my-8 sm:align-middle sm:max-w-lg sm:w-full">
                        <div className="bg-white px-4 pt-5 pb-4 sm:p-6 sm:pb-4">
                            <div className="mt-3 text-center sm:mt-0 sm:ml-4 sm:text-left">
                                <h3 className="text-lg leading-6 font-medium text-gray-900">Parcel Details</h3>
                                <div className="mt-2">
                                    <h2>ReceiverId</h2>
                                    <form onSubmit={handleSubmit}>
                                        <input
                                        type="text"
                                        value={textInput}
                                        onChange={handleInputChange}
                                        placeholder="Enter text here"
                                        />
                                        <button type='submit' className="w-full inline-flex justify-center rounded-md border border-transparent shadow-sm px-4 py-2 bg-red-600 text-base font-medium text-white hover:bg-red-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-red-500 sm:ml-3 sm:w-auto sm:text-sm">
                                            Add
                                        </button>
                                        <button type='submit' onClick={closeDialog} className="w-full inline-flex justify-center rounded-md border border-transparent shadow-sm px-4 py-2 bg-red-600 text-base font-medium text-white hover:bg-red-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-red-500 sm:ml-3 sm:w-auto sm:text-sm">
                                            close
                                        </button>
                                    </form>
                                    {isSubmitted && <p>Form submitted successfully!</p>}
                                </div>
                            </div>
                        </div> 
                    </div>
                </div>
            </div>
        )}
    </div>
  )
}
