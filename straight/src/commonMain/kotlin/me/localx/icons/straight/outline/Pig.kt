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

public val Icons.Outline.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                horizontalLineToRelative(-1.217f)
                curveToRelative(-0.305f, -1.372f, -0.925f, -2.616f, -1.819f, -3.616f)
                curveToRelative(-1.051f, -1.176f, -2.426f, -1.947f, -3.965f, -2.245f)
                lineTo(16.999f, 1.0f)
                curveToRelative(-1.867f, -0.106f, -3.434f, 1.246f, -3.876f, 3.0f)
                horizontalLineToRelative(-5.124f)
                curveToRelative(-2.175f, 0.0f, -4.15f, 0.873f, -5.594f, 2.287f)
                curveToRelative(-0.27f, -0.612f, -0.406f, -1.376f, -0.406f, -2.287f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, 1.637f, 0.362f, 2.974f, 1.079f, 3.992f)
                curveToRelative(-0.686f, 1.179f, -1.079f, 2.549f, -1.079f, 4.008f)
                curveToRelative(0.0f, 2.85f, 1.551f, 5.5f, 4.0f, 6.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.586f)
                curveToRelative(2.02f, -0.82f, 3.599f, -2.44f, 4.407f, -4.414f)
                horizontalLineToRelative(1.593f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 2.633f, -1.763f, 4.997f, -4.285f, 5.748f)
                lineToRelative(-0.715f, 0.213f)
                verticalLineToRelative(2.039f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.314f)
                lineToRelative(-0.57f, -0.271f)
                curveToRelative(-2.083f, -0.992f, -3.43f, -3.117f, -3.43f, -5.415f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(7.538f)
                curveToRelative(1.571f, 0.0f, 2.932f, 0.594f, 3.936f, 1.717f)
                curveToRelative(0.984f, 1.102f, 1.526f, 2.623f, 1.526f, 4.283f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
