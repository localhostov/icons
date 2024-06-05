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

public val Icons.Bold.BatteryBolt: ImageVector
    get() {
        if (_batteryBolt != null) {
            return _batteryBolt!!
        }
        _batteryBolt = Builder(name = "BatteryBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(12.593f, 10.5f)
                horizontalLineToRelative(-2.142f)
                lineToRelative(2.331f, -4.283f)
                curveToRelative(0.396f, -0.728f, 0.126f, -1.639f, -0.601f, -2.035f)
                curveToRelative(-0.727f, -0.396f, -1.638f, -0.127f, -2.035f, 0.601f)
                curveToRelative(0.0f, 0.0f, -3.012f, 5.559f, -3.042f, 5.657f)
                curveToRelative(-0.22f, 0.728f, -0.091f, 1.489f, 0.354f, 2.089f)
                curveToRelative(0.451f, 0.608f, 1.186f, 0.971f, 1.964f, 0.971f)
                horizontalLineToRelative(2.235f)
                lineToRelative(-2.149f, 4.333f)
                curveToRelative(-0.368f, 0.742f, -0.065f, 1.642f, 0.677f, 2.01f)
                curveToRelative(0.214f, 0.106f, 0.441f, 0.157f, 0.666f, 0.157f)
                curveToRelative(0.552f, 0.0f, 1.083f, -0.306f, 1.345f, -0.834f)
                lineToRelative(2.463f, -4.966f)
                curveToRelative(0.438f, -0.733f, 0.456f, -1.65f, 0.043f, -2.421f)
                curveToRelative(-0.424f, -0.79f, -1.231f, -1.28f, -2.109f, -1.28f)
                close()
                moveTo(23.0f, 8.0f)
                horizontalLineToRelative(-1.208f)
                curveToRelative(-0.655f, -2.306f, -2.78f, -4.0f, -5.292f, -4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(2.513f, 0.0f, 4.637f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(1.208f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _batteryBolt!!
    }

private var _batteryBolt: ImageVector? = null
