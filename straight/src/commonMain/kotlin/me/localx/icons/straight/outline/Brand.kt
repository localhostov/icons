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

public val Icons.Outline.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.245f, 13.203f)
                lineTo(12.414f, 2.451f)
                lineToRelative(-7.671f, 0.875f)
                lineTo(1.452f, 0.035f)
                lineTo(0.038f, 1.449f)
                lineToRelative(3.325f, 3.325f)
                lineToRelative(-0.911f, 7.842f)
                lineToRelative(10.686f, 10.584f)
                curveToRelative(0.535f, 0.533f, 1.236f, 0.8f, 1.94f, 0.8f)
                curveToRelative(0.713f, 0.0f, 1.427f, -0.272f, 1.973f, -0.819f)
                lineToRelative(6.221f, -6.359f)
                curveToRelative(0.982f, -1.003f, 0.972f, -2.626f, -0.025f, -3.618f)
                close()
                moveTo(21.841f, 15.423f)
                lineToRelative(-6.214f, 6.352f)
                curveToRelative(-0.294f, 0.296f, -0.788f, 0.3f, -1.08f, 0.007f)
                lineTo(4.551f, 11.88f)
                lineToRelative(0.615f, -5.302f)
                lineToRelative(1.909f, 1.91f)
                curveToRelative(-0.044f, 0.164f, -0.074f, 0.333f, -0.074f, 0.511f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.178f, 0.0f, -0.348f, 0.031f, -0.512f, 0.075f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(5.138f, -0.586f)
                lineToRelative(10.148f, 10.075f)
                curveToRelative(0.22f, 0.219f, 0.223f, 0.578f, 0.005f, 0.801f)
                close()
                moveTo(11.087f, 15.499f)
                lineToRelative(3.914f, 3.914f)
                lineToRelative(4.414f, -4.414f)
                lineToRelative(-3.914f, -3.914f)
                lineToRelative(-4.414f, 4.414f)
                close()
                moveTo(15.001f, 16.585f)
                lineToRelative(-1.086f, -1.086f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(1.086f, 1.086f)
                lineToRelative(-1.586f, 1.586f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
