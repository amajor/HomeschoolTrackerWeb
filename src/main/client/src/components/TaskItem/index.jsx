import React from 'react';
import PropTypes from 'prop-types';

class TaskItem extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isChecked: props.isChecked,
    };

    this.handleClick = this.handleClick.bind(this);
  }

  handleClick(name, event) {
    const { isChecked } = this.state;
    const { onClick } = this.props;
    this.setState({
      isChecked: !isChecked,
    });
    onClick(name);
  }

  render() {
    const { isChecked } = this.state;
    const { name } = this.props;
    return (
      <div onClick={(e) => this.handleClick(name, e)}>
        {isChecked ? "X" : "O"} {name}
      </div>
    );
  }
}

TaskItem.propTypes = {
  isChecked: PropTypes.bool,
  onClick: PropTypes.func,
  name: PropTypes.string,
};

TaskItem.defaultProps = {
  name: "My Task",
  isChecked: false,
  onClick: () => {},
};

export default TaskItem;