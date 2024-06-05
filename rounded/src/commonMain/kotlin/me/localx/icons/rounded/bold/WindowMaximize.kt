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

public val Icons.Bold.WindowMaximize: ImageVector
    get() {
        if (_windowMaximize != null) {
            return _windowMaximize!!
        }
        _windowMaximize = Builder(name = "WindowMaximize", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 1.0f)
                lineTo(5.5f, 1.0f)
                curveTo(2.47f, 1.0f, 0.0f, 3.47f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(5.5f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(18.5f, 20.0f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                lineTo(21.0f, 10.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _windowMaximize!!
    }

private var _windowMaximize: ImageVector? = null
