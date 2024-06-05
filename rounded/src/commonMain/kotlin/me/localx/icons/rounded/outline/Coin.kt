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

public val Icons.Outline.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(5.271f, 2.0f, 0.0f, 4.855f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.645f, -5.271f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(2.0f, 15.5f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0.303f, 0.247f, 0.638f, 0.482f, 1.0f, 0.703f)
                verticalLineToRelative(4.526f)
                curveToRelative(-0.647f, -0.6f, -1.0f, -1.244f, -1.0f, -1.868f)
                close()
                moveTo(3.01f, 12.849f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(7.0f, 19.366f)
                curveToRelative(-0.737f, -0.202f, -1.407f, -0.446f, -2.0f, -0.719f)
                verticalLineToRelative(-4.835f)
                curveToRelative(0.623f, 0.239f, 1.292f, 0.446f, 2.0f, 0.617f)
                verticalLineToRelative(4.936f)
                close()
                moveTo(11.0f, 19.977f)
                curveToRelative(-0.697f, -0.032f, -1.365f, -0.098f, -2.0f, -0.193f)
                verticalLineToRelative(-4.981f)
                curveToRelative(0.646f, 0.087f, 1.314f, 0.146f, 2.0f, 0.175f)
                verticalLineToRelative(4.998f)
                close()
                moveTo(15.0f, 19.784f)
                curveToRelative(-0.635f, 0.095f, -1.303f, 0.16f, -2.0f, 0.193f)
                verticalLineToRelative(-4.998f)
                curveToRelative(0.686f, -0.029f, 1.354f, -0.088f, 2.0f, -0.175f)
                verticalLineToRelative(4.981f)
                close()
                moveTo(19.0f, 18.648f)
                curveToRelative(-0.593f, 0.273f, -1.263f, 0.516f, -2.0f, 0.719f)
                verticalLineToRelative(-4.936f)
                curveToRelative(0.708f, -0.171f, 1.377f, -0.378f, 2.0f, -0.617f)
                verticalLineToRelative(4.835f)
                close()
                moveTo(20.989f, 12.85f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(22.0f, 15.501f)
                curveToRelative(0.0f, 0.624f, -0.353f, 1.268f, -1.0f, 1.868f)
                verticalLineToRelative(-4.526f)
                curveToRelative(0.362f, -0.221f, 0.697f, -0.455f, 1.0f, -0.703f)
                verticalLineToRelative(3.36f)
                close()
                moveTo(12.0f, 13.001f)
                curveToRelative(-5.893f, 0.0f, -10.0f, -2.372f, -10.0f, -4.5f)
                reflectiveCurveTo(6.107f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(10.0f, 2.372f, 10.0f, 4.5f)
                reflectiveCurveToRelative(-4.107f, 4.5f, -10.0f, 4.5f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
