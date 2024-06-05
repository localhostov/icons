package me.localx.icons.rounded.filled

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

public val Icons.Filled.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.567f)
                curveTo(14.97f, 2.814f, 4.893f, 7.4f, 5.0f, 15.791f)
                lineTo(5.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(2.0f, 15.274f)
                arcToRelative(7.486f, 7.486f, 0.0f, false, true, 1.626f, -4.65f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.063f, 9.377f)
                curveTo(-0.336f, 12.054f, -0.036f, 16.165f, 0.0f, 19.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 23.0f)
                lineTo(19.0f, 23.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 15.5f)
                arcTo(9.536f, 9.536f, 0.0f, false, false, 21.0f, 8.567f)
                close()
                moveTo(16.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 20.0f)
                close()
                moveTo(18.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 17.0f)
                close()
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(5.215f, 8.178f)
                arcTo(3.839f, 3.839f, 0.0f, false, true, 8.257f, 3.063f)
                arcToRelative(3.315f, 3.315f, 0.0f, false, true, 3.8f, -1.947f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 4.918f, -0.011f)
                arcToRelative(3.308f, 3.308f, 0.0f, false, true, 3.768f, 1.958f)
                arcToRelative(3.927f, 3.927f, 0.0f, false, true, 2.929f, 5.525f)
                curveToRelative(-4.2f, -6.042f, -14.026f, -6.02f, -18.22f, -0.072f)
                arcTo(3.113f, 3.113f, 0.0f, false, false, 5.215f, 8.178f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
