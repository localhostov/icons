package me.localx.icons.rounded.filled

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
                moveTo(22.535f, 8.46f)
                arcTo(4.965f, 4.965f, 0.0f, false, false, 19.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                lineTo(2.8f, 7.0f)
                lineTo(7.1f, 2.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.682f, 1.288f)
                lineTo(0.732f, 6.237f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.535f)
                lineToRelative(4.95f, 4.951f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.1f, 13.309f)
                lineTo(2.788f, 9.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(12.0f)
                arcTo(4.969f, 4.969f, 0.0f, false, false, 22.535f, 8.46f)
                close()
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
