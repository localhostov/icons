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

public val Icons.Outline.TrianglePersonDigging: ImageVector
    get() {
        if (_trianglePersonDigging != null) {
            return _trianglePersonDigging!!
        }
        _trianglePersonDigging = Builder(name = "TrianglePersonDigging", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.398f, 15.92f)
                lineTo(15.356f, 2.883f)
                curveToRelative(-0.749f, -1.214f, -1.938f, -1.883f, -3.347f, -1.883f)
                curveToRelative(-1.424f, 0.0f, -2.621f, 0.669f, -3.37f, 1.883f)
                lineTo(0.597f, 15.92f)
                curveToRelative(-0.771f, 1.25f, -0.804f, 2.764f, -0.088f, 4.047f)
                curveToRelative(0.71f, 1.273f, 2.001f, 2.033f, 3.454f, 2.033f)
                horizontalLineToRelative(16.07f)
                curveToRelative(1.452f, 0.0f, 2.743f, -0.76f, 3.454f, -2.033f)
                curveToRelative(0.716f, -1.284f, 0.684f, -2.797f, -0.088f, -4.047f)
                close()
                moveTo(21.739f, 18.992f)
                curveToRelative(-0.352f, 0.631f, -0.99f, 1.008f, -1.707f, 1.008f)
                lineTo(3.963f, 20.0f)
                curveToRelative(-0.717f, 0.0f, -1.355f, -0.377f, -1.707f, -1.008f)
                curveToRelative(-0.358f, -0.642f, -0.342f, -1.397f, 0.043f, -2.022f)
                lineToRelative(3.974f, -6.442f)
                lineToRelative(8.215f, 5.6f)
                lineToRelative(-1.297f, 1.873f)
                horizontalLineToRelative(6.308f)
                lineToRelative(-2.628f, -5.257f)
                lineToRelative(-1.415f, 2.002f)
                lineToRelative(-5.472f, -3.776f)
                lineToRelative(0.388f, -0.999f)
                curveToRelative(0.065f, -0.182f, 0.2f, -0.323f, 0.381f, -0.398f)
                curveToRelative(0.177f, -0.073f, 0.38f, -0.066f, 0.556f, 0.021f)
                lineToRelative(0.161f, 0.077f)
                curveToRelative(0.412f, 0.205f, 0.726f, 0.557f, 0.885f, 0.991f)
                lineToRelative(0.126f, 0.396f)
                lineToRelative(1.763f, 1.16f)
                lineToRelative(-0.526f, -2.092f)
                curveToRelative(-0.271f, -0.747f, -0.812f, -1.353f, -1.523f, -1.707f)
                lineToRelative(-0.377f, -0.188f)
                curveToRelative(-0.504f, -0.25f, -1.091f, -0.274f, -1.612f, -0.064f)
                curveToRelative(-0.521f, 0.209f, -0.929f, 0.633f, -1.119f, 1.162f)
                lineToRelative(-0.326f, 0.805f)
                lineToRelative(-1.593f, -1.053f)
                lineToRelative(3.175f, -5.146f)
                curveToRelative(0.382f, -0.619f, 0.943f, -0.933f, 1.668f, -0.933f)
                curveToRelative(0.72f, 0.0f, 1.258f, 0.305f, 1.645f, 0.933f)
                lineToRelative(8.042f, 13.037f)
                curveToRelative(0.385f, 0.625f, 0.402f, 1.381f, 0.043f, 2.022f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(7.646f, 13.412f)
                lineToRelative(1.312f, 0.898f)
                lineToRelative(-1.324f, 3.691f)
                horizontalLineToRelative(-1.634f)
                lineToRelative(1.646f, -4.588f)
                close()
                moveTo(10.0f, 15.037f)
                lineToRelative(1.5f, 1.09f)
                verticalLineToRelative(1.873f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.963f)
                close()
            }
        }
        .build()
        return _trianglePersonDigging!!
    }

private var _trianglePersonDigging: ImageVector? = null
