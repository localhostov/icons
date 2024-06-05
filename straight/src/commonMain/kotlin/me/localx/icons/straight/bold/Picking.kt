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

public val Icons.Bold.Picking: ImageVector
    get() {
        if (_picking != null) {
            return _picking!!
        }
        _picking = Builder(name = "Picking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                verticalLineToRelative(11.582f)
                lineToRelative(-6.662f, 7.289f)
                lineToRelative(-0.038f, -0.035f)
                curveToRelative(-0.981f, 1.078f, -2.061f, 1.754f, -2.274f, 1.881f)
                curveToRelative(-0.321f, 0.192f, -0.675f, 0.283f, -1.023f, 0.283f)
                curveToRelative(-0.681f, 0.0f, -1.345f, -0.348f, -1.719f, -0.975f)
                curveToRelative(-0.565f, -0.947f, -0.258f, -2.172f, 0.687f, -2.739f)
                curveToRelative(0.848f, -0.516f, 2.03f, -1.635f, 2.03f, -2.286f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.354f, 0.495f, -2.594f, 1.309f, -3.553f)
                lineToRelative(-1.152f, 0.595f)
                lineToRelative(-2.302f, 4.626f)
                curveToRelative(-0.262f, 0.527f, -0.793f, 0.832f, -1.344f, 0.832f)
                curveToRelative(-0.225f, 0.0f, -0.452f, -0.05f, -0.667f, -0.157f)
                curveToRelative(-0.742f, -0.369f, -1.044f, -1.27f, -0.675f, -2.011f)
                lineToRelative(2.673f, -5.374f)
                lineToRelative(6.157f, -3.458f)
                verticalLineToRelative(3.213f)
                curveToRelative(0.478f, -0.136f, 0.979f, -0.213f, 1.5f, -0.213f)
                curveToRelative(2.781f, 0.0f, 5.081f, 2.078f, 5.444f, 4.761f)
                lineToRelative(3.056f, -3.343f)
                verticalLineToRelative(-7.418f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-8.999f, 2.914f)
                curveToRelative(-0.781f, 0.277f, -1.638f, -0.132f, -1.915f, -0.913f)
                curveToRelative(-0.277f, -0.781f, 0.132f, -1.638f, 0.913f, -1.915f)
                lineToRelative(9.439f, -3.086f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(20.5f)
                close()
            }
        }
        .build()
        return _picking!!
    }

private var _picking: ImageVector? = null
