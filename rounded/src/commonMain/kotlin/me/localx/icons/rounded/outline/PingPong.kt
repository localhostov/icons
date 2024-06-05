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

public val Icons.Outline.PingPong: ImageVector
    get() {
        if (_pingPong != null) {
            return _pingPong!!
        }
        _pingPong = Builder(name = "PingPong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.261f, 2.739f)
                arcTo(9.836f, 9.836f, 0.0f, false, false, 8.3f, 2.114f)
                arcTo(4.489f, 4.489f, 0.0f, true, false, 4.134f, 8.963f)
                arcToRelative(9.415f, 9.415f, 0.0f, false, false, 0.842f, 5.668f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.07f, 0.564f)
                lineTo(2.0f, 16.945f)
                arcTo(3.743f, 3.743f, 0.0f, false, false, 3.735f, 24.0f)
                arcToRelative(3.891f, 3.891f, 0.0f, false, false, 0.457f, -0.027f)
                arcToRelative(3.705f, 3.705f, 0.0f, false, false, 2.725f, -1.735f)
                lineToRelative(2.068f, -3.127f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.575f, -0.089f)
                arcToRelative(9.663f, 9.663f, 0.0f, false, false, 11.315f, -2.147f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 24.0f, 9.758f)
                arcTo(9.409f, 9.409f, 0.0f, false, false, 21.261f, 2.739f)
                close()
                moveTo(2.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 4.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 4.5f)
                close()
                moveTo(10.44f, 17.226f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, -3.017f, 0.632f)
                curveToRelative(-0.024f, 0.029f, -0.046f, 0.059f, -0.067f, 0.09f)
                lineTo(5.229f, 21.166f)
                arcTo(1.742f, 1.742f, 0.0f, false, true, 2.02f, 20.0f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.961f, -1.312f)
                lineToRelative(3.041f, -1.831f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, 0.126f, -0.09f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, false, 0.623f, -3.016f)
                arcToRelative(7.331f, 7.331f, 0.0f, false, true, -0.693f, -4.259f)
                lineToRelative(8.433f, 8.433f)
                arcTo(7.31f, 7.31f, 0.0f, false, true, 10.44f, 17.226f)
                close()
                moveTo(19.461f, 15.461f)
                arcToRelative(8.871f, 8.871f, 0.0f, false, true, -2.732f, 1.865f)
                curveToRelative(-0.009f, -0.01f, -0.012f, -0.023f, -0.022f, -0.033f)
                lineTo(7.36f, 7.945f)
                arcTo(4.473f, 4.473f, 0.0f, false, false, 9.0f, 4.5f)
                curveToRelative(0.0f, -0.119f, -0.026f, -0.231f, -0.035f, -0.347f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, true, 10.882f, 0.0f)
                arcTo(7.423f, 7.423f, 0.0f, false, true, 22.0f, 9.7f)
                arcTo(8.506f, 8.506f, 0.0f, false, true, 19.461f, 15.461f)
                close()
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
