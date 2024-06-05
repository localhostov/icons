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

public val Icons.Filled.CustomizeComputer: ImageVector
    get() {
        if (_customizeComputer != null) {
            return _customizeComputer!!
        }
        _customizeComputer = Builder(name = "CustomizeComputer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.988f, 11.726f)
                curveToRelative(0.158f, 1.78f, -1.24f, 3.274f, -2.988f, 3.274f)
                horizontalLineToRelative(-3.978f)
                curveToRelative(-0.691f, 0.0f, -1.181f, -0.666f, -0.975f, -1.325f)
                curveToRelative(0.502f, -1.609f, 1.936f, -4.165f, 4.24f, -4.608f)
                curveToRelative(1.755f, -0.338f, 3.542f, 0.879f, 3.7f, 2.659f)
                close()
                moveTo(16.022f, 8.064f)
                curveToRelative(0.74f, 0.558f, 1.279f, 1.309f, 1.611f, 2.141f)
                lineToRelative(5.659f, -6.085f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -5.573f, 6.513f, -5.573f, 6.513f)
                curveToRelative(0.609f, 0.175f, 1.191f, 0.456f, 1.708f, 0.846f)
                close()
                moveTo(16.689f, 15.376f)
                curveToRelative(-0.944f, 1.032f, -2.289f, 1.625f, -3.688f, 1.625f)
                horizontalLineToRelative(-3.978f)
                curveToRelative(-0.958f, 0.0f, -1.868f, -0.46f, -2.435f, -1.23f)
                reflectiveCurveToRelative(-0.735f, -1.776f, -0.45f, -2.69f)
                curveToRelative(0.729f, -2.332f, 2.621f, -5.229f, 5.565f, -5.915f)
                lineToRelative(4.388f, -5.164f)
                lineTo(5.0f, 2.002f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 6.285f)
                lineToRelative(-6.091f, 6.546f)
                curveToRelative(-0.16f, 0.94f, -0.568f, 1.83f, -1.22f, 2.543f)
                close()
            }
        }
        .build()
        return _customizeComputer!!
    }

private var _customizeComputer: ImageVector? = null
