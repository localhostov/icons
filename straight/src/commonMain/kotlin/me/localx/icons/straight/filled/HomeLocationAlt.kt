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

public val Icons.Filled.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.007f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.536f, 8.536f)
                lineTo(12.0f, 21.2f)
                lineToRelative(3.543f, -3.669f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 9.007f)
                close()
                moveTo(12.0f, 15.994f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.994f)
                close()
                moveTo(22.849f, 7.681f)
                lineToRelative(-9.0f, -7.044f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.7f, 0.0f)
                lineToRelative(-9.0f, 7.042f)
                arcTo(2.988f, 2.988f, 0.0f, false, false, 0.0f, 10.044f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.044f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 22.849f, 7.681f)
                close()
                moveTo(16.949f, 18.957f)
                lineTo(12.105f, 23.9f)
                lineTo(7.058f, 18.965f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 9.892f, -0.008f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
