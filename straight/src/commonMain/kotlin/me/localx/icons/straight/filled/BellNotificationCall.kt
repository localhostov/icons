package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.BellNotificationCall: ImageVector
    get() {
        if (_bellNotificationCall != null) {
            return _bellNotificationCall!!
        }
        _bellNotificationCall = Builder(name = "BellNotificationCall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.972f, 7.434f)
                lineToRelative(-0.796f, -3.79f)
                curveToRelative(-0.478f, -2.282f, -2.039f, -3.645f, -4.176f, -3.645f)
                curveToRelative(-2.157f, 0.0f, -3.678f, 1.327f, -4.175f, 3.64f)
                curveToRelative(-0.291f, 1.356f, -0.646f, 3.066f, -0.798f, 3.798f)
                curveToRelative(-0.08f, 0.384f, 0.016f, 0.778f, 0.263f, 1.082f)
                curveToRelative(0.249f, 0.305f, 0.617f, 0.48f, 1.012f, 0.48f)
                horizontalLineToRelative(1.971f)
                curveToRelative(0.123f, 0.844f, 0.843f, 1.494f, 1.722f, 1.494f)
                reflectiveCurveToRelative(1.598f, -0.65f, 1.722f, -1.494f)
                horizontalLineToRelative(1.981f)
                curveToRelative(0.396f, 0.0f, 0.765f, -0.175f, 1.013f, -0.481f)
                curveToRelative(0.247f, -0.304f, 0.342f, -0.699f, 0.261f, -1.084f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.613f, 12.848f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-3.171f, 3.171f)
                curveToRelative(-1.105f, 1.106f, -2.6f, 1.716f, -4.207f, 1.716f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                curveToRelative(0.0f, -1.608f, 0.609f, -3.103f, 1.716f, -4.208f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-4.125f, 4.125f)
                curveToRelative(1.373f, 3.061f, 3.493f, 5.186f, 6.453f, 6.468f)
                lineToRelative(4.133f, -4.132f)
                close()
            }
        }
        .build()
        return _bellNotificationCall!!
    }

private var _bellNotificationCall: ImageVector? = null
