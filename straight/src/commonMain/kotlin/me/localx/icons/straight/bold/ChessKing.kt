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

public val Icons.Bold.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.6f, 9.845f)
                arcToRelative(3.371f, 3.371f, 0.0f, false, false, -2.013f, -1.656f)
                arcTo(36.826f, 36.826f, 0.0f, false, false, 13.5f, 7.031f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(7.031f)
                arcTo(36.826f, 36.826f, 0.0f, false, false, 2.413f, 8.189f)
                arcToRelative(3.405f, 3.405f, 0.0f, false, false, -2.259f, 4.27f)
                lineTo(2.821f, 21.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.179f)
                lineToRelative(2.669f, -8.547f)
                arcTo(3.389f, 3.389f, 0.0f, false, false, 23.6f, 9.845f)
                close()
                moveTo(5.964f, 21.0f)
                lineTo(3.019f, 11.57f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.029f, -0.316f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.234f, -0.193f)
                arcTo(35.469f, 35.469f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(35.453f, 35.453f, 0.0f, false, true, 8.717f, 1.061f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, 0.235f, 0.193f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, 0.031f, 0.31f)
                lineTo(18.036f, 21.0f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
