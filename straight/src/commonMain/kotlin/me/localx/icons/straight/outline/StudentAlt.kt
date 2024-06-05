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

public val Icons.Outline.StudentAlt: ImageVector
    get() {
        if (_studentAlt != null) {
            return _studentAlt!!
        }
        _studentAlt = Builder(name = "StudentAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.03f, 0.476f)
                curveToRelative(-1.255f, -0.638f, -2.875f, -0.637f, -4.125f, 0.0f)
                lineTo(0.052f, 5.5f)
                lineToRelative(4.948f, 2.523f)
                verticalLineToRelative(5.811f)
                curveToRelative(0.629f, 0.094f, 1.303f, 0.188f, 2.0f, 0.276f)
                verticalLineToRelative(-5.067f)
                lineToRelative(2.904f, 1.481f)
                curveToRelative(0.626f, 0.32f, 1.345f, 0.48f, 2.063f, 0.48f)
                reflectiveCurveToRelative(1.437f, -0.16f, 2.064f, -0.48f)
                lineToRelative(2.969f, -1.513f)
                verticalLineToRelative(5.1f)
                curveToRelative(0.697f, -0.088f, 1.371f, -0.183f, 2.0f, -0.276f)
                verticalLineToRelative(-5.844f)
                lineToRelative(3.0f, -1.529f)
                verticalLineToRelative(6.884f)
                curveToRelative(0.266f, -0.047f, 0.432f, -0.078f, 0.442f, -0.08f)
                lineToRelative(1.558f, -0.295f)
                verticalLineToRelative(-7.469f)
                lineTo(14.03f, 0.476f)
                close()
                moveTo(13.123f, 8.742f)
                curveToRelative(-0.681f, 0.346f, -1.63f, 0.348f, -2.31f, 0.0f)
                lineToRelative(-6.357f, -3.241f)
                lineToRelative(6.357f, -3.241f)
                curveToRelative(0.68f, -0.347f, 1.63f, -0.346f, 2.311f, 0.0f)
                lineToRelative(6.357f, 3.242f)
                lineToRelative(-6.358f, 3.241f)
                close()
                moveTo(12.0f, 16.501f)
                curveToRelative(-4.047f, 0.0f, -10.747f, -1.258f, -10.814f, -1.271f)
                lineToRelative(-1.186f, -0.225f)
                verticalLineToRelative(8.991f)
                lineToRelative(1.186f, -0.225f)
                curveToRelative(0.067f, -0.013f, 6.764f, -1.271f, 10.814f, -1.271f)
                reflectiveCurveToRelative(10.747f, 1.258f, 10.814f, 1.271f)
                lineToRelative(1.186f, 0.225f)
                verticalLineToRelative(-8.991f)
                lineToRelative(-1.186f, 0.225f)
                curveToRelative(-0.067f, 0.013f, -6.764f, 1.271f, -10.814f, 1.271f)
                close()
                moveTo(2.0f, 17.407f)
                curveToRelative(1.944f, 0.334f, 5.884f, 0.952f, 9.0f, 1.072f)
                verticalLineToRelative(2.044f)
                curveToRelative(-3.116f, 0.12f, -7.056f, 0.738f, -9.0f, 1.072f)
                verticalLineToRelative(-4.188f)
                close()
                moveTo(22.0f, 21.595f)
                curveToRelative(-1.944f, -0.334f, -5.884f, -0.952f, -9.0f, -1.072f)
                verticalLineToRelative(-2.044f)
                curveToRelative(3.116f, -0.12f, 7.056f, -0.738f, 9.0f, -1.072f)
                verticalLineToRelative(4.188f)
                close()
            }
        }
        .build()
        return _studentAlt!!
    }

private var _studentAlt: ImageVector? = null
