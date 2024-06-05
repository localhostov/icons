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

public val Icons.Filled.MoneyWings: ImageVector
    get() {
        if (_moneyWings != null) {
            return _moneyWings!!
        }
        _moneyWings = Builder(name = "MoneyWings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.256f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(2.344f, 6.88f)
                curveToRelative(-0.217f, 0.32f, -0.344f, 0.705f, -0.344f, 1.12f)
                curveToRelative(0.0f, 0.86f, 0.549f, 1.589f, 1.313f, 1.871f)
                curveToRelative(1.224f, -1.205f, 2.483f, -1.993f, 3.606f, -2.695f)
                curveToRelative(1.386f, -0.866f, 2.464f, -1.545f, 3.324f, -2.902f)
                curveToRelative(-0.586f, -1.071f, -0.896f, -2.023f, -0.946f, -2.185f)
                curveToRelative(-0.392f, -1.27f, -1.49f, -2.089f, -2.797f, -2.089f)
                lineTo(2.0f, 0.0f)
                curveTo(0.897f, 0.0f, 0.0f, 0.897f, 0.0f, 2.0f)
                curveToRelative(0.0f, 0.878f, 0.572f, 1.617f, 1.359f, 1.885f)
                curveToRelative(-0.219f, 0.32f, -0.359f, 0.698f, -0.359f, 1.115f)
                curveToRelative(0.0f, 0.872f, 0.564f, 1.607f, 1.344f, 1.88f)
                close()
                moveTo(21.911f, 14.703f)
                curveToRelative(-0.124f, -0.038f, -0.49f, -0.16f, -0.972f, -0.361f)
                curveToRelative(-1.362f, 1.626f, -2.873f, 2.576f, -4.207f, 3.409f)
                curveToRelative(-1.019f, 0.637f, -1.922f, 1.211f, -2.732f, 2.057f)
                verticalLineToRelative(0.191f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.414f, 0.0f, 0.8f, -0.127f, 1.12f, -0.344f)
                curveToRelative(0.273f, 0.78f, 1.008f, 1.344f, 1.88f, 1.344f)
                curveToRelative(0.417f, 0.0f, 0.795f, -0.14f, 1.115f, -0.359f)
                curveToRelative(0.269f, 0.788f, 1.008f, 1.359f, 1.885f, 1.359f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.307f, -0.819f, -2.405f, -2.089f, -2.797f)
                close()
                moveTo(21.73f, 8.788f)
                curveToRelative(-1.266f, 4.016f, -3.92f, 5.932f, -6.058f, 7.268f)
                curveToRelative(-1.612f, 1.007f, -3.465f, 2.096f, -4.908f, 4.802f)
                curveToRelative(-0.665f, 1.247f, -2.285f, 1.603f, -3.375f, 0.702f)
                lineToRelative(-4.699f, -3.887f)
                curveToRelative(-0.791f, -0.655f, -1.024f, -1.763f, -0.592f, -2.695f)
                curveToRelative(1.658f, -3.574f, 4.018f, -4.941f, 5.88f, -6.105f)
                curveToRelative(1.725f, -1.078f, 3.745f, -2.782f, 4.958f, -5.577f)
                curveToRelative(0.567f, -1.306f, 2.207f, -1.728f, 3.304f, -0.821f)
                lineToRelative(4.762f, 3.939f)
                curveToRelative(0.694f, 0.574f, 0.999f, 1.515f, 0.728f, 2.374f)
                close()
                moveTo(15.5f, 12.256f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _moneyWings!!
    }

private var _moneyWings: ImageVector? = null
