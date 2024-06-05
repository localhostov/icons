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

public val Icons.Bold.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(17.0f)
                lineToRelative(2.439f, 2.439f)
                lineTo(16.905f, 4.974f)
                arcToRelative(6.445f, 6.445f, 0.0f, false, false, -6.9f, 0.054f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 5.0f, 16.818f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.819f)
                arcToRelative(6.435f, 6.435f, 0.0f, false, false, 2.006f, -0.847f)
                arcTo(6.487f, 6.487f, 0.0f, false, false, 19.026f, 7.1f)
                lineToRelative(2.535f, -2.534f)
                close()
                moveTo(3.0f, 10.5f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 7.862f, 7.279f)
                arcToRelative(6.449f, 6.449f, 0.0f, false, false, 0.0f, 6.442f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 3.0f, 10.5f)
                close()
                moveTo(13.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 17.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 14.0f)
                close()
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null
