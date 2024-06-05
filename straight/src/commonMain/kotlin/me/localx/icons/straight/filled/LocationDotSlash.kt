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

public val Icons.Filled.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.534f, 6.777f)
                lineToRelative(13.384f, 13.384f)
                lineToRelative(-3.918f, 3.833f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-2.782f, -2.782f, -3.608f, -6.792f, -2.403f, -10.308f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.197f, 3.197f)
                curveToRelative(0.093f, -0.101f, 0.177f, -0.208f, 0.275f, -0.306f)
                curveTo(6.817f, 1.047f, 9.327f, 0.007f, 11.997f, 0.007f)
                horizontalLineToRelative(0.004f)
                curveTo(14.672f, 0.007f, 17.183f, 1.047f, 19.071f, 2.936f)
                curveToRelative(1.889f, 1.889f, 2.929f, 4.399f, 2.929f, 7.071f)
                reflectiveCurveToRelative(-1.04f, 5.182f, -2.929f, 7.07f)
                lineToRelative(-0.293f, 0.287f)
                lineToRelative(5.179f, 5.179f)
                close()
                moveTo(15.536f, 6.464f)
                curveToRelative(-1.953f, -1.953f, -5.118f, -1.953f, -7.071f, 0.0f)
                curveToRelative(-0.1f, 0.1f, -0.173f, 0.216f, -0.263f, 0.323f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.083f, -0.11f, 0.163f, -0.222f, 0.263f, -0.323f)
                curveToRelative(1.172f, -1.172f, 3.071f, -1.172f, 4.243f, 0.0f)
                reflectiveCurveToRelative(1.172f, 3.071f, 0.0f, 4.243f)
                curveToRelative(-0.1f, 0.1f, -0.212f, 0.18f, -0.323f, 0.263f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.107f, -0.09f, 0.222f, -0.163f, 0.323f, -0.263f)
                curveToRelative(1.953f, -1.953f, 1.953f, -5.118f, 0.0f, -7.071f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
