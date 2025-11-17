from src.structural.proxy.subject import Subject


class RealSubject(Subject):
    def request(self) -> str:
        return "RealSubject: Handling request."
