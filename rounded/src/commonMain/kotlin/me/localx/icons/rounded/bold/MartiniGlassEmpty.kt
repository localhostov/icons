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

public val Icons.Bold.MartiniGlassEmpty: ImageVector
    get() {
        if (_martiniGlassEmpty != null) {
            return _martiniGlassEmpty!!
        }
        _martiniGlassEmpty = Builder(name = "MartiniGlassEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.754f, 2.278f)
                curveToRelative(-0.542f, -1.384f, -1.842f, -2.278f, -3.312f, -2.278f)
                lineTo(3.558f, 0.0f)
                curveTo(2.088f, 0.0f, 0.788f, 0.895f, 0.246f, 2.278f)
                curveToRelative(-0.521f, 1.33f, -0.19f, 2.807f, 0.873f, 3.789f)
                lineToRelative(7.782f, 7.189f)
                curveToRelative(0.479f, 0.435f, 1.024f, 0.752f, 1.6f, 0.951f)
                verticalLineToRelative(6.792f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.794f)
                curveToRelative(0.578f, -0.2f, 1.126f, -0.52f, 1.609f, -0.958f)
                lineToRelative(7.802f, -7.207f)
                curveToRelative(1.033f, -0.956f, 1.364f, -2.433f, 0.843f, -3.763f)
                close()
                moveTo(20.845f, 3.864f)
                lineToRelative(-7.763f, 7.172f)
                curveToRelative(-0.617f, 0.561f, -1.547f, 0.561f, -2.155f, 0.009f)
                lineTo(3.126f, 3.838f)
                curveToRelative(-0.049f, -0.045f, -0.198f, -0.183f, -0.087f, -0.466f)
                curveToRelative(0.034f, -0.087f, 0.173f, -0.372f, 0.519f, -0.372f)
                horizontalLineToRelative(16.884f)
                curveToRelative(0.346f, 0.0f, 0.485f, 0.285f, 0.519f, 0.372f)
                curveToRelative(0.111f, 0.283f, -0.038f, 0.421f, -0.116f, 0.492f)
                close()
            }
        }
        .build()
        return _martiniGlassEmpty!!
    }

private var _martiniGlassEmpty: ImageVector? = null
