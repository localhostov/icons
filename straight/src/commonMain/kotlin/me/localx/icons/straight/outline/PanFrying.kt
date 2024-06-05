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

public val Icons.Outline.PanFrying: ImageVector
    get() {
        if (_panFrying != null) {
            return _panFrying!!
        }
        _panFrying = Builder(name = "PanFrying", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.97f, 22.556f)
                lineToRelative(-5.375f, -5.375f)
                curveToRelative(1.502f, -1.817f, 2.405f, -4.145f, 2.405f, -6.681f)
                curveTo(21.0f, 4.71f, 16.29f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(0.0f, 4.71f, 0.0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.536f, 0.0f, 4.864f, -0.904f, 6.681f, -2.405f)
                lineToRelative(5.375f, 5.375f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.5f, 19.0f)
                curveToRelative(-4.687f, 0.0f, -8.5f, -3.813f, -8.5f, -8.5f)
                reflectiveCurveTo(5.813f, 2.0f, 10.5f, 2.0f)
                reflectiveCurveToRelative(8.5f, 3.813f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.813f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.027f, 6.716f)
                curveToRelative(-1.017f, -1.71f, -2.677f, -2.716f, -4.527f, -2.716f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(2.228f, 0.0f, 4.077f, -1.547f, 4.381f, -3.613f)
                curveToRelative(0.986f, -0.722f, 1.619f, -1.918f, 1.619f, -3.137f)
                curveToRelative(0.0f, -1.688f, -1.245f, -3.128f, -2.973f, -3.534f)
                close()
                moveTo(13.971f, 11.915f)
                lineToRelative(-0.542f, 0.33f)
                verticalLineToRelative(0.612f)
                curveToRelative(0.0f, 1.282f, -1.256f, 2.143f, -2.429f, 2.143f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.232f, 0.0f, 2.348f, 0.771f, 2.984f, 2.062f)
                lineToRelative(0.245f, 0.496f)
                lineToRelative(0.55f, 0.056f)
                curveToRelative(0.846f, 0.087f, 1.721f, 0.723f, 1.721f, 1.636f)
                curveToRelative(0.0f, 0.661f, -0.433f, 1.361f, -1.029f, 1.665f)
                close()
            }
        }
        .build()
        return _panFrying!!
    }

private var _panFrying: ImageVector? = null
