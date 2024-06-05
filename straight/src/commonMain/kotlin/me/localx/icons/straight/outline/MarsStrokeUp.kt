package me.localx.icons.straight.outline

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
                moveTo(13.0f, 10.072f)
                verticalLineToRelative(-1.072f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 3.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 0.586f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.5f, -2.5f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.072f)
                curveToRelative(-3.387f, 0.487f, -6.0f, 3.408f, -6.0f, 6.928f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.52f, -2.613f, -6.441f, -6.0f, -6.928f)
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
