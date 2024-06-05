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

public val Icons.Bold.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.304f, 11.616f)
                curveToRelative(1.584f, -0.699f, 2.696f, -2.285f, 2.696f, -4.149f)
                curveToRelative(0.0f, -1.496f, -0.596f, -2.917f, -1.681f, -4.002f)
                curveTo(20.073f, 1.219f, 16.261f, -0.023f, 11.872f, 0.0f)
                curveTo(7.615f, 0.045f, 3.806f, 1.34f, 1.681f, 3.465f)
                curveTo(0.596f, 4.55f, 0.0f, 5.971f, 0.0f, 7.5f)
                curveToRelative(0.0f, 1.839f, 1.111f, 3.419f, 2.695f, 4.116f)
                lineToRelative(-1.321f, 2.453f)
                curveToRelative(-0.898f, 1.671f, -1.374f, 3.556f, -1.374f, 5.452f)
                curveToRelative(0.0f, 2.47f, 2.009f, 4.479f, 4.479f, 4.479f)
                horizontalLineToRelative(15.043f)
                curveToRelative(2.47f, 0.0f, 4.479f, -2.009f, 4.479f, -4.479f)
                curveToRelative(0.0f, -1.896f, -0.476f, -3.781f, -1.375f, -5.452f)
                lineToRelative(-1.321f, -2.453f)
                close()
                moveTo(3.802f, 5.586f)
                curveToRelative(1.56f, -1.559f, 4.663f, -2.55f, 8.102f, -2.585f)
                curveToRelative(3.534f, -0.016f, 6.64f, 0.93f, 8.295f, 2.585f)
                curveToRelative(0.518f, 0.518f, 0.803f, 1.185f, 0.802f, 1.914f)
                curveToRelative(0.0f, 0.714f, -0.502f, 1.314f, -1.172f, 1.464f)
                lineToRelative(-1.042f, -1.736f)
                curveToRelative(-0.127f, -0.211f, -0.304f, -0.388f, -0.515f, -0.514f)
                curveToRelative(-0.116f, -0.07f, -2.895f, -1.714f, -6.271f, -1.714f)
                reflectiveCurveToRelative(-6.155f, 1.644f, -6.271f, 1.714f)
                curveToRelative(-0.211f, 0.126f, -0.388f, 0.303f, -0.515f, 0.514f)
                lineToRelative(-1.041f, 1.736f)
                curveToRelative(-0.671f, -0.15f, -1.173f, -0.754f, -1.173f, -1.5f)
                curveToRelative(0.0f, -0.693f, 0.284f, -1.361f, 0.802f, -1.878f)
                close()
                moveTo(19.522f, 21.0f)
                lineTo(4.479f, 21.0f)
                curveToRelative(-0.815f, 0.0f, -1.479f, -0.664f, -1.479f, -1.479f)
                curveToRelative(0.0f, -1.401f, 0.352f, -2.794f, 1.016f, -4.03f)
                lineToRelative(2.283f, -4.241f)
                lineToRelative(1.275f, -2.126f)
                curveToRelative(0.688f, -0.347f, 2.454f, -1.125f, 4.426f, -1.125f)
                reflectiveCurveToRelative(3.74f, 0.78f, 4.426f, 1.125f)
                lineToRelative(1.275f, 2.125f)
                lineToRelative(2.282f, 4.241f)
                curveToRelative(0.665f, 1.235f, 1.017f, 2.628f, 1.017f, 4.03f)
                curveToRelative(0.0f, 0.815f, -0.663f, 1.479f, -1.479f, 1.479f)
                close()
                moveTo(16.001f, 15.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
