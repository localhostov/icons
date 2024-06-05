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

public val Icons.Bold.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(3.786f, 3.786f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(11.0f, 9.0f)
                curveTo(10.243f, 9.0f, 10.0f, 9.243f, 10.0f, 10.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(3.786f, 3.786f, 0.0f, false, false, -4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                curveTo(13.757f, 10.0f, 14.0f, 10.243f, 14.0f, 11.0f)
                close()
                moveTo(21.994f, 14.113f)
                lineTo(19.9f, 24.0f)
                lineTo(4.1f, 24.0f)
                lineTo(2.037f, 14.258f)
                arcToRelative(4.479f, 4.479f, 0.0f, false, true, -0.008f, -7.5f)
                arcTo(4.257f, 4.257f, 0.0f, false, true, 5.684f, 3.038f)
                arcTo(3.742f, 3.742f, 0.0f, false, true, 8.7f, 1.5f)
                horizontalLineToRelative(0.375f)
                arcTo(5.2f, 5.2f, 0.0f, false, true, 12.75f, 0.0f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, 4.736f, 3.006f)
                arcToRelative(4.716f, 4.716f, 0.0f, false, true, 4.247f, 3.2f)
                arcToRelative(4.733f, 4.733f, 0.0f, false, true, 0.261f, 7.908f)
                close()
                moveTo(4.5f, 12.0f)
                lineTo(6.273f, 12.0f)
                arcToRelative(4.325f, 4.325f, 0.0f, false, true, 2.864f, 1.1f)
                arcToRelative(4.283f, 4.283f, 0.0f, false, true, 5.725f, 0.0f)
                arcTo(4.329f, 4.329f, 0.0f, false, true, 17.727f, 12.0f)
                lineTo(19.25f, 12.0f)
                arcToRelative(1.747f, 1.747f, 0.0f, false, false, 0.644f, -3.372f)
                lineTo(19.1f, 8.313f)
                lineToRelative(-0.135f, -0.841f)
                arcTo(1.736f, 1.736f, 0.0f, false, false, 17.25f, 6.0f)
                lineTo(15.189f, 6.0f)
                lineToRelative(-0.244f, -1.2f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.994f, -0.9f)
                lineToRelative(-0.45f, 0.6f)
                lineTo(8.7f, 4.5f)
                arcTo(0.749f, 0.749f, 0.0f, false, false, 8.0f, 5.0f)
                lineTo(7.649f, 6.0f)
                lineTo(6.25f, 6.0f)
                arcTo(1.252f, 1.252f, 0.0f, false, false, 5.0f, 7.25f)
                lineTo(5.0f, 8.745f)
                lineTo(4.0f, 9.1f)
                arcTo(1.492f, 1.492f, 0.0f, false, false, 4.5f, 12.0f)
                close()
                moveTo(7.945f, 21.0f)
                lineTo(7.636f, 16.364f)
                arcTo(1.365f, 1.365f, 0.0f, false, false, 6.273f, 15.0f)
                lineTo(5.261f, 15.0f)
                lineToRelative(1.273f, 6.0f)
                close()
                moveTo(12.9f, 21.0f)
                lineToRelative(0.458f, -4.671f)
                arcToRelative(1.361f, 1.361f, 0.0f, false, false, -2.722f, 0.015f)
                lineTo(10.951f, 21.0f)
                close()
                moveTo(18.737f, 15.0f)
                lineTo(17.727f, 15.0f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -1.363f, 1.364f)
                lineTo(15.917f, 21.0f)
                horizontalLineToRelative(1.549f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
