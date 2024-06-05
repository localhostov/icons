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

public val Icons.Bold.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 24.0f)
                lineTo(8.5f, 24.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, -0.5f, -1.5f, -1.2f)
                lineToRelative(-1.6f, -7.3f)
                lineTo(5.0f, 17.8f)
                curveTo(4.8f, 18.5f, 4.2f, 19.0f, 3.4f, 19.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, -0.6f, -1.4f, -1.3f)
                lineTo(0.0f, 4.0f)
                curveToRelative(-0.2f, -0.9f, 0.1f, -2.0f, 0.7f, -2.8f)
                reflectiveCurveTo(2.4f, 0.0f, 3.4f, 0.0f)
                horizontalLineToRelative(17.2f)
                curveToRelative(1.0f, 0.0f, 2.0f, 0.4f, 2.6f, 1.2f)
                reflectiveCurveTo(24.1f, 3.0f, 23.9f, 4.0f)
                lineToRelative(-2.5f, 17.7f)
                curveTo(21.4f, 22.4f, 20.8f, 23.0f, 20.0f, 23.0f)
                curveToRelative(-0.7f, 0.0f, -1.3f, -0.5f, -1.5f, -1.2f)
                lineToRelative(-1.7f, -7.2f)
                lineToRelative(-0.9f, 3.3f)
                curveToRelative(-0.2f, 0.6f, -0.8f, 1.1f, -1.4f, 1.1f)
                reflectiveCurveToRelative(-1.3f, -0.4f, -1.4f, -1.1f)
                lineToRelative(-1.0f, -3.5f)
                lineTo(10.0f, 22.9f)
                curveTo(9.8f, 23.5f, 9.2f, 24.0f, 8.5f, 24.0f)
                lineTo(8.5f, 24.0f)
                close()
                moveTo(5.5f, 7.0f)
                lineTo(5.5f, 7.0f)
                curveTo(6.2f, 7.0f, 6.8f, 7.5f, 7.0f, 8.2f)
                lineToRelative(1.6f, 7.7f)
                lineToRelative(1.9f, -7.7f)
                curveTo(10.7f, 7.5f, 11.3f, 7.0f, 12.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.7f, 0.0f, 1.3f, 0.4f, 1.4f, 1.1f)
                lineToRelative(1.1f, 3.8f)
                lineToRelative(1.1f, -3.8f)
                curveTo(15.7f, 7.4f, 16.3f, 7.0f, 17.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.7f, 0.0f, 1.3f, 0.5f, 1.4f, 1.2f)
                lineToRelative(1.3f, 5.6f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.2f, 0.0f, -0.3f, -0.1f, -0.4f)
                curveToRelative(0.0f, -0.1f, -0.2f, -0.2f, -0.3f, -0.2f)
                horizontalLineTo(3.4f)
                curveTo(3.3f, 3.0f, 3.1f, 3.1f, 3.1f, 3.2f)
                curveTo(3.1f, 3.2f, 3.0f, 3.3f, 3.0f, 3.5f)
                lineToRelative(0.8f, 5.7f)
                lineToRelative(0.2f, -1.0f)
                curveTo(4.2f, 7.5f, 4.8f, 7.0f, 5.5f, 7.0f)
                lineTo(5.5f, 7.0f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
