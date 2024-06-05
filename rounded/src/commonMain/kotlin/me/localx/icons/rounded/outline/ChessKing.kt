package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.328f, 10.222f)
                arcToRelative(5.038f, 5.038f, 0.0f, false, false, -3.27f, -2.389f)
                arcTo(40.142f, 40.142f, 0.0f, false, false, 13.0f, 7.014f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.014f)
                arcToRelative(40.142f, 40.142f, 0.0f, false, false, -7.058f, 0.819f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.249f, 14.27f)
                lineTo(3.089f, 22.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(4.478f)
                quadToRelative(0.04f, 0.0f, 0.081f, 0.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.089f)
                lineToRelative(2.856f, -7.774f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 23.328f, 10.222f)
                close()
                moveTo(21.875f, 13.58f)
                lineTo(18.781f, 22.0f)
                horizontalLineTo(5.219f)
                lineTo(2.141f, 13.624f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.372f, 9.786f)
                arcTo(38.169f, 38.169f, 0.0f, false, true, 12.0f, 9.0f)
                arcToRelative(38.169f, 38.169f, 0.0f, false, true, 7.628f, 0.786f)
                arcTo(2.992f, 2.992f, 0.0f, false, true, 21.6f, 11.223f)
                arcTo(2.947f, 2.947f, 0.0f, false, true, 21.875f, 13.58f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
