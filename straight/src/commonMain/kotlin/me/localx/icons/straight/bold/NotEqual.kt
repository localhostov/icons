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

public val Icons.Bold.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.011f, 9.0f)
                lineToRelative(-2.727f, 6.0f)
                horizontalLineToRelative(11.716f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-13.08f)
                lineToRelative(-2.714f, 5.971f)
                lineToRelative(-2.73f, -1.242f)
                lineToRelative(2.149f, -4.729f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.989f)
                lineToRelative(2.727f, -6.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.08f)
                lineTo(15.794f, 0.029f)
                lineToRelative(2.73f, 1.242f)
                lineToRelative(-2.149f, 4.729f)
                horizontalLineToRelative(7.625f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.989f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
