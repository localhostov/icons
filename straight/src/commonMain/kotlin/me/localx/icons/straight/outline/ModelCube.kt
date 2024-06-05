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

public val Icons.Outline.ModelCube: ImageVector
    get() {
        if (_modelCube != null) {
            return _modelCube!!
        }
        _modelCube = Builder(name = "ModelCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.738f, -0.405f, 1.376f, -1.0f, 1.723f)
                verticalLineToRelative(4.475f)
                lineToRelative(-1.0f, 0.571f)
                lineToRelative(-1.0f, -0.571f)
                lineTo(11.0f, 3.723f)
                curveToRelative(-0.595f, -0.346f, -1.0f, -0.984f, -1.0f, -1.723f)
                close()
                moveTo(20.5f, 15.0f)
                curveToRelative(-0.363f, 0.0f, -0.699f, 0.104f, -0.992f, 0.273f)
                lineToRelative(-3.441f, -2.151f)
                lineToRelative(-1.015f, 0.544f)
                lineToRelative(-0.047f, 1.151f)
                lineToRelative(3.496f, 2.185f)
                curveToRelative(0.001f, 1.104f, 0.896f, 1.998f, 2.0f, 1.998f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.996f, 14.817f)
                lineToRelative(-0.047f, -1.151f)
                lineToRelative(-1.015f, -0.544f)
                lineToRelative(-3.441f, 2.151f)
                curveToRelative(-0.293f, -0.169f, -0.629f, -0.273f, -0.992f, -0.273f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(1.999f, -0.894f, 2.0f, -1.998f)
                lineToRelative(3.496f, -2.185f)
                close()
                moveTo(15.973f, 2.27f)
                curveToRelative(-0.048f, 0.711f, -0.268f, 1.375f, -0.641f, 1.937f)
                lineToRelative(4.143f, 2.371f)
                lineToRelative(-7.474f, 4.271f)
                lineToRelative(-7.477f, -4.273f)
                lineToRelative(4.145f, -2.37f)
                curveToRelative(-0.373f, -0.561f, -0.592f, -1.225f, -0.641f, -1.935f)
                lineTo(1.5f, 6.0f)
                verticalLineToRelative(7.556f)
                curveToRelative(0.591f, -0.344f, 1.268f, -0.556f, 2.0f, -0.556f)
                verticalLineToRelative(-4.705f)
                lineToRelative(7.5f, 4.285f)
                verticalLineToRelative(8.546f)
                lineToRelative(-3.976f, -2.273f)
                curveToRelative(-0.326f, 0.616f, -0.797f, 1.14f, -1.382f, 1.514f)
                lineToRelative(6.358f, 3.633f)
                lineToRelative(6.358f, -3.633f)
                curveToRelative(-0.586f, -0.374f, -1.057f, -0.898f, -1.383f, -1.516f)
                lineToRelative(-3.975f, 2.273f)
                verticalLineToRelative(-8.544f)
                lineToRelative(7.5f, -4.285f)
                verticalLineToRelative(4.705f)
                curveToRelative(0.732f, 0.0f, 1.409f, 0.212f, 2.0f, 0.556f)
                verticalLineToRelative(-7.556f)
                lineToRelative(-6.527f, -3.73f)
                close()
            }
        }
        .build()
        return _modelCube!!
    }

private var _modelCube: ImageVector? = null
