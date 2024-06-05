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

public val Icons.Bold.Banner4: ImageVector
    get() {
        if (_banner4 != null) {
            return _banner4!!
        }
        _banner4 = Builder(name = "Banner4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.889f, 10.0f)
                lineToRelative(2.919f, -2.539f)
                curveToRelative(0.463f, -0.595f, 0.039f, -1.461f, -0.715f, -1.461f)
                horizontalLineToRelative(-4.093f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                lineTo(7.0f, 8.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                lineTo(0.907f, 6.0f)
                curveToRelative(-0.753f, 0.0f, -1.177f, 0.866f, -0.715f, 1.461f)
                lineToRelative(2.919f, 2.539f)
                lineTo(0.192f, 12.539f)
                curveToRelative(-0.463f, 0.595f, -0.039f, 1.461f, 0.715f, 1.461f)
                horizontalLineToRelative(3.093f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.093f)
                curveToRelative(0.753f, 0.0f, 1.177f, -0.866f, 0.715f, -1.461f)
                lineToRelative(-2.919f, -2.539f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 15.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _banner4!!
    }

private var _banner4: ImageVector? = null
