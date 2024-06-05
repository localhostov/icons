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

public val Icons.Bold.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.756f, 19.007f)
                lineToRelative(-0.181f, 0.502f)
                curveToRelative(-0.477f, 1.192f, -1.414f, 2.044f, -2.593f, 2.391f)
                lineToRelative(-6.813f, 1.999f)
                curveToRelative(-0.229f, 0.067f, -0.464f, 0.1f, -0.696f, 0.1f)
                curveToRelative(-0.646f, 0.0f, -1.277f, -0.253f, -1.747f, -0.724f)
                curveToRelative(-0.64f, -0.64f, -0.879f, -1.577f, -0.624f, -2.445f)
                lineToRelative(1.998f, -6.812f)
                curveToRelative(0.346f, -1.179f, 1.198f, -2.118f, 2.34f, -2.575f)
                lineToRelative(0.587f, -0.198f)
                curveToRelative(0.786f, -0.262f, 1.635f, 0.164f, 1.896f, 0.949f)
                curveToRelative(0.262f, 0.786f, -0.163f, 1.636f, -0.949f, 1.897f)
                lineToRelative(-0.503f, 0.167f)
                curveToRelative(-0.197f, 0.082f, -0.407f, 0.312f, -0.492f, 0.603f)
                lineToRelative(-1.145f, 3.904f)
                lineToRelative(2.458f, -2.471f)
                curveToRelative(0.39f, -0.392f, 1.022f, -0.393f, 1.414f, -0.004f)
                reflectiveCurveToRelative(0.394f, 1.022f, 0.004f, 1.414f)
                lineToRelative(-2.437f, 2.45f)
                lineToRelative(3.866f, -1.134f)
                curveToRelative(0.29f, -0.085f, 0.521f, -0.295f, 0.634f, -0.577f)
                lineToRelative(0.162f, -0.452f)
                curveToRelative(0.28f, -0.78f, 1.14f, -1.183f, 1.919f, -0.904f)
                curveToRelative(0.779f, 0.28f, 1.184f, 1.14f, 0.903f, 1.919f)
                close()
                moveTo(23.561f, 21.439f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(7.593f, 7.593f)
                lineToRelative(6.873f, -6.839f)
                curveToRelative(1.592f, -1.591f, 4.184f, -1.589f, 5.775f, 0.003f)
                curveToRelative(0.772f, 0.771f, 1.197f, 1.798f, 1.197f, 2.889f)
                reflectiveCurveToRelative(-0.425f, 2.118f, -1.197f, 2.89f)
                lineToRelative(-6.87f, 6.836f)
                lineToRelative(7.628f, 7.628f)
                close()
                moveTo(13.812f, 11.69f)
                lineToRelative(6.873f, -6.839f)
                curveToRelative(0.203f, -0.203f, 0.315f, -0.475f, 0.315f, -0.765f)
                reflectiveCurveToRelative(-0.113f, -0.562f, -0.318f, -0.768f)
                curveToRelative(-0.423f, -0.423f, -1.111f, -0.425f, -1.536f, 0.0f)
                lineToRelative(-6.87f, 6.836f)
                lineToRelative(1.536f, 1.536f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null
