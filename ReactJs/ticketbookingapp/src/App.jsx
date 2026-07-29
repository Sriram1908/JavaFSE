import React, { useState } from "react";

function GuestPage() {
  return (
      <div>
        <h2>Welcome Guest</h2>
        <p>You can browse the flight details.</p>

        <table>
          <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Fare</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>AI101</td>
            <td>Chennai</td>
            <td>Delhi</td>
            <td>₹6000</td>
          </tr>
          <tr>
            <td>AI202</td>
            <td>Bangalore</td>
            <td>Mumbai</td>
            <td>₹4500</td>
          </tr>
          </tbody>
        </table>

        <p><b>login to book tickets</b></p>
      </div>
  );
}

function UserPage() {
  return (
      <div>
        <h2>Welcome User</h2>
        <p>You can browse and book flight tickets.</p>

        <table>
          <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Fare</th>
            <th>Action</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>AI101</td>
            <td>Chennai</td>
            <td>Delhi</td>
            <td>₹6000</td>
            <td>
              <button>Book</button>
            </td>
          </tr>
          <tr>
            <td>AI202</td>
            <td>Bangalore</td>
            <td>Mumbai</td>
            <td>₹4500</td>
            <td>
              <button>Book</button>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
      <div style={{ padding: "20px" }}>
        <h1>Ticket Booking App</h1>

        {isLoggedIn ? (
            <button onClick={() => setIsLoggedIn(false)}>Logout</button>
        ) : (
            <button onClick={() => setIsLoggedIn(true)}>Login</button>
        )}

        <hr />

        {isLoggedIn ? <UserPage /> : <GuestPage />}
      </div>
  );
}

export default App;