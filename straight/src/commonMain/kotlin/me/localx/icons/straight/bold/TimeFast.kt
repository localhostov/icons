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

public val Icons.Bold.TimeFast: ImageVector
    get() {
        if (_timeFast != null) {
            return _timeFast!!
        }
        _timeFast = Builder(name = "TimeFast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 24.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(6.621f)
                lineToRelative(3.439f, 3.44f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-2.561f, -2.56f)
                verticalLineToRelative(-5.379f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.006f, 12.006f, 0.0f, false, false, -11.6f, 9.0f)
                horizontalLineToRelative(3.13f)
                arcToRelative(8.995f, 8.995f, 0.0f, true, true, 8.47f, 12.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _timeFast!!
    }

private var _timeFast: ImageVector? = null
