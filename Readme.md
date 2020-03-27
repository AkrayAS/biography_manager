# Biography Manager

> An smalll side project application that allows the management of several user bibliography bases.


Each one of these bibliographic base will consist of an *article*, *book*, *masterthesis*, *misc* or *techreport* publications in the BibTeX file format. Each type of publication has its set of optional and mandatory attributes. The particularities of each type of publication must be respected. For example, the user could not create a publication of type *book* that contains the attribute `institution`.

## BibTeX File

![BibTeX](/images/BibTeX_logo.svg.png)

A [BibTeX](https://en.wikipedia.org/wiki/BibTeX) file contains different entries to represent the different types of publication. Each type has a set of optional attributes and a set of mandatory attributes. For example, the type `book` has mandatory attributes: *author*, *publisher*, *title* and *year*. Optional attributes include: *address*, *edition*, *month*, *number*, *series* and *volume*.

## BibTeX Table

 The table below shows a subset of all types provided for a BibTeX file, as well as a list with a subset of all mandatory and optional attributes for each one:


 |             | article | book | masterthesis | misc | techreport |
| ----------- | :-----: | :--: | :----------: | :--: | :--------: |
| address     |         |  o   |      o       |      |     o      |
| author      |    +    |  +   |      +       |  o   |     +      |
| edition     |         |  o   |              |      |            |
| editor      |         |  o   |              |      |            |
| institution |         |      |              |      |     +      |
| journal     |    +    |      |              |      |            |
| month       |    o    |  o   |      o       |  o   |     o      |
| number      |    o    |  o   |              |      |            |
| pages       |    o    |      |              |      |            |
| publisher   |         |  +   |              |      |            |
| series      |         |  o   |              |      |            |
| title       |    +    |  +   |      +       |  +   |     +      |
| volume      |    o    |  o   |              |      |            |
| year        |    +    |  +   |      +       |  o   |     +      |


> `o` for optional attributes and` + `for mandatory attributes. Blank means that the attribute does not belong to that type of publication.

## Bibtex Format

```bibtex
@book{lamport1994latex,
  title={LATEX: a document preparation system: user's guide and reference manual},
  author={Lamport, Leslie},
  year={1994},
  publisher={Addison-wesley}
}
```