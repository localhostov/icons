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

public val Icons.Bold.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 117.333f)
                curveTo(511.929f, 52.561f, 459.439f, 0.071f, 394.667f, 0.0f)
                horizontalLineTo(117.333f)
                curveTo(52.561f, 0.071f, 0.071f, 52.561f, 0.0f, 117.333f)
                verticalLineToRelative(21.333f)
                curveToRelative(0.008f, 19.49f, 7.669f, 38.198f, 21.333f, 52.096f)
                verticalLineToRelative(203.904f)
                curveTo(21.404f, 459.439f, 73.895f, 511.929f, 138.667f, 512.0f)
                horizontalLineToRelative(234.667f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineTo(190.763f)
                curveToRelative(13.665f, -13.898f, 21.326f, -32.606f, 21.333f, -52.096f)
                verticalLineTo(117.333f)
                close()
                moveTo(64.0f, 117.333f)
                curveTo(64.0f, 87.878f, 87.878f, 64.0f, 117.333f, 64.0f)
                horizontalLineToRelative(277.333f)
                curveTo(424.122f, 64.0f, 448.0f, 87.878f, 448.0f, 117.333f)
                verticalLineToRelative(21.333f)
                curveToRelative(0.0f, 5.891f, -4.776f, 10.667f, -10.667f, 10.667f)
                horizontalLineTo(74.667f)
                curveToRelative(-5.891f, 0.0f, -10.667f, -4.776f, -10.667f, -10.667f)
                verticalLineTo(117.333f)
                close()
                moveTo(426.667f, 394.667f)
                curveToRelative(0.0f, 29.455f, -23.878f, 53.333f, -53.333f, 53.333f)
                horizontalLineTo(138.667f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(213.333f)
                horizontalLineToRelative(341.333f)
                verticalLineTo(394.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.667f, 256.0f)
                horizontalLineToRelative(106.667f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(202.667f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(170.667f, 270.327f, 184.994f, 256.0f, 202.667f, 256.0f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
