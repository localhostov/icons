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

public val Icons.Filled.Square2: ImageVector
    get() {
        if (_square2 != null) {
            return _square2!!
        }
        _square2 = Builder(name = "Square2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-5.162f)
                curveToRelative(-0.724f, 0.0f, -1.362f, -0.407f, -1.666f, -1.062f)
                curveToRelative(-0.307f, -0.663f, -0.203f, -1.423f, 0.272f, -1.983f)
                curveToRelative(0.634f, -0.749f, 1.569f, -1.258f, 2.559f, -1.797f)
                curveToRelative(1.905f, -1.038f, 3.057f, -1.778f, 2.994f, -3.29f)
                curveToRelative(-0.044f, -1.03f, -0.939f, -1.868f, -1.997f, -1.868f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(2.15f, 0.0f, 3.905f, 1.662f, 3.995f, 3.783f)
                curveToRelative(0.121f, 2.867f, -2.281f, 4.175f, -4.035f, 5.131f)
                curveToRelative(-0.673f, 0.367f, -1.315f, 0.717f, -1.742f, 1.086f)
                horizontalLineToRelative(4.781f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _square2!!
    }

private var _square2: ImageVector? = null
