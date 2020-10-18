import React from 'react';
import axios from 'axios';

class Greeting extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      message: 'Hello World'
    };
  }

  componentDidMount() {
    axios.get("http://localhost:8001/greeting")
      .then(response => response.data)
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            message: result.content
          });
        },
        // Note: it's important to handle errors here
        // instead of a catch() block so that we don't swallow
        // exceptions from actual bugs in components.
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )
  }

  render() {
    const { error, isLoaded, message } = this.state;
    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
        <h1>{message}</h1>
      );
    }
  }
}

export default Greeting;