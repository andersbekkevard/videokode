```mermaid
%%{init: {
  'theme': 'base',
  'themeVariables': {
    'primaryColor': '#ffffff',
    'primaryBorderColor': '#000000',
    'primaryTextColor': '#000000',
    'lineColor': '#000000',
    'fontFamily': 'arial',
    'fontSize': '14px',
    'tertiaryColor': '#ffffff'
  }
}}%%
graph TD
    subgraph a["a : A"]
    a1[" "]
    end
    subgraph b["b : B"]
    b1[" "]
    end
    a --> b
    style a fill:#ffffff,stroke:#000000
    style b fill:#ffffff,stroke:#000000
    style a1 fill:#ffffff,stroke:#ffffff
    style b1 fill:#ffffff,stroke:#ffffff
``` 