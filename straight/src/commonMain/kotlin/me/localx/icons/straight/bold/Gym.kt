package me.localx.icons.straight.bold

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

public val Icons.Bold.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.975f, 7.268f)
                lineToRelative(-2.061f, -2.061f)
                lineToRelative(2.147f, -2.146f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-2.146f, 2.147f)
                lineToRelative(-2.061f, -2.061f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -4.95f, 0.0f)
                lineToRelative(-3.182f, 3.182f)
                lineToRelative(4.535f, 4.536f)
                lineToRelative(-4.407f, 4.407f)
                lineToRelative(-4.521f, -4.521f)
                lineToRelative(-3.182f, 3.182f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.949f)
                lineToRelative(2.047f, 2.047f)
                lineToRelative(-2.133f, 2.132f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(2.132f, -2.133f)
                lineToRelative(2.075f, 2.072f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, 0.0f)
                lineToRelative(3.182f, -3.179f)
                lineToRelative(-4.55f, -4.55f)
                lineToRelative(4.408f, -4.407f)
                lineToRelative(4.535f, 4.536f)
                lineToRelative(3.182f, -3.182f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -4.95f)
                close()
                moveTo(10.1f, 20.882f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-6.246f, -6.243f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineToRelative(1.061f, -1.061f)
                lineToRelative(6.95f, 6.95f)
                close()
                moveTo(20.854f, 10.1f)
                lineTo(19.793f, 11.161f)
                lineTo(12.843f, 4.211f)
                lineTo(13.9f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(6.246f, 6.244f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.706f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
