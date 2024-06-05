package me.localx.icons.straight.filled

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

public val Icons.Filled.Violin: ImageVector
    get() {
        if (_violin != null) {
            return _violin!!
        }
        _violin = Builder(name = "Violin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.97f, 1.53f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveTo(17.641f, 0.03f, 18.47f, 0.03f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.47f, 4.03f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.298f, 7.7f)
                lineToRelative(0.002f, 0.002f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.241f, 0.241f, 0.453f, 0.501f, 0.643f, 0.771f)
                lineToRelative(6.735f, -6.735f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-6.735f, 6.735f)
                curveToRelative(0.27f, 0.19f, 0.53f, 0.402f, 0.771f, 0.643f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(16.942f, 8.472f)
                curveToRelative(1.406f, 2.001f, 1.409f, 4.702f, -0.039f, 6.731f)
                lineToRelative(-0.607f, 0.892f)
                reflectiveCurveToRelative(-2.294f, -1.099f, -3.794f, 1.401f)
                reflectiveCurveToRelative(0.277f, 4.174f, 0.277f, 4.174f)
                curveToRelative(-2.604f, 2.769f, -6.872f, 3.091f, -9.855f, 0.819f)
                lineToRelative(2.076f, -1.99f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.076f, 1.99f)
                curveToRelative(-2.272f, -2.983f, -1.95f, -7.251f, 0.819f, -9.855f)
                curveToRelative(0.0f, 0.0f, 1.674f, 1.777f, 4.174f, 0.277f)
                reflectiveCurveToRelative(1.401f, -3.794f, 1.401f, -3.794f)
                lineToRelative(0.892f, -0.607f)
                curveToRelative(2.029f, -1.448f, 4.73f, -1.445f, 6.731f, -0.039f)
                lineToRelative(-6.442f, 6.528f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.442f, -6.528f)
                close()
                moveTo(9.0f, 18.086f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _violin!!
    }

private var _violin: ImageVector? = null
