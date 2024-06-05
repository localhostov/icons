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

public val Icons.Outline.Cheeseburger: ImageVector
    get() {
        if (_cheeseburger != null) {
            return _cheeseburger!!
        }
        _cheeseburger = Builder(name = "Cheeseburger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.066f, 12.001f)
                horizontalLineToRelative(17.875f)
                curveToRelative(0.568f, 0.0f, 1.111f, -0.243f, 1.491f, -0.667f)
                curveToRelative(0.382f, -0.426f, 0.565f, -0.997f, 0.503f, -1.565f)
                curveTo(22.325f, 4.2f, 17.625f, 0.0f, 12.004f, 0.0f)
                reflectiveCurveTo(1.695f, 4.199f, 1.072f, 9.767f)
                curveToRelative(-0.063f, 0.569f, 0.119f, 1.139f, 0.501f, 1.566f)
                curveToRelative(0.38f, 0.425f, 0.924f, 0.668f, 1.493f, 0.668f)
                close()
                moveTo(12.004f, 2.001f)
                curveToRelative(4.6f, 0.0f, 8.444f, 3.433f, 8.938f, 8.0f)
                lineTo(3.066f, 10.001f)
                lineToRelative(-0.007f, -0.012f)
                curveToRelative(0.509f, -4.554f, 4.354f, -7.988f, 8.944f, -7.988f)
                close()
                moveTo(1.004f, 15.001f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.999f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(11.0f, 0.0f, 11.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(1.001f, 0.0f, 1.001f, 0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.001f)
                lineToRelative(-2.544f, 2.544f)
                curveToRelative(-0.528f, 0.528f, -1.383f, 0.528f, -1.911f, 0.0f)
                lineToRelative(-2.544f, -2.544f)
                lineTo(2.004f, 16.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(23.004f, 20.001f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(5.004f, 24.001f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.999f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.004f, 20.001f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cheeseburger!!
    }

private var _cheeseburger: ImageVector? = null
