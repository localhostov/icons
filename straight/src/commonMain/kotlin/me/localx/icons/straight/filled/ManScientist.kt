package me.localx.icons.straight.filled

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

public val Icons.Filled.ManScientist: ImageVector
    get() {
        if (_manScientist != null) {
            return _manScientist!!
        }
        _manScientist = Builder(name = "ManScientist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(23.81f, 22.92f)
                curveToRelative(-0.312f, 0.666f, -0.945f, 1.08f, -1.653f, 1.08f)
                horizontalLineToRelative(-7.311f)
                curveToRelative(-0.708f, 0.0f, -1.342f, -0.414f, -1.653f, -1.08f)
                curveToRelative(-0.329f, -0.704f, -0.226f, -1.538f, 0.265f, -2.125f)
                lineToRelative(3.544f, -4.245f)
                verticalLineToRelative(-2.55f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.55f)
                lineToRelative(3.544f, 4.246f)
                curveToRelative(0.49f, 0.586f, 0.594f, 1.42f, 0.265f, 2.124f)
                close()
                moveTo(11.51f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.61f, 2.006f, -4.728f, 4.557f, -4.955f)
                lineToRelative(4.354f, 4.955f)
                lineToRelative(4.333f, -4.975f)
                curveToRelative(0.256f, 0.013f, 0.513f, 0.027f, 0.758f, 0.076f)
                verticalLineToRelative(2.921f)
                lineToRelative(-2.079f, 2.49f)
                curveToRelative(-0.985f, 1.18f, -1.198f, 2.85f, -0.541f, 4.255f)
                curveToRelative(0.038f, 0.081f, 0.086f, 0.155f, 0.129f, 0.232f)
                close()
            }
        }
        .build()
        return _manScientist!!
    }

private var _manScientist: ImageVector? = null
