package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ChessKingAlt: ImageVector
    get() {
        if (_chessKingAlt != null) {
            return _chessKingAlt!!
        }
        _chessKingAlt = Builder(name = "ChessKingAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-0.793f)
                arcToRelative(40.242f, 40.242f, 0.0f, false, true, -2.579f, -9.006f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.348f, -2.916f)
                reflectiveCurveToRelative(0.66f, -1.026f, 0.689f, -1.088f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.333f, 6.99f)
                curveToRelative(0.029f, 0.062f, 0.69f, 1.088f, 0.69f, 1.088f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.349f, 2.916f)
                arcTo(40.242f, 40.242f, 0.0f, false, true, 4.793f, 20.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(9.078f, 5.232f)
                arcTo(0.488f, 0.488f, 0.0f, false, true, 9.5f, 5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.479f, 0.647f)
                lineTo(13.45f, 8.0f)
                horizontalLineToRelative(-2.9f)
                lineTo(9.022f, 5.647f)
                arcTo(0.485f, 0.485f, 0.0f, false, true, 9.078f, 5.232f)
                close()
                moveTo(10.391f, 11.0f)
                horizontalLineToRelative(3.218f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, false, 2.371f, 9.0f)
                horizontalLineTo(8.02f)
                arcTo(39.5f, 39.5f, 0.0f, false, false, 10.391f, 11.0f)
                close()
            }
        }
        .build()
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
