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

public val Icons.Filled.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.942f, 6.837f)
                lineToRelative(-2.182f, -2.183f)
                lineToRelative(0.947f, -0.947f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-0.947f, 0.947f)
                lineToRelative(-2.183f, -2.182f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -5.105f, 0.0f)
                arcToRelative(3.609f, 3.609f, 0.0f, false, false, 0.0f, 5.106f)
                lineToRelative(2.182f, 2.182f)
                lineToRelative(-5.894f, 5.894f)
                lineToRelative(-2.183f, -2.182f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -5.105f, 0.0f)
                arcToRelative(3.609f, 3.609f, 0.0f, false, false, 0.0f, 5.106f)
                lineToRelative(2.182f, 2.182f)
                lineToRelative(-0.947f, 0.947f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(0.947f, -0.947f)
                lineToRelative(2.183f, 2.182f)
                arcToRelative(3.609f, 3.609f, 0.0f, false, false, 5.105f, 0.0f)
                arcToRelative(3.608f, 3.608f, 0.0f, false, false, 0.0f, -5.105f)
                lineToRelative(-2.182f, -2.182f)
                lineToRelative(5.9f, -5.895f)
                lineToRelative(2.182f, 2.182f)
                arcToRelative(3.609f, 3.609f, 0.0f, false, false, 5.105f, 0.0f)
                arcToRelative(3.608f, 3.608f, 0.0f, false, false, 0.0f, -5.105f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
