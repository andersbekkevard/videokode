# Mermaid Flowchart Example

```mermaid

%%{init:{
  "theme": "base",
  "themeVariables": {
    "darkMode": true,
    "fontFamily": "Lato, sans-serif",
    "fontSize": "14px",
    "background": "#1E2A3A",
    "primaryColor": "#4A90E2",
    "textColor": "#FFFFFF",
    "nodeTextColor": "#FFFFFF",
    "lineColor": "#4A90E2",
    "mainBkg": "#233047",
    "actorTextColor": "#FFFFFF",
    "signalColor": "#FFFFFF",
    "signalTextColor": "#FFFFFF",
    "labelTextColor": "#FFFFFF",
    "sequenceNumberColor": "#FFFFFF"
  }
}}%%
flowchart TD
    A[Start] --> B{Is it sunny?}
    B -- Yes --> C[Go for a walk]
    B -- No --> D[Read a book]
    C --> E[Have lunch]
    D --> E
    E --> F[End]
```
