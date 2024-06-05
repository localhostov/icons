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

public val Icons.Bold.SignPosts: ImageVector
    get() {
        if (_signPosts != null) {
            return _signPosts!!
        }
        _signPosts = Builder(name = "SignPosts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                curveToRelative(0.0f, -1.758f, -1.308f, -3.204f, -3.0f, -3.449f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 2.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.051f)
                curveToRelative(-1.692f, 0.245f, -3.0f, 1.691f, -3.0f, 3.449f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 5.5f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                close()
            }
        }
        .build()
        return _signPosts!!
    }

private var _signPosts: ImageVector? = null
