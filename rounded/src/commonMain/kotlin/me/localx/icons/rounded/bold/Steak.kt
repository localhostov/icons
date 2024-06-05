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

public val Icons.Bold.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 24.0f)
                arcToRelative(6.094f, 6.094f, 0.0f, false, true, -4.973f, -2.4f)
                arcTo(3.73f, 3.73f, 0.0f, false, false, 9.0f, 20.0f)
                curveToRelative(-4.878f, 0.0f, -9.0f, -4.538f, -9.0f, -9.909f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 10.091f, 0.0f)
                curveTo(19.8f, 0.0f, 24.0f, 11.423f, 24.0f, 17.25f)
                arcTo(6.758f, 6.758f, 0.0f, false, true, 17.25f, 24.0f)
                close()
                moveTo(10.091f, 3.0f)
                arcTo(7.1f, 7.1f, 0.0f, false, false, 3.0f, 10.091f)
                curveTo(3.0f, 14.163f, 6.162f, 17.0f, 9.0f, 17.0f)
                arcToRelative(6.681f, 6.681f, 0.0f, false, true, 5.477f, 2.559f)
                arcTo(3.226f, 3.226f, 0.0f, false, false, 17.25f, 21.0f)
                arcTo(3.754f, 3.754f, 0.0f, false, false, 21.0f, 17.25f)
                curveTo(21.0f, 13.057f, 17.861f, 3.0f, 10.091f, 3.0f)
                close()
                moveTo(8.061f, 12.061f)
                lineTo(12.061f, 8.061f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.939f, 5.939f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                close()
                moveTo(12.021f, 15.088f)
                lineTo(16.059f, 11.062f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.118f, -2.124f)
                lineTo(9.9f, 12.963f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.119f, 2.125f)
                close()
                moveTo(17.061f, 17.061f)
                lineTo(18.061f, 16.061f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null
