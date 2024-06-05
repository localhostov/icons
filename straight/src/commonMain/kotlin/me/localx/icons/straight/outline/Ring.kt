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

public val Icons.Outline.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveTo(5.582f, 3.0f, 0.457f, 5.597f, 0.0f, 9.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.645f, -5.271f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(5.894f, 0.0f, 10.0f, 2.372f, 10.0f, 4.5f)
                curveToRelative(0.0f, 0.358f, -0.117f, 0.723f, -0.338f, 1.082f)
                curveToRelative(-2.227f, -1.625f, -5.777f, -2.582f, -9.662f, -2.582f)
                reflectiveCurveToRelative(-7.445f, 0.972f, -9.662f, 2.582f)
                curveToRelative(-0.221f, -0.359f, -0.338f, -0.724f, -0.338f, -1.082f)
                curveToRelative(0.0f, -2.128f, 4.106f, -4.5f, 10.0f, -4.5f)
                close()
                moveTo(20.19f, 11.994f)
                curveToRelative(-1.747f, 1.147f, -4.645f, 2.006f, -8.19f, 2.006f)
                reflectiveCurveToRelative(-6.444f, -0.858f, -8.191f, -2.006f)
                curveToRelative(1.886f, -1.232f, 4.942f, -1.994f, 8.191f, -1.994f)
                reflectiveCurveToRelative(6.294f, 0.752f, 8.19f, 1.994f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-5.894f, 0.0f, -10.0f, -2.372f, -10.0f, -4.5f)
                verticalLineToRelative(-1.36f)
                curveToRelative(2.133f, 1.737f, 5.779f, 2.86f, 10.0f, 2.86f)
                reflectiveCurveToRelative(7.867f, -1.123f, 10.0f, -2.86f)
                verticalLineToRelative(1.36f)
                curveToRelative(0.0f, 2.128f, -4.106f, 4.5f, -10.0f, 4.5f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
