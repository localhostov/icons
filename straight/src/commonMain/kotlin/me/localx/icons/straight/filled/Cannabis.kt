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

public val Icons.Filled.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = Builder(name = "Cannabis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                reflectiveCurveToRelative(-2.879f, 1.269f, -7.0f, 1.599f)
                curveToRelative(0.9f, 1.803f, 1.0f, 3.401f, 1.0f, 3.401f)
                curveToRelative(0.0f, 0.0f, -2.856f, -0.185f, -5.0f, -1.974f)
                verticalLineToRelative(-6.026f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.999f)
                curveToRelative(-2.142f, 1.813f, -5.0f, 2.001f, -5.0f, 2.001f)
                curveToRelative(0.0f, 0.0f, 0.045f, -1.674f, 1.0f, -3.528f)
                curveToRelative(-4.158f, -0.312f, -7.0f, -1.472f, -7.0f, -1.472f)
                curveToRelative(0.0f, 0.0f, 2.223f, -1.708f, 5.176f, -2.372f)
                curveTo(1.577f, 11.512f, 0.0f, 7.0f, 0.0f, 7.0f)
                curveToRelative(0.0f, 0.0f, 4.381f, 0.278f, 8.768f, 2.489f)
                curveToRelative(0.85f, -5.148f, 3.232f, -9.489f, 3.232f, -9.489f)
                curveToRelative(0.0f, 0.0f, 2.434f, 4.441f, 3.257f, 9.665f)
                curveToRelative(4.36f, -2.286f, 8.743f, -2.665f, 8.743f, -2.665f)
                curveToRelative(0.0f, 0.0f, -1.658f, 4.582f, -5.287f, 7.746f)
                curveToRelative(2.99f, 0.659f, 5.287f, 2.254f, 5.287f, 2.254f)
                close()
                moveTo(11.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
