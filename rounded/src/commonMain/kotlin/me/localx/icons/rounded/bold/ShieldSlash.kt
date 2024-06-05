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

public val Icons.Bold.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.479f, 20.778f)
                curveToRelative(0.398f, 0.727f, 0.133f, 1.639f, -0.593f, 2.037f)
                curveToRelative(-0.802f, 0.439f, -1.492f, 0.741f, -1.929f, 0.917f)
                curveToRelative(0.0f, 0.0f, -0.519f, 0.268f, -0.954f, 0.268f)
                reflectiveCurveToRelative(-1.052f, -0.35f, -1.052f, -0.35f)
                curveToRelative(-2.099f, -1.049f, -8.951f, -4.979f, -8.951f, -11.499f)
                verticalLineToRelative(-1.651f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.651f)
                curveToRelative(0.0f, 4.606f, 5.143f, 7.705f, 7.068f, 8.702f)
                curveToRelative(0.354f, -0.15f, 0.832f, -0.371f, 1.374f, -0.669f)
                curveToRelative(0.728f, -0.397f, 1.638f, -0.132f, 2.037f, 0.594f)
                close()
                moveTo(23.561f, 23.56f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(2.052f, 2.052f)
                curveToRelative(0.317f, -0.185f, 0.653f, -0.339f, 1.003f, -0.455f)
                lineTo(11.528f, 0.076f)
                curveToRelative(0.307f, -0.102f, 0.638f, -0.102f, 0.944f, 0.0f)
                lineToRelative(5.911f, 1.96f)
                curveToRelative(2.163f, 0.718f, 3.617f, 2.731f, 3.617f, 5.01f)
                verticalLineToRelative(5.105f)
                curveToRelative(0.0f, 2.152f, -0.599f, 4.147f, -1.783f, 5.944f)
                lineToRelative(3.344f, 3.344f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(6.894f, 4.773f)
                lineToRelative(11.138f, 11.138f)
                curveToRelative(0.642f, -1.16f, 0.967f, -2.42f, 0.967f, -3.76f)
                verticalLineToRelative(-5.105f)
                curveToRelative(0.0f, -0.983f, -0.627f, -1.853f, -1.561f, -2.162f)
                lineToRelative(-5.439f, -1.804f)
                lineToRelative(-5.106f, 1.693f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
