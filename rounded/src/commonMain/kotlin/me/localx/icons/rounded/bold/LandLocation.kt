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

public val Icons.Bold.LandLocation: ImageVector
    get() {
        if (_landLocation != null) {
            return _landLocation!!
        }
        _landLocation = Builder(name = "LandLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.252f, 12.682f)
                curveToRelative(0.972f, 0.95f, 2.524f, 0.95f, 3.496f, 0.0f)
                lineToRelative(2.494f, -2.439f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                reflectiveCurveToRelative(-0.624f, -3.11f, -1.758f, -4.243f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.242f, -1.757f)
                reflectiveCurveToRelative(-3.11f, 0.624f, -4.242f, 1.757f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                reflectiveCurveToRelative(0.624f, 3.11f, 1.77f, 4.254f)
                lineToRelative(2.482f, 2.428f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(23.938f, 18.76f)
                lineToRelative(-1.0f, -5.999f)
                curveToRelative(-0.203f, -1.226f, -0.914f, -2.323f, -1.95f, -3.011f)
                curveToRelative(-0.69f, -0.457f, -1.62f, -0.27f, -2.08f, 0.42f)
                curveToRelative(-0.458f, 0.69f, -0.27f, 1.621f, 0.42f, 2.079f)
                curveToRelative(0.346f, 0.229f, 0.583f, 0.596f, 0.651f, 1.005f)
                lineToRelative(0.291f, 1.746f)
                lineTo(3.729f, 15.0f)
                lineToRelative(0.291f, -1.747f)
                curveToRelative(0.068f, -0.408f, 0.305f, -0.774f, 0.651f, -1.003f)
                curveToRelative(0.69f, -0.458f, 0.879f, -1.389f, 0.421f, -2.079f)
                reflectiveCurveToRelative(-1.388f, -0.877f, -2.079f, -0.421f)
                curveToRelative(-1.037f, 0.688f, -1.748f, 1.786f, -1.952f, 3.011f)
                lineTo(0.062f, 18.76f)
                curveToRelative(-0.218f, 1.308f, 0.148f, 2.637f, 1.004f, 3.648f)
                curveToRelative(0.857f, 1.012f, 2.108f, 1.592f, 3.434f, 1.592f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.325f, 0.0f, 2.576f, -0.58f, 3.434f, -1.592f)
                curveToRelative(0.856f, -1.011f, 1.223f, -2.341f, 1.005f, -3.648f)
                close()
                moveTo(14.119f, 18.0f)
                lineToRelative(0.25f, 3.0f)
                horizontalLineToRelative(-4.739f)
                lineToRelative(0.25f, -3.0f)
                horizontalLineToRelative(4.239f)
                close()
                moveTo(3.355f, 20.47f)
                curveToRelative(-0.29f, -0.343f, -0.409f, -0.774f, -0.335f, -1.216f)
                lineToRelative(0.209f, -1.254f)
                horizontalLineToRelative(3.641f)
                lineToRelative(-0.25f, 3.0f)
                horizontalLineToRelative(-2.12f)
                curveToRelative(-0.448f, 0.0f, -0.855f, -0.188f, -1.145f, -0.53f)
                close()
                moveTo(20.644f, 20.47f)
                curveToRelative(-0.29f, 0.342f, -0.696f, 0.53f, -1.145f, 0.53f)
                horizontalLineToRelative(-2.119f)
                lineToRelative(-0.25f, -3.0f)
                horizontalLineToRelative(3.64f)
                lineToRelative(0.209f, 1.254f)
                curveToRelative(0.073f, 0.441f, -0.046f, 0.873f, -0.335f, 1.216f)
                close()
            }
        }
        .build()
        return _landLocation!!
    }

private var _landLocation: ImageVector? = null
