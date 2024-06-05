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

public val Icons.Filled.Template: ImageVector
    get() {
        if (_template != null) {
            return _template!!
        }
        _template = Builder(name = "Template", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(17.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.34f, 3.34f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 10.0f)
                close()
            }
        }
        .build()
        return _template!!
    }

private var _template: ImageVector? = null
