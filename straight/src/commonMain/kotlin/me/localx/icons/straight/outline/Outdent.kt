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

public val Icons.Outline.Outdent: ImageVector
    get() {
        if (_outdent != null) {
            return _outdent!!
        }
        _outdent = Builder(name = "Outdent", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.83f, 13.228f)
                curveToRelative(-0.443f, -0.397f, -0.443f, -1.092f, 0.0f, -1.489f)
                lineToRelative(4.17f, -3.739f)
                verticalLineToRelative(8.967f)
                lineTo(0.83f, 13.228f)
                close()
                moveTo(0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 4.0f)
                close()
                moveTo(0.0f, 21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _outdent!!
    }

private var _outdent: ImageVector? = null
