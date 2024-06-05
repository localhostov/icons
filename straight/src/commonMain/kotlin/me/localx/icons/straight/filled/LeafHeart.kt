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
                moveToRelative(16.0f, 10.43f)
                curveToRelative(0.0f, 1.239f, -1.891f, 3.186f, -3.499f, 4.428f)
                curveToRelative(-1.414f, -1.1f, -3.501f, -3.096f, -3.501f, -4.428f)
                curveToRelative(0.0f, -0.789f, 0.561f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.622f, 0.0f, 1.25f, 0.374f, 1.25f, 1.209f)
                verticalLineToRelative(0.791f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.791f)
                curveToRelative(0.0f, -0.835f, 0.628f, -1.209f, 1.25f, -1.209f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.642f, 1.25f, 1.43f)
                close()
                moveTo(24.0f, -0.004f)
                verticalLineToRelative(1.606f)
                curveToRelative(0.0f, 6.461f, -0.608f, 13.049f, -5.019f, 17.46f)
                curveToRelative(-1.939f, 1.939f, -4.486f, 2.909f, -7.033f, 2.909f)
                curveToRelative(-2.229f, 0.0f, -4.458f, -0.742f, -6.279f, -2.226f)
                lineToRelative(-4.222f, 4.222f)
                lineTo(0.033f, 22.553f)
                lineToRelative(4.219f, -4.219f)
                curveToRelative(-1.459f, -1.774f, -2.252f, -3.979f, -2.252f, -6.305f)
                curveToRelative(0.0f, -2.657f, 1.035f, -5.155f, 2.914f, -7.034f)
                curveToRelative(2.854f, -2.856f, 6.34f, -2.905f, 9.71f, -2.953f)
                curveToRelative(0.605f, -0.008f, 1.218f, -0.017f, 1.837f, -0.041f)
                curveToRelative(1.954f, -0.077f, 4.046f, -0.287f, 6.098f, -1.296f)
                lineTo(24.0f, -0.004f)
                close()
                moveTo(18.0f, 10.43f)
                curveToRelative(0.0f, -1.892f, -1.458f, -3.43f, -3.25f, -3.43f)
                curveToRelative(-0.89f, 0.0f, -1.675f, 0.318f, -2.25f, 0.852f)
                curveToRelative(-0.575f, -0.533f, -1.36f, -0.852f, -2.25f, -0.852f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.539f, -3.25f, 3.43f)
                curveToRelative(0.0f, 2.982f, 4.425f, 6.141f, 4.93f, 6.491f)
                lineToRelative(0.57f, 0.396f)
                lineToRelative(0.57f, -0.396f)
                curveToRelative(0.505f, -0.35f, 4.93f, -3.509f, 4.93f, -6.491f)
                close()
            }
        }
        .build()
        return _leafHeart!!
    }

private var _leafHeart: ImageVector? = null
