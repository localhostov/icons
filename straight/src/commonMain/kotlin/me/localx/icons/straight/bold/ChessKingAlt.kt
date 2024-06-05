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
                moveTo(19.007f, 19.037f)
                arcTo(43.434f, 43.434f, 0.0f, false, true, 16.486f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 8.0f)
                lineTo(16.7f, 8.0f)
                lineToRelative(1.247f, -2.777f)
                arcTo(2.415f, 2.415f, 0.0f, false, false, 15.666f, 2.0f)
                lineTo(13.5f, 2.0f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                lineTo(8.333f, 2.0f)
                arcTo(2.416f, 2.416f, 0.0f, false, false, 6.055f, 5.224f)
                lineTo(7.3f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.513f, 11.0f)
                arcToRelative(43.509f, 43.509f, 0.0f, false, true, -2.521f, 8.037f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 2.0f, 22.5f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.5f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 19.007f, 19.037f)
                close()
                moveTo(9.24f, 5.0f)
                horizontalLineToRelative(5.52f)
                lineTo(13.407f, 8.0f)
                lineTo(10.593f, 8.0f)
                close()
                moveTo(13.45f, 11.0f)
                arcToRelative(41.426f, 41.426f, 0.0f, false, false, 2.31f, 8.0f)
                lineTo(8.241f, 19.0f)
                arcToRelative(41.5f, 41.5f, 0.0f, false, false, 2.309f, -8.0f)
                close()
            }
        }
        .build()
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
