import React from 'react';
import TaskItem from '../TaskItem';
import PropTypes from 'prop-types';

class TaskList extends React.Component {
  handleClick(name) {
    console.log("You clicked task " + name);
  }

  render() {
    const { tasks } = this.props;

    return (
      <div>
        {tasks.map(task => (
          <div key={task.name}>
            <TaskItem name={task.name} isChecked={task.isChecked} onClick={this.handleClick} />
          </div>
        ))}
      </div>
    );
  }
}

TaskList.propTypes = {
  tasks: PropTypes.array,
};

TaskList.defaultProps = {
  tasks: [
    { name: "Task 1", isChecked: false },
    { name: "Task 2", isChecked: true },
    { name: "Task 3", isChecked: false },
  ]
};

export default TaskList;