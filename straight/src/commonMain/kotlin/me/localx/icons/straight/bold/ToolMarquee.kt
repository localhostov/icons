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

public val Icons.Bold.ToolMarquee: ImageVector
    get() {
        if (_toolMarquee != null) {
            return _toolMarquee!!
        }
        _toolMarquee = Builder(name = "ToolMarquee", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(15.068f, 21.0f)
                horizontalLineToRelative(-6.068f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.068f)
                close()
            }
        }
        .build()
        return _toolMarquee!!
    }

private var _toolMarquee: ImageVector? = null
