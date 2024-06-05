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

public val Icons.Bold.ChessClockAlt: ImageVector
    get() {
        if (_chessClockAlt != null) {
            return _chessClockAlt!!
        }
        _chessClockAlt = Builder(name = "ChessClockAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.025f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(16.0f, 3.0f)
                lineTo(16.0f, 5.0f)
                lineTo(9.908f, 5.0f)
                arcTo(1.483f, 1.483f, 0.0f, false, false, 10.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 4.5f)
                arcToRelative(1.481f, 1.481f, 0.0f, false, false, 0.342f, 0.942f)
                arcTo(5.509f, 5.509f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.0f, 4.893f)
                lineTo(3.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(6.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(21.0f, 21.393f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 19.0f, 5.025f)
                close()
                moveTo(21.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 19.0f)
                lineTo(5.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 16.5f)
                verticalLineToRelative(-6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 8.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
                moveTo(19.905f, 12.671f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, true, -6.221f, 2.884f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, 0.163f, -0.688f)
                lineToRelative(1.935f, -0.967f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.0f, -0.718f)
                lineToRelative(-1.98f, -0.99f)
                arcToRelative(0.465f, 0.465f, 0.0f, false, true, -0.165f, -0.683f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, 6.268f, 1.162f)
                close()
                moveTo(10.99f, 13.519f)
                arcToRelative(3.481f, 3.481f, 0.0f, false, true, -4.038f, 3.437f)
                arcToRelative(0.462f, 0.462f, 0.0f, false, true, -0.371f, -0.6f)
                lineTo(7.265f, 14.3f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.508f, -0.507f)
                lineToRelative(-2.1f, 0.7f)
                arcToRelative(0.465f, 0.465f, 0.0f, false, true, -0.6f, -0.366f)
                arcToRelative(3.495f, 3.495f, 0.0f, true, true, 6.933f, -0.61f)
                close()
            }
        }
        .build()
        return _chessClockAlt!!
    }

private var _chessClockAlt: ImageVector? = null
