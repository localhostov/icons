package me.localx.icons.straight.filled

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

public val Icons.Filled.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.973f, 14.0f)
                arcTo(10.6f, 10.6f, 0.0f, false, false, 13.0f, 20.672f)
                verticalLineTo(13.91f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 8.0f)
                curveTo(18.0f, 4.0f, 14.108f, 0.872f, 14.085f, 0.85f)
                arcTo(20.472f, 20.472f, 0.0f, false, false, 12.0f, 9.0f)
                horizontalLineTo(10.0f)
                arcTo(22.276f, 22.276f, 0.0f, false, true, 12.258f, 0.054f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 9.844f, 0.908f)
                curveTo(7.943f, 2.848f, 6.0f, 5.207f, 6.0f, 8.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 5.0f, 5.91f)
                verticalLineToRelative(6.762f)
                arcTo(10.6f, 10.6f, 0.0f, false, false, 1.027f, 14.0f)
                horizontalLineTo(0.0f)
                lineToRelative(0.127f, 1.124f)
                curveTo(0.923f, 22.145f, 7.5f, 24.0f, 10.86f, 24.0f)
                horizontalLineToRelative(2.28f)
                curveToRelative(3.365f, 0.0f, 9.936f, -1.855f, 10.731f, -8.876f)
                lineTo(24.0f, 14.0f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
