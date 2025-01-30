export namespace CommandTypes {
  export interface Command {
    execute(): string;
    undo(): string;
  }
}
