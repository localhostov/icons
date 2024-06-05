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

public val Icons.Outline.PanFood: ImageVector
    get() {
        if (_panFood != null) {
            return _panFood!!
        }
        _panFood = Builder(name = "PanFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.627f, 6.444f)
                lineToRelative(1.056f, -1.642f)
                curveToRelative(0.509f, -0.791f, 0.397f, -1.83f, -0.268f, -2.496f)
                lineToRelative(-1.72f, -1.72f)
                curveToRelative(-0.665f, -0.665f, -1.704f, -0.777f, -2.496f, -0.268f)
                lineToRelative(-1.642f, 1.056f)
                curveToRelative(-1.663f, -0.873f, -3.551f, -1.373f, -5.556f, -1.373f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.005f, 0.501f, 3.893f, 1.373f, 5.556f)
                lineToRelative(-1.056f, 1.642f)
                curveToRelative(-0.509f, 0.791f, -0.397f, 1.83f, 0.268f, 2.496f)
                lineToRelative(1.72f, 1.72f)
                curveToRelative(0.665f, 0.665f, 1.704f, 0.777f, 2.496f, 0.268f)
                lineToRelative(1.642f, -1.056f)
                curveToRelative(1.663f, 0.873f, 3.551f, 1.373f, 5.556f, 1.373f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.005f, -0.501f, -3.893f, -1.373f, -5.556f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                close()
                moveTo(17.828f, 10.843f)
                curveToRelative(1.562f, 1.562f, 1.562f, 4.095f, 0.0f, 5.657f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(2.828f, -2.828f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _panFood!!
    }

private var _panFood: ImageVector? = null
