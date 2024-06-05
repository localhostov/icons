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

public val Icons.Bold.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(435.413f, 86.379f)
                lineToRelative(-51.029f, -51.584f)
                curveTo(362.29f, 12.599f, 332.288f, 0.084f, 300.97f, 0.0f)
                horizontalLineTo(160.0f)
                curveTo(95.228f, 0.071f, 42.737f, 52.561f, 42.666f, 117.333f)
                verticalLineToRelative(277.333f)
                curveTo(42.737f, 459.439f, 95.228f, 511.929f, 160.0f, 512.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineTo(168.896f)
                curveTo(469.414f, 137.981f, 457.213f, 108.299f, 435.413f, 86.379f)
                close()
                moveTo(405.333f, 394.667f)
                curveTo(405.333f, 424.122f, 381.455f, 448.0f, 352.0f, 448.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(117.333f)
                curveTo(106.666f, 87.878f, 130.545f, 64.0f, 160.0f, 64.0f)
                horizontalLineToRelative(117.333f)
                verticalLineToRelative(85.333f)
                curveTo(277.333f, 172.897f, 296.436f, 192.0f, 320.0f, 192.0f)
                horizontalLineToRelative(85.333f)
                verticalLineTo(394.667f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
