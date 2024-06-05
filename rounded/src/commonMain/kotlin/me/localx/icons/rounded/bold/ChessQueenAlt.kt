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

public val Icons.Bold.ChessQueenAlt: ImageVector
    get() {
        if (_chessQueenAlt != null) {
            return _chessQueenAlt!!
        }
        _chessQueenAlt = Builder(name = "ChessQueenAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-0.756f)
                arcTo(59.282f, 59.282f, 0.0f, false, true, 16.581f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 6.0f)
                horizontalLineToRelative(-0.454f)
                lineToRelative(1.848f, -3.188f)
                arcToRelative(1.131f, 1.131f, 0.0f, false, false, -1.71f, -1.37f)
                lineTo(14.4f, 2.4f)
                lineTo(12.859f, 0.362f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -1.718f, 0.0f)
                lineTo(9.6f, 2.4f)
                lineTo(7.816f, 1.442f)
                arcToRelative(1.131f, 1.131f, 0.0f, false, false, -1.71f, 1.37f)
                lineTo(7.954f, 6.0f)
                horizontalLineTo(7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.081f, 3.0f)
                arcTo(59.282f, 59.282f, 0.0f, false, true, 4.756f, 20.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(10.43f, 9.0f)
                horizontalLineToRelative(3.14f)
                arcToRelative(56.837f, 56.837f, 0.0f, false, false, 2.515f, 11.0f)
                horizontalLineTo(7.915f)
                arcTo(56.837f, 56.837f, 0.0f, false, false, 10.43f, 9.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
