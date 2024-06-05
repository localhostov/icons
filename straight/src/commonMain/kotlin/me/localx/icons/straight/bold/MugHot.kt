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

public val Icons.Bold.MugHot: ImageVector
    get() {
        if (_mugHot != null) {
            return _mugHot!!
        }
        _mugHot = Builder(name = "MugHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(24.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 20.5f)
                lineTo(0.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 13.5f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(21.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(19.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null
