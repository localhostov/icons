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

public val Icons.Bold.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 20.439f)
                arcTo(6.148f, 6.148f, 0.0f, false, true, 22.0f, 15.917f)
                lineTo(22.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(19.0f, 11.0f)
                lineTo(15.654f, 11.0f)
                curveToRelative(-0.06f, -0.126f, -3.753f, -7.5f, -3.753f, -7.5f)
                arcTo(4.473f, 4.473f, 0.0f, false, false, 7.873f, 1.0f)
                lineTo(7.51f, 1.0f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, -3.5f, 3.506f)
                lineToRelative(0.0f, 1.741f)
                arcTo(4.521f, 4.521f, 0.0f, false, false, 1.0f, 10.5f)
                reflectiveCurveToRelative(0.009f, 5.1f, 0.015f, 5.152f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 4.5f, 23.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 16.0f, 15.67f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.917f)
                curveToRelative(-0.214f, 2.427f, 1.849f, 8.729f, 4.561f, 6.644f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.561f, 20.439f)
                close()
                moveTo(7.156f, 4.147f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.51f, 4.0f)
                horizontalLineToRelative(0.363f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, 1.343f, 0.832f)
                lineTo(11.291f, 9.0f)
                lineTo(7.517f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineToRelative(-0.006f, -4.0f)
                arcTo(0.493f, 0.493f, 0.0f, false, true, 7.156f, 4.147f)
                close()
                moveTo(4.229f, 9.7f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 7.517f, 12.0f)
                lineTo(12.49f, 12.0f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(13.0f, 14.027f)
                arcTo(4.772f, 4.772f, 0.0f, false, false, 12.5f, 14.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.525f, 4.525f, 0.0f, false, false, -0.5f, 0.027f)
                lineTo(4.0f, 10.5f)
                arcTo(1.493f, 1.493f, 0.0f, false, true, 4.229f, 9.7f)
                close()
                moveTo(3.5f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 20.0f)
                close()
                moveTo(8.5f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 20.0f)
                close()
                moveTo(13.5f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 20.0f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
