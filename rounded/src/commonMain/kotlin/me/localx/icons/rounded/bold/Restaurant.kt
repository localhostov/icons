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

public val Icons.Bold.Restaurant: ImageVector
    get() {
        if (_restaurant != null) {
            return _restaurant!!
        }
        _restaurant = Builder(name = "Restaurant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.057f, 14.064f)
                lineToRelative(-9.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.439f, 21.438f)
                lineToRelative(9.5f, -9.495f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, true, 0.932f, -8.0f)
                lineTo(14.45f, 0.43f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.1f, 2.142f)
                lineToRelative(-3.571f, 3.5f)
                arcToRelative(3.483f, 3.483f, 0.0f, false, false, -0.8f, 3.631f)
                lineTo(18.439f, 3.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.122f, 2.121f)
                lineTo(14.3f, 11.823f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.641f, -0.812f)
                lineToRelative(3.49f, -3.56f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.142f, 2.1f)
                lineToRelative(-3.5f, 3.571f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -8.014f, 0.943f)
                close()
                moveTo(20.129f, 17.512f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 17.0f)
                arcToRelative(19.959f, 19.959f, 0.0f, false, true, -4.813f, -0.39f)
                lineToRelative(-0.4f, -0.082f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.578f, 2.944f)
                lineToRelative(0.366f, 0.074f)
                arcToRelative(20.963f, 20.963f, 0.0f, false, false, 4.739f, 0.45f)
                lineToRelative(3.055f, 3.491f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.258f, -1.975f)
                close()
                moveTo(3.78f, 12.659f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.366f, -1.846f)
                arcTo(15.676f, 15.676f, 0.0f, false, true, 3.039f, 3.571f)
                lineTo(5.751f, 6.516f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.958f, 4.485f)
                lineTo(4.622f, 0.861f)
                arcTo(2.709f, 2.709f, 0.0f, false, false, 1.637f, 0.192f)
                arcTo(2.584f, 2.584f, 0.0f, false, false, 0.0f, 2.652f)
                lineTo(0.0f, 3.0f)
                arcTo(17.788f, 17.788f, 0.0f, false, false, 3.78f, 12.659f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
