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

public val Icons.Bold.Notdef: ImageVector
    get() {
        if (_notdef != null) {
            return _notdef!!
        }
        _notdef = Builder(name = "Notdef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(5.47f, 0.0f, 3.0f, 2.47f, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.84f, 12.0f)
                lineToRelative(4.16f, -5.84f)
                verticalLineToRelative(11.68f)
                lineToRelative(-4.16f, -5.84f)
                close()
                moveTo(15.5f, 3.0f)
                curveToRelative(0.33f, 0.0f, 0.65f, 0.07f, 0.94f, 0.19f)
                lineToRelative(-4.44f, 6.23f)
                lineTo(7.56f, 3.19f)
                curveToRelative(0.29f, -0.12f, 0.61f, -0.19f, 0.94f, -0.19f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(6.0f, 17.84f)
                lineTo(6.0f, 6.16f)
                lineToRelative(4.16f, 5.84f)
                lineToRelative(-4.16f, 5.84f)
                close()
                moveTo(8.5f, 21.0f)
                curveToRelative(-0.33f, 0.0f, -0.65f, -0.07f, -0.94f, -0.19f)
                lineToRelative(4.44f, -6.23f)
                lineToRelative(4.44f, 6.23f)
                curveToRelative(-0.29f, 0.12f, -0.61f, 0.19f, -0.94f, 0.19f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _notdef!!
    }

private var _notdef: ImageVector? = null
