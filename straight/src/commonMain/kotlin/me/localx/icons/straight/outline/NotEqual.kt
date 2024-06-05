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

public val Icons.Outline.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.462f, 9.0f)
                lineToRelative(-2.727f, 6.0f)
                horizontalLineToRelative(12.265f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-13.174f)
                lineToRelative(-3.165f, 6.964f)
                lineToRelative(-1.82f, -0.828f)
                lineToRelative(2.789f, -6.136f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.538f)
                lineToRelative(2.727f, -6.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.174f)
                lineTo(16.34f, 0.036f)
                lineToRelative(1.82f, 0.828f)
                lineToRelative(-2.789f, 6.136f)
                horizontalLineToRelative(8.629f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.538f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
