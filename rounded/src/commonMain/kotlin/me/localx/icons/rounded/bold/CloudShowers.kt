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

public val Icons.Bold.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.839f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.325f, -0.794f)
                arcTo(5.751f, 5.751f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, 0.162f, -0.353f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, true, -0.034f, -2.952f)
                arcTo(8.125f, 8.125f, 0.0f, false, true, 8.558f, 0.141f)
                arcToRelative(8.234f, 8.234f, 0.0f, false, true, 8.929f, 4.54f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, 0.325f, 0.242f)
                arcToRelative(7.757f, 7.757f, 0.0f, false, true, 4.857f, 11.893f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.516f, -1.632f)
                arcToRelative(4.741f, 4.741f, 0.0f, false, false, -2.93f, -7.32f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, true, -2.448f, -1.9f)
                arcToRelative(5.183f, 5.183f, 0.0f, false, false, -9.791f, 1.32f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(3.416f, 3.416f, 0.0f, false, true, -1.088f, 3.144f)
                arcToRelative(2.728f, 2.728f, 0.0f, false, false, -0.592f, 3.316f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 17.839f)
                close()
                moveTo(13.0f, 22.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(8.0f, 20.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(18.0f, 20.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
