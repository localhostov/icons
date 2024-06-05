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

public val Icons.Outline.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.011f, 15.372f)
                lineToRelative(5.079f, 3.611f)
                lineTo(23.966f, 10.452f)
                lineToRelative(-1.256f, -2.713f)
                curveToRelative(-0.695f, -1.5f, -2.482f, -2.157f, -3.982f, -1.461f)
                lineToRelative(-2.818f, 1.356f)
                lineTo(9.359f, 3.591f)
                curveToRelative(-0.882f, -0.656f, -2.048f, -0.775f, -3.053f, -0.311f)
                lineToRelative(-3.532f, 1.659f)
                lineToRelative(6.599f, 5.84f)
                lineToRelative(-3.101f, 1.492f)
                lineToRelative(-3.041f, -1.115f)
                curveToRelative(-0.603f, -0.223f, -1.255f, -0.195f, -1.838f, 0.075f)
                curveTo(0.607f, 11.596f, 0.09f, 12.329f, 0.01f, 13.192f)
                reflectiveCurveToRelative(0.294f, 1.678f, 1.0f, 2.18f)
                close()
                moveTo(6.377f, 5.457f)
                lineToRelative(0.775f, -0.364f)
                curveToRelative(0.333f, -0.154f, 0.722f, -0.113f, 1.085f, 0.151f)
                lineToRelative(5.533f, 3.419f)
                lineToRelative(-2.443f, 1.175f)
                lineTo(6.377f, 5.457f)
                close()
                moveTo(2.002f, 13.376f)
                curveToRelative(0.008f, -0.087f, 0.079f, -0.367f, 0.402f, -0.367f)
                curveToRelative(0.047f, 0.0f, 0.094f, 0.009f, 0.138f, 0.024f)
                lineToRelative(3.834f, 1.408f)
                lineToRelative(13.196f, -6.351f)
                curveToRelative(0.5f, -0.229f, 1.091f, -0.009f, 1.322f, 0.489f)
                lineToRelative(0.425f, 0.919f)
                lineToRelative(-15.03f, 7.172f)
                lineToRelative(-4.121f, -2.93f)
                curveToRelative(-0.165f, -0.116f, -0.176f, -0.279f, -0.167f, -0.365f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
