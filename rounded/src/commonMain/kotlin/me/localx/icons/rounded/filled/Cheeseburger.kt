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

public val Icons.Filled.Cheeseburger: ImageVector
    get() {
        if (_cheeseburger != null) {
            return _cheeseburger!!
        }
        _cheeseburger = Builder(name = "Cheeseburger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.573f, 11.333f)
                curveToRelative(-0.382f, -0.427f, -0.564f, -0.997f, -0.501f, -1.566f)
                curveTo(1.695f, 4.199f, 6.395f, 0.0f, 12.004f, 0.0f)
                reflectiveCurveToRelative(10.321f, 4.199f, 10.932f, 9.768f)
                curveToRelative(0.062f, 0.568f, -0.121f, 1.139f, -0.503f, 1.565f)
                curveToRelative(-0.38f, 0.424f, -0.923f, 0.667f, -1.491f, 0.667f)
                lineTo(3.066f, 12.0f)
                curveToRelative(-0.569f, 0.0f, -1.113f, -0.244f, -1.493f, -0.668f)
                close()
                moveTo(2.004f, 16.001f)
                horizontalLineToRelative(9.999f)
                lineToRelative(2.544f, 2.544f)
                curveToRelative(0.528f, 0.528f, 1.383f, 0.528f, 1.911f, 0.0f)
                lineToRelative(2.544f, -2.544f)
                horizontalLineToRelative(3.001f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.001f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-18.999f, 0.0f, -18.999f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(21.004f, 18.001f)
                horizontalLineToRelative(-1.173f)
                lineToRelative(-1.959f, 1.958f)
                curveToRelative(-0.653f, 0.653f, -1.512f, 0.979f, -2.37f, 0.979f)
                reflectiveCurveToRelative(-1.716f, -0.326f, -2.369f, -0.979f)
                lineToRelative(-1.959f, -1.959f)
                lineTo(3.004f, 18.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cheeseburger!!
    }

private var _cheeseburger: ImageVector? = null
