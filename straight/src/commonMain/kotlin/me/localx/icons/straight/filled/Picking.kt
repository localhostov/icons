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

public val Icons.Filled.Picking: ImageVector
    get() {
        if (_picking != null) {
            return _picking!!
        }
        _picking = Builder(name = "Picking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.938f)
                lineTo(1.0f, 7.086f)
                curveToRelative(-0.781f, 0.277f, -1.19f, 1.134f, -0.913f, 1.915f)
                curveToRelative(0.277f, 0.781f, 1.134f, 1.19f, 1.915f, 0.913f)
                lineToRelative(8.999f, -2.914f)
                lineToRelative(-6.157f, 3.458f)
                lineToRelative(-2.673f, 5.374f)
                curveToRelative(-0.369f, 0.741f, -0.067f, 1.642f, 0.675f, 2.011f)
                curveToRelative(0.215f, 0.107f, 0.442f, 0.157f, 0.667f, 0.157f)
                curveToRelative(0.551f, 0.0f, 1.082f, -0.305f, 1.344f, -0.832f)
                lineToRelative(2.302f, -4.626f)
                lineToRelative(1.152f, -0.595f)
                curveToRelative(-0.815f, 0.96f, -1.309f, 2.199f, -1.309f, 3.553f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.651f, -1.183f, 1.771f, -2.03f, 2.286f)
                curveToRelative(-0.944f, 0.567f, -1.252f, 1.792f, -0.687f, 2.739f)
                curveToRelative(0.374f, 0.627f, 1.038f, 0.975f, 1.719f, 0.975f)
                curveToRelative(0.349f, 0.0f, 0.702f, -0.091f, 1.023f, -0.283f)
                curveToRelative(0.213f, -0.127f, 1.293f, -0.802f, 2.274f, -1.881f)
                lineToRelative(0.038f, 0.035f)
                lineToRelative(6.662f, -7.289f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _picking!!
    }

private var _picking: ImageVector? = null
