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

public val Icons.Outline.CircleS: ImageVector
    get() {
        if (_circleS != null) {
            return _circleS!!
        }
        _circleS = Builder(name = "CircleS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.02f)
                curveTo(5.421f, 0.02f, 0.038f, 5.402f, 0.038f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.038f, 0.02f)
                close()
                moveTo(12.038f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.038f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(9.038f, 9.205f)
                curveToRelative(0.0f, 0.527f, 0.354f, 0.996f, 0.861f, 1.14f)
                lineToRelative(4.838f, 1.425f)
                curveToRelative(1.353f, 0.389f, 2.301f, 1.648f, 2.301f, 3.062f)
                curveToRelative(0.0f, 1.758f, -1.43f, 3.188f, -3.188f, 3.188f)
                horizontalLineToRelative(-3.312f)
                curveToRelative(-0.979f, 0.0f, -2.618f, 0.0f, -3.395f, -1.553f)
                curveToRelative(-0.247f, -0.494f, -0.047f, -1.095f, 0.447f, -1.342f)
                curveToRelative(0.494f, -0.246f, 1.095f, -0.047f, 1.342f, 0.447f)
                curveToRelative(0.189f, 0.38f, 0.586f, 0.447f, 1.605f, 0.447f)
                horizontalLineToRelative(3.312f)
                curveToRelative(0.655f, 0.0f, 1.188f, -0.533f, 1.188f, -1.188f)
                curveToRelative(0.0f, -0.527f, -0.354f, -0.997f, -0.859f, -1.143f)
                lineToRelative(-4.834f, -1.424f)
                curveToRelative(-1.354f, -0.384f, -2.307f, -1.644f, -2.307f, -3.061f)
                curveToRelative(0.0f, -1.756f, 1.429f, -3.185f, 3.186f, -3.185f)
                horizontalLineToRelative(3.314f)
                curveToRelative(0.979f, 0.0f, 2.618f, 0.0f, 3.395f, 1.553f)
                curveToRelative(0.247f, 0.494f, 0.047f, 1.095f, -0.447f, 1.342f)
                curveToRelative(-0.494f, 0.245f, -1.094f, 0.047f, -1.342f, -0.447f)
                curveToRelative(-0.189f, -0.38f, -0.586f, -0.447f, -1.605f, -0.447f)
                horizontalLineToRelative(-3.314f)
                curveToRelative(-0.653f, 0.0f, -1.186f, 0.531f, -1.186f, 1.185f)
                close()
            }
        }
        .build()
        return _circleS!!
    }

private var _circleS: ImageVector? = null
