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

public val Icons.Outline.TruckContainerEmpty: ImageVector
    get() {
        if (_truckContainerEmpty != null) {
            return _truckContainerEmpty!!
        }
        _truckContainerEmpty = Builder(name = "TruckContainerEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.641f, 10.76f)
                lineToRelative(-0.901f, -2.704f)
                curveToRelative(-0.609f, -1.827f, -2.312f, -3.056f, -4.239f, -3.056f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.987f, 0.42f, 1.933f, 1.152f, 2.596f)
                curveToRelative(0.645f, 0.584f, 1.488f, 0.904f, 2.356f, 0.904f)
                curveToRelative(0.116f, 0.0f, 0.233f, -0.006f, 0.35f, -0.018f)
                curveToRelative(0.824f, -0.083f, 1.564f, -0.476f, 2.119f, -1.059f)
                curveToRelative(0.637f, 0.663f, 1.533f, 1.077f, 2.523f, 1.077f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.769f)
                curveToRelative(0.597f, -0.346f, 1.0f, -0.992f, 1.0f, -1.731f)
                verticalLineToRelative(-4.026f)
                curveToRelative(0.0f, -0.753f, -0.121f, -1.498f, -0.359f, -2.214f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(18.5f, 7.0f)
                curveToRelative(1.064f, 0.0f, 2.005f, 0.679f, 2.342f, 1.688f)
                lineToRelative(0.771f, 2.312f)
                horizontalLineToRelative(-3.612f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.659f, 20.992f)
                curveToRelative(-0.436f, 0.038f, -0.847f, -0.092f, -1.165f, -0.38f)
                curveToRelative(-0.319f, -0.288f, -0.494f, -0.683f, -0.494f, -1.112f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.357f)
                curveToRelative(0.0f, 0.841f, -0.589f, 1.56f, -1.341f, 1.635f)
                close()
                moveTo(10.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(19.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _truckContainerEmpty!!
    }

private var _truckContainerEmpty: ImageVector? = null
