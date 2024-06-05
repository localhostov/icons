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

public val Icons.Outline.BellNotificationCall: ImageVector
    get() {
        if (_bellNotificationCall != null) {
            return _bellNotificationCall!!
        }
        _bellNotificationCall = Builder(name = "BellNotificationCall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.302f, 9.0f)
                horizontalLineToRelative(1.971f)
                curveToRelative(0.123f, 0.844f, 0.843f, 1.494f, 1.722f, 1.494f)
                reflectiveCurveToRelative(1.598f, -0.65f, 1.722f, -1.494f)
                horizontalLineToRelative(1.981f)
                curveToRelative(0.396f, 0.0f, 0.765f, -0.175f, 1.013f, -0.481f)
                curveToRelative(0.247f, -0.304f, 0.342f, -0.699f, 0.261f, -1.084f)
                lineToRelative(-0.796f, -3.79f)
                curveToRelative(-0.478f, -2.282f, -2.039f, -3.645f, -4.176f, -3.645f)
                curveToRelative(-2.157f, 0.0f, -3.678f, 1.327f, -4.175f, 3.64f)
                curveToRelative(-0.291f, 1.356f, -0.646f, 3.066f, -0.798f, 3.798f)
                curveToRelative(-0.08f, 0.384f, 0.016f, 0.778f, 0.263f, 1.082f)
                curveToRelative(0.249f, 0.305f, 0.617f, 0.48f, 1.012f, 0.48f)
                close()
                moveTo(16.781f, 4.059f)
                curveToRelative(0.442f, -2.059f, 1.78f, -2.059f, 2.219f, -2.059f)
                curveToRelative(0.442f, 0.0f, 1.788f, 0.0f, 2.218f, 2.054f)
                lineToRelative(0.619f, 2.946f)
                horizontalLineToRelative(-5.676f)
                curveToRelative(0.176f, -0.841f, 0.415f, -1.98f, 0.62f, -2.941f)
                close()
                moveTo(14.199f, 16.262f)
                curveToRelative(-2.96f, -1.282f, -5.08f, -3.407f, -6.453f, -6.468f)
                lineToRelative(3.406f, -3.406f)
                lineTo(4.887f, 0.122f)
                lineTo(1.716f, 3.292f)
                curveTo(0.61f, 4.397f, 0.0f, 5.891f, 0.0f, 7.5f)
                curveTo(0.0f, 14.748f, 9.252f, 24.0f, 16.5f, 24.0f)
                curveToRelative(1.609f, 0.0f, 3.104f, -0.609f, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                lineToRelative(-3.414f, 3.414f)
                close()
                moveTo(19.291f, 20.871f)
                curveToRelative(-0.726f, 0.728f, -1.718f, 1.129f, -2.792f, 1.129f)
                curveToRelative(-6.233f, 0.0f, -14.5f, -8.266f, -14.5f, -14.5f)
                curveToRelative(0.0f, -1.074f, 0.401f, -2.066f, 1.129f, -2.793f)
                lineToRelative(1.757f, -1.757f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-2.936f, 2.936f)
                lineToRelative(0.246f, 0.613f)
                curveToRelative(1.641f, 4.085f, 4.482f, 6.924f, 8.447f, 8.437f)
                lineToRelative(0.605f, 0.231f)
                lineToRelative(2.927f, -2.927f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-1.758f, 1.758f)
                close()
            }
        }
        .build()
        return _bellNotificationCall!!
    }

private var _bellNotificationCall: ImageVector? = null
