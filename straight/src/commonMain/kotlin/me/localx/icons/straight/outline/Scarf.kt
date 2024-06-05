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

public val Icons.Outline.Scarf: ImageVector
    get() {
        if (_scarf != null) {
            return _scarf!!
        }
        _scarf = Builder(name = "Scarf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.412f, 13.167f)
                lineToRelative(3.65f, -3.806f)
                lineToRelative(-0.073f, -0.486f)
                curveToRelative(-0.324f, -2.158f, -0.985f, -4.963f, -3.236f, -7.534f)
                curveToRelative(-0.161f, -0.124f, -1.829f, -1.341f, -5.752f, -1.341f)
                reflectiveCurveToRelative(-5.592f, 1.218f, -5.752f, 1.341f)
                curveToRelative(-2.255f, 2.575f, -2.915f, 5.366f, -3.236f, 7.51f)
                lineToRelative(-0.073f, 0.485f)
                lineToRelative(3.723f, 3.888f)
                lineToRelative(-5.186f, 5.371f)
                lineToRelative(5.548f, 5.401f)
                lineToRelative(4.98f, -5.192f)
                lineToRelative(4.972f, 5.193f)
                lineToRelative(5.538f, -5.392f)
                lineToRelative(-5.103f, -5.438f)
                close()
                moveTo(18.934f, 8.691f)
                lineToRelative(-2.893f, 3.015f)
                lineToRelative(-2.53f, -2.696f)
                lineToRelative(4.152f, -4.3f)
                curveToRelative(0.594f, 1.132f, 1.0f, 2.417f, 1.27f, 3.981f)
                close()
                moveTo(7.66f, 2.766f)
                curveToRelative(0.297f, -0.167f, 1.563f, -0.766f, 4.34f, -0.766f)
                curveToRelative(2.806f, 0.0f, 4.387f, 0.736f, 4.654f, 0.885f)
                lineToRelative(-3.106f, 3.208f)
                curveToRelative(-0.902f, -0.109f, -1.864f, -0.12f, -2.806f, -0.033f)
                lineToRelative(-3.086f, -3.289f)
                reflectiveCurveToRelative(0.003f, -0.003f, 0.004f, -0.005f)
                close()
                moveTo(6.974f, 21.158f)
                lineToRelative(-2.677f, -2.606f)
                lineToRelative(1.158f, -1.199f)
                lineToRelative(2.673f, 2.602f)
                lineToRelative(-1.154f, 1.203f)
                close()
                moveTo(9.513f, 18.511f)
                lineToRelative(-2.668f, -2.597f)
                lineToRelative(1.2f, -1.243f)
                lineToRelative(2.574f, 2.688f)
                lineToRelative(-1.106f, 1.152f)
                close()
                moveTo(5.066f, 8.668f)
                curveToRelative(0.291f, -1.677f, 0.74f, -3.034f, 1.415f, -4.227f)
                lineToRelative(10.736f, 11.441f)
                lineToRelative(-2.713f, 2.641f)
                lineTo(5.066f, 8.668f)
                close()
                moveTo(15.887f, 19.968f)
                lineToRelative(2.698f, -2.627f)
                lineToRelative(1.127f, 1.201f)
                lineToRelative(-2.687f, 2.615f)
                lineToRelative(-1.139f, -1.189f)
                close()
            }
        }
        .build()
        return _scarf!!
    }

private var _scarf: ImageVector? = null
