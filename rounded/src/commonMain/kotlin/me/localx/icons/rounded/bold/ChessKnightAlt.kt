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

public val Icons.Bold.ChessKnightAlt: ImageVector
    get() {
        if (_chessKnightAlt != null) {
            return _chessKnightAlt!!
        }
        _chessKnightAlt = Builder(name = "ChessKnightAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                verticalLineTo(8.462f)
                curveTo(20.0f, 5.722f, 18.231f, 0.427f, 11.541f, 0.0f)
                arcTo(2.424f, 2.424f, 0.0f, false, false, 9.05f, 1.687f)
                curveToRelative(-0.621f, 2.0f, -1.576f, 3.24f, -2.917f, 3.784f)
                arcTo(3.37f, 3.37f, 0.0f, false, false, 4.0f, 8.6f)
                arcTo(2.406f, 2.406f, 0.0f, false, false, 6.4f, 11.0f)
                horizontalLineTo(9.437f)
                arcTo(4.808f, 4.808f, 0.0f, false, true, 7.16f, 12.794f)
                arcTo(5.285f, 5.285f, 0.0f, false, false, 4.0f, 17.573f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(7.0f, 17.573f)
                arcTo(2.253f, 2.253f, 0.0f, false, true, 8.391f, 15.53f)
                arcToRelative(7.318f, 7.318f, 0.0f, false, false, 4.625f, -5.783f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.536f, 8.0f)
                horizontalLineTo(7.81f)
                arcToRelative(8.333f, 8.333f, 0.0f, false, false, 3.955f, -4.968f)
                arcTo(5.477f, 5.477f, 0.0f, false, true, 17.0f, 8.462f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _chessKnightAlt!!
    }

private var _chessKnightAlt: ImageVector? = null
