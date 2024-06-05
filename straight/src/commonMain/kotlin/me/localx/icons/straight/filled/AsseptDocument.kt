package me.localx.icons.straight.filled

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

public val Icons.Filled.AsseptDocument: ImageVector
    get() {
        if (_asseptDocument != null) {
            return _asseptDocument!!
        }
        _asseptDocument = Builder(name = "AsseptDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(16.611f, 13.536f)
                lineTo(15.2f, 12.122f)
                lineTo(11.61f, 15.707f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -1.413f, 0.0f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(-1.411f, 1.414f)
                lineToRelative(1.585f, 1.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                close()
            }
        }
        .build()
        return _asseptDocument!!
    }

private var _asseptDocument: ImageVector? = null
