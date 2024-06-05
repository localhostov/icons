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

public val Icons.Filled.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.355f)
                arcTo(3.266f, 3.266f, 0.0f, false, true, 4.162f, 6.3f)
                curveTo(7.119f, 5.229f, 9.112f, 3.929f, 9.9f, 0.758f)
                lineTo(10.094f, 0.0f)
                horizontalLineToRelative(0.781f)
                curveTo(21.873f, 0.0f, 22.0f, 9.9f, 22.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.236f)
                curveTo(7.392f, 18.046f, 10.19f, 14.858f, 11.0f, 11.0f)
                close()
                moveTo(1.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
