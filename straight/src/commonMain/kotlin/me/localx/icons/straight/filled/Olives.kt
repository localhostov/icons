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

public val Icons.Filled.Olives: ImageVector
    get() {
        if (_olives != null) {
            return _olives!!
        }
        _olives = Builder(name = "Olives", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.074f, 7.1f)
                curveToRelative(0.2f, -1.442f, 0.98f, -4.1f, 3.926f, -4.1f)
                verticalLineTo(1.0f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, -3.5f, 1.141f)
                arcTo(13.731f, 13.731f, 0.0f, false, false, 11.0f, 0.0f)
                arcTo(13.239f, 13.239f, 0.0f, false, false, 3.0f, 2.5f)
                arcTo(13.239f, 13.239f, 0.0f, false, false, 11.0f, 5.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 6.228f, -1.419f)
                arcToRelative(8.491f, 8.491f, 0.0f, false, false, -1.172f, 3.5f)
                curveTo(12.546f, 7.606f, 10.0f, 11.046f, 10.0f, 15.5f)
                curveToRelative(0.0f, 4.846f, 3.009f, 8.5f, 7.0f, 8.5f)
                reflectiveCurveToRelative(7.0f, -3.654f, 7.0f, -8.5f)
                curveTo(24.0f, 11.1f, 21.517f, 7.694f, 18.074f, 7.1f)
                close()
                moveTo(16.0f, 21.0f)
                curveToRelative(-1.738f, 0.0f, -3.0f, -1.683f, -3.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.449f, 2.0f, 1.0f, 2.0f)
                close()
                moveTo(11.787f, 6.839f)
                curveToRelative(-3.347f, -1.907f, -7.562f, -0.5f, -10.136f, 3.45f)
                arcToRelative(9.056f, 9.056f, 0.0f, false, false, -1.488f, 6.74f)
                arcToRelative(6.168f, 6.168f, 0.0f, false, false, 2.784f, 3.984f)
                arcToRelative(6.28f, 6.28f, 0.0f, false, false, 3.381f, 0.978f)
                arcTo(7.179f, 7.179f, 0.0f, false, false, 9.4f, 21.266f)
                arcTo(12.052f, 12.052f, 0.0f, false, true, 8.0f, 15.5f)
                arcTo(10.935f, 10.935f, 0.0f, false, true, 11.787f, 6.839f)
                close()
                moveTo(5.2f, 15.82f)
                lineTo(3.9f, 17.34f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.872f, -2.5f)
                arcTo(4.967f, 4.967f, 0.0f, false, true, 4.224f, 12.35f)
                lineToRelative(1.52f, 1.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.73f, 1.454f)
                arcTo(0.753f, 0.753f, 0.0f, false, false, 5.2f, 15.82f)
                close()
            }
        }
        .build()
        return _olives!!
    }

private var _olives: ImageVector? = null
