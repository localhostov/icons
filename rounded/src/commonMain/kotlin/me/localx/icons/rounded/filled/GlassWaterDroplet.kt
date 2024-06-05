package me.localx.icons.rounded.filled

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

public val Icons.Filled.GlassWaterDroplet: ImageVector
    get() {
        if (_glassWaterDroplet != null) {
            return _glassWaterDroplet!!
        }
        _glassWaterDroplet = Builder(name = "GlassWaterDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.72f, 17.248f)
                lineToRelative(-0.193f, 2.19f)
                curveToRelative(-0.228f, 2.601f, -2.369f, 4.562f, -4.98f, 4.562f)
                lineTo(7.284f, 24.0f)
                curveToRelative(-2.583f, 0.0f, -4.771f, -2.016f, -4.983f, -4.59f)
                lineToRelative(-0.187f, -2.276f)
                curveToRelative(0.82f, 0.536f, 1.838f, 0.866f, 2.886f, 0.866f)
                curveToRelative(1.327f, 0.0f, 2.617f, -0.517f, 3.5f, -1.328f)
                curveToRelative(0.883f, 0.812f, 2.173f, 1.328f, 3.5f, 1.328f)
                reflectiveCurveToRelative(2.617f, -0.517f, 3.5f, -1.328f)
                curveToRelative(0.883f, 0.812f, 2.173f, 1.328f, 3.5f, 1.328f)
                curveToRelative(0.976f, 0.0f, 1.932f, -0.28f, 2.72f, -0.752f)
                close()
                moveTo(12.0f, 6.016f)
                curveToRelative(-0.044f, 0.0f, -0.081f, 0.018f, -0.111f, 0.053f)
                curveToRelative(-1.289f, 1.484f, -1.389f, 2.236f, -1.389f, 2.432f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.195f, -0.1f, -0.948f, -1.389f, -2.432f)
                curveToRelative(-0.03f, -0.035f, -0.067f, -0.052f, -0.111f, -0.052f)
                close()
                moveTo(22.95f, 3.263f)
                lineToRelative(-0.958f, 10.898f)
                reflectiveCurveToRelative(-0.992f, 1.839f, -2.992f, 1.839f)
                curveToRelative(-1.125f, 0.0f, -2.256f, -0.606f, -2.576f, -1.381f)
                curveToRelative(-0.154f, -0.375f, -0.52f, -0.619f, -0.924f, -0.619f)
                reflectiveCurveToRelative(-0.77f, 0.244f, -0.924f, 0.619f)
                curveToRelative(-0.319f, 0.774f, -1.451f, 1.381f, -2.576f, 1.381f)
                reflectiveCurveToRelative(-2.256f, -0.606f, -2.576f, -1.381f)
                curveToRelative(-0.154f, -0.375f, -0.52f, -0.619f, -0.924f, -0.619f)
                reflectiveCurveToRelative(-0.77f, 0.244f, -0.924f, 0.619f)
                curveToRelative(-0.319f, 0.774f, -1.451f, 1.381f, -2.576f, 1.381f)
                curveToRelative(-2.5f, 0.0f, -3.138f, -1.927f, -3.138f, -1.927f)
                lineTo(0.972f, 3.246f)
                curveToRelative(-0.068f, -0.833f, 0.217f, -1.664f, 0.784f, -2.279f)
                reflectiveCurveToRelative(1.37f, -0.967f, 2.206f, -0.967f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.839f, 0.0f, 1.645f, 0.355f, 2.212f, 0.973f)
                curveToRelative(0.567f, 0.619f, 0.85f, 1.454f, 0.776f, 2.29f)
                close()
                moveTo(15.5f, 8.5f)
                curveToRelative(0.0f, -1.048f, -0.632f, -2.307f, -1.878f, -3.743f)
                curveToRelative(-0.818f, -0.942f, -2.426f, -0.943f, -3.244f, 0.0f)
                curveToRelative(-1.246f, 1.436f, -1.878f, 2.695f, -1.878f, 3.743f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _glassWaterDroplet!!
    }

private var _glassWaterDroplet: ImageVector? = null
