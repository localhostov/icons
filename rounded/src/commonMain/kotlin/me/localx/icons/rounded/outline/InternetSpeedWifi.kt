package me.localx.icons.rounded.outline

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

public val Icons.Outline.InternetSpeedWifi: ImageVector
    get() {
        if (_internetSpeedWifi != null) {
            return _internetSpeedWifi!!
        }
        _internetSpeedWifi = Builder(name = "InternetSpeedWifi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                curveToRelative(-3.883f, 0.0f, -7.625f, 1.634f, -10.268f, 4.482f)
                curveToRelative(-0.197f, 0.212f, -0.465f, 0.32f, -0.733f, 0.32f)
                curveToRelative(-0.244f, 0.0f, -0.488f, -0.088f, -0.68f, -0.267f)
                curveToRelative(-0.405f, -0.375f, -0.429f, -1.008f, -0.053f, -1.413f)
                curveTo(3.286f, 4.867f, 7.562f, 3.0f, 12.0f, 3.0f)
                curveToRelative(2.813f, 0.0f, 5.58f, 0.74f, 8.001f, 2.141f)
                curveToRelative(0.478f, 0.277f, 0.642f, 0.889f, 0.364f, 1.367f)
                curveToRelative(-0.275f, 0.478f, -0.887f, 0.641f, -1.366f, 0.365f)
                curveToRelative(-2.117f, -1.225f, -4.537f, -1.873f, -6.999f, -1.873f)
                close()
                moveTo(13.756f, 12.216f)
                curveToRelative(0.533f, 0.133f, 1.079f, -0.189f, 1.214f, -0.726f)
                curveToRelative(0.135f, -0.536f, -0.189f, -1.079f, -0.726f, -1.214f)
                curveToRelative(-0.729f, -0.184f, -1.484f, -0.277f, -2.244f, -0.277f)
                curveToRelative(-2.543f, 0.0f, -4.994f, 1.07f, -6.724f, 2.935f)
                curveToRelative(-0.376f, 0.405f, -0.352f, 1.038f, 0.053f, 1.413f)
                curveToRelative(0.192f, 0.179f, 0.437f, 0.267f, 0.68f, 0.267f)
                curveToRelative(0.268f, 0.0f, 0.536f, -0.107f, 0.733f, -0.32f)
                curveToRelative(1.758f, -1.896f, 4.539f, -2.703f, 7.014f, -2.079f)
                close()
                moveTo(23.707f, 7.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-9.781f, 9.781f)
                curveToRelative(-0.164f, -0.044f, -0.334f, -0.074f, -0.512f, -0.074f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.178f, -0.031f, -0.347f, -0.074f, -0.512f)
                lineToRelative(9.781f, -9.781f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _internetSpeedWifi!!
    }

private var _internetSpeedWifi: ImageVector? = null
