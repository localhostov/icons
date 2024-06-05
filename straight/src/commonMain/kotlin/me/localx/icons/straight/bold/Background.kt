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

public val Icons.Bold.Background: ImageVector
    get() {
        if (_background != null) {
            return _background!!
        }
        _background = Builder(name = "Background", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.88f)
                lineTo(3.0f, 9.38f)
                lineTo(3.0f, 3.5f)
                close()
                moveTo(3.0f, 13.62f)
                lineTo(13.62f, 3.0f)
                horizontalLineToRelative(5.26f)
                lineTo(3.0f, 18.88f)
                verticalLineToRelative(-5.26f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-6.38f)
                lineToRelative(6.38f, -6.38f)
                verticalLineToRelative(6.38f)
                close()
                moveTo(21.0f, 10.38f)
                lineToRelative(-10.62f, 10.62f)
                lineTo(5.12f, 21.0f)
                lineTo(21.0f, 5.12f)
                verticalLineToRelative(5.26f)
                close()
            }
        }
        .build()
        return _background!!
    }

private var _background: ImageVector? = null
