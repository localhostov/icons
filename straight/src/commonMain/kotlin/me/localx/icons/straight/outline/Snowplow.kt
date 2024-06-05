package me.localx.icons.straight.outline

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

public val Icons.Outline.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 16.72f)
                lineTo(21.99f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.99f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.316f, -2.921f)
                lineToRelative(-2.819f, -6.3f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.117f, 0.99f)
                lineTo(5.0f, 0.99f)
                lineTo(5.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 9.0f)
                lineToRelative(0.01f, 5.99f)
                arcTo(5.032f, 5.032f, 0.0f, false, false, 5.0f, 23.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.031f, 5.031f, 0.0f, false, false, 4.0f, -8.0f)
                lineToRelative(0.0f, -1.013f)
                lineTo(19.99f, 13.987f)
                verticalLineToRelative(2.73f)
                arcTo(8.838f, 8.838f, 0.0f, false, false, 22.6f, 23.01f)
                lineTo(24.01f, 21.6f)
                arcTo(6.853f, 6.853f, 0.0f, false, true, 21.99f, 16.72f)
                close()
                moveTo(7.0f, 2.99f)
                lineTo(9.117f, 2.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.912f, 0.592f)
                lineTo(12.448f, 8.99f)
                lineTo(7.0f, 8.99f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                lineTo(5.0f, 9.99f)
                lineToRelative(0.01f, 1.0f)
                horizontalLineToRelative(8.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(0.0f, 1.423f)
                arcTo(4.975f, 4.975f, 0.0f, false, false, 13.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, -1.993f, 0.415f)
                lineTo(3.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 8.0f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                horizontalLineToRelative(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 21.0f)
                close()
                moveTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                close()
                moveTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
