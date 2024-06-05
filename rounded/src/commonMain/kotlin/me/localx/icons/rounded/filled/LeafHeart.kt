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

public val Icons.Filled.LeafHeart: ImageVector
    get() {
        if (_leafHeart != null) {
            return _leafHeart!!
        }
        _leafHeart = Builder(name = "LeafHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.389f, 11.1f)
                curveToRelative(0.0f, 0.972f, -1.448f, 2.784f, -2.801f, 3.868f)
                curveToRelative(-0.053f, 0.043f, -0.123f, 0.042f, -0.176f, 0.0f)
                curveToRelative(-1.353f, -1.084f, -2.801f, -2.896f, -2.801f, -3.868f)
                curveToRelative(0.0f, -0.606f, 0.424f, -1.1f, 0.944f, -1.1f)
                curveToRelative(0.436f, 0.0f, 0.944f, 0.238f, 0.944f, 0.909f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.671f, 0.509f, -0.909f, 0.944f, -0.909f)
                curveToRelative(0.521f, 0.0f, 0.944f, 0.494f, 0.944f, 1.1f)
                close()
                moveTo(23.999f, 2.801f)
                curveToRelative(-0.215f, 6.847f, -1.473f, 11.833f, -3.737f, 14.817f)
                curveToRelative(-1.843f, 2.428f, -4.618f, 3.974f, -7.615f, 4.241f)
                curveToRelative(-0.308f, 0.028f, -0.614f, 0.041f, -0.918f, 0.041f)
                curveToRelative(-2.246f, 0.0f, -4.358f, -0.744f, -6.072f, -2.142f)
                lineToRelative(-3.949f, 3.949f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(3.949f, -3.948f)
                curveToRelative(-1.406f, -1.714f, -2.193f, -3.829f, -2.24f, -6.085f)
                curveToRelative(-0.057f, -2.735f, 0.978f, -5.307f, 2.912f, -7.241f)
                curveToRelative(2.417f, -2.417f, 5.254f, -2.604f, 7.997f, -2.783f)
                curveToRelative(2.422f, -0.159f, 4.926f, -0.323f, 7.508f, -1.925f)
                curveToRelative(0.658f, -0.411f, 1.475f, -0.414f, 2.184f, -0.004f)
                curveToRelative(0.866f, 0.5f, 1.427f, 1.502f, 1.396f, 2.495f)
                close()
                moveTo(17.389f, 11.1f)
                curveToRelative(0.0f, -1.709f, -1.321f, -3.1f, -2.944f, -3.1f)
                curveToRelative(-0.759f, 0.0f, -1.433f, 0.255f, -1.944f, 0.688f)
                curveToRelative(-0.512f, -0.433f, -1.186f, -0.688f, -1.944f, -0.688f)
                curveToRelative(-1.623f, 0.0f, -2.944f, 1.391f, -2.944f, 3.1f)
                curveToRelative(0.0f, 2.555f, 3.405f, 5.312f, 3.551f, 5.429f)
                curveToRelative(0.394f, 0.315f, 0.866f, 0.473f, 1.338f, 0.473f)
                reflectiveCurveToRelative(0.944f, -0.158f, 1.338f, -0.473f)
                curveToRelative(0.146f, -0.116f, 3.551f, -2.874f, 3.551f, -5.429f)
                close()
            }
        }
        .build()
        return _leafHeart!!
    }

private var _leafHeart: ImageVector? = null
