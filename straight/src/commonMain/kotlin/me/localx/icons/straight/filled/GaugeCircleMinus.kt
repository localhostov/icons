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

public val Icons.Filled.GaugeCircleMinus: ImageVector
    get() {
        if (_gaugeCircleMinus != null) {
            return _gaugeCircleMinus!!
        }
        _gaugeCircleMinus = Builder(name = "GaugeCircleMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.997f, 12.724f)
                curveToRelative(-1.239f, 1.409f, -1.997f, 3.252f, -1.997f, 5.276f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.705f, 2.5f)
                lineToRelative(-0.588f, -0.413f)
                curveTo(1.76f, 18.016f, 0.0f, 14.637f, 0.0f, 11.048f)
                curveTo(0.0f, 4.956f, 4.956f, 0.0f, 11.048f, 0.0f)
                reflectiveCurveToRelative(11.048f, 4.956f, 11.048f, 11.048f)
                curveToRelative(0.0f, 0.029f, -0.005f, 0.057f, -0.005f, 0.086f)
                curveToRelative(-1.198f, -0.715f, -2.594f, -1.134f, -4.091f, -1.134f)
                curveToRelative(-2.024f, 0.0f, -3.867f, 0.757f, -5.276f, 1.997f)
                curveToRelative(0.171f, -0.294f, 0.276f, -0.632f, 0.276f, -0.997f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.277f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.365f, 0.0f, 0.702f, -0.105f, 0.997f, -0.276f)
                close()
            }
        }
        .build()
        return _gaugeCircleMinus!!
    }

private var _gaugeCircleMinus: ImageVector? = null
