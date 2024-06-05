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

public val Icons.Outline.H1: ImageVector
    get() {
        if (_h1 != null) {
            return _h1!!
        }
        _h1 = Builder(name = "H1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(20.492f, 4.0f)
                lineToRelative(-3.708f, 3.802f)
                lineToRelative(1.432f, 1.396f)
                lineToRelative(1.784f, -1.829f)
                verticalLineToRelative(12.631f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-1.508f)
                close()
            }
        }
        .build()
        return _h1!!
    }

private var _h1: ImageVector? = null
