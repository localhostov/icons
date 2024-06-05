package me.localx.icons.straight.filled

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

public val Icons.Filled.ChessQueenAlt: ImageVector
    get() {
        if (_chessQueenAlt != null) {
            return _chessQueenAlt!!
        }
        _chessQueenAlt = Builder(name = "ChessQueenAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.225f, 6.0f)
                lineToRelative(1.7f, -5.89f)
                lineTo(14.0f, 2.0f)
                lineTo(12.0f, 0.031f)
                lineTo(10.0f, 2.0f)
                lineTo(6.077f, 0.11f)
                lineTo(7.775f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(22.0f, 24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(16.357f, 10.0f)
                arcToRelative(50.4f, 50.4f, 0.0f, false, false, 2.327f, 8.0f)
                horizontalLineTo(5.316f)
                arcToRelative(50.6f, 50.6f, 0.0f, false, false, 2.327f, -8.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
