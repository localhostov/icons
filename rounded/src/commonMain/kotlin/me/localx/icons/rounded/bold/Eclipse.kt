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

public val Icons.Bold.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = Builder(name = "Eclipse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveToRelative(-7.929f, 0.252f, -7.928f, 11.749f, 0.0f, 12.0f)
                curveTo(25.929f, 17.748f, 25.928f, 6.251f, 18.0f, 6.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 15.0f)
                close()
                moveTo(13.5f, 18.9f)
                verticalLineToRelative(3.579f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-3.15f)
                arcToRelative(7.421f, 7.421f, 0.0f, false, true, -2.627f, -1.1f)
                lineTo(5.636f, 20.466f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, -2.122f)
                lineToRelative(2.238f, -2.237f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -1.094f, -2.626f)
                lineTo(1.5f, 13.481f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(4.659f, 10.481f)
                arcTo(7.484f, 7.484f, 0.0f, false, true, 5.753f, 7.855f)
                lineTo(3.515f, 5.617f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.636f, 3.5f)
                lineTo(7.873f, 5.732f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, 2.627f, -1.1f)
                lineTo(10.5f, 1.481f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(13.5f, 5.059f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.141f, 2.467f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, false, 0.0f, 8.91f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 18.9f)
                close()
            }
        }
        .build()
        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
