package me.localx.icons.rounded.outline

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

public val Icons.Outline.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 8.002f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.535f, -3.348f, -2.817f, -6.114f, -5.886f, -7.329f)
                curveTo(15.118f, 0.264f, 14.592f, 0.002f, 14.0f, 0.002f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.592f, 0.0f, -1.118f, 0.262f, -1.484f, 0.671f)
                curveToRelative(-3.068f, 1.216f, -5.35f, 3.982f, -5.885f, 7.329f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.692f)
                lineToRelative(2.153f, 10.048f)
                curveToRelative(0.491f, 2.29f, 2.547f, 3.952f, 4.889f, 3.952f)
                horizontalLineToRelative(4.532f)
                curveToRelative(2.343f, 0.0f, 4.398f, -1.662f, 4.89f, -3.952f)
                lineToRelative(2.153f, -10.048f)
                horizontalLineToRelative(0.692f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.2f, 19.63f)
                curveToRelative(-0.295f, 1.375f, -1.529f, 2.372f, -2.935f, 2.372f)
                horizontalLineToRelative(-4.532f)
                curveToRelative(-1.405f, 0.0f, -2.639f, -0.997f, -2.934f, -2.372f)
                lineToRelative(-1.206f, -5.628f)
                horizontalLineToRelative(9.906f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(5.165f, 12.002f)
                lineToRelative(-0.429f, -2.0f)
                horizontalLineToRelative(14.527f)
                lineToRelative(-2.063f, 9.628f)
                close()
                moveTo(4.651f, 8.002f)
                curveToRelative(0.436f, -2.14f, 1.789f, -3.945f, 3.625f, -5.001f)
                curveToRelative(0.346f, 0.596f, 0.984f, 1.001f, 1.723f, 1.001f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.739f, 0.0f, 1.377f, -0.405f, 1.723f, -1.001f)
                curveToRelative(1.837f, 1.056f, 3.19f, 2.862f, 3.626f, 5.002f)
                lineTo(4.651f, 8.003f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
