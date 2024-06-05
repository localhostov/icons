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

public val Icons.Filled.Cucumber: ImageVector
    get() {
        if (_cucumber != null) {
            return _cucumber!!
        }
        _cucumber = Builder(name = "Cucumber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.976f, 0.186f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-2.695f, -0.915f, -5.749f, 1.661f, -7.235f, 4.839f)
                curveToRelative(-0.078f, -0.013f, -0.157f, -0.024f, -0.239f, -0.024f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.488f, 0.237f, 0.917f, 0.598f, 1.191f)
                curveToRelative(-0.582f, 1.16f, -1.245f, 2.08f, -2.065f, 2.867f)
                curveToRelative(-1.132f, 1.181f, -2.57f, 2.05f, -4.665f, 2.819f)
                curveToRelative(-0.09f, 0.033f, -0.178f, 0.073f, -0.268f, 0.109f)
                curveToRelative(-0.274f, -0.297f, -0.663f, -0.487f, -1.1f, -0.487f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.143f, 0.027f, 0.28f, 0.064f, 0.411f)
                curveToRelative(-2.172f, 1.627f, -3.594f, 3.952f, -2.879f, 6.058f)
                curveToRelative(0.691f, 2.022f, 3.354f, 3.026f, 6.146f, 3.026f)
                curveToRelative(1.201f, 0.0f, 2.426f, -0.187f, 3.528f, -0.558f)
                curveToRelative(0.127f, -0.043f, 0.25f, -0.093f, 0.375f, -0.138f)
                curveToRelative(0.266f, 0.42f, 0.731f, 0.701f, 1.265f, 0.701f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.131f, -0.022f, -0.255f, -0.053f, -0.376f)
                curveToRelative(3.293f, -1.697f, 6.046f, -4.173f, 8.049f, -7.217f)
                curveToRelative(0.158f, 0.057f, 0.327f, 0.093f, 0.504f, 0.093f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.469f, -0.219f, -0.882f, -0.556f, -1.157f)
                curveToRelative(0.381f, -0.803f, 0.719f, -1.633f, 1.003f, -2.491f)
                curveToRelative(1.238f, -3.741f, 0.444f, -8.67f, -2.472f, -9.666f)
                close()
                moveTo(12.5f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cucumber!!
    }

private var _cucumber: ImageVector? = null
