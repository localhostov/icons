package me.localx.icons.rounded.filled

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
                moveTo(4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(15.516f)
                lineToRelative(1.71f, -2.954f)
                arcToRelative(1.423f, 1.423f, 0.0f, false, false, -0.413f, -1.72f)
                arcToRelative(1.392f, 1.392f, 0.0f, false, false, -1.7f, -0.069f)
                lineToRelative(-1.11f, 0.6f)
                lineTo(12.932f, 0.448f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.745f, 0.5f)
                lineTo(9.717f, 1.855f)
                lineTo(8.672f, 1.3f)
                arcTo(1.442f, 1.442f, 0.0f, false, false, 6.515f, 3.091f)
                lineTo(8.2f, 6.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 8.0f)
                close()
                moveTo(18.672f, 18.0f)
                arcTo(44.865f, 44.865f, 0.0f, false, true, 16.3f, 10.0f)
                horizontalLineTo(7.7f)
                arcToRelative(44.865f, 44.865f, 0.0f, false, true, -2.374f, 8.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
