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

public val Icons.Bold.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.667f, 64.0f)
                horizontalLineTo(266.496f)
                curveToRelative(-1.723f, -0.008f, -3.419f, -0.425f, -4.949f, -1.216f)
                lineTo(198.72f, 29.867f)
                curveToRelative(-10.698f, -5.6f, -22.592f, -8.528f, -34.667f, -8.533f)
                horizontalLineToRelative(-46.72f)
                curveTo(52.561f, 21.404f, 0.071f, 73.895f, 0.0f, 138.667f)
                verticalLineToRelative(234.667f)
                curveToRelative(0.071f, 64.772f, 52.561f, 117.263f, 117.333f, 117.333f)
                horizontalLineToRelative(277.333f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineToRelative(-192.0f)
                curveTo(511.929f, 116.561f, 459.439f, 64.071f, 394.667f, 64.0f)
                close()
                moveTo(448.0f, 373.333f)
                curveToRelative(0.0f, 29.455f, -23.878f, 53.333f, -53.333f, 53.333f)
                horizontalLineTo(117.333f)
                curveTo(87.878f, 426.667f, 64.0f, 402.789f, 64.0f, 373.333f)
                verticalLineTo(169.963f)
                horizontalLineToRelative(382.72f)
                curveToRelative(0.839f, 3.732f, 1.268f, 7.545f, 1.28f, 11.371f)
                verticalLineTo(373.333f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
