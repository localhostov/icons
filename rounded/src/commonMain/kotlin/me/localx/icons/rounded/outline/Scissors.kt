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

public val Icons.Outline.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 14.0f)
                arcToRelative(4.929f, 4.929f, 0.0f, false, false, -2.352f, 0.615f)
                lineToRelative(-3.348f, -4.015f)
                lineToRelative(7.467f, -8.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.536f, -1.28f)
                lineToRelative(-7.231f, 8.678f)
                lineToRelative(-7.232f, -8.678f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.536f, 1.28f)
                lineToRelative(7.468f, 8.96f)
                lineToRelative(-3.348f, 4.015f)
                arcToRelative(4.941f, 4.941f, 0.0f, false, false, -2.352f, -0.615f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, false, -1.112f, -3.1f)
                lineToRelative(3.112f, -3.738f)
                lineToRelative(3.111f, 3.738f)
                arcToRelative(4.955f, 4.955f, 0.0f, false, false, -1.111f, 3.1f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, -5.0f)
                close()
                moveTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
                moveTo(19.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
