package me.localx.icons.straight.outline

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

public val Icons.Outline.ChessRookAlt: ImageVector
    get() {
        if (_chessRookAlt != null) {
            return _chessRookAlt!!
        }
        _chessRookAlt = Builder(name = "ChessRookAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                lineTo(19.0f, 8.829f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 21.0f, 6.0f)
                lineTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 6.0f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 5.0f, 8.829f)
                lineTo(5.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                lineTo(5.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
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
