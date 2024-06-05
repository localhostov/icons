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
                moveToRelative(12.0f, 1.0f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, -6.888f, 21.818f)
                lineToRelative(0.259f, 0.182f)
                horizontalLineToRelative(13.258f)
                lineToRelative(0.259f, -0.182f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, -6.888f, -21.818f)
                close()
                moveTo(17.988f, 21.0f)
                horizontalLineToRelative(-11.976f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 11.976f, 0.0f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, true, -2.406f, 5.715f)
                lineToRelative(-1.4f, -1.43f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, false, 1.595f, -5.833f)
                lineToRelative(1.575f, -1.575f)
                arcToRelative(7.968f, 7.968f, 0.0f, false, true, 0.636f, 3.123f)
                close()
                moveTo(6.0f, 13.0f)
                arcToRelative(5.951f, 5.951f, 0.0f, false, false, 1.8f, 4.285f)
                lineToRelative(-1.4f, 1.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.717f, -13.08f)
                lineToRelative(-1.569f, 1.575f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, false, -7.548f, 5.79f)
                close()
                moveTo(13.926f, 12.488f)
                arcToRelative(2.033f, 2.033f, 0.0f, true, true, -1.414f, -1.414f)
                lineToRelative(4.281f, -4.281f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
