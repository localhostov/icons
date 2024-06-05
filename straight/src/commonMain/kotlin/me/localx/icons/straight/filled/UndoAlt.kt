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

public val Icons.Filled.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9f, 7.005f)
                horizontalLineTo(2.793f)
                lineTo(7.1f, 2.7f)
                lineTo(5.682f, 1.288f)
                lineTo(0.732f, 6.237f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.535f)
                lineToRelative(4.95f, 4.951f)
                lineTo(7.1f, 13.309f)
                lineToRelative(-4.3f, -4.3f)
                horizontalLineTo(20.9f)
                arcToRelative(1.034f, 1.034f, 0.0f, false, true, 1.1f, 0.95f)
                verticalLineToRelative(11.1f)
                arcToRelative(1.034f, 1.034f, 0.0f, false, true, -1.1f, 0.949f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(20.9f)
                arcTo(3.031f, 3.031f, 0.0f, false, false, 24.0f, 21.056f)
                verticalLineTo(9.955f)
                arcTo(3.031f, 3.031f, 0.0f, false, false, 20.9f, 7.005f)
                close()
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
