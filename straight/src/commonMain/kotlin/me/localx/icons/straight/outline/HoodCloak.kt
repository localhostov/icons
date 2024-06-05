package me.localx.icons.straight.outline

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

public val Icons.Outline.HoodCloak: ImageVector
    get() {
        if (_hoodCloak != null) {
            return _hoodCloak!!
        }
        _hoodCloak = Builder(name = "HoodCloak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 5.498f, 6.119f, 10.397f, 6.38f, 10.603f)
                lineToRelative(0.62f, 0.49f)
                lineToRelative(0.62f, -0.49f)
                curveToRelative(0.261f, -0.206f, 6.38f, -5.105f, 6.38f, -10.603f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(12.0f, 21.499f)
                curveToRelative(-1.462f, -1.321f, -5.0f, -4.89f, -5.0f, -8.499f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 3.609f, -3.538f, 7.178f, -5.0f, 8.499f)
                close()
                moveTo(21.202f, 21.976f)
                horizontalLineToRelative(2.798f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.611f)
                lineToRelative(1.13f, -1.581f)
                curveToRelative(2.683f, -3.756f, 3.657f, -6.811f, 3.462f, -10.87f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(-0.079f, -1.708f, -0.469f, -3.127f, -1.156f, -4.216f)
                curveToRelative(-0.557f, -0.883f, -0.835f, -1.812f, -0.806f, -2.688f)
                curveToRelative(0.031f, -0.962f, 0.317f, -1.892f, 0.626f, -2.629f)
                curveToRelative(-1.719f, -0.008f, -7.361f, 0.016f, -7.361f, 0.016f)
                curveToRelative(-0.693f, 0.005f, -1.305f, 0.01f, -1.771f, 0.033f)
                curveToRelative(-5.04f, 0.247f, -9.193f, 4.377f, -9.455f, 9.403f)
                curveToRelative(-0.214f, 4.1f, 0.756f, 7.17f, 3.457f, 10.952f)
                lineToRelative(1.13f, 1.581f)
                lineTo(0.0f, 23.977f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.813f)
                curveTo(0.65f, 18.486f, -0.163f, 15.292f, 0.042f, 11.339f)
                curveTo(0.356f, 5.301f, 5.345f, 0.338f, 11.397f, 0.041f)
                curveToRelative(0.487f, -0.024f, 1.127f, -0.029f, 1.854f, -0.035f)
                lineToRelative(10.892f, 0.007f)
                lineToRelative(-1.044f, 1.546f)
                curveToRelative(-0.01f, 0.014f, -1.048f, 1.583f, -1.1f, 3.127f)
                curveToRelative(-0.016f, 0.468f, 0.162f, 1.02f, 0.499f, 1.555f)
                curveToRelative(0.861f, 1.364f, 1.352f, 3.079f, 1.458f, 5.097f)
                horizontalLineToRelative(0.018f)
                curveToRelative(0.205f, 3.953f, -0.608f, 7.147f, -2.771f, 10.637f)
                close()
            }
        }
        .build()
        return _hoodCloak!!
    }

private var _hoodCloak: ImageVector? = null
