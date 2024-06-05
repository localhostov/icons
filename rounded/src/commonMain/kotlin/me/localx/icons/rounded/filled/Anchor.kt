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

public val Icons.Filled.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.392f, 13.001f)
                curveToRelative(-0.518f, -0.636f, -1.284f, -1.001f, -2.103f, -1.001f)
                horizontalLineToRelative(-1.289f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.289f)
                curveToRelative(0.214f, 0.0f, 0.415f, 0.096f, 0.552f, 0.264f)
                curveToRelative(0.076f, 0.093f, 0.196f, 0.29f, 0.141f, 0.557f)
                curveToRelative(-0.883f, 4.291f, -5.101f, 6.758f, -8.981f, 7.125f)
                verticalLineToRelative(-7.946f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.142f)
                curveToRelative(1.721f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.858f, 1.28f, 3.411f, 3.0f, 3.858f)
                verticalLineToRelative(4.142f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.946f)
                curveToRelative(-3.88f, -0.367f, -8.099f, -2.834f, -8.982f, -7.125f)
                curveToRelative(-0.055f, -0.268f, 0.065f, -0.464f, 0.141f, -0.558f)
                curveToRelative(0.137f, -0.167f, 0.338f, -0.264f, 0.552f, -0.264f)
                horizontalLineToRelative(1.289f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.289f)
                curveToRelative(-0.817f, 0.0f, -1.583f, 0.364f, -2.102f, 1.0f)
                curveTo(0.098f, 13.627f, -0.103f, 14.438f, 0.059f, 15.225f)
                curveToRelative(1.186f, 5.761f, 6.904f, 8.775f, 11.941f, 8.775f)
                reflectiveCurveToRelative(10.755f, -3.014f, 11.94f, -8.775f)
                curveToRelative(0.162f, -0.786f, -0.038f, -1.597f, -0.549f, -2.224f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
