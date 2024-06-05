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

public val Icons.Filled.ThunderstormRisk: ImageVector
    get() {
        if (_thunderstormRisk != null) {
            return _thunderstormRisk!!
        }
        _thunderstormRisk = Builder(name = "ThunderstormRisk", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.47f, 12.377f)
                lineToRelative(-5.226f, 8.96f)
                curveToRelative(-0.689f, 1.181f, 0.163f, 2.663f, 1.53f, 2.663f)
                horizontalLineToRelative(10.453f)
                curveToRelative(1.367f, 0.0f, 2.218f, -1.483f, 1.53f, -2.663f)
                lineToRelative(-5.226f, -8.96f)
                curveToRelative(-0.683f, -1.171f, -2.376f, -1.171f, -3.059f, 0.0f)
                close()
                moveTo(12.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 12.496f)
                curveToRelative(0.0f, 2.39f, -1.128f, 4.518f, -2.875f, 5.892f)
                curveToRelative(-0.448f, 0.34f, -0.885f, 0.595f, -1.304f, 0.806f)
                lineToRelative(-4.564f, -7.825f)
                curveToRelative(-0.684f, -1.171f, -1.901f, -1.871f, -3.257f, -1.871f)
                reflectiveCurveToRelative(-2.574f, 0.699f, -3.257f, 1.871f)
                lineToRelative(-4.885f, 8.375f)
                curveToRelative(-2.233f, -0.7f, -3.858f, -2.789f, -3.858f, -5.249f)
                curveToRelative(0.0f, -1.546f, 0.656f, -3.029f, 1.801f, -4.07f)
                curveToRelative(0.273f, -0.248f, 0.405f, -0.593f, 0.346f, -0.901f)
                curveToRelative(-0.184f, -0.946f, -0.195f, -1.919f, -0.033f, -2.89f)
                curveTo(2.66f, 3.345f, 5.225f, 0.733f, 8.497f, 0.133f)
                curveToRelative(3.592f, -0.661f, 7.183f, 1.167f, 8.735f, 4.438f)
                curveToRelative(0.14f, 0.296f, 0.41f, 0.503f, 0.742f, 0.569f)
                curveToRelative(3.492f, 0.696f, 6.026f, 3.789f, 6.026f, 7.354f)
                close()
            }
        }
        .build()
        return _thunderstormRisk!!
    }

private var _thunderstormRisk: ImageVector? = null
