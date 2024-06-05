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

public val Icons.Bold.GripLinesVertical: ImageVector
    get() {
        if (_gripLinesVertical != null) {
            return _gripLinesVertical!!
        }
        _gripLinesVertical = Builder(name = "GripLinesVertical", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _gripLinesVertical!!
    }

private var _gripLinesVertical: ImageVector? = null
