package com.keyin.finalsprint.model;


import jakarta.persistence.*;

@Entity
@Table(name = "bst_records")
public class TreeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "input_numbers", nullable = false)
    private String inputNumbers;


    @Lob
    @Column(name = "tree_structure", columnDefinition = "TEXT", nullable = false)
    private String treeStructure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(String inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public String getTreeStructure() {
        return treeStructure;
    }

    public void setTreeStructure(String treeStructure) {
        this.treeStructure = treeStructure;
    }

}
