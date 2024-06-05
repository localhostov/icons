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

public val Icons.Bold.Digging: ImageVector
    get() {
        if (_digging != null) {
            return _digging!!
        }
        _digging = Builder(name = "Digging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.026f, 24.0f)
                horizontalLineToRelative(-7.051f)
                curveToRelative(-1.595f, 0.0f, -2.53f, -1.781f, -1.615f, -3.077f)
                lineToRelative(0.991f, -1.404f)
                lineTo(0.69f, 10.763f)
                curveToRelative(-0.697f, -0.447f, -0.9f, -1.375f, -0.453f, -2.072f)
                reflectiveCurveToRelative(1.375f, -0.9f, 2.072f, -0.453f)
                lineToRelative(2.629f, 1.685f)
                lineToRelative(0.576f, -1.604f)
                curveToRelative(0.337f, -0.94f, 1.062f, -1.693f, 1.989f, -2.065f)
                curveToRelative(0.927f, -0.373f, 1.971f, -0.331f, 2.866f, 0.114f)
                lineToRelative(0.674f, 0.337f)
                curveToRelative(1.256f, 0.628f, 2.224f, 1.713f, 2.704f, 3.033f)
                lineToRelative(0.573f, 1.263f)
                curveToRelative(0.283f, 0.779f, -0.118f, 1.64f, -0.897f, 1.923f)
                curveToRelative(-0.779f, 0.283f, -1.639f, -0.119f, -1.923f, -0.897f)
                lineToRelative(-0.572f, -1.263f)
                curveToRelative(-0.217f, -0.598f, -0.656f, -1.09f, -1.225f, -1.375f)
                lineToRelative(-0.672f, -0.336f)
                curveToRelative(-0.177f, -0.088f, -0.332f, -0.048f, -0.408f, -0.016f)
                curveToRelative(-0.078f, 0.031f, -0.219f, 0.111f, -0.284f, 0.295f)
                lineToRelative(-0.808f, 2.253f)
                lineToRelative(8.552f, 5.482f)
                lineToRelative(1.57f, -2.225f)
                curveToRelative(0.877f, -1.243f, 2.785f, -1.065f, 3.413f, 0.319f)
                lineToRelative(2.759f, 6.082f)
                curveToRelative(0.587f, 1.294f, -0.367f, 2.758f, -1.798f, 2.758f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(10.347f, 19.262f)
                curveToRelative(-0.996f, -0.681f, -2.347f, 0.032f, -2.347f, 1.238f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.495f, -0.244f, -0.958f, -0.653f, -1.238f)
                close()
                moveTo(4.854f, 16.036f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.811f, -0.555f, -1.927f, -0.193f, -2.259f, 0.731f)
                lineToRelative(-1.875f, 5.226f)
                curveToRelative(-0.351f, 0.977f, 0.374f, 2.007f, 1.412f, 2.007f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.633f, 0.0f, 1.198f, -0.398f, 1.412f, -0.993f)
                lineToRelative(1.875f, -5.226f)
                curveToRelative(0.23f, -0.642f, -0.002f, -1.359f, -0.565f, -1.745f)
                close()
            }
        }
        .build()
        return _digging!!
    }

private var _digging: ImageVector? = null
