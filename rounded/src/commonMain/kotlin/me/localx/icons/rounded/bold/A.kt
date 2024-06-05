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

public val Icons.Bold.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.899f, 21.958f)
                lineTo(16.609f, 3.142f)
                curveToRelative(-1.512f, -4.142f, -7.711f, -4.139f, -9.222f, 0.006f)
                lineTo(0.101f, 21.958f)
                curveToRelative(-0.299f, 0.772f, 0.084f, 1.642f, 0.857f, 1.941f)
                curveToRelative(0.773f, 0.299f, 1.642f, -0.084f, 1.941f, -0.857f)
                lineToRelative(1.953f, -5.042f)
                horizontalLineToRelative(14.296f)
                lineToRelative(1.953f, 5.042f)
                curveToRelative(0.299f, 0.78f, 1.188f, 1.154f, 1.941f, 0.857f)
                curveToRelative(0.772f, -0.299f, 1.156f, -1.168f, 0.857f, -1.941f)
                close()
                moveTo(6.014f, 15.0f)
                lineTo(10.183f, 4.238f)
                curveToRelative(0.697f, -1.668f, 2.933f, -1.672f, 3.632f, -0.006f)
                lineToRelative(4.171f, 10.768f)
                horizontalLineTo(6.014f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
