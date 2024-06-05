package me.localx.icons.straight.bold

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

public val Icons.Bold.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, false, -10.5f, -11.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.6f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, false, -10.5f, 11.9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 7.5f, 0.0f)
                verticalLineToRelative(-5.25f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3.125f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 17.75f, 0.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
