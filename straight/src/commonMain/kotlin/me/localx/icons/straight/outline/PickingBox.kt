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

public val Icons.Outline.PickingBox: ImageVector
    get() {
        if (_pickingBox != null) {
            return _pickingBox!!
        }
        _pickingBox = Builder(name = "PickingBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-12.169f)
                curveToRelative(-2.918f, 0.0f, -5.801f, 0.636f, -8.448f, 1.863f)
                lineToRelative(-1.546f, 0.717f)
                curveToRelative(-0.738f, 0.311f, -1.312f, 0.892f, -1.615f, 1.635f)
                curveToRelative(-0.301f, 0.742f, -0.295f, 1.558f, 0.016f, 2.294f)
                curveToRelative(0.311f, 0.738f, 0.891f, 1.312f, 1.637f, 1.616f)
                curveToRelative(0.121f, 0.049f, 0.251f, 0.073f, 0.378f, 0.106f)
                lineToRelative(-0.936f, 1.431f)
                curveToRelative(-0.358f, 0.718f, -0.415f, 1.531f, -0.16f, 2.291f)
                reflectiveCurveToRelative(0.791f, 1.375f, 1.505f, 1.729f)
                curveToRelative(0.418f, 0.21f, 0.868f, 0.316f, 1.339f, 0.316f)
                curveToRelative(0.393f, 0.0f, 0.769f, -0.079f, 1.116f, -0.219f)
                curveToRelative(0.346f, 1.274f, 1.501f, 2.219f, 2.884f, 2.219f)
                curveToRelative(1.118f, 0.0f, 2.095f, -0.615f, 2.61f, -1.523f)
                curveToRelative(0.647f, 0.945f, 1.736f, 1.523f, 2.891f, 1.523f)
                curveToRelative(0.633f, 0.0f, 1.253f, -0.171f, 1.792f, -0.495f)
                curveToRelative(0.402f, -0.24f, 2.47f, -1.543f, 3.723f, -3.636f)
                curveToRelative(0.143f, -0.239f, 0.714f, -1.245f, 1.067f, -1.869f)
                horizontalLineToRelative(3.917f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.083f)
                lineToRelative(-0.287f, 0.508f)
                reflectiveCurveToRelative(-1.124f, 1.988f, -1.331f, 2.334f)
                curveToRelative(-1.027f, 1.717f, -2.829f, 2.826f, -3.033f, 2.947f)
                curveToRelative(-0.677f, 0.407f, -1.646f, 0.163f, -2.055f, -0.521f)
                curveToRelative(-0.422f, -0.708f, -0.191f, -1.629f, 0.52f, -2.057f)
                curveToRelative(1.484f, -0.902f, 2.27f, -2.013f, 2.27f, -3.212f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(11.0f, 8.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.45f, -0.477f, 0.998f, -1.305f, 1.5f)
                curveToRelative(-0.26f, 0.156f, -0.492f, 0.341f, -0.695f, 0.549f)
                verticalLineToRelative(-2.049f)
                close()
                moveTo(2.626f, 6.272f)
                curveToRelative(-0.247f, -0.101f, -0.442f, -0.293f, -0.546f, -0.54f)
                curveToRelative(-0.106f, -0.248f, -0.107f, -0.512f, -0.005f, -0.763f)
                curveToRelative(0.101f, -0.248f, 0.293f, -0.442f, 0.516f, -0.537f)
                lineToRelative(3.103f, -1.466f)
                lineToRelative(-2.091f, 3.199f)
                lineToRelative(-0.227f, 0.106f)
                curveToRelative(-0.232f, 0.099f, -0.508f, 0.099f, -0.749f, 0.0f)
                close()
                moveTo(3.555f, 11.894f)
                curveToRelative(-0.239f, -0.118f, -0.417f, -0.323f, -0.502f, -0.577f)
                curveToRelative(-0.085f, -0.252f, -0.066f, -0.522f, 0.054f, -0.763f)
                lineToRelative(1.894f, -3.041f)
                verticalLineToRelative(3.728f)
                lineToRelative(-0.105f, 0.205f)
                curveToRelative(-0.238f, 0.481f, -0.853f, 0.691f, -1.34f, 0.447f)
                close()
            }
        }
        .build()
        return _pickingBox!!
    }

private var _pickingBox: ImageVector? = null
