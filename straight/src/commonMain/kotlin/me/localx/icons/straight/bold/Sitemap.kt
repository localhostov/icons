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

public val Icons.Bold.Sitemap: ImageVector
    get() {
        if (_sitemap != null) {
            return _sitemap!!
        }
        _sitemap = Builder(name = "Sitemap", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _sitemap!!
    }

private var _sitemap: ImageVector? = null
