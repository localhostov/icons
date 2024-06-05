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

public val Icons.Outline.AirplaneWindowOpen: ImageVector
    get() {
        if (_airplaneWindowOpen != null) {
            return _airplaneWindowOpen!!
        }
        _airplaneWindowOpen = Builder(name = "AirplaneWindowOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.038f, 0.0f, 3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                verticalLineToRelative(-6.0f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.785f, 0.0f, 5.189f, 1.639f, 6.315f, 4.0f)
                lineTo(5.685f, 6.0f)
                curveToRelative(1.126f, -2.361f, 3.53f, -4.0f, 6.315f, -4.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.34f, 0.033f, -0.672f, 0.08f, -1.0f)
                horizontalLineToRelative(13.84f)
                curveToRelative(0.047f, 0.328f, 0.08f, 0.66f, 0.08f, 1.0f)
                verticalLineToRelative(5.065f)
                curveToRelative(-0.315f, -0.323f, -0.688f, -0.595f, -1.125f, -0.782f)
                curveToRelative(-0.501f, -2.161f, -2.604f, -3.569f, -4.805f, -3.23f)
                curveToRelative(-1.159f, 0.182f, -2.242f, 0.918f, -2.896f, 1.97f)
                curveToRelative(-0.531f, 0.85f, -0.749f, 1.739f, -0.651f, 2.649f)
                curveToRelative(-1.102f, 0.566f, -1.703f, 1.771f, -1.476f, 3.021f)
                curveToRelative(0.242f, 1.337f, 1.446f, 2.307f, 2.863f, 2.307f)
                horizontalLineToRelative(5.005f)
                curveToRelative(0.386f, 0.0f, 0.747f, -0.049f, 1.092f, -0.119f)
                curveToRelative(-1.272f, 1.305f, -3.046f, 2.119f, -5.008f, 2.119f)
                close()
                moveTo(11.533f, 14.607f)
                curveToRelative(-0.095f, -0.521f, 0.012f, -1.006f, 0.337f, -1.527f)
                curveToRelative(0.353f, -0.565f, 0.917f, -0.958f, 1.509f, -1.051f)
                curveToRelative(0.124f, -0.02f, 0.247f, -0.029f, 0.368f, -0.029f)
                curveToRelative(1.049f, 0.0f, 1.956f, 0.71f, 2.186f, 1.768f)
                curveToRelative(0.131f, 0.603f, 0.56f, 1.106f, 1.143f, 1.35f)
                curveToRelative(0.648f, 0.271f, 1.018f, 0.949f, 0.9f, 1.65f)
                curveToRelative(-0.127f, 0.761f, -0.917f, 1.232f, -2.062f, 1.232f)
                horizontalLineToRelative(-5.005f)
                curveToRelative(-0.442f, 0.0f, -0.827f, -0.285f, -0.895f, -0.663f)
                curveToRelative(-0.084f, -0.463f, 0.202f, -0.803f, 0.501f, -0.922f)
                curveToRelative(0.74f, -0.294f, 1.158f, -1.038f, 1.017f, -1.808f)
                close()
            }
        }
        .build()
        return _airplaneWindowOpen!!
    }

private var _airplaneWindowOpen: ImageVector? = null
