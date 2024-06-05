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

public val Icons.Filled.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.646f)
                arcTo(13.451f, 13.451f, 0.0f, false, true, 14.0f, 15.0f)
                curveToRelative(0.0f, 2.088f, -0.761f, 5.0f, -2.0f, 5.0f)
                reflectiveCurveToRelative(-2.0f, -2.912f, -2.0f, -5.0f)
                arcTo(13.451f, 13.451f, 0.0f, false, true, 12.0f, 7.646f)
                close()
                moveTo(15.0f, 3.146f)
                arcTo(2.63f, 2.63f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(2.628f, 2.628f, 0.0f, false, false, 9.0f, 3.141f)
                curveToRelative(-2.291f, 3.5f, -7.441f, 13.1f, -0.289f, 15.952f)
                curveTo(6.453f, 13.26f, 10.0f, 6.217f, 11.293f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                curveToRelative(1.312f, 0.943f, 4.835f, 7.989f, 2.582f, 13.8f)
                curveTo(22.442f, 16.244f, 17.291f, 6.639f, 15.0f, 3.147f)
                close()
                moveTo(14.611f, 21.522f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.944f, 0.645f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 15.0f, 24.0f)
                curveToRelative(-0.447f, 0.066f, -1.627f, -0.94f, -2.0f, -1.132f)
                arcToRelative(1.006f, 1.006f, 0.0f, true, true, -2.0f, 0.0f)
                curveToRelative(-0.381f, 0.2f, -1.546f, 1.194f, -2.0f, 1.132f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.556f, -1.832f)
                lineToRelative(1.029f, -0.618f)
                horizontalLineToRelative(0.0f)
                curveTo(-2.707f, 20.882f, -2.41f, 7.45f, 6.088f, 4.06f)
                curveTo(4.647f, 6.65f, 3.0f, 10.4f, 3.0f, 14.0f)
                curveToRelative(0.0f, 5.7f, 6.352f, 8.0f, 9.0f, 8.0f)
                reflectiveCurveToRelative(9.0f, -2.3f, 9.0f, -8.0f)
                curveToRelative(0.0f, -3.6f, -1.645f, -7.342f, -3.086f, -9.932f)
                curveTo(26.432f, 7.439f, 26.65f, 20.875f, 14.611f, 21.523f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null
