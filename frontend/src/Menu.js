import React, { useState } from 'react';
import './App.css';
import { Table, Card, ListGroup, ListGroupItem, CardImg, Image } from 'react-bootstrap';

class Menu extends React.Component{
    constructor(props){
        super(props);
        this.state = {menu:[]};
    }
        async componentDidMount() {
            let resp = await fetch("http://localhost:8080/all");
            let data = await resp.json();
            this.setState({ menu: data});
        }
        render(){
            return(
                <Card style={{ width: '20rem' }}>
                    <Card.Title>Menu</Card.Title>
                    <Card.Body>
                        <Table  size="sm">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Price</th>                                    
                                    <th>Name</th>
                                    <th>Calories</th>
                                </tr>
                            </thead>
                            <tbody>
                                    {this.state.menu.map(item => <tr><Image src = {"./"+item.id +".jpg"} thumbnail /><td>${item.price}</td><td>{item.name}</td><td>{item.calories}</td></tr>)}                                    
                            </tbody>
                        </Table>                        
                    </Card.Body>
                    
                </Card>
            )
        }
}
export default Menu;