package me.localx.icons.straight.outline

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

public val Icons.Outline.ChessKnightAlt: ImageVector
    get() {
        if (_chessKnightAlt != null) {
            return _chessKnightAlt!!
        }
        _chessKnightAlt = Builder(name = "ChessKnightAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.184f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -0.085f, -0.108f, -8.5f, -9.438f, -8.5f)
                horizontalLineTo(9.781f)
                lineTo(9.593f, 0.758f)
                curveTo(8.9f, 3.546f, 7.76f, 4.481f, 5.91f, 5.232f)
                arcTo(3.014f, 3.014f, 0.0f, false, false, 4.0f, 8.025f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(6.221f)
                arcToRelative(5.911f, 5.911f, 0.0f, false, true, -4.086f, 3.753f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 4.0f, 16.623f)
                verticalLineToRelative(1.561f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 18.184f)
                close()
                moveTo(6.709f, 15.669f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 5.777f, -6.505f)
                lineTo(12.681f, 8.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.027f, 1.027f, 0.0f, false, true, 0.661f, -0.914f)
                arcToRelative(7.213f, 7.213f, 0.0f, false, false, 4.652f, -5.063f)
                curveTo(17.877f, 2.436f, 18.0f, 8.247f, 18.0f, 8.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.623f)
                arcTo(0.99f, 0.99f, 0.0f, false, true, 6.709f, 15.669f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chessKnightAlt!!
    }

private var _chessKnightAlt: ImageVector? = null
