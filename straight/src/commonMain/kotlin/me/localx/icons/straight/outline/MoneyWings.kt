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

public val Icons.Outline.MoneyWings: ImageVector
    get() {
        if (_moneyWings != null) {
            return _moneyWings!!
        }
        _moneyWings = Builder(name = "MoneyWings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.256f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 13.256f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(21.911f, 14.703f)
                curveToRelative(-0.217f, -0.067f, -1.151f, -0.375f, -2.207f, -0.958f)
                curveToRelative(1.08f, -1.203f, 2.04f, -2.849f, 2.742f, -5.367f)
                lineToRelative(0.175f, -0.625f)
                lineTo(13.25f, 0.0f)
                lineToRelative(-0.414f, 1.484f)
                curveToRelative(-0.495f, 1.777f, -1.116f, 3.024f, -1.83f, 3.979f)
                curveToRelative(-1.087f, -1.462f, -1.642f, -3.154f, -1.71f, -3.375f)
                curveToRelative(-0.392f, -1.27f, -1.49f, -2.089f, -2.797f, -2.089f)
                lineTo(2.0f, -0.001f)
                curveTo(0.897f, 0.0f, 0.0f, 0.897f, 0.0f, 2.0f)
                curveToRelative(0.0f, 0.878f, 0.572f, 1.617f, 1.359f, 1.885f)
                curveToRelative(-0.219f, 0.32f, -0.359f, 0.698f, -0.359f, 1.115f)
                curveToRelative(0.0f, 0.872f, 0.564f, 1.607f, 1.344f, 1.88f)
                curveToRelative(-0.217f, 0.32f, -0.344f, 0.705f, -0.344f, 1.12f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.149f)
                curveToRelative(-1.435f, 1.149f, -2.847f, 2.749f, -3.97f, 5.514f)
                lineToRelative(-0.276f, 0.68f)
                lineToRelative(9.3f, 7.693f)
                lineToRelative(0.513f, -1.263f)
                curveToRelative(0.941f, -2.316f, 2.065f, -3.649f, 3.284f, -4.642f)
                verticalLineToRelative(2.018f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.414f, 0.0f, 0.8f, -0.127f, 1.12f, -0.344f)
                curveToRelative(0.273f, 0.78f, 1.008f, 1.344f, 1.88f, 1.344f)
                curveToRelative(0.417f, 0.0f, 0.795f, -0.14f, 1.115f, -0.359f)
                curveToRelative(0.269f, 0.788f, 1.008f, 1.359f, 1.885f, 1.359f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.307f, -0.819f, -2.405f, -2.089f, -2.797f)
                close()
                moveTo(4.309f, 6.0f)
                horizontalLineToRelative(2.322f)
                curveToRelative(-0.41f, -0.773f, -0.706f, -1.47f, -0.903f, -2.0f)
                lineTo(3.564f, 4.0f)
                curveToRelative(-0.257f, -0.811f, -0.426f, -1.512f, -0.507f, -2.0f)
                horizontalLineToRelative(3.443f)
                curveToRelative(0.43f, 0.0f, 0.752f, 0.248f, 0.886f, 0.68f)
                curveToRelative(0.138f, 0.445f, 0.826f, 2.5f, 2.221f, 4.253f)
                curveToRelative(-0.676f, 0.562f, -1.402f, 1.019f, -2.165f, 1.496f)
                curveToRelative(-0.403f, 0.252f, -0.817f, 0.511f, -1.234f, 0.793f)
                curveToRelative(-0.756f, -0.886f, -1.395f, -2.055f, -1.899f, -3.222f)
                close()
                moveTo(9.418f, 20.641f)
                lineTo(3.321f, 15.598f)
                curveToRelative(1.441f, -3.136f, 3.262f, -4.273f, 5.182f, -5.473f)
                curveToRelative(2.14f, -1.337f, 4.346f, -2.715f, 5.797f, -6.66f)
                lineToRelative(6.037f, 4.994f)
                curveToRelative(-1.215f, 3.83f, -3.074f, 4.991f, -5.21f, 6.326f)
                curveToRelative(-1.908f, 1.192f, -4.043f, 2.526f, -5.709f, 5.856f)
                close()
                moveTo(18.001f, 17.369f)
                verticalLineToRelative(2.322f)
                curveToRelative(-1.279f, -0.553f, -2.554f, -1.269f, -3.462f, -2.122f)
                curveToRelative(0.537f, -0.391f, 1.088f, -0.738f, 1.649f, -1.088f)
                curveToRelative(0.659f, -0.412f, 1.324f, -0.83f, 1.971f, -1.324f)
                curveToRelative(1.411f, 0.875f, 2.751f, 1.33f, 3.163f, 1.457f)
                curveToRelative(0.432f, 0.133f, 0.679f, 0.456f, 0.679f, 0.886f)
                verticalLineToRelative(3.443f)
                curveToRelative(-0.488f, -0.081f, -1.189f, -0.249f, -2.0f, -0.507f)
                verticalLineToRelative(-2.165f)
                curveToRelative(-0.53f, -0.197f, -1.227f, -0.493f, -2.0f, -0.903f)
                close()
            }
        }
        .build()
        return _moneyWings!!
    }

private var _moneyWings: ImageVector? = null
