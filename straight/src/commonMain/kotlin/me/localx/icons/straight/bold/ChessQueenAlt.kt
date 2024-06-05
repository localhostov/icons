package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ChessQueenAlt: ImageVector
    get() {
        if (_chessQueenAlt != null) {
            return _chessQueenAlt!!
        }
        _chessQueenAlt = Builder(name = "ChessQueenAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.059f, 19.045f)
                arcTo(62.442f, 62.442f, 0.0f, false, true, 16.232f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.618f)
                lineTo(17.0f, 1.0f)
                lineTo(14.294f, 2.465f)
                lineTo(12.0f, 0.0f)
                lineTo(9.706f, 2.465f)
                lineTo(7.0f, 1.0f)
                lineTo(8.382f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.768f)
                arcTo(62.442f, 62.442f, 0.0f, false, true, 4.941f, 19.045f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 22.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.059f, 19.045f)
                close()
                moveTo(13.2f, 9.0f)
                arcToRelative(58.944f, 58.944f, 0.0f, false, false, 2.653f, 10.0f)
                horizontalLineTo(8.145f)
                arcTo(58.944f, 58.944f, 0.0f, false, false, 10.8f, 9.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
