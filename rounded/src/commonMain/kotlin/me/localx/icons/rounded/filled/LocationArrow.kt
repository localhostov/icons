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

public val Icons.Filled.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.595f, 23.999f)
                curveToRelative(-0.229f, 0.0f, -0.455f, -0.021f, -0.674f, -0.061f)
                curveToRelative(-1.467f, -0.267f, -2.947f, -1.463f, -2.947f, -3.532f)
                verticalLineToRelative(-6.394f)
                horizontalLineTo(3.595f)
                curveTo(1.524f, 14.013f, 0.328f, 12.532f, 0.061f, 11.064f)
                curveToRelative(-0.267f, -1.467f, 0.331f, -3.273f, 2.268f, -4.003f)
                lineTo(18.723f, 0.268f)
                curveToRelative(1.473f, -0.555f, 3.047f, -0.216f, 4.136f, 0.874f)
                curveToRelative(1.091f, 1.09f, 1.43f, 2.663f, 0.886f, 4.105f)
                lineToRelative(-6.83f, 16.457f)
                curveToRelative(-0.611f, 1.621f, -2.011f, 2.295f, -3.319f, 2.295f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
