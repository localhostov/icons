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

public val Icons.Outline.Tricycle: ImageVector
    get() {
        if (_tricycle != null) {
            return _tricycle!!
        }
        _tricycle = Builder(name = "Tricycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.421f, 13.083f)
                curveToRelative(-0.415f, -4.664f, -1.429f, -8.796f, -2.024f, -10.906f)
                curveToRelative(-0.361f, -1.282f, -1.547f, -2.177f, -2.885f, -2.177f)
                horizontalLineToRelative(-3.513f)
                lineTo(10.999f, 2.0f)
                horizontalLineToRelative(3.513f)
                curveToRelative(0.446f, 0.0f, 0.84f, 0.296f, 0.96f, 0.719f)
                curveToRelative(0.362f, 1.284f, 0.885f, 3.349f, 1.325f, 5.817f)
                curveToRelative(-1.776f, 0.12f, -5.197f, 0.573f, -8.251f, 2.133f)
                lineToRelative(-1.064f, -2.67f)
                horizontalLineToRelative(2.517f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 5.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.33f)
                lineToRelative(1.482f, 3.72f)
                curveToRelative(-1.488f, 1.065f, -2.761f, 2.477f, -3.529f, 4.352f)
                curveToRelative(-1.863f, 0.34f, -3.283f, 1.968f, -3.283f, 3.927f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.713f, -1.087f, -3.165f, -2.604f, -3.735f)
                curveToRelative(2.416f, -4.674f, 9.284f, -5.56f, 11.725f, -5.726f)
                curveToRelative(0.117f, 0.827f, 0.213f, 1.691f, 0.294f, 2.569f)
                curveToRelative(-2.515f, 0.505f, -4.416f, 2.73f, -4.416f, 5.392f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                curveToRelative(0.0f, -2.718f, -1.984f, -4.976f, -4.579f, -5.417f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(18.5f, 22.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _tricycle!!
    }

private var _tricycle: ImageVector? = null
