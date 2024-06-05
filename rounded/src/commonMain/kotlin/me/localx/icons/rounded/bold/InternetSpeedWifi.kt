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

public val Icons.Bold.InternetSpeedWifi: ImageVector
    get() {
        if (_internetSpeedWifi != null) {
            return _internetSpeedWifi!!
        }
        _internetSpeedWifi = Builder(name = "InternetSpeedWifi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.757f, 14.757f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(1.834f, -1.835f, 4.377f, -2.792f, 6.963f, -2.616f)
                curveToRelative(0.827f, 0.055f, 1.453f, 0.77f, 1.398f, 1.596f)
                curveToRelative(-0.055f, 0.827f, -0.771f, 1.452f, -1.596f, 1.397f)
                curveToRelative(-1.727f, -0.112f, -3.42f, 0.521f, -4.644f, 1.744f)
                close()
                moveTo(17.38f, 7.161f)
                curveToRelative(0.755f, 0.344f, 1.644f, 0.008f, 1.985f, -0.746f)
                curveToRelative(0.343f, -0.754f, 0.01f, -1.643f, -0.745f, -1.986f)
                curveTo(12.584f, 1.688f, 5.376f, 2.997f, 0.687f, 7.687f)
                lineToRelative(-0.272f, 0.278f)
                curveToRelative(-0.572f, 0.6f, -0.549f, 1.549f, 0.05f, 2.121f)
                curveToRelative(0.291f, 0.277f, 0.664f, 0.415f, 1.036f, 0.415f)
                curveToRelative(0.396f, 0.0f, 0.791f, -0.156f, 1.085f, -0.464f)
                lineToRelative(0.222f, -0.228f)
                curveToRelative(3.811f, -3.812f, 9.668f, -4.874f, 14.572f, -2.646f)
                close()
                moveTo(23.561f, 7.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-8.672f, 8.672f)
                curveToRelative(-0.246f, -0.065f, -0.5f, -0.112f, -0.767f, -0.112f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.267f, -0.046f, -0.521f, -0.112f, -0.767f)
                lineToRelative(8.672f, -8.672f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
            }
        }
        .build()
        return _internetSpeedWifi!!
    }

private var _internetSpeedWifi: ImageVector? = null
