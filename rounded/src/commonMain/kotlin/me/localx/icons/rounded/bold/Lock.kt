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

public val Icons.Bold.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 508.779f, viewportHeight = 508.779f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.723f, 180.395f)
                verticalLineToRelative(-31.061f)
                curveTo(403.723f, 66.859f, 336.864f, 0.0f, 254.389f, 0.0f)
                reflectiveCurveTo(105.056f, 66.859f, 105.056f, 149.333f)
                verticalLineToRelative(31.061f)
                curveToRelative(-39.236f, 20.023f, -63.952f, 60.334f, -64.0f, 104.384f)
                verticalLineToRelative(106.667f)
                curveToRelative(0.071f, 64.772f, 52.561f, 117.263f, 117.333f, 117.333f)
                horizontalLineToRelative(192.0f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineTo(284.779f)
                curveTo(467.675f, 240.729f, 442.959f, 200.417f, 403.723f, 180.395f)
                close()
                moveTo(254.389f, 64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(18.112f)
                horizontalLineTo(169.056f)
                verticalLineToRelative(-18.112f)
                curveTo(169.056f, 102.205f, 207.261f, 64.0f, 254.389f, 64.0f)
                close()
                moveTo(403.723f, 391.445f)
                curveToRelative(0.0f, 29.455f, -23.878f, 53.333f, -53.333f, 53.333f)
                horizontalLineToRelative(-192.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(284.779f)
                curveToRelative(0.0f, -29.455f, 23.878f, -53.333f, 53.333f, -53.333f)
                horizontalLineToRelative(192.0f)
                curveToRelative(29.455f, 0.0f, 53.333f, 23.878f, 53.333f, 53.333f)
                verticalLineTo(391.445f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.723f, 295.445f)
                horizontalLineToRelative(21.333f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-21.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(211.723f, 309.772f, 226.05f, 295.445f, 243.723f, 295.445f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
