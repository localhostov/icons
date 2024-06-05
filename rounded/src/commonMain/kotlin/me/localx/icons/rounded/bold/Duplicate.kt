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

public val Icons.Bold.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.781f, 36.885f)
                curveTo(415.688f, 13.395f, 384.888f, 0.052f, 352.64f, 0.0f)
                horizontalLineTo(288.0f)
                curveToRelative(-60.623f, 0.095f, -111.219f, 46.301f, -116.8f, 106.667f)
                horizontalLineTo(160.0f)
                curveTo(95.228f, 106.737f, 42.737f, 159.228f, 42.667f, 224.0f)
                verticalLineToRelative(170.667f)
                curveTo(42.737f, 459.439f, 95.228f, 511.929f, 160.0f, 512.0f)
                horizontalLineToRelative(85.333f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineToRelative(-11.2f)
                curveToRelative(60.37f, -5.572f, 106.582f, -56.173f, 106.667f, -116.8f)
                verticalLineTo(116.693f)
                curveTo(469.376f, 87.041f, 458.089f, 58.492f, 437.781f, 36.885f)
                close()
                moveTo(298.667f, 394.667f)
                curveToRelative(0.0f, 29.455f, -23.878f, 53.333f, -53.333f, 53.333f)
                horizontalLineTo(160.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -29.455f, 23.878f, -53.333f, 53.333f, -53.333f)
                horizontalLineToRelative(10.667f)
                verticalLineToRelative(96.0f)
                curveTo(170.737f, 331.439f, 223.228f, 383.929f, 288.0f, 384.0f)
                horizontalLineToRelative(10.667f)
                verticalLineTo(394.667f)
                close()
                moveTo(405.333f, 266.667f)
                curveTo(405.333f, 296.122f, 381.455f, 320.0f, 352.0f, 320.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(117.333f)
                curveTo(234.667f, 87.878f, 258.545f, 64.0f, 288.0f, 64.0f)
                horizontalLineToRelative(53.333f)
                verticalLineToRelative(21.333f)
                curveTo(341.333f, 108.897f, 360.436f, 128.0f, 384.0f, 128.0f)
                horizontalLineToRelative(21.333f)
                verticalLineTo(266.667f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
