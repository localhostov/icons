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

public val Icons.Bold.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.2f)
                curveToRelative(0.0f, -1.215f, 0.895f, -2.2f, 2.0f, -2.2f)
                reflectiveCurveToRelative(2.0f, 0.985f, 2.0f, 2.2f)
                curveToRelative(0.0f, -1.215f, 0.895f, -2.2f, 2.0f, -2.2f)
                reflectiveCurveToRelative(2.0f, 0.985f, 2.0f, 2.2f)
                curveToRelative(0.0f, 1.73f, -2.256f, 3.68f, -3.38f, 4.582f)
                curveToRelative(-0.362f, 0.29f, -0.879f, 0.29f, -1.24f, 0.0f)
                curveToRelative(-1.123f, -0.902f, -3.38f, -2.852f, -3.38f, -4.582f)
                close()
                moveTo(17.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                lineTo(16.0f, 9.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                lineTo(11.0f, 9.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.155f)
                curveToRelative(-1.517f, 0.0f, -2.98f, -0.635f, -4.016f, -1.742f)
                lineToRelative(-0.45f, -0.481f)
                curveToRelative(0.058f, -0.021f, 0.115f, -0.042f, 0.173f, -0.066f)
                curveToRelative(1.184f, -0.491f, 1.948f, -1.635f, 1.948f, -2.917f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                lineTo(6.0f, 15.794f)
                curveToRelative(0.0f, 0.039f, 0.0f, 0.104f, -0.097f, 0.145f)
                curveToRelative(-0.101f, 0.041f, -0.144f, -0.006f, -0.167f, -0.029f)
                lineToRelative(-2.343f, -2.363f)
                curveToRelative(-0.067f, -0.067f, -0.141f, -0.128f, -0.219f, -0.182f)
                curveToRelative(-0.699f, -0.478f, -1.815f, -0.556f, -2.596f, 0.225f)
                curveToRelative(-0.799f, 0.799f, -0.687f, 1.937f, -0.164f, 2.646f)
                curveToRelative(0.035f, 0.047f, 0.072f, 0.092f, 0.111f, 0.134f)
                lineToRelative(4.61f, 4.937f)
                curveToRelative(1.602f, 1.711f, 3.864f, 2.693f, 6.208f, 2.693f)
                horizontalLineToRelative(6.155f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                lineTo(23.998f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
