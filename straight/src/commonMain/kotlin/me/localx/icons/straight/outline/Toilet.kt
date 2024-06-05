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

public val Icons.Outline.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.625f)
                curveToRelative(-1.273f, 0.76f, -2.0f, 1.926f, -2.0f, 2.875f)
                curveToRelative(0.0f, 2.727f, 2.326f, 6.634f, 7.285f, 7.375f)
                curveToRelative(-0.528f, 2.378f, -3.285f, 1.412f, -3.285f, 4.125f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.0f, -2.713f, -2.757f, -1.746f, -3.285f, -4.125f)
                curveToRelative(4.959f, -0.742f, 7.285f, -4.648f, 7.285f, -7.375f)
                curveToRelative(0.0f, -0.948f, -0.727f, -2.115f, -2.0f, -2.875f)
                verticalLineToRelative(-4.625f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.032f)
                lineToRelative(-10.0f, -0.031f)
                lineTo(7.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.761f, 0.0f, -4.621f, -1.116f, -5.725f, -2.436f)
                curveToRelative(1.648f, 0.379f, 3.717f, 0.436f, 5.725f, 0.436f)
                reflectiveCurveToRelative(4.077f, -0.058f, 5.725f, -0.436f)
                curveToRelative(-1.104f, 1.32f, -2.964f, 2.436f, -5.725f, 2.436f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-4.643f, 0.0f, -6.999f, -0.505f, -7.0f, -1.498f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.008f, -0.276f, 0.575f, -1.131f, 1.806f, -1.502f)
                horizontalLineToRelative(10.389f)
                curveToRelative(1.229f, 0.371f, 1.798f, 1.226f, 1.806f, 1.5f)
                curveToRelative(0.0f, 0.995f, -2.355f, 1.5f, -7.0f, 1.5f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
