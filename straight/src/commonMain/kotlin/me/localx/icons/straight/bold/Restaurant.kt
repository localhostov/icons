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
                moveTo(5.023f, 14.027f)
                arcTo(17.62f, 17.62f, 0.0f, false, true, 0.0f, 3.0f)
                lineTo(0.0f, 2.65f)
                arcTo(2.586f, 2.586f, 0.0f, false, true, 1.637f, 0.19f)
                arcTo(2.71f, 2.71f, 0.0f, false, true, 4.622f, 0.86f)
                lineTo(7.739f, 4.241f)
                lineTo(6.585f, 5.4f)
                arcToRelative(5.51f, 5.51f, 0.0f, false, false, -0.837f, 1.113f)
                lineTo(3.041f, 3.571f)
                arcTo(15.321f, 15.321f, 0.0f, false, false, 4.992f, 9.083f)
                curveToRelative(0.0f, -0.016f, 0.0f, -0.031f, 0.0f, 0.0f)
                arcToRelative(5.966f, 5.966f, 0.0f, false, false, 1.273f, 3.7f)
                close()
                moveTo(19.27f, 16.75f)
                lineToRelative(-0.665f, 0.665f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 16.772f, 18.6f)
                lineToRelative(5.0f, 5.3f)
                lineToRelative(2.206f, -2.034f)
                close()
                moveTo(23.909f, 9.284f)
                lineTo(21.788f, 7.163f)
                lineTo(15.069f, 13.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.706f, 0.0f)
                lineTo(13.3f, 12.819f)
                lineToRelative(7.071f, -7.071f)
                lineTo(18.252f, 3.627f)
                lineTo(11.181f, 10.7f)
                lineTo(10.12f, 9.637f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineToRelative(6.717f, -6.718f)
                lineTo(14.716f, 0.091f)
                lineTo(8.0f, 6.809f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.949f)
                lineTo(9.06f, 12.819f)
                lineToRelative(-9.0f, 8.995f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(8.995f, -9.0f)
                lineTo(12.241f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, 0.0f)
                close()
            }
        }
        .build()
        return _restaurant!!
    }

private var _restaurant: ImageVector? = null
