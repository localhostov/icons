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
                moveToRelative(19.0f, 9.625f)
                verticalLineToRelative(-4.625f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.126f)
                curveToRelative(-0.445f, -1.724f, -2.013f, -3.0f, -3.874f, -3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(5.625f)
                curveToRelative(-1.273f, 0.76f, -2.0f, 1.926f, -2.0f, 2.875f)
                curveToRelative(0.0f, 2.736f, 2.342f, 6.66f, 7.335f, 7.383f)
                curveToRelative(-0.479f, 1.117f, -1.835f, 1.117f, -1.835f, 1.117f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(0.0f, 0.0f, -1.356f, 0.0f, -1.835f, -1.117f)
                curveToRelative(4.993f, -0.723f, 7.335f, -4.647f, 7.335f, -7.383f)
                curveToRelative(0.0f, -0.948f, -0.727f, -2.115f, -2.0f, -2.875f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(5.032f)
                lineToRelative(-10.0f, -0.031f)
                verticalLineToRelative(-5.001f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
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
