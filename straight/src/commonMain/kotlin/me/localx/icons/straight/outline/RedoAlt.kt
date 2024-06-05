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

public val Icons.Outline.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.318f, 14.718f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.9f, 2.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(3.1f)
                arcTo(3.031f, 3.031f, 0.0f, false, false, 0.0f, 9.95f)
                verticalLineToRelative(11.1f)
                arcTo(3.031f, 3.031f, 0.0f, false, false, 3.1f, 24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.1f)
                arcTo(1.034f, 1.034f, 0.0f, false, true, 2.0f, 21.05f)
                verticalLineTo(9.95f)
                arcTo(1.034f, 1.034f, 0.0f, false, true, 3.1f, 9.0f)
                horizontalLineTo(21.207f)
                lineToRelative(-4.3f, 4.3f)
                close()
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
