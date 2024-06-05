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

public val Icons.Outline.ChessClockAlt: ImageVector
    get() {
        if (_chessClockAlt != null) {
            return _chessClockAlt!!
        }
        _chessClockAlt = Builder(name = "ChessClockAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(16.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.576f)
                lineTo(3.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(5.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(21.0f, 21.576f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 17.0f)
                lineTo(24.0f, 10.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 5.0f)
                close()
                moveTo(22.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(16.5f, 9.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 21.0f, 13.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 9.0f)
                close()
                moveTo(16.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.288f, -1.5f)
                lineTo(16.0f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(14.212f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 16.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.19f, 7.669f)
                lineToRelative(0.008f, 0.013f)
                lineToRelative(0.013f, 0.008f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 7.5f, 9.0f)
                close()
                moveTo(7.5f, 16.0f)
                arcToRelative(2.481f, 2.481f, 0.0f, false, true, -0.909f, -0.177f)
                lineToRelative(1.263f, -1.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.415f, -1.415f)
                lineTo(5.177f, 14.409f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.5f, 16.0f)
                close()
            }
        }
        .build()
        return _chessClockAlt!!
    }

private var _chessClockAlt: ImageVector? = null
