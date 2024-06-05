package me.localx.icons.rounded.bold

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

public val Icons.Bold.Guide: ImageVector
    get() {
        if (_guide != null) {
            return _guide!!
        }
        _guide = Builder(name = "Guide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.312f)
                curveToRelative(-1.039f, -1.79f, -2.973f, -3.0f, -5.188f, -3.0f)
                curveTo(3.691f, 0.0f, 1.0f, 2.691f, 1.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(7.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(14.896f, 20.251f)
                curveToRelative(0.068f, 0.41f, 0.104f, 0.83f, 0.104f, 1.249f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.253f, -0.021f, -0.506f, -0.063f, -0.751f)
                curveToRelative(-0.137f, -0.817f, 0.414f, -1.591f, 1.23f, -1.729f)
                curveToRelative(0.81f, -0.133f, 1.591f, 0.413f, 1.729f, 1.23f)
                close()
                moveTo(23.521f, 3.364f)
                lineToRelative(-3.521f, 1.636f)
                verticalLineToRelative(4.349f)
                curveToRelative(0.0f, 1.114f, -0.41f, 2.184f, -1.156f, 3.011f)
                lineToRelative(-2.835f, 3.15f)
                curveToRelative(-0.852f, 0.947f, -2.071f, 1.49f, -3.345f, 1.49f)
                horizontalLineToRelative(-5.164f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.136f, 3.364f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(5.164f)
                curveToRelative(0.425f, 0.0f, 0.83f, -0.181f, 1.114f, -0.496f)
                lineToRelative(2.836f, -3.151f)
                curveToRelative(0.249f, -0.276f, 0.386f, -0.633f, 0.386f, -1.004f)
                lineTo(17.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.66f, 0.0f, 1.315f, 0.128f, 1.926f, 0.377f)
                lineToRelative(3.095f, 1.259f)
                curveToRelative(0.639f, 0.399f, 0.639f, 1.329f, 0.0f, 1.729f)
                close()
            }
        }
        .build()
        return _guide!!
    }

private var _guide: ImageVector? = null
