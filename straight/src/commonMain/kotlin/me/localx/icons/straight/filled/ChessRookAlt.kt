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

public val Icons.Filled.ChessRookAlt: ImageVector
    get() {
        if (_chessRookAlt != null) {
            return _chessRookAlt!!
        }
        _chessRookAlt = Builder(name = "ChessRookAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 5.0f, 8.829f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.829f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 21.0f, 6.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chessRookAlt!!
    }

private var _chessRookAlt: ImageVector? = null
