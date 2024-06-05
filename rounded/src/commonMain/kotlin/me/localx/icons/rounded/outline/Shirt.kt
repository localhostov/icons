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

public val Icons.Outline.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.773f, 3.98f)
                lineToRelative(-1.137f, -0.758f)
                lineToRelative(-1.765f, -1.765f)
                curveTo(17.941f, 0.527f, 16.653f, -0.006f, 15.338f, -0.006f)
                horizontalLineToRelative(-0.005f)
                lineTo(8.646f, -0.001f)
                curveToRelative(-1.319f, 0.0f, -2.608f, 0.538f, -3.539f, 1.472f)
                lineToRelative(-1.745f, 1.753f)
                lineToRelative(-1.136f, 0.757f)
                curveToRelative(-1.394f, 0.929f, -2.227f, 2.484f, -2.227f, 4.16f)
                verticalLineToRelative(10.859f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.859f)
                curveToRelative(0.0f, -1.005f, 0.5f, -1.938f, 1.336f, -2.496f)
                lineToRelative(0.537f, -0.358f)
                lineToRelative(5.89f, 5.89f)
                lineToRelative(-1.647f, 7.338f)
                curveToRelative(-0.299f, 1.047f, -0.007f, 2.176f, 0.729f, 2.91f)
                lineToRelative(1.777f, 1.964f)
                curveToRelative(0.352f, 0.389f, 0.854f, 0.612f, 1.378f, 0.612f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.523f, 0.0f, 1.026f, -0.222f, 1.378f, -0.61f)
                lineToRelative(1.707f, -1.884f)
                curveToRelative(0.745f, -0.721f, 1.068f, -1.797f, 0.841f, -2.812f)
                lineToRelative(-1.689f, -7.519f)
                lineToRelative(5.889f, -5.889f)
                lineToRelative(0.537f, 0.358f)
                curveToRelative(0.836f, 0.558f, 1.336f, 1.491f, 1.336f, 2.496f)
                verticalLineToRelative(10.859f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-10.859f)
                curveToRelative(0.0f, -1.676f, -0.833f, -3.231f, -2.227f, -4.16f)
                close()
                moveTo(14.591f, 1.994f)
                lineToRelative(-2.592f, 2.592f)
                lineToRelative(-2.588f, -2.588f)
                lineToRelative(5.18f, -0.004f)
                close()
                moveTo(6.524f, 2.882f)
                curveToRelative(0.159f, -0.16f, 0.335f, -0.3f, 0.524f, -0.418f)
                lineToRelative(3.807f, 3.807f)
                lineToRelative(-0.793f, 2.379f)
                lineTo(5.413f, 3.999f)
                lineToRelative(1.112f, -1.117f)
                close()
                moveTo(13.649f, 20.115f)
                lineToRelative(-1.649f, 1.817f)
                lineToRelative(-1.708f, -1.886f)
                curveToRelative(-0.257f, -0.257f, -0.354f, -0.633f, -0.24f, -1.038f)
                lineToRelative(1.947f, -8.672f)
                lineToRelative(1.976f, 8.795f)
                curveToRelative(0.076f, 0.337f, -0.032f, 0.696f, -0.326f, 0.983f)
                close()
                moveTo(13.936f, 8.649f)
                lineToRelative(-0.793f, -2.379f)
                lineToRelative(3.805f, -3.805f)
                curveToRelative(0.183f, 0.117f, 0.354f, 0.253f, 0.509f, 0.407f)
                lineToRelative(1.128f, 1.128f)
                lineToRelative(-4.649f, 4.649f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
