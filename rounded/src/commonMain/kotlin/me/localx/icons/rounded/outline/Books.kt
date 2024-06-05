package me.localx.icons.rounded.outline

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

public val Icons.Outline.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.786f, 19.492f)
                lineTo(16.713f, 1.836f)
                curveToRelative(-0.624f, -1.529f, -2.376f, -2.269f, -3.911f, -1.645f)
                lineToRelative(-0.925f, 0.378f)
                curveToRelative(-0.249f, 0.102f, -0.472f, 0.244f, -0.68f, 0.402f)
                curveToRelative(-0.548f, -0.594f, -1.326f, -0.972f, -2.196f, -0.972f)
                lineTo(3.0f, -0.001f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(12.0f, 8.895f)
                lineToRelative(5.304f, 13.242f)
                curveToRelative(0.625f, 1.543f, 2.417f, 2.26f, 3.909f, 1.641f)
                lineToRelative(0.926f, -0.378f)
                curveToRelative(1.505f, -0.574f, 2.286f, -2.434f, 1.647f, -3.907f)
                close()
                moveTo(13.574f, 7.446f)
                lineToRelative(2.778f, -1.132f)
                lineToRelative(4.171f, 10.412f)
                lineToRelative(-2.778f, 1.132f)
                lineTo(13.574f, 7.446f)
                close()
                moveTo(12.632f, 2.421f)
                lineToRelative(0.925f, -0.378f)
                curveToRelative(0.496f, -0.206f, 1.097f, 0.031f, 1.302f, 0.543f)
                lineToRelative(0.75f, 1.871f)
                lineToRelative(-2.777f, 1.132f)
                lineToRelative(-0.747f, -1.866f)
                curveToRelative(-0.208f, -0.51f, 0.038f, -1.095f, 0.549f, -1.303f)
                close()
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(21.929f, 21.009f)
                curveToRelative(-0.104f, 0.247f, -0.297f, 0.438f, -0.544f, 0.539f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.926f, 0.378f)
                curveToRelative(-0.511f, 0.206f, -1.095f, -0.037f, -1.3f, -0.54f)
                lineToRelative(-0.669f, -1.671f)
                lineToRelative(2.778f, -1.132f)
                lineToRelative(0.665f, 1.661f)
                curveToRelative(0.102f, 0.247f, 0.101f, 0.52f, -0.003f, 0.766f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
