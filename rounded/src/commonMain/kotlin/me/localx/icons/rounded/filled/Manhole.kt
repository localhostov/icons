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

public val Icons.Filled.Manhole: ImageVector
    get() {
        if (_manhole != null) {
            return _manhole!!
        }
        _manhole = Builder(name = "Manhole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.028f, 0.388f)
                curveToRelative(-0.337f, -0.088f, -0.964f, 0.035f, -1.087f, 0.597f)
                curveToRelative(-0.192f, 0.876f, -1.003f, 1.515f, -1.941f, 1.515f)
                curveToRelative(-0.932f, 0.0f, -1.638f, -0.661f, -1.937f, -1.5f)
                curveToRelative(-0.242f, -0.682f, -0.735f, -0.704f, -1.063f, -0.619f)
                curveTo(3.83f, 1.716f, 0.0f, 6.419f, 0.0f, 12.0f)
                reflectiveCurveToRelative(3.83f, 10.284f, 9.0f, 11.619f)
                curveToRelative(0.328f, 0.085f, 0.821f, 0.062f, 1.063f, -0.619f)
                curveToRelative(0.299f, -0.839f, 1.005f, -1.5f, 1.937f, -1.5f)
                curveToRelative(0.937f, 0.0f, 1.749f, 0.639f, 1.941f, 1.515f)
                curveToRelative(0.123f, 0.562f, 0.75f, 0.685f, 1.087f, 0.597f)
                curveToRelative(5.155f, -1.345f, 8.972f, -6.041f, 8.972f, -11.612f)
                reflectiveCurveTo(20.184f, 1.733f, 15.028f, 0.388f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(19.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _manhole!!
    }

private var _manhole: ImageVector? = null
