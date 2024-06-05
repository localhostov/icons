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
                moveToRelative(21.261f, 2.739f)
                arcToRelative(9.836f, 9.836f, 0.0f, false, false, -12.961f, -0.625f)
                arcToRelative(4.489f, 4.489f, 0.0f, true, false, -4.167f, 6.849f)
                arcToRelative(9.762f, 9.762f, 0.0f, false, false, 0.843f, 5.816f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.081f, 0.578f)
                lineToRelative(-3.613f, 2.8f)
                arcToRelative(3.363f, 3.363f, 0.0f, false, false, -1.282f, 2.409f)
                arcToRelative(2.824f, 2.824f, 0.0f, false, false, 0.853f, 2.151f)
                lineToRelative(0.445f, 0.422f)
                arcToRelative(2.836f, 2.836f, 0.0f, false, false, 2.126f, 0.861f)
                arcToRelative(2.959f, 2.959f, 0.0f, false, false, 2.232f, -1.08f)
                lineToRelative(2.958f, -3.779f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.119f)
                arcToRelative(10.194f, 10.194f, 0.0f, false, false, 11.659f, -2.147f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 3.127f, -7.117f)
                arcToRelative(9.412f, 9.412f, 0.0f, false, false, -2.739f, -7.019f)
                close()
                moveTo(2.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
                moveTo(10.1f, 17.226f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.037f, 0.657f)
                lineToRelative(-2.963f, 3.78f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, true, -1.407f, 0.044f)
                lineToRelative(-0.444f, -0.422f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.249f, -0.63f)
                arcToRelative(1.372f, 1.372f, 0.0f, false, true, 0.535f, -0.944f)
                lineToRelative(3.612f, -2.8f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, false, 0.624f, -3.011f)
                arcToRelative(7.736f, 7.736f, 0.0f, false, true, -0.691f, -4.4f)
                lineToRelative(8.42f, 8.413f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, true, -4.4f, -0.687f)
                close()
                moveTo(19.464f, 15.461f)
                arcToRelative(8.732f, 8.732f, 0.0f, false, true, -2.776f, 1.854f)
                lineToRelative(0.022f, -0.022f)
                lineToRelative(-9.35f, -9.348f)
                arcToRelative(4.473f, 4.473f, 0.0f, false, false, 1.64f, -3.445f)
                curveToRelative(0.0f, -0.119f, -0.026f, -0.231f, -0.035f, -0.347f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, true, 10.882f, 0.0f)
                arcToRelative(7.423f, 7.423f, 0.0f, false, true, 2.153f, 5.547f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -2.539f, 5.761f)
                close()
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
