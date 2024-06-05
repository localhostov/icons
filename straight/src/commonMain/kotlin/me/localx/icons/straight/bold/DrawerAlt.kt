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

public val Icons.Bold.DrawerAlt: ImageVector
    get() {
        if (_drawerAlt != null) {
            return _drawerAlt!!
        }
        _drawerAlt = Builder(name = "DrawerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.956f, 8.709f)
                lineToRelative(1.387f, -1.639f)
                curveToRelative(0.195f, -0.204f, 0.365f, -0.427f, 0.513f, -0.661f)
                lineToRelative(2.145f, 0.848f)
                verticalLineToRelative(3.088f)
                lineToRelative(-4.044f, -1.637f)
                close()
                moveTo(23.995f, 17.993f)
                lineToRelative(-1.365f, 0.005f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.961f, 0.0f, -1.919f, -0.117f, -2.852f, -0.348f)
                lineToRelative(-0.891f, -0.221f)
                curveToRelative(-1.169f, -0.289f, -2.378f, -0.399f, -3.577f, -0.434f)
                lineToRelative(-4.299f, 0.004f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.451f)
                lineToRelative(5.311f, -6.275f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                reflectiveCurveToRelative(-2.234f, -0.852f, -3.086f, 0.0f)
                lineTo(3.0f, 18.914f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(3.086f)
                lineToRelative(2.455f, -2.901f)
                curveToRelative(0.719f, 0.561f, 1.626f, 0.901f, 2.596f, 0.901f)
                horizontalLineToRelative(0.007f)
                lineToRelative(4.159f, -0.005f)
                horizontalLineToRelative(0.011f)
                curveToRelative(0.961f, 0.0f, 1.919f, 0.117f, 2.852f, 0.348f)
                lineToRelative(0.876f, 0.217f)
                curveToRelative(1.172f, 0.291f, 2.375f, 0.438f, 3.582f, 0.438f)
                horizontalLineToRelative(0.014f)
                lineToRelative(1.369f, -0.005f)
                lineToRelative(-0.011f, -3.0f)
                close()
                moveTo(5.53f, 7.502f)
                lineToRelative(-0.03f, -0.002f)
                lineTo(0.513f, 13.618f)
                curveToRelative(-0.75f, 0.937f, -0.669f, 2.289f, 0.186f, 3.131f)
                curveToRelative(0.296f, 0.292f, 0.652f, 0.476f, 1.024f, 0.578f)
                lineTo(12.775f, 4.27f)
                lineToRelative(-7.245f, 3.232f)
                close()
            }
        }
        .build()
        return _drawerAlt!!
    }

private var _drawerAlt: ImageVector? = null
