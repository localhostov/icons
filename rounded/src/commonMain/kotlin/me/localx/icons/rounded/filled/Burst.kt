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

public val Icons.Filled.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.608f, 24.0f)
                curveToRelative(-0.797f, 0.0f, -1.523f, -0.435f, -1.9f, -1.138f)
                lineToRelative(-1.628f, -3.043f)
                lineToRelative(-3.817f, 1.442f)
                curveToRelative(-0.757f, 0.261f, -1.542f, 0.074f, -2.081f, -0.476f)
                curveToRelative(-0.538f, -0.55f, -0.708f, -1.339f, -0.443f, -2.062f)
                curveToRelative(0.014f, -0.038f, 0.03f, -0.074f, 0.048f, -0.11f)
                lineToRelative(1.771f, -3.474f)
                lineToRelative(-3.419f, -1.411f)
                curveTo(0.443f, 13.422f, 0.016f, 12.781f, 0.0f, 12.046f)
                curveToRelative(-0.016f, -0.735f, 0.385f, -1.395f, 1.044f, -1.72f)
                lineToRelative(3.492f, -1.611f)
                lineTo(1.341f, 3.935f)
                curveToRelative(-0.463f, -0.779f, -0.36f, -1.686f, 0.229f, -2.301f)
                curveToRelative(0.588f, -0.617f, 1.49f, -0.762f, 2.241f, -0.361f)
                lineToRelative(5.263f, 2.75f)
                lineToRelative(1.535f, -2.883f)
                curveToRelative(0.375f, -0.703f, 1.102f, -1.14f, 1.898f, -1.14f)
                reflectiveCurveToRelative(1.522f, 0.436f, 1.897f, 1.138f)
                lineToRelative(1.633f, 3.06f)
                lineToRelative(4.594f, -1.967f)
                curveToRelative(0.654f, -0.278f, 1.389f, -0.122f, 1.871f, 0.396f)
                curveToRelative(0.483f, 0.517f, 0.589f, 1.259f, 0.27f, 1.89f)
                lineToRelative(-2.343f, 4.201f)
                lineToRelative(2.411f, 1.287f)
                curveToRelative(0.701f, 0.374f, 1.137f, 1.1f, 1.137f, 1.895f)
                curveToRelative(0.0f, 0.795f, -0.435f, 1.522f, -1.136f, 1.897f)
                lineToRelative(-2.245f, 1.2f)
                lineToRelative(3.165f, 5.19f)
                curveToRelative(0.015f, 0.024f, 0.028f, 0.049f, 0.041f, 0.074f)
                curveToRelative(0.362f, 0.726f, 0.227f, 1.567f, -0.347f, 2.142f)
                curveToRelative(-0.573f, 0.576f, -1.413f, 0.714f, -2.141f, 0.354f)
                lineToRelative(-5.306f, -2.825f)
                lineToRelative(-1.48f, 2.895f)
                curveToRelative(-0.367f, 0.716f, -1.095f, 1.166f, -1.899f, 1.173f)
                horizontalLineToRelative(-0.02f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
