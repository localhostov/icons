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

public val Icons.Bold.WindowRestore: ImageVector
    get() {
        if (_windowRestore != null) {
            return _windowRestore!!
        }
        _windowRestore = Builder(name = "WindowRestore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(2.24f, 6.0f, 0.0f, 8.24f, 0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(13.0f, 24.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(18.0f, 11.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(3.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(7.35f)
                curveToRelative(0.0f, 1.34f, -0.49f, 2.63f, -1.38f, 3.64f)
                curveToRelative(-0.3f, 0.34f, -0.71f, 0.51f, -1.13f, 0.51f)
                curveToRelative(-0.35f, 0.0f, -0.71f, -0.12f, -0.99f, -0.38f)
                curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.13f, -2.12f)
                curveToRelative(0.4f, -0.46f, 0.62f, -1.04f, 0.62f, -1.65f)
                lineTo(20.99f, 5.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.35f)
                curveToRelative(-0.61f, 0.0f, -1.2f, 0.22f, -1.65f, 0.62f)
                curveToRelative(-0.62f, 0.55f, -1.57f, 0.49f, -2.12f, -0.13f)
                curveToRelative(-0.55f, -0.62f, -0.49f, -1.57f, 0.13f, -2.12f)
                curveToRelative(1.0f, -0.89f, 2.3f, -1.38f, 3.64f, -1.38f)
                horizontalLineToRelative(7.35f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _windowRestore!!
    }

private var _windowRestore: ImageVector? = null
