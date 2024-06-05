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

public val Icons.Filled.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.24f, 12.0f)
                lineTo(20.24f, 2.38f)
                curveToRelative(0.48f, 0.77f, 0.76f, 1.66f, 0.76f, 2.62f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.97f, -0.29f, 1.86f, -0.76f, 2.62f)
                lineToRelative(-7.0f, -9.62f)
                close()
                moveTo(12.0f, 10.3f)
                lineTo(18.84f, 0.89f)
                curveToRelative(-0.81f, -0.56f, -1.78f, -0.89f, -2.84f, -0.89f)
                lineTo(8.0f, 0.0f)
                curveToRelative(-1.06f, 0.0f, -2.03f, 0.33f, -2.84f, 0.89f)
                lineToRelative(6.84f, 9.41f)
                close()
                moveTo(12.0f, 13.7f)
                lineToRelative(-6.84f, 9.41f)
                curveToRelative(0.81f, 0.56f, 1.78f, 0.89f, 2.84f, 0.89f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.06f, 0.0f, 2.03f, -0.33f, 2.84f, -0.89f)
                lineToRelative(-6.84f, -9.41f)
                close()
                moveTo(3.76f, 2.38f)
                curveToRelative(-0.48f, 0.77f, -0.76f, 1.66f, -0.76f, 2.62f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.97f, 0.29f, 1.86f, 0.76f, 2.62f)
                lineToRelative(7.0f, -9.62f)
                lineTo(3.76f, 2.38f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null
