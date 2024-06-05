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

public val Icons.Outline.DroneAlt: ImageVector
    get() {
        if (_droneAlt != null) {
            return _droneAlt!!
        }
        _droneAlt = Builder(name = "DroneAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.996f)
                horizontalLineToRelative(-2.996f)
                lineToRelative(-0.004f, -1.004f)
                lineToRelative(-2.0f, 0.008f)
                lineToRelative(0.004f, 0.996f)
                horizontalLineToRelative(-3.004f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.012f)
                lineToRelative(0.017f, 4.395f)
                curveToRelative(-2.024f, -1.488f, -4.49f, -2.323f, -7.028f, -2.323f)
                reflectiveCurveToRelative(-4.981f, 0.827f, -7.0f, 2.302f)
                verticalLineToRelative(-4.373f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 3.997f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.987f)
                lineToRelative(0.339f, 0.299f)
                curveToRelative(0.485f, 0.427f, 1.28f, 1.07f, 2.299f, 1.701f)
                lineToRelative(-1.638f, 3.277f)
                verticalLineToRelative(2.736f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.264f)
                lineToRelative(1.403f, -2.806f)
                curveToRelative(1.35f, 0.612f, 2.917f, 1.07f, 4.597f, 1.07f)
                reflectiveCurveToRelative(3.247f, -0.457f, 4.598f, -1.069f)
                lineToRelative(1.402f, 2.804f)
                verticalLineToRelative(2.264f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.736f)
                lineToRelative(-1.638f, -3.276f)
                curveToRelative(1.04f, -0.645f, 1.851f, -1.304f, 2.342f, -1.74f)
                lineToRelative(0.338f, -0.3f)
                lineToRelative(-0.031f, -7.948f)
                horizontalLineToRelative(2.988f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.403f, 10.679f)
                lineToRelative(-1.317f, 1.317f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-1.317f, -1.317f)
                curveToRelative(1.074f, -0.394f, 2.218f, -0.611f, 3.403f, -0.611f)
                reflectiveCurveToRelative(2.329f, 0.217f, 3.403f, 0.611f)
                close()
                moveTo(12.0f, 15.996f)
                curveToRelative(-3.029f, 0.0f, -5.714f, -1.862f, -7.0f, -2.926f)
                verticalLineToRelative(-0.071f)
                curveToRelative(0.524f, -0.53f, 1.096f, -0.99f, 1.707f, -1.382f)
                lineToRelative(2.379f, 2.379f)
                horizontalLineToRelative(5.828f)
                lineToRelative(2.379f, -2.379f)
                curveToRelative(0.626f, 0.401f, 1.212f, 0.873f, 1.746f, 1.419f)
                verticalLineToRelative(0.003f)
                curveToRelative(-1.289f, 1.074f, -3.984f, 2.958f, -7.039f, 2.958f)
                close()
            }
        }
        .build()
        return _droneAlt!!
    }

private var _droneAlt: ImageVector? = null
