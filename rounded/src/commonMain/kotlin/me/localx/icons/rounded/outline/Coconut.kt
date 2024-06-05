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

public val Icons.Outline.Coconut: ImageVector
    get() {
        if (_coconut != null) {
            return _coconut!!
        }
        _coconut = Builder(name = "Coconut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.686f, 17.0f)
                curveToRelative(0.404f, 0.0f, 0.845f, -0.05f, 1.311f, -0.152f)
                curveToRelative(1.867f, -0.412f, 3.899f, -1.609f, 5.575f, -3.283f)
                curveToRelative(1.52f, -1.519f, 2.635f, -3.311f, 3.139f, -5.045f)
                curveToRelative(0.49f, -1.684f, 0.35f, -3.122f, -0.375f, -3.846f)
                curveToRelative(-0.648f, -0.648f, -1.878f, -0.834f, -3.32f, -0.519f)
                curveToRelative(-1.868f, 0.412f, -3.9f, 1.608f, -5.575f, 3.283f)
                curveToRelative(-1.52f, 1.519f, -2.635f, 3.311f, -3.14f, 5.045f)
                curveToRelative(-0.49f, 1.684f, -0.35f, 3.121f, 0.374f, 3.845f)
                curveToRelative(0.444f, 0.443f, 1.146f, 0.672f, 2.012f, 0.672f)
                close()
                moveTo(8.854f, 8.852f)
                curveToRelative(1.413f, -1.412f, 3.086f, -2.412f, 4.591f, -2.744f)
                curveToRelative(0.317f, -0.07f, 0.624f, -0.106f, 0.888f, -0.106f)
                curveToRelative(0.381f, 0.0f, 0.55f, 0.065f, 0.572f, 0.067f)
                curveToRelative(0.31f, 0.468f, 0.06f, 3.278f, -2.747f, 6.082f)
                curveToRelative(-1.413f, 1.412f, -3.087f, 2.413f, -4.591f, 2.745f)
                curveToRelative(-0.953f, 0.208f, -1.419f, 0.057f, -1.461f, 0.039f)
                curveToRelative(-0.31f, -0.468f, -0.059f, -3.278f, 2.748f, -6.082f)
                close()
                moveTo(20.38f, 2.905f)
                reflectiveCurveToRelative(-1.478f, -1.439f, -1.596f, -1.488f)
                curveTo(15.415f, -1.353f, 9.365f, 0.0f, 4.682f, 4.682f)
                curveTo(0.018f, 9.346f, -1.343f, 15.367f, 1.38f, 18.743f)
                curveToRelative(0.049f, 0.121f, 1.523f, 1.637f, 1.523f, 1.637f)
                curveToRelative(2.409f, 2.41f, 5.573f, 3.614f, 8.738f, 3.614f)
                reflectiveCurveToRelative(6.329f, -1.205f, 8.738f, -3.614f)
                curveToRelative(2.335f, -2.334f, 3.62f, -5.438f, 3.62f, -8.738f)
                reflectiveCurveToRelative(-1.285f, -6.404f, -3.62f, -8.738f)
                close()
                moveTo(6.096f, 6.097f)
                curveToRelative(2.619f, -2.619f, 5.853f, -4.085f, 8.432f, -4.085f)
                curveToRelative(1.317f, 0.0f, 2.465f, 0.383f, 3.272f, 1.19f)
                curveToRelative(2.387f, 2.388f, 1.061f, 7.747f, -2.896f, 11.704f)
                curveToRelative(-3.957f, 3.956f, -9.314f, 5.283f, -11.704f, 2.895f)
                curveToRelative(-2.387f, -2.388f, -1.061f, -7.747f, 2.896f, -11.704f)
                close()
                moveTo(18.966f, 18.968f)
                curveToRelative(-3.184f, 3.184f, -7.937f, 3.846f, -11.787f, 2.01f)
                curveToRelative(2.949f, -0.213f, 6.295f, -1.814f, 9.14f, -4.658f)
                reflectiveCurveToRelative(4.451f, -6.187f, 4.666f, -9.133f)
                curveToRelative(0.657f, 1.376f, 1.015f, 2.887f, 1.015f, 4.456f)
                curveToRelative(0.0f, 2.767f, -1.077f, 5.368f, -3.034f, 7.324f)
                close()
            }
        }
        .build()
        return _coconut!!
    }

private var _coconut: ImageVector? = null
