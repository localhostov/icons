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

public val Icons.Bold.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(name = "Ufo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.508f, 8.957f)
                curveToRelative(-0.787f, -2.854f, -3.406f, -4.957f, -6.508f, -4.957f)
                reflectiveCurveToRelative(-5.72f, 2.103f, -6.508f, 4.957f)
                curveTo(1.992f, 10.012f, 0.0f, 11.843f, 0.0f, 14.035f)
                curveToRelative(0.0f, 3.916f, 6.037f, 5.965f, 12.0f, 5.965f)
                reflectiveCurveToRelative(12.0f, -2.049f, 12.0f, -5.965f)
                curveToRelative(0.0f, -2.192f, -1.992f, -4.023f, -5.492f, -5.078f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.921f, 0.0f, 3.509f, 1.452f, 3.725f, 3.316f)
                curveToRelative(-0.541f, 0.281f, -1.673f, 0.684f, -3.725f, 0.684f)
                curveToRelative(-2.073f, 0.0f, -3.208f, -0.41f, -3.726f, -0.675f)
                curveToRelative(0.211f, -1.868f, 1.802f, -3.325f, 3.726f, -3.325f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-5.583f, 0.0f, -9.0f, -1.92f, -9.0f, -2.965f)
                curveToRelative(0.0f, -0.461f, 0.831f, -1.295f, 2.646f, -1.967f)
                curveToRelative(0.409f, 0.457f, 2.061f, 1.932f, 6.354f, 1.932f)
                reflectiveCurveToRelative(5.945f, -1.475f, 6.354f, -1.932f)
                curveToRelative(1.815f, 0.671f, 2.646f, 1.506f, 2.646f, 1.967f)
                curveToRelative(0.0f, 1.045f, -3.417f, 2.965f, -9.0f, 2.965f)
                close()
            }
        }
        .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
