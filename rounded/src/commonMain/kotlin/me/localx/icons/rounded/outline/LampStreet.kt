package me.localx.icons.rounded.outline

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

public val Icons.Outline.LampStreet: ImageVector
    get() {
        if (_lampStreet != null) {
            return _lampStreet!!
        }
        _lampStreet = Builder(name = "LampStreet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.936f, 13.788f)
                curveToRelative(-0.744f, -3.637f, -3.833f, -6.351f, -7.522f, -6.74f)
                curveTo(15.826f, 3.005f, 12.378f, 0.0f, 8.25f, 0.0f)
                curveTo(3.701f, 0.0f, 0.0f, 3.701f, 0.0f, 8.253f)
                lineToRelative(0.038f, 14.75f)
                curveToRelative(0.0f, 0.551f, 0.449f, 0.997f, 1.0f, 0.997f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.552f, 0.0f, 0.998f, -0.45f, 0.997f, -1.003f)
                lineToRelative(-0.038f, -14.747f)
                curveToRelative(0.0f, -3.446f, 2.804f, -6.25f, 6.25f, -6.25f)
                curveToRelative(3.036f, 0.0f, 5.586f, 2.145f, 6.139f, 5.071f)
                curveToRelative(-3.609f, 0.463f, -6.605f, 3.151f, -7.333f, 6.732f)
                curveToRelative(-0.062f, 0.309f, -0.21f, 1.383f, 0.501f, 2.251f)
                curveToRelative(0.354f, 0.432f, 1.045f, 0.946f, 2.33f, 0.946f)
                horizontalLineToRelative(3.112f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.108f)
                curveToRelative(1.047f, 0.0f, 1.838f, -0.318f, 2.349f, -0.945f)
                curveToRelative(0.682f, -0.836f, 0.562f, -1.864f, 0.479f, -2.267f)
                close()
                moveTo(21.908f, 14.791f)
                curveToRelative(-0.107f, 0.131f, -0.405f, 0.209f, -0.799f, 0.209f)
                horizontalLineToRelative(-11.221f)
                curveToRelative(-0.387f, 0.0f, -0.672f, -0.078f, -0.782f, -0.213f)
                curveToRelative(-0.121f, -0.147f, -0.118f, -0.44f, -0.088f, -0.588f)
                curveToRelative(0.611f, -3.013f, 3.338f, -5.199f, 6.482f, -5.199f)
                reflectiveCurveToRelative(5.861f, 2.183f, 6.477f, 5.19f)
                curveToRelative(0.042f, 0.204f, 0.031f, 0.477f, -0.069f, 0.601f)
                close()
            }
        }
        .build()
        return _lampStreet!!
    }

private var _lampStreet: ImageVector? = null
