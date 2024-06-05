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

public val Icons.Filled.ChessKingAlt: ImageVector
    get() {
        if (_chessKingAlt != null) {
            return _chessKingAlt!!
        }
        _chessKingAlt = Builder(name = "ChessKingAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.385f, 8.0f)
                lineToRelative(1.5f, -3.331f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.634f, 0.847f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, -0.22f, 1.9f)
                lineTo(7.614f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(22.0f, 24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(5.393f, 18.0f)
                arcToRelative(27.874f, 27.874f, 0.0f, false, false, 2.193f, -6.0f)
                horizontalLineToRelative(8.828f)
                arcToRelative(27.819f, 27.819f, 0.0f, false, false, 2.193f, 6.0f)
                close()
            }
        }
        .build()
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
