package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Mosquito: ImageVector
    get() {
        if (_mosquito != null) {
            return _mosquito!!
        }
        _mosquito = Builder(name = "Mosquito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.583f, 12.059f)
                curveToRelative(-0.42f, -0.767f, -1.103f, -1.319f, -1.921f, -1.553f)
                curveToRelative(-0.739f, -0.211f, -3.008f, -0.505f, -5.026f, -0.505f)
                horizontalLineToRelative(-2.659f)
                reflectiveCurveToRelative(6.049f, -4.306f, 6.049f, -4.306f)
                verticalLineToRelative(-2.123f)
                lineToRelative(1.781f, -2.226f)
                lineToRelative(-1.562f, -1.249f)
                lineToRelative(-2.219f, 2.774f)
                verticalLineToRelative(1.792f)
                lineToRelative(-4.11f, 2.925f)
                curveToRelative(0.36f, -0.433f, 0.585f, -0.982f, 0.585f, -1.589f)
                curveToRelative(0.0f, -1.009f, -0.601f, -1.873f, -1.461f, -2.268f)
                lineToRelative(-1.039f, -3.732f)
                lineToRelative(-1.039f, 3.732f)
                curveToRelative(-0.86f, 0.395f, -1.461f, 1.259f, -1.461f, 2.268f)
                curveToRelative(0.0f, 0.6f, 0.22f, 1.143f, 0.572f, 1.574f)
                lineToRelative(-4.072f, -2.909f)
                verticalLineToRelative(-1.793f)
                lineTo(3.781f, 0.098f)
                lineToRelative(-1.562f, 1.249f)
                lineToRelative(1.781f, 2.226f)
                verticalLineToRelative(2.122f)
                lineToRelative(6.029f, 4.306f)
                horizontalLineToRelative(-2.661f)
                reflectiveCurveToRelative(-0.004f, 0.0f, -0.004f, 0.0f)
                curveToRelative(-2.018f, 0.0f, -4.287f, 0.294f, -5.026f, 0.505f)
                curveToRelative(-0.818f, 0.234f, -1.501f, 0.785f, -1.921f, 1.553f)
                curveTo(-0.004f, 12.826f, -0.111f, 13.717f, 0.114f, 14.569f)
                curveToRelative(0.224f, 0.852f, 0.755f, 1.561f, 1.493f, 1.998f)
                curveToRelative(0.486f, 0.288f, 1.024f, 0.434f, 1.568f, 0.434f)
                curveToRelative(0.282f, 0.0f, 0.567f, -0.039f, 0.846f, -0.119f)
                curveToRelative(1.281f, -0.366f, 5.648f, -3.927f, 6.979f, -5.129f)
                lineToRelative(-6.0f, 7.05f)
                verticalLineToRelative(1.717f)
                lineToRelative(-2.125f, 1.7f)
                lineToRelative(1.25f, 1.562f)
                lineToRelative(2.875f, -2.3f)
                verticalLineToRelative(-1.938f)
                lineToRelative(4.0f, -4.667f)
                verticalLineToRelative(5.124f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.124f)
                lineToRelative(4.0f, 4.667f)
                verticalLineToRelative(1.938f)
                lineToRelative(2.875f, 2.3f)
                lineToRelative(1.25f, -1.562f)
                lineToRelative(-2.125f, -1.7f)
                verticalLineToRelative(-1.717f)
                lineToRelative(-6.0f, -7.049f)
                curveToRelative(1.331f, 1.203f, 5.697f, 4.762f, 6.978f, 5.128f)
                curveToRelative(0.28f, 0.08f, 0.564f, 0.119f, 0.846f, 0.119f)
                curveToRelative(0.544f, 0.0f, 1.082f, -0.147f, 1.568f, -0.434f)
                curveToRelative(0.738f, -0.437f, 1.269f, -1.146f, 1.493f, -1.998f)
                curveToRelative(0.225f, -0.852f, 0.118f, -1.743f, -0.302f, -2.51f)
                close()
            }
        }
        .build()
        return _mosquito!!
    }

private var _mosquito: ImageVector? = null
