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

public val Icons.Outline.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.005f, 24.0f)
                curveToRelative(-0.712f, 0.0f, -1.402f, -0.249f, -1.948f, -0.714f)
                curveToRelative(-0.672f, -0.571f, -1.057f, -1.404f, -1.057f, -2.286f)
                lineToRelative(0.02f, -7.274f)
                lineToRelative(-3.945f, -3.919f)
                curveToRelative(-0.691f, -0.687f, -1.073f, -1.602f, -1.075f, -2.576f)
                curveToRelative(-0.001f, -0.974f, 0.377f, -1.89f, 1.066f, -2.579f)
                lineToRelative(2.308f, -2.308f)
                curveTo(5.884f, 0.832f, 7.894f, 0.0f, 10.031f, 0.0f)
                horizontalLineToRelative(6.969f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(4.721f)
                curveToRelative(0.0f, 2.375f, -1.69f, 4.437f, -4.019f, 4.903f)
                lineToRelative(-5.981f, 1.196f)
                verticalLineToRelative(5.073f)
                curveToRelative(0.0f, 1.516f, -1.076f, 2.834f, -2.503f, 3.066f)
                curveToRelative(-0.164f, 0.027f, -0.329f, 0.04f, -0.492f, 0.04f)
                close()
                moveTo(7.039f, 6.0f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.552f, 0.001f, 0.999f, 0.451f, 0.997f, 1.003f)
                lineToRelative(-0.039f, 14.0f)
                curveToRelative(0.0f, 0.291f, 0.128f, 0.569f, 0.353f, 0.759f)
                curveToRelative(0.228f, 0.193f, 0.522f, 0.272f, 0.823f, 0.224f)
                curveToRelative(0.462f, -0.076f, 0.825f, -0.556f, 0.825f, -1.093f)
                verticalLineToRelative(-5.893f)
                curveToRelative(0.0f, -0.477f, 0.336f, -0.887f, 0.804f, -0.98f)
                lineToRelative(6.785f, -1.357f)
                curveToRelative(1.397f, -0.28f, 2.412f, -1.517f, 2.412f, -2.942f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.969f)
                curveToRelative(-1.603f, 0.0f, -3.11f, 0.624f, -4.243f, 1.757f)
                lineToRelative(-2.308f, 2.308f)
                curveToRelative(-0.31f, 0.311f, -0.481f, 0.723f, -0.48f, 1.162f)
                curveToRelative(0.0f, 0.439f, 0.172f, 0.851f, 0.484f, 1.161f)
                lineToRelative(2.544f, 2.527f)
                lineToRelative(0.011f, -3.917f)
                curveToRelative(0.001f, -0.551f, 0.449f, -0.997f, 1.0f, -0.997f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
