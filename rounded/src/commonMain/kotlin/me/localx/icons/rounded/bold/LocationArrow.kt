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

public val Icons.Bold.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.736f, 1.278f)
                curveToRelative(-1.23f, -1.23f, -3.009f, -1.613f, -4.636f, -1.002f)
                lineTo(2.676f, 6.084f)
                curveTo(0.795f, 6.792f, -0.268f, 8.667f, 0.093f, 10.645f)
                curveToRelative(0.359f, 1.978f, 2.015f, 3.358f, 4.025f, 3.358f)
                horizontalLineToRelative(5.879f)
                verticalLineToRelative(5.894f)
                curveToRelative(0.0f, 2.009f, 1.381f, 3.664f, 3.357f, 4.024f)
                curveToRelative(0.258f, 0.047f, 0.514f, 0.07f, 0.766f, 0.07f)
                curveToRelative(1.682f, 0.0f, 3.181f, -1.017f, 3.797f, -2.651f)
                lineToRelative(5.818f, -15.426f)
                curveToRelative(0.614f, -1.628f, 0.231f, -3.404f, -0.999f, -4.636f)
                close()
                moveTo(20.928f, 4.855f)
                lineToRelative(-5.818f, 15.426f)
                curveToRelative(-0.297f, 0.79f, -1.004f, 0.727f, -1.218f, 0.688f)
                curveToRelative(-0.21f, -0.038f, -0.896f, -0.229f, -0.896f, -1.073f)
                verticalLineToRelative(-7.394f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.379f)
                curveToRelative(-0.846f, 0.0f, -1.036f, -0.686f, -1.074f, -0.896f)
                reflectiveCurveToRelative(-0.102f, -0.919f, 0.688f, -1.216f)
                lineToRelative(15.425f, -5.808f)
                curveToRelative(0.179f, -0.066f, 0.345f, -0.094f, 0.497f, -0.094f)
                curveToRelative(0.502f, 0.0f, 0.847f, 0.296f, 0.96f, 0.409f)
                curveToRelative(0.147f, 0.147f, 0.604f, 0.687f, 0.314f, 1.456f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
