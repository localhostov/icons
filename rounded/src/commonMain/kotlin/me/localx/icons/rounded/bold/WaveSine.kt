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

public val Icons.Bold.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 21.0f)
                curveToRelative(-4.71f, 0.0f, -6.397f, -6.49f, -6.952f, -8.623f)
                curveToRelative(-0.756f, -2.909f, -2.072f, -6.377f, -4.048f, -6.377f)
                curveToRelative(-1.739f, 0.0f, -3.5f, 2.748f, -3.5f, 8.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                curveTo(0.0f, 7.42f, 2.612f, 3.0f, 6.5f, 3.0f)
                curveToRelative(4.71f, 0.0f, 6.397f, 6.49f, 6.952f, 8.623f)
                curveToRelative(0.756f, 2.909f, 2.072f, 6.377f, 4.048f, 6.377f)
                curveToRelative(1.739f, 0.0f, 3.5f, -2.748f, 3.5f, -8.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                curveToRelative(0.0f, 6.58f, -2.612f, 11.0f, -6.5f, 11.0f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
