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

public val Icons.Outline.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.86f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(17.896f, 16.002f)
                horizontalLineToRelative(-1.001f)
                lineToRelative(1.269f, -1.893f)
                lineToRelative(-1.664f, -1.109f)
                reflectiveCurveToRelative(-1.422f, 1.879f, -1.902f, 2.919f)
                curveToRelative(-0.213f, 0.462f, -0.054f, 1.022f, 0.249f, 1.431f)
                curveToRelative(0.303f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(1.007f)
                lineToRelative(-1.31f, 1.881f)
                lineToRelative(1.659f, 1.117f)
                lineToRelative(1.732f, -2.508f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.327f, -0.493f, 0.357f, -1.122f, 0.077f, -1.644f)
                curveToRelative(-0.28f, -0.522f, -0.821f, -0.846f, -1.413f, -0.846f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
