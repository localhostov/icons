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

public val Icons.Filled.ShieldDog: ImageVector
    get() {
        if (_shieldDog != null) {
            return _shieldDog!!
        }
        _shieldDog = Builder(name = "ShieldDog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.995f, 11.446f)
                reflectiveCurveToRelative(0.024f, 0.093f, -0.04f, 0.333f)
                curveToRelative(-0.193f, 0.719f, -0.872f, 1.221f, -1.652f, 1.221f)
                horizontalLineToRelative(-2.404f)
                curveToRelative(-0.45f, 0.0f, -0.845f, 0.301f, -0.964f, 0.735f)
                lineToRelative(-0.5f, 1.822f)
                curveToRelative(-0.926f, -0.875f, -1.573f, -1.763f, -1.849f, -2.551f)
                curveToRelative(-0.147f, -0.421f, -0.101f, -0.922f, 0.115f, -1.355f)
                lineToRelative(1.402f, -2.65f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.768f, 0.0f, 1.465f, 0.333f, 1.819f, 0.867f)
                curveToRelative(0.656f, 0.992f, 1.809f, 1.633f, 2.935f, 1.633f)
                verticalLineToRelative(-0.054f)
                close()
                moveTo(21.997f, 6.872f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 7.434f, -7.047f, 10.848f, -9.208f, 11.717f)
                curveToRelative(0.0f, 0.0f, -0.483f, 0.24f, -0.791f, 0.24f)
                reflectiveCurveToRelative(-0.85f, -0.307f, -0.85f, -0.307f)
                curveToRelative(-2.147f, -1.074f, -9.153f, -5.087f, -9.153f, -11.65f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.16f, 1.377f, -4.067f, 3.427f, -4.746f)
                lineTo(11.683f, 0.051f)
                curveToRelative(0.205f, -0.067f, 0.425f, -0.067f, 0.63f, 0.0f)
                lineToRelative(6.259f, 2.075f)
                curveToRelative(2.05f, 0.68f, 3.427f, 2.587f, 3.427f, 4.746f)
                close()
                moveTo(17.604f, 10.27f)
                curveToRelative(-0.562f, -0.733f, -1.439f, -0.77f, -1.609f, -0.77f)
                curveToRelative(-0.387f, 0.0f, -0.946f, -0.253f, -1.268f, -0.738f)
                curveToRelative(-0.731f, -1.104f, -2.035f, -1.762f, -3.486f, -1.762f)
                horizontalLineToRelative(-0.242f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0.0f, -0.503f, -0.517f, -0.851f, -0.979f, -0.654f)
                curveToRelative(-0.894f, 0.381f, -1.521f, 1.268f, -1.521f, 2.302f)
                verticalLineToRelative(0.895f)
                reflectiveCurveToRelative(-1.577f, 2.983f, -1.577f, 2.983f)
                curveToRelative(-0.468f, 0.934f, -0.55f, 2.002f, -0.225f, 2.931f)
                curveToRelative(0.577f, 1.649f, 1.983f, 3.066f, 3.062f, 3.964f)
                curveToRelative(0.274f, 0.228f, 0.612f, 0.348f, 0.956f, 0.348f)
                curveToRelative(0.15f, 0.0f, 0.301f, -0.023f, 0.448f, -0.069f)
                curveToRelative(0.479f, -0.151f, 0.844f, -0.531f, 0.977f, -1.015f)
                lineToRelative(0.52f, -1.894f)
                horizontalLineToRelative(1.642f)
                curveToRelative(1.684f, 0.0f, 3.157f, -1.112f, 3.584f, -2.704f)
                curveToRelative(0.272f, -1.017f, -0.003f, -1.663f, -0.281f, -2.026f)
                close()
            }
        }
        .build()
        return _shieldDog!!
    }

private var _shieldDog: ImageVector? = null
