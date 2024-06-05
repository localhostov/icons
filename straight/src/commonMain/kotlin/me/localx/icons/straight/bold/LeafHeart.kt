package me.localx.icons.straight.bold

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

public val Icons.Bold.LeafHeart: ImageVector
    get() {
        if (_leafHeart != null) {
            return _leafHeart!!
        }
        _leafHeart = Builder(name = "LeafHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.838f, 1.051f)
                curveToRelative(-2.376f, 1.169f, -4.897f, 1.135f, -7.333f, 1.103f)
                curveToRelative(-3.291f, -0.043f, -6.712f, -0.089f, -9.576f, 2.775f)
                curveToRelative(-3.539f, 3.539f, -3.866f, 9.091f, -0.981f, 13.002f)
                lineTo(0.004f, 21.875f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.943f, -3.943f)
                curveToRelative(1.708f, 1.264f, 3.767f, 1.947f, 5.932f, 1.947f)
                curveToRelative(2.672f, 0.0f, 5.183f, -1.04f, 7.071f, -2.929f)
                curveToRelative(4.547f, -4.548f, 4.929f, -10.991f, 4.929f, -16.673f)
                lineTo(24.0f, -0.012f)
                lineToRelative(-2.162f, 1.063f)
                close()
                moveTo(16.95f, 16.949f)
                curveToRelative(-1.322f, 1.322f, -3.08f, 2.05f, -4.95f, 2.05f)
                reflectiveCurveToRelative(-3.628f, -0.728f, -4.95f, -2.05f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                curveToRelative(1.696f, -1.696f, 3.717f, -1.907f, 6.189f, -1.907f)
                curveToRelative(0.397f, 0.0f, 0.806f, 0.005f, 1.226f, 0.011f)
                curveToRelative(2.017f, 0.026f, 4.232f, 0.057f, 6.503f, -0.577f)
                curveToRelative(-0.168f, 5.26f, -1.055f, 9.409f, -4.018f, 12.372f)
                close()
                moveTo(14.769f, 7.874f)
                curveToRelative(1.243f, 0.0f, 2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, 2.592f, -4.5f, 5.775f, -4.5f, 5.775f)
                curveToRelative(0.0f, 0.0f, -4.5f, -3.183f, -4.5f, -5.775f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                close()
            }
        }
        .build()
        return _leafHeart!!
    }

private var _leafHeart: ImageVector? = null
