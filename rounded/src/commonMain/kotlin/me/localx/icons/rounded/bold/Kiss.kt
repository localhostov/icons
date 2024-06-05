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

public val Icons.Bold.Kiss: ImageVector
    get() {
        if (_kiss != null) {
            return _kiss!!
        }
        _kiss = Builder(name = "Kiss", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 9.0f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.547f, 0.081f, 3.451f, 12.0f, 3.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(10.769f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(10.769f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 20.0f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kiss!!
    }

private var _kiss: ImageVector? = null
