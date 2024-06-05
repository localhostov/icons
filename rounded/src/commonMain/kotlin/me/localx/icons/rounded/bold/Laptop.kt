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

public val Icons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                lineTo(22.0f, 8.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 16.5f, 3.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 2.0f, 8.5f)
                lineTo(2.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.154f)
                arcTo(1.847f, 1.847f, 0.0f, false, false, 1.846f, 20.0f)
                lineTo(22.154f, 20.0f)
                arcTo(1.847f, 1.847f, 0.0f, false, false, 24.0f, 18.154f)
                lineTo(24.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 15.0f)
                close()
                moveTo(14.769f, 16.0f)
                lineTo(9.231f, 16.0f)
                lineToRelative(-0.923f, -1.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 6.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 8.5f)
                lineTo(19.0f, 15.0f)
                lineTo(15.692f, 15.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
