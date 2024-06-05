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

public val Icons.Bold.ChessRookAlt: ImageVector
    get() {
        if (_chessRookAlt != null) {
            return _chessRookAlt!!
        }
        _chessRookAlt = Builder(name = "ChessRookAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.036f)
                lineTo(19.0f, 9.662f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 6.5f)
                lineTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 9.662f)
                verticalLineToRelative(9.374f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 22.5f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.0f, 19.036f)
                close()
                moveTo(6.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 7.0f)
                lineTo(6.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 6.5f)
                close()
                moveTo(14.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                lineTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chessRookAlt!!
    }

private var _chessRookAlt: ImageVector? = null
