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

public val Icons.Outline.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard = Builder(name = "Dashboard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 11.437f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 13.0f)
                arcToRelative(11.878f, 11.878f, 0.0f, false, false, 3.759f, 8.712f)
                arcTo(4.84f, 4.84f, 0.0f, false, false, 7.113f, 23.0f)
                lineTo(16.88f, 23.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 3.509f, -1.429f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 23.9f, 11.437f)
                close()
                moveTo(18.991f, 20.137f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.88f, 21.0f)
                lineTo(7.113f, 21.0f)
                arcToRelative(2.862f, 2.862f, 0.0f, false, true, -1.981f, -0.741f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 2.0f, 13.0f)
                arcTo(10.014f, 10.014f, 0.0f, false, true, 5.338f, 5.543f)
                arcTo(9.881f, 9.881f, 0.0f, false, true, 11.986f, 3.0f)
                arcToRelative(10.553f, 10.553f, 0.0f, false, true, 1.174f, 0.066f)
                arcToRelative(9.994f, 9.994f, 0.0f, false, true, 5.831f, 17.076f)
                close()
                moveTo(7.807f, 17.285f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 1.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcToRelative(8.072f, 8.072f, 0.0f, false, true, 1.143f, 0.081f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.847f, 1.133f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, -1.133f, 0.848f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.05f, 10.223f)
                close()
                moveTo(19.919f, 11.857f)
                arcTo(8.072f, 8.072f, 0.0f, false, true, 20.0f, 13.0f)
                arcToRelative(7.931f, 7.931f, 0.0f, false, true, -2.408f, 5.716f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.432f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, 1.744f, -5.141f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.981f, -0.286f)
                close()
                moveTo(13.926f, 12.488f)
                arcToRelative(2.033f, 2.033f, 0.0f, true, true, -1.414f, -1.414f)
                lineToRelative(3.781f, -3.781f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
