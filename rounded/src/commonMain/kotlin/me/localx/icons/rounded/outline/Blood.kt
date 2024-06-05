package me.localx.icons.rounded.outline

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

public val Icons.Outline.Blood: ImageVector
    get() {
        if (_blood != null) {
            return _blood!!
        }
        _blood = Builder(name = "Blood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.04f, 11.856f)
                curveToRelative(-1.07f, -1.089f, -3.01f, -1.089f, -4.08f, 0.0f)
                lineToRelative(-2.202f, 1.901f)
                curveToRelative(-2.339f, 2.339f, -2.339f, 6.146f, 0.0f, 8.485f)
                curveToRelative(1.133f, 1.133f, 2.64f, 1.757f, 4.242f, 1.757f)
                reflectiveCurveToRelative(3.109f, -0.624f, 4.243f, -1.757f)
                curveToRelative(2.339f, -2.339f, 2.339f, -6.146f, -0.054f, -8.536f)
                lineToRelative(-2.148f, -1.851f)
                close()
                moveTo(8.829f, 20.828f)
                curveToRelative(-1.512f, 1.512f, -4.146f, 1.511f, -5.657f, 0.0f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.098f, -0.054f, -5.606f)
                curveToRelative(0.0f, 0.0f, 2.234f, -1.927f, 2.258f, -1.953f)
                curveToRelative(0.164f, -0.174f, 0.386f, -0.27f, 0.625f, -0.27f)
                reflectiveCurveToRelative(0.461f, 0.096f, 0.625f, 0.27f)
                curveToRelative(0.024f, 0.025f, 2.204f, 1.902f, 2.204f, 1.902f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.098f, 0.0f, 5.657f)
                close()
                moveTo(22.361f, 8.583f)
                lineToRelative(-1.947f, -1.798f)
                curveToRelative(-1.054f, -1.032f, -2.772f, -1.032f, -3.806f, -0.02f)
                lineToRelative(-1.996f, 1.845f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.572f, 2.851f, 1.611f, 3.889f)
                curveToRelative(1.039f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.85f, -0.572f, 3.889f, -1.611f)
                curveToRelative(2.145f, -2.145f, 2.145f, -5.634f, -0.028f, -7.806f)
                close()
                moveTo(20.975f, 14.974f)
                curveToRelative(-1.322f, 1.322f, -3.627f, 1.323f, -4.95f, 0.0f)
                curveToRelative(-0.661f, -0.661f, -1.025f, -1.54f, -1.025f, -2.475f)
                reflectiveCurveToRelative(0.364f, -1.814f, 0.997f, -2.448f)
                lineToRelative(1.988f, -1.837f)
                curveToRelative(0.14f, -0.137f, 0.322f, -0.206f, 0.508f, -0.206f)
                curveToRelative(0.192f, 0.0f, 0.388f, 0.075f, 0.542f, 0.226f)
                lineToRelative(1.939f, 1.791f)
                curveToRelative(1.365f, 1.365f, 1.365f, 3.585f, 0.0f, 4.95f)
                close()
                moveTo(12.862f, 2.207f)
                lineToRelative(-1.501f, -1.652f)
                curveToRelative(-0.75f, -0.732f, -1.971f, -0.734f, -2.764f, 0.043f)
                lineToRelative(-1.425f, 1.574f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.171f, 2.828f)
                reflectiveCurveToRelative(1.76f, 1.172f, 2.829f, 1.172f)
                reflectiveCurveToRelative(2.073f, -0.416f, 2.829f, -1.172f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.097f, 0.034f, -5.621f)
                close()
                moveTo(11.414f, 6.414f)
                curveToRelative(-0.756f, 0.756f, -2.073f, 0.756f, -2.828f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.378f, -0.378f, -0.586f, -0.88f, -0.586f, -1.414f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.62f, -1.449f)
                lineToRelative(1.38f, -1.522f)
                lineToRelative(1.415f, 1.558f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.048f, 0.0f, 2.828f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
