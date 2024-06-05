package me.localx.icons.straight.filled

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

public val Icons.Filled.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 14.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                close()
                moveTo(17.441f, 5.059f)
                curveTo(13.527f, -4.12f, -0.042f, 0.313f, 2.265f, 10.05f)
                curveTo(-1.445f, 12.585f, -0.3f, 18.711f, 4.0f, 19.792f)
                lineToRelative(0.114f, 0.012f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, 1.272f, -3.332f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 10.0f, 12.766f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.614f, 4.762f)
                arcToRelative(2.962f, 2.962f, 0.0f, false, true, 0.253f, 2.323f)
                lineToRelative(0.133f, 0.0f)
                curveTo(26.22f, 18.075f, 25.826f, 6.193f, 17.441f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
