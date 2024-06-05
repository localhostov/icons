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

public val Icons.Bold.RampLoading: ImageVector
    get() {
        if (_rampLoading != null) {
            return _rampLoading!!
        }
        _rampLoading = Builder(name = "RampLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.697f, 24.0f)
                lineTo(5.244f, 24.0f)
                curveToRelative(-1.152f, 0.0f, -2.202f, -0.585f, -2.808f, -1.565f)
                curveToRelative(-0.605f, -0.98f, -0.66f, -2.18f, -0.145f, -3.21f)
                lineToRelative(2.451f, -4.902f)
                curveToRelative(0.716f, -1.432f, 2.155f, -2.322f, 3.757f, -2.322f)
                horizontalLineToRelative(6.941f)
                curveToRelative(1.602f, 0.0f, 3.041f, 0.89f, 3.757f, 2.322f)
                lineToRelative(2.451f, 4.902f)
                curveToRelative(0.516f, 1.03f, 0.461f, 2.23f, -0.145f, 3.21f)
                curveToRelative(-0.605f, 0.98f, -1.655f, 1.565f, -2.808f, 1.565f)
                close()
                moveTo(8.5f, 15.0f)
                curveToRelative(-0.458f, 0.0f, -0.869f, 0.254f, -1.073f, 0.663f)
                lineToRelative(-2.451f, 4.903f)
                curveToRelative(-0.062f, 0.124f, -0.027f, 0.227f, 0.013f, 0.292f)
                curveToRelative(0.04f, 0.065f, 0.117f, 0.143f, 0.256f, 0.143f)
                horizontalLineToRelative(13.453f)
                curveToRelative(0.139f, 0.0f, 0.216f, -0.078f, 0.256f, -0.143f)
                curveToRelative(0.04f, -0.064f, 0.075f, -0.168f, 0.013f, -0.292f)
                lineToRelative(-2.451f, -4.902f)
                curveToRelative(-0.204f, -0.41f, -0.615f, -0.664f, -1.073f, -0.664f)
                horizontalLineToRelative(-6.941f)
                close()
                moveTo(22.0f, 10.5f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 0.0f)
                curveTo(4.468f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _rampLoading!!
    }

private var _rampLoading: ImageVector? = null
