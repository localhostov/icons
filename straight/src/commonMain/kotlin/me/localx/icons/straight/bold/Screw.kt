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

public val Icons.Bold.Screw: ImageVector
    get() {
        if (_screw != null) {
            return _screw!!
        }
        _screw = Builder(name = "Screw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 1.997f)
                verticalLineToRelative(14.977f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineTo(16.0f, 5.022f)
                lineToRelative(2.0f, -2.022f)
                lineTo(18.0f, 0.0f)
                close()
                moveTo(13.0f, 12.233f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.819f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.819f)
                close()
                moveTo(13.0f, 6.586f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-3.576f)
                lineToRelative(2.0f, 0.006f)
                verticalLineToRelative(1.57f)
                close()
                moveTo(12.0f, 19.732f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.671f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(3.671f)
                lineToRelative(-1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _screw!!
    }

private var _screw: ImageVector? = null
