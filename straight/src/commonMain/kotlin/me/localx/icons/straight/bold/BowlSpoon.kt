package me.localx.icons.straight.bold

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

public val Icons.Bold.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) {
            return _bowlSpoon!!
        }
        _bowlSpoon = Builder(name = "BowlSpoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.582f, 11.0f)
                lineTo(3.418f, 11.0f)
                curveToRelative(-1.01f, 0.0f, -1.963f, 0.443f, -2.616f, 1.215f)
                curveToRelative(-0.646f, 0.765f, -0.921f, 1.767f, -0.755f, 2.748f)
                curveToRelative(0.645f, 3.811f, 3.54f, 7.029f, 7.797f, 9.037f)
                horizontalLineToRelative(8.31f)
                curveToRelative(4.258f, -2.007f, 7.153f, -5.226f, 7.798f, -9.037f)
                curveToRelative(0.166f, -0.982f, -0.109f, -1.984f, -0.755f, -2.748f)
                curveToRelative(-0.652f, -0.772f, -1.605f, -1.215f, -2.615f, -1.215f)
                close()
                moveTo(20.995f, 14.463f)
                curveToRelative(-0.573f, 3.389f, -3.253f, 5.41f, -5.52f, 6.537f)
                horizontalLineToRelative(-6.95f)
                curveToRelative(-2.266f, -1.127f, -4.946f, -3.148f, -5.519f, -6.537f)
                curveToRelative(-0.024f, -0.143f, 0.035f, -0.248f, 0.088f, -0.312f)
                curveToRelative(0.048f, -0.057f, 0.153f, -0.151f, 0.324f, -0.151f)
                horizontalLineToRelative(17.164f)
                curveToRelative(0.171f, 0.0f, 0.276f, 0.095f, 0.324f, 0.151f)
                curveToRelative(0.054f, 0.063f, 0.113f, 0.169f, 0.089f, 0.312f)
                close()
                moveTo(10.745f, 3.0f)
                curveTo(10.124f, 1.229f, 8.437f, -0.044f, 6.457f, -0.044f)
                curveTo(4.18f, -0.044f, 0.0f, 1.682f, 0.0f, 4.5f)
                reflectiveCurveToRelative(4.18f, 4.544f, 6.457f, 4.544f)
                curveToRelative(1.98f, 0.0f, 3.668f, -1.273f, 4.289f, -3.044f)
                horizontalLineToRelative(13.255f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-13.255f)
                close()
                moveTo(6.456f, 6.044f)
                curveToRelative(-1.257f, 0.0f, -3.287f, -1.01f, -3.461f, -1.505f)
                curveToRelative(0.174f, -0.573f, 2.204f, -1.583f, 3.461f, -1.583f)
                curveToRelative(0.851f, 0.0f, 1.543f, 0.692f, 1.543f, 1.544f)
                reflectiveCurveToRelative(-0.692f, 1.544f, -1.543f, 1.544f)
                close()
            }
        }
        .build()
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
