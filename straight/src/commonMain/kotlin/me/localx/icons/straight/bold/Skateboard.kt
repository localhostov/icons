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

public val Icons.Bold.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.688f, 2.312f)
                arcToRelative(7.887f, 7.887f, 0.0f, false, false, -11.158f, 0.0f)
                lineToRelative(-8.218f, 8.218f)
                arcToRelative(7.89f, 7.89f, 0.0f, true, false, 11.158f, 11.158f)
                lineToRelative(8.218f, -8.218f)
                arcToRelative(7.887f, 7.887f, 0.0f, false, false, 0.0f, -11.158f)
                close()
                moveTo(19.567f, 11.349f)
                lineTo(11.349f, 19.567f)
                arcToRelative(4.89f, 4.89f, 0.0f, true, true, -6.916f, -6.916f)
                lineToRelative(8.218f, -8.218f)
                arcToRelative(4.89f, 4.89f, 0.0f, true, true, 6.916f, 6.916f)
                close()
                moveTo(17.939f, 6.939f)
                lineTo(20.061f, 9.061f)
                lineTo(16.061f, 13.061f)
                lineTo(13.939f, 10.939f)
                lineTo(14.879f, 10.0f)
                lineTo(14.0f, 9.121f)
                lineTo(13.061f, 10.061f)
                lineTo(10.939f, 7.939f)
                lineTo(14.939f, 3.939f)
                lineTo(17.061f, 6.061f)
                lineTo(16.121f, 7.0f)
                lineTo(17.0f, 7.879f)
                close()
                moveTo(10.939f, 13.939f)
                lineTo(13.061f, 16.061f)
                lineTo(9.016f, 20.105f)
                lineTo(6.9f, 17.984f)
                lineTo(7.879f, 17.0f)
                lineTo(7.0f, 16.121f)
                lineTo(6.016f, 17.105f)
                lineTo(3.9f, 14.984f)
                lineTo(7.944f, 10.939f)
                lineTo(10.066f, 13.061f)
                lineTo(9.121f, 14.0f)
                lineTo(10.0f, 14.879f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
