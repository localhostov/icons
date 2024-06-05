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

public val Icons.Filled.Spider: ImageVector
    get() {
        if (_spider != null) {
            return _spider!!
        }
        _spider = Builder(name = "Spider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.793f, 12.225f)
                lineToRelative(3.8f, 1.689f)
                curveToRelative(0.132f, 0.059f, 0.27f, 0.086f, 0.405f, 0.086f)
                curveToRelative(0.384f, 0.0f, 0.749f, -0.222f, 0.915f, -0.594f)
                curveToRelative(0.224f, -0.505f, -0.003f, -1.096f, -0.508f, -1.32f)
                lineToRelative(-7.25f, -3.222f)
                lineToRelative(2.958f, -1.381f)
                curveToRelative(1.753f, -0.818f, 2.886f, -2.597f, 2.886f, -4.531f)
                verticalLineToRelative(-1.953f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.953f)
                curveToRelative(0.0f, 1.161f, -0.68f, 2.228f, -1.731f, 2.718f)
                lineToRelative(-3.589f, 1.675f)
                curveToRelative(0.204f, -0.405f, 0.32f, -0.862f, 0.32f, -1.346f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.484f, 0.116f, 0.941f, 0.32f, 1.346f)
                lineToRelative(-3.589f, -1.675f)
                curveToRelative(-1.052f, -0.491f, -1.731f, -1.558f, -1.731f, -2.718f)
                verticalLineToRelative(-1.953f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.953f)
                curveToRelative(0.0f, 1.934f, 1.133f, 3.712f, 2.886f, 4.531f)
                lineToRelative(2.958f, 1.381f)
                lineTo(0.594f, 12.086f)
                curveToRelative(-0.504f, 0.224f, -0.732f, 0.815f, -0.507f, 1.32f)
                curveToRelative(0.166f, 0.373f, 0.531f, 0.594f, 0.914f, 0.594f)
                curveToRelative(0.136f, 0.0f, 0.273f, -0.027f, 0.406f, -0.086f)
                lineToRelative(3.8f, -1.689f)
                lineToRelative(-3.806f, 5.075f)
                curveToRelative(-0.903f, 1.203f, -1.4f, 2.694f, -1.4f, 4.2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.075f, 0.355f, -2.141f, 1.0f, -3.0f)
                lineToRelative(3.315f, -4.42f)
                curveToRelative(-0.204f, 0.603f, -0.315f, 1.249f, -0.315f, 1.92f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.671f, -0.111f, -1.317f, -0.315f, -1.92f)
                lineToRelative(3.315f, 4.421f)
                curveToRelative(0.645f, 0.858f, 1.0f, 1.924f, 1.0f, 2.999f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.506f, -0.497f, -2.997f, -1.4f, -4.199f)
                lineToRelative(-3.806f, -5.076f)
                close()
            }
        }
        .build()
        return _spider!!
    }

private var _spider: ImageVector? = null
