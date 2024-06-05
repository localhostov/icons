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

public val Icons.Filled.Circle2: ImageVector
    get() {
        if (_circle2 != null) {
            return _circle2!!
        }
        _circle2 = Builder(name = "Circle2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-5.162f)
                curveToRelative(-0.724f, 0.0f, -1.362f, -0.407f, -1.666f, -1.062f)
                curveToRelative(-0.307f, -0.664f, -0.203f, -1.424f, 0.272f, -1.983f)
                curveToRelative(0.634f, -0.748f, 1.569f, -1.257f, 2.559f, -1.797f)
                curveToRelative(1.906f, -1.037f, 3.058f, -1.777f, 2.994f, -3.29f)
                curveToRelative(-0.043f, -1.029f, -0.939f, -1.867f, -1.997f, -1.867f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(2.151f, 0.0f, 3.906f, 1.662f, 3.995f, 3.783f)
                curveToRelative(0.122f, 2.866f, -2.281f, 4.175f, -4.035f, 5.131f)
                curveToRelative(-0.673f, 0.366f, -1.315f, 0.716f, -1.742f, 1.086f)
                horizontalLineToRelative(4.781f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _circle2!!
    }

private var _circle2: ImageVector? = null
