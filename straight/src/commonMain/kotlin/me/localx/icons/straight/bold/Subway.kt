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

public val Icons.Bold.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 2.0f, 4.5f)
                lineTo(2.0f, 20.0f)
                lineTo(5.7f, 20.0f)
                lineToRelative(-2.45f, 4.0f)
                lineTo(6.564f, 24.0f)
                lineToRelative(2.45f, -4.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.45f, 4.0f)
                horizontalLineToRelative(3.385f)
                lineTo(18.4f, 20.0f)
                lineTo(22.0f, 20.0f)
                close()
                moveTo(13.5f, 10.0f)
                lineTo(13.5f, 5.0f)
                lineTo(19.0f, 5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 10.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 13.5f)
                lineTo(10.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 13.5f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
