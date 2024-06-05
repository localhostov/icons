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

public val Icons.Bold.JarAlt: ImageVector
    get() {
        if (_jarAlt != null) {
            return _jarAlt!!
        }
        _jarAlt = Builder(name = "JarAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 3.261f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                verticalLineToRelative(3.261f)
                curveToRelative(-1.221f, 1.01f, -2.0f, 2.535f, -2.0f, 4.239f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0.0f, -1.704f, -0.779f, -3.23f, -2.0f, -4.239f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-10.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _jarAlt!!
    }

private var _jarAlt: ImageVector? = null
