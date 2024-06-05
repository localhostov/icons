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
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-5.113f, -5.113f)
                curveToRelative(1.502f, -1.817f, 2.406f, -4.145f, 2.406f, -6.68f)
                curveTo(21.0f, 4.71f, 16.29f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(0.0f, 4.71f, 0.0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.536f, 0.0f, 4.864f, -0.904f, 6.68f, -2.406f)
                lineToRelative(5.113f, 5.113f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(2.0f, 10.5f)
                curveTo(2.0f, 5.813f, 5.813f, 2.0f, 10.5f, 2.0f)
                reflectiveCurveToRelative(8.5f, 3.813f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.813f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(2.0f, 15.187f, 2.0f, 10.5f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.028f, 6.717f)
                curveToRelative(-1.221f, -2.048f, -3.275f, -3.032f, -5.492f, -2.629f)
                curveToRelative(-2.628f, 0.476f, -4.536f, 2.792f, -4.536f, 5.506f)
                verticalLineToRelative(0.406f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(2.151f, 0.0f, 4.031f, -1.522f, 4.372f, -3.542f)
                curveToRelative(0.01f, -0.06f, 0.047f, -0.1f, 0.078f, -0.124f)
                curveToRelative(0.956f, -0.738f, 1.55f, -1.92f, 1.55f, -3.085f)
                curveToRelative(0.0f, -1.661f, -1.222f, -3.112f, -2.972f, -3.533f)
                close()
                moveTo(14.228f, 11.751f)
                curveToRelative(-0.443f, 0.341f, -0.737f, 0.829f, -0.829f, 1.375f)
                curveToRelative(-0.177f, 1.051f, -1.231f, 1.874f, -2.399f, 1.874f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-0.406f)
                curveToRelative(0.0f, -1.747f, 1.216f, -3.234f, 2.893f, -3.538f)
                curveToRelative(0.214f, -0.039f, 0.418f, -0.056f, 0.611f, -0.056f)
                curveToRelative(1.588f, 0.0f, 2.482f, 1.195f, 2.815f, 1.757f)
                curveToRelative(0.268f, 0.451f, 0.719f, 0.78f, 1.24f, 0.905f)
                curveToRelative(0.694f, 0.166f, 1.441f, 0.733f, 1.441f, 1.588f)
                curveToRelative(0.0f, 0.55f, -0.303f, 1.14f, -0.772f, 1.501f)
                close()
            }
        }
        .build()
        return _panFrying!!
    }

private var _panFrying: ImageVector? = null
