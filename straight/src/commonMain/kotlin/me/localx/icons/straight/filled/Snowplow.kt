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
                moveTo(14.2f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(6.0f, 1.0f)
                lineTo(9.117f, 1.0f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, 2.738f, 1.766f)
                close()
                moveTo(22.0f, 16.72f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(16.857f, 12.0f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, -2.888f, -2.0f)
                lineTo(4.0f, 10.0f)
                lineTo(4.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 9.0f)
                lineToRelative(0.008f, 4.806f)
                arcTo(5.958f, 5.958f, 0.0f, false, true, 4.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                arcToRelative(5.962f, 5.962f, 0.0f, false, true, 3.31f, 1.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(2.72f)
                arcToRelative(8.833f, 8.833f, 0.0f, false, false, 2.6f, 6.29f)
                lineTo(24.01f, 21.6f)
                arcTo(6.848f, 6.848f, 0.0f, false, true, 22.0f, 16.72f)
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
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
