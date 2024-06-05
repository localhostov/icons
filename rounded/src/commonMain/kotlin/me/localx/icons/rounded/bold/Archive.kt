package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                horizontalLineTo(160.0f)
                curveTo(95.228f, 0.071f, 42.737f, 52.561f, 42.667f, 117.333f)
                verticalLineToRelative(277.333f)
                curveTo(42.737f, 459.439f, 95.228f, 511.929f, 160.0f, 512.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineTo(117.333f)
                curveTo(469.263f, 52.561f, 416.772f, 0.071f, 352.0f, 0.0f)
                close()
                moveTo(160.0f, 64.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(29.455f, 0.0f, 53.333f, 23.878f, 53.333f, 53.333f)
                verticalLineToRelative(117.333f)
                horizontalLineTo(106.667f)
                verticalLineTo(117.333f)
                curveTo(106.667f, 87.878f, 130.545f, 64.0f, 160.0f, 64.0f)
                close()
                moveTo(352.0f, 448.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(298.667f)
                verticalLineToRelative(96.0f)
                curveTo(405.333f, 424.122f, 381.455f, 448.0f, 352.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.333f, 128.0f)
                horizontalLineToRelative(21.333f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-21.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(213.333f, 142.327f, 227.66f, 128.0f, 245.333f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.333f, 341.333f)
                horizontalLineToRelative(21.333f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-21.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(213.333f, 355.66f, 227.66f, 341.333f, 245.333f, 341.333f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
