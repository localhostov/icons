package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.MeterFire: ImageVector
    get() {
        if (_meterFire != null) {
            return _meterFire!!
        }
        _meterFire = Builder(name = "MeterFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.957f, 22.556f)
                curveToRelative(-0.167f, 0.686f, -0.78f, 1.145f, -1.456f, 1.145f)
                curveToRelative(-0.117f, 0.0f, -0.237f, -0.014f, -0.356f, -0.043f)
                curveTo(3.76f, 22.343f, 0.0f, 17.549f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.077f, 0.0f, 9.625f, 3.215f, 11.316f, 8.0f)
                curveToRelative(0.276f, 0.781f, -0.133f, 1.639f, -0.914f, 1.914f)
                curveToRelative(-0.78f, 0.276f, -1.638f, -0.134f, -1.914f, -0.914f)
                curveToRelative(-1.269f, -3.589f, -4.68f, -6.0f, -8.488f, -6.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                curveToRelative(0.0f, 4.162f, 2.819f, 7.758f, 6.855f, 8.743f)
                curveToRelative(0.805f, 0.196f, 1.298f, 1.008f, 1.102f, 1.812f)
                close()
                moveTo(6.0f, 8.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 8.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 17.974f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 3.208f, -2.507f, 5.831f, -5.669f, 6.016f)
                curveToRelative(-2.642f, 0.155f, -4.939f, -1.57f, -5.956f, -4.014f)
                curveToRelative(-0.95f, -2.283f, 0.052f, -4.425f, 1.125f, -5.752f)
                curveToRelative(0.28f, -0.346f, 0.827f, -0.283f, 1.007f, 0.123f)
                curveToRelative(0.254f, 0.575f, 0.17f, 1.505f, 0.708f, 1.505f)
                curveToRelative(1.137f, 0.0f, 0.876f, -3.27f, 2.145f, -5.416f)
                curveToRelative(0.225f, -0.381f, 0.748f, -0.455f, 1.078f, -0.161f)
                curveToRelative(2.05f, 1.829f, 5.562f, 4.532f, 5.562f, 7.699f)
                close()
                moveTo(19.345f, 18.453f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.894f, -0.894f)
                curveToRelative(-0.249f, -0.249f, -0.652f, -0.249f, -0.901f, 0.0f)
                lineToRelative(-0.894f, 0.894f)
                curveToRelative(-0.763f, 0.763f, -0.899f, 2.015f, -0.197f, 2.835f)
                curveToRelative(0.813f, 0.948f, 2.271f, 0.948f, 3.083f, 0.0f)
                curveToRelative(0.703f, -0.819f, 0.566f, -2.072f, -0.197f, -2.835f)
                close()
            }
        }
        .build()
        return _meterFire!!
    }

private var _meterFire: ImageVector? = null
