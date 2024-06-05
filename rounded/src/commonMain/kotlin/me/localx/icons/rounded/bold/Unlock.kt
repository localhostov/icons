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

public val Icons.Bold.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.033f, viewportHeight = 512.033f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.017f, 170.7f)
                horizontalLineTo(170.683f)
                verticalLineToRelative(-16.491f)
                curveToRelative(0.009f, -49.815f, 40.399f, -90.19f, 90.214f, -90.181f)
                curveToRelative(32.799f, 0.006f, 63.01f, 17.816f, 78.895f, 46.511f)
                curveToRelative(8.577f, 15.452f, 28.057f, 21.025f, 43.509f, 12.448f)
                reflectiveCurveToRelative(21.025f, -28.057f, 12.448f, -43.509f)
                lineToRelative(0.0f, 0.0f)
                curveTo(354.469f, 4.992f, 260.62f, -21.925f, 186.134f, 19.356f)
                curveToRelative(-49.024f, 27.17f, -79.445f, 78.803f, -79.451f, 134.853f)
                verticalLineToRelative(29.44f)
                curveToRelative(-39.236f, 20.023f, -63.952f, 60.334f, -64.0f, 104.384f)
                verticalLineTo(394.7f)
                curveToRelative(0.071f, 64.772f, 52.561f, 117.263f, 117.333f, 117.333f)
                horizontalLineToRelative(192.0f)
                curveToRelative(64.772f, -0.071f, 117.263f, -52.561f, 117.333f, -117.333f)
                verticalLineTo(288.033f)
                curveTo(469.28f, 223.261f, 416.789f, 170.771f, 352.017f, 170.7f)
                close()
                moveTo(405.35f, 394.7f)
                curveToRelative(0.0f, 29.455f, -23.878f, 53.333f, -53.333f, 53.333f)
                horizontalLineToRelative(-192.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, -23.878f, -53.333f, -53.333f)
                verticalLineTo(288.033f)
                curveToRelative(0.0f, -29.455f, 23.878f, -53.333f, 53.333f, -53.333f)
                horizontalLineToRelative(192.0f)
                curveToRelative(29.455f, 0.0f, 53.333f, 23.878f, 53.333f, 53.333f)
                verticalLineTo(394.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.35f, 298.7f)
                horizontalLineToRelative(21.333f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(245.35f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(213.35f, 313.027f, 227.677f, 298.7f, 245.35f, 298.7f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
