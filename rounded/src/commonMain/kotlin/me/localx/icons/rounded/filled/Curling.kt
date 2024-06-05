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

public val Icons.Filled.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(6.0f, 24.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 0.0f, 18.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(24.0f, 16.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 10.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, true, 1.567f, 0.155f)
                lineToRelative(-0.029f, -0.125f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 15.657f, 5.0f)
                lineTo(7.138f, 5.0f)
                lineToRelative(0.142f, -0.65f)
                arcTo(2.983f, 2.983f, 0.0f, false, true, 10.209f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(10.209f, 0.0f)
                arcTo(4.975f, 4.975f, 0.0f, false, false, 5.326f, 3.919f)
                lineTo(4.4f, 8.16f)
                arcTo(8.02f, 8.02f, 0.0f, false, true, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
