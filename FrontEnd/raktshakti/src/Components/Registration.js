import axios from 'axios';
import React, { useState } from 'react';
 
function Registration() {

    const[fname,setName]=useState('');
    const[email,setEmail]=useState('');
    const[password,setPassword]=useState('');
    const[address,setAddress]=useState('');
    const[phone,setPhone]=useState('');
  

async function save(event){
    event.preventDefault();
    try{
    await axios.post("http://localhost:8080/register/",
    {
        firstName:fname,
        email:email,
        password:password,
        address:address,
        phoneNo:phone,
        role:'User'

    });
    alert("User registration successfully")
    setName('');
    setEmail('');
    setPassword('');
    setAddress('');
    setPhone('');
}
catch(err){
  alert("User Registration failed")
}
}


  return (
    <div className='container-sm'>
    <form>
    <div className="form-group row">
    <label for="inputName" className="col-sm-2 col-form-label sixe-sm">Name</label>
    <div className="col-sm-10">
      <input type="text" className="form-control" id="inputEmail3" placeholder="Name"
      value={fname}
      onChange={(event)=>{
        setName(event.target.value);
        
      }}
      />
    </div>
    </div>

  <div className="form-group row">
    <label for="inputEmail3" className="col-sm-2 col-form-label sixe-sm">Email</label>
    <div className="col-sm-10">
      <input type="email" className="form-control" id="inputEmail3" placeholder="Email"
       value={email}
       onChange={(event)=>{
         setEmail(event.target.value);
       }}
      />
    </div>
  </div>
  <div className="form-group row">
    <label for="inputPassword3" className="col-sm-2 col-form-label">Password</label>
    <div className="col-sm-4">
      <input type="password" className="form-control" id="inputPassword3" placeholder="Password"
       value={password}
       onChange={(event)=>{
         setPassword(event.target.value);
       }}
         />
    </div>
  </div>
  <div className="form-group row">
    <label for="inputAddress" className="col-sm-2 col-form-label sixe-sm">Address</label>
    <div className="col-sm-10">
      <input type="text" className="form-control" id="inputEmail3" placeholder="Address"
       value={address}
       onChange={(event)=>{
         setAddress(event.target.value);
       }}
      />
    </div>
    </div>

    <div className="form-group row">
    <label for="inputPhone" className="col-sm-2 col-form-label sixe-sm">Phone Number</label>
    <div className="col-sm-10">
      <input type="number" className="form-control" id="inputEmail3" placeholder="Phone"
       value={phone}
       onChange={(event)=>{
         setPhone(event.target.value);
       }}
      />
    </div>
    </div>

  
  <div className="form-group row">
    <div className="col-sm-10">
      <button className="btn btn-primary mt-4" onClick={save}>Register</button>
    </div>
  </div>
</form>
</div>
  );
}


export default Registration;