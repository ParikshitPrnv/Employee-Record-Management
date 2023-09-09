import React, { Component } from 'react';
import EmployeeService from '../service/EmployeeService';

class EmployeeComponent extends Component {
    constructor(props) {
        super(props);
        this.state ={
            emp : {}, 
            dept: {},
            org: {}
        }
    }


    componentDidMount(){
        EmployeeService.getEmployee().then((resp) => {
            this.setState({emp: resp.data.empDto})
            this.setState({dept: resp.data.deptDto})
            this.setState({org: resp.data.orgDto})
            console.log(this.state.emp)
            console.log(this.state.dept)
            console.log(this.state.org)
        });
    }
    
    render() {
        return (
            <div>
                <div className='container card offset-md-3'>
                    <h3 className='text-center card-header'> View Emp Details</h3>
                    <div className='card-body'>
                        <div className='row'>
                            <p><strong>Emp First Name: </strong>{this.state.emp.firstName}</p>
                        </div>
                    </div>

                </div>
            </div>
        );
    }
}

export default EmployeeComponent;
























