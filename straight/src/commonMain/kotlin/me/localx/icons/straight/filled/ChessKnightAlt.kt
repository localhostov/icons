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

public val Icons.Filled.ChessKnightAlt: ImageVector
    get() {
        if (_chessKnightAlt != null) {
            return _chessKnightAlt!!
        }
        _chessKnightAlt = Builder(name = "ChessKnightAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 16.646f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, 2.135f, -2.87f)
                arcToRelative(5.416f, 5.416f, 0.0f, false, false, 4.086f, -4.753f)
                lineTo(4.0f, 9.023f)
                lineTo(4.0f, 8.049f)
                arcTo(3.013f, 3.013f, 0.0f, false, true, 5.91f, 5.256f)
                curveTo(7.76f, 4.505f, 8.9f, 3.569f, 9.593f, 0.781f)
                lineTo(9.781f, 0.023f)
                horizontalLineToRelative(0.781f)
                curveTo(19.892f, 0.023f, 20.0f, 8.438f, 20.0f, 8.523f)
                close()
                moveTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chessKnightAlt!!
    }

private var _chessKnightAlt: ImageVector? = null
