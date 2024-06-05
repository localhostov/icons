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

public val Icons.Outline.MarsStrokeUp: ImageVector
    get() {
        if (_marsStrokeUp != null) {
            return _marsStrokeUp!!
        }
        _marsStrokeUp = Builder(name = "MarsStrokeUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.08f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 2.568f)
                lineToRelative(2.317f, 2.163f)
                curveToRelative(0.193f, 0.18f, 0.438f, 0.269f, 0.683f, 0.269f)
                curveToRelative(0.268f, 0.0f, 0.534f, -0.106f, 0.731f, -0.317f)
                curveToRelative(0.376f, -0.404f, 0.354f, -1.037f, -0.049f, -1.414f)
                lineTo(14.121f, 0.879f)
                curveToRelative(-1.17f, -1.169f, -3.073f, -1.17f, -4.218f, -0.024f)
                lineToRelative(-2.586f, 2.414f)
                curveToRelative(-0.403f, 0.377f, -0.425f, 1.01f, -0.049f, 1.414f)
                curveToRelative(0.379f, 0.404f, 1.01f, 0.426f, 1.414f, 0.048f)
                lineToRelative(2.317f, -2.164f)
                lineTo(10.999f, 7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.08f)
                curveToRelative(-3.386f, 0.488f, -6.0f, 3.401f, -6.0f, 6.92f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.519f, -2.614f, -6.432f, -6.0f, -6.92f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _marsStrokeUp!!
    }

private var _marsStrokeUp: ImageVector? = null
