package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.GaugeCircleMinus: ImageVector
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.249f, 17.914f)
                curveToRelative(-2.046f, -1.705f, -3.249f, -4.238f, -3.249f, -6.914f)
                curveTo(2.0f, 6.039f, 6.036f, 2.002f, 10.997f, 2.0f)
                curveToRelative(0.002f, 0.0f, 0.004f, 0.001f, 0.005f, 0.001f)
                curveToRelative(4.718f, 0.0f, 8.593f, 3.646f, 8.973f, 8.267f)
                curveToRelative(0.717f, 0.183f, 1.396f, 0.46f, 2.022f, 0.823f)
                curveToRelative(0.002f, -0.028f, 0.016f, -0.051f, 0.016f, -0.079f)
                curveTo(22.013f, 4.941f, 17.073f, 0.001f, 11.002f, 0.001f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                verticalLineToRelative(-0.002f)
                curveTo(4.935f, 0.0f, 0.0f, 4.935f, 0.0f, 11.0f)
                curveToRelative(0.0f, 3.573f, 1.752f, 6.938f, 4.686f, 9.0f)
                lineToRelative(0.613f, 0.43f)
                lineToRelative(3.324f, -2.648f)
                lineToRelative(-1.246f, -1.564f)
                lineToRelative(-2.128f, 1.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                verticalLineToRelative(-5.277f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.277f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _gaugeCircleMinus!!
    }

private var _gaugeCircleMinus: ImageVector? = null
