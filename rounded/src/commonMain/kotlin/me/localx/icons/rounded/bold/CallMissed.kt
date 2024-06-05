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

public val Icons.Bold.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.354f, 15.381f)
                curveTo(20.185f, 13.212f, 16.437f, 12.0f, 11.993f, 12.0f)
                curveToRelative(-4.382f, 0.02f, -8.25f, 1.283f, -10.347f, 3.381f)
                arcToRelative(5.547f, 5.547f, 0.0f, false, false, -1.644f, 4.0f)
                lineToRelative(0.077f, 1.48f)
                arcTo(3.147f, 3.147f, 0.0f, false, false, 3.222f, 24.0f)
                curveToRelative(0.065f, 0.0f, 2.452f, -0.309f, 2.452f, -0.309f)
                arcTo(3.146f, 3.146f, 0.0f, false, false, 8.7f, 20.731f)
                lineToRelative(0.03f, -0.143f)
                arcTo(9.037f, 9.037f, 0.0f, false, true, 11.992f, 20.0f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, true, 3.281f, 0.6f)
                lineToRelative(0.028f, 0.129f)
                arcToRelative(3.146f, 3.146f, 0.0f, false, false, 3.025f, 2.96f)
                reflectiveCurveTo(20.713f, 24.0f, 20.778f, 24.0f)
                arcToRelative(3.128f, 3.128f, 0.0f, false, false, 3.141f, -3.066f)
                lineTo(24.0f, 19.3f)
                arcTo(5.513f, 5.513f, 0.0f, false, false, 22.354f, 15.381f)
                close()
                moveTo(20.921f, 20.857f)
                arcToRelative(0.141f, 0.141f, 0.0f, false, true, -0.1f, 0.136f)
                lineToRelative(-2.187f, -0.287f)
                curveToRelative(-0.435f, -0.006f, -0.307f, -0.162f, -0.371f, -0.465f)
                lineToRelative(-0.222f, -1.051f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.879f, -1.07f)
                arcTo(13.3f, 13.3f, 0.0f, false, false, 12.008f, 17.0f)
                arcToRelative(12.786f, 12.786f, 0.0f, false, false, -5.195f, 1.131f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.855f, 1.059f)
                lineToRelative(-0.222f, 1.051f)
                curveToRelative(-0.063f, 0.3f, 0.063f, 0.459f, -0.371f, 0.465f)
                lineToRelative(-2.186f, 0.287f)
                curveToRelative(-0.058f, -0.02f, -0.1f, -0.087f, -0.1f, -0.212f)
                lineTo(3.0f, 19.3f)
                arcToRelative(2.534f, 2.534f, 0.0f, false, true, 0.768f, -1.8f)
                curveToRelative(1.5f, -1.5f, 4.738f, -2.486f, 8.239f, -2.5f)
                reflectiveCurveToRelative(6.666f, 0.943f, 8.225f, 2.5f)
                arcTo(2.511f, 2.511f, 0.0f, false, true, 21.0f, 19.225f)
                close()
                moveTo(3.0f, 5.474f)
                lineTo(3.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(8.474f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 1.707f)
                lineTo(8.091f, 2.8f)
                lineTo(12.5f, 6.9f)
                lineToRelative(5.98f, -5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.516f, 3.6f)
                lineTo(14.382f, 9.246f)
                arcTo(2.664f, 2.664f, 0.0f, false, true, 12.5f, 10.0f)
                lineTo(12.5f, 10.0f)
                arcToRelative(2.706f, 2.706f, 0.0f, false, true, -1.921f, -0.8f)
                lineTo(5.968f, 4.919f)
                lineTo(4.707f, 6.181f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.474f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
