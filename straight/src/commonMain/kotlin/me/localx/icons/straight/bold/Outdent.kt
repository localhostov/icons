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

public val Icons.Bold.Outdent: ImageVector
    get() {
        if (_outdent != null) {
            return _outdent!!
        }
        _outdent = Builder(name = "Outdent", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.922f, 12.768f)
                curveToRelative(-0.48f, -0.4f, -0.48f, -1.137f, 0.0f, -1.536f)
                lineToRelative(5.078f, -4.232f)
                verticalLineToRelative(10.0f)
                lineTo(0.922f, 12.768f)
                close()
                moveTo(0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 3.0f)
                close()
                moveTo(0.0f, 21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _outdent!!
    }

private var _outdent: ImageVector? = null
