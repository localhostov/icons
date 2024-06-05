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

public val Icons.Filled.CustomerCare: ImageVector
    get() {
        if (_customerCare != null) {
            return _customerCare!!
        }
        _customerCare = Builder(name = "CustomerCare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                curveTo(2.0f, 0.895f, 2.895f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveTo(15.105f, 0.0f, 14.0f, 0.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 7.5f)
                curveToRelative(0.0f, -0.98f, 0.407f, -1.864f, 1.058f, -2.5f)
                horizontalLineToRelative(-2.558f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(15.5f, 5.0f)
                horizontalLineToRelative(-2.558f)
                curveToRelative(0.651f, 0.636f, 1.058f, 1.52f, 1.058f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.148f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(1.084f, -0.155f, 1.9f, -1.097f, 1.9f, -2.191f)
                curveToRelative(0.0f, -1.22f, -0.993f, -2.213f, -2.213f, -2.213f)
                lineTo(3.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(9.664f)
                lineToRelative(10.674f, -11.655f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _customerCare!!
    }

private var _customerCare: ImageVector? = null
