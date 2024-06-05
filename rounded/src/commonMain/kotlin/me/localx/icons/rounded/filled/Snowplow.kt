package me.localx.icons.rounded.filled

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

public val Icons.Filled.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.666f, 22.728f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.413f, -0.08f)
                arcTo(8.884f, 8.884f, 0.0f, false, true, 20.0f, 16.72f)
                lineTo(20.0f, 14.0f)
                lineTo(17.314f, 14.0f)
                arcTo(5.967f, 5.967f, 0.0f, false, false, 14.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                arcToRelative(5.973f, 5.973f, 0.0f, false, false, -2.992f, 0.8f)
                lineToRelative(0.0f, -3.8f)
                arcTo(3.958f, 3.958f, 0.0f, false, true, 4.0f, 6.143f)
                lineTo(4.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(15.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.955f, 1.583f)
                arcToRelative(3.033f, 3.033f, 0.0f, false, true, 0.035f, 0.407f)
                lineTo(16.99f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.72f)
                arcToRelative(6.89f, 6.89f, 0.0f, false, false, 1.745f, 4.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.666f, 22.728f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(4.0f, 23.0f)
                curveToRelative(-5.276f, -0.139f, -5.272f, -7.862f, 0.0f, -8.0f)
                lineTo(14.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
                moveTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                close()
                moveTo(12.12f, 3.357f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.468f, 0.99f)
                lineToRelative(0.025f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 3.493f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(8.2f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
