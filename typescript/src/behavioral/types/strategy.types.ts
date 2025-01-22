export namespace StrategyTypes {
  export interface Strategy {
    execute(a: number, b: number): number;
  }
}
