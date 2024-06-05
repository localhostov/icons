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

public val Icons.Filled.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.624f, 12.004f)
                lineToRelative(-2.436f, 3.996f)
                horizontalLineToRelative(-4.425f)
                lineToRelative(-2.318f, -4.118f)
                lineToRelative(2.368f, -3.884f)
                horizontalLineToRelative(4.378f)
                reflectiveCurveToRelative(2.433f, 4.006f, 2.433f, 4.006f)
                close()
                moveTo(11.032f, 5.998f)
                horizontalLineToRelative(11.357f)
                curveToRelative(-1.672f, -2.882f, -4.51f, -5.009f, -7.863f, -5.73f)
                lineToRelative(-3.493f, 5.73f)
                close()
                moveTo(22.493f, 17.816f)
                curveToRelative(0.959f, -1.724f, 1.507f, -3.707f, 1.507f, -5.816f)
                curveToRelative(0.0f, -1.402f, -0.243f, -2.749f, -0.687f, -4.001f)
                horizontalLineToRelative(-6.782f)
                reflectiveCurveToRelative(5.962f, 9.817f, 5.962f, 9.817f)
                close()
                moveTo(1.728f, 5.801f)
                curveToRelative(-1.096f, 1.81f, -1.728f, 3.932f, -1.728f, 6.199f)
                curveToRelative(0.0f, 1.402f, 0.242f, 2.748f, 0.686f, 4.0f)
                horizontalLineToRelative(6.783f)
                lineTo(1.728f, 5.801f)
                close()
                moveTo(6.321f, 9.885f)
                lineTo(12.344f, 0.005f)
                curveToRelative(-0.114f, -0.003f, -0.229f, -0.005f, -0.344f, -0.005f)
                curveToRelative(-3.565f, 0.0f, -6.77f, 1.563f, -8.97f, 4.038f)
                lineToRelative(3.291f, 5.847f)
                close()
                moveTo(17.792f, 13.929f)
                lineToRelative(-6.136f, 10.066f)
                curveToRelative(0.114f, 0.003f, 0.229f, 0.005f, 0.344f, 0.005f)
                curveToRelative(3.721f, 0.0f, 7.052f, -1.702f, 9.255f, -4.37f)
                lineToRelative(-3.463f, -5.702f)
                close()
                moveTo(12.968f, 18.0f)
                lineTo(1.611f, 18.0f)
                curveToRelative(1.672f, 2.884f, 4.51f, 5.011f, 7.864f, 5.732f)
                lineToRelative(3.494f, -5.732f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
