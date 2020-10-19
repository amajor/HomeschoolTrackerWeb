import React from 'react';
import axios from 'axios';

class UserList extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      users: [{"id":99,"name":"Bilbo"}],
    };
  }

  componentDidMount() {
    const { endpoint } = this.props;
    axios.get(`http://localhost:8001/${endpoint}`)
      .then(response => response.data)
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            users: result
          });
        },
        // Note: it's important to handle errors here
        // instead of a catch() block so that we don't swallow
        // exceptions from actual bugs in components.
        (error) => {
          this.setState({
            isLoaded: true,
            users: [],
            error
          });
        }
      )
  }

  render() {
    const { error, isLoaded, users } = this.state;
    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
        <ul>
            {users.map(user => (
             <li key={user.name}>
               {user.id}: {user.name}
             </li>
            ))}
        </ul>
      );
    }
  }
}

export default UserList;