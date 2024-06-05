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

public val Icons.Bold.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard = Builder(name = "Dashboard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.9f, 11.394f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.9f, 1.556f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 3.761f, 8.678f)
                arcToRelative(5.176f, 5.176f, 0.0f, false, false, 3.575f, 1.372f)
                horizontalLineToRelative(9.322f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, false, 3.728f, -1.512f)
                arcToRelative(11.866f, 11.866f, 0.0f, false, false, 3.514f, -10.094f)
                close()
                moveTo(18.293f, 19.338f)
                arcToRelative(2.333f, 2.333f, 0.0f, false, true, -1.635f, 0.662f)
                horizontalLineToRelative(-9.322f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.52f, -0.557f)
                arcToRelative(8.831f, 8.831f, 0.0f, false, true, -2.816f, -6.493f)
                arcToRelative(8.977f, 8.977f, 0.0f, false, true, 8.988f, -8.95f)
                arcToRelative(9.483f, 9.483f, 0.0f, false, true, 1.06f, 0.06f)
                arcToRelative(9.008f, 9.008f, 0.0f, false, true, 7.877f, 7.713f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, true, -2.631f, 7.565f)
                close()
                moveTo(9.053f, 15.485f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.209f, 2.03f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.844f, -4.729f)
                arcToRelative(6.818f, 6.818f, 0.0f, false, true, 6.377f, -6.761f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.246f, 2.991f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -3.623f, 3.77f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, 1.053f, 2.699f)
                close()
                moveTo(18.941f, 13.693f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, true, -1.785f, 3.823f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.209f, -2.032f)
                arcToRelative(3.951f, 3.951f, 0.0f, false, false, 1.02f, -2.177f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.974f, 0.386f)
                close()
                moveTo(13.986f, 13.135f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.121f, -2.121f)
                lineToRelative(2.574f, -2.575f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
