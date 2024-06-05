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

public val Icons.Bold.CursorTextAlt: ImageVector
    get() {
        if (_cursorTextAlt != null) {
            return _cursorTextAlt!!
        }
        _cursorTextAlt = Builder(name = "CursorTextAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.751f)
                verticalLineToRelative(-11.502f)
                arcToRelative(3.249f, 3.249f, 0.0f, true, false, -4.249f, -4.249f)
                horizontalLineToRelative(-11.502f)
                arcToRelative(3.249f, 3.249f, 0.0f, true, false, -4.249f, 4.249f)
                verticalLineToRelative(11.5f)
                arcToRelative(3.249f, 3.249f, 0.0f, true, false, 4.249f, 4.251f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.249f, 3.249f, 0.0f, true, false, 4.251f, -4.249f)
                close()
                moveTo(5.0f, 18.019f)
                verticalLineToRelative(-12.038f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, false, 0.981f, -0.981f)
                horizontalLineToRelative(12.038f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, false, 0.981f, 0.981f)
                verticalLineToRelative(12.038f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, false, -0.981f, 0.981f)
                horizontalLineToRelative(-12.038f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, false, -0.981f, -0.981f)
                close()
                moveTo(13.5f, 14.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -2.0f, -0.635f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -2.0f, 0.635f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 2.0f, 0.635f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 2.0f, -0.635f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cursorTextAlt!!
    }

private var _cursorTextAlt: ImageVector? = null
