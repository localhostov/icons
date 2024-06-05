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

public val Icons.Filled.Banner3: ImageVector
    get() {
        if (_banner3 != null) {
            return _banner3!!
        }
        _banner3 = Builder(name = "Banner3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.478f, 20.609f)
                lineToRelative(4.522f, 3.391f)
                lineToRelative(-8.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(1.689f, -2.533f)
                lineToRelative(5.957f, 3.475f)
                lineToRelative(-4.167f, 1.667f)
                close()
                moveTo(1.075f, 1.234f)
                lineTo(0.019f, 9.876f)
                lineToRelative(23.981f, 1.124f)
                lineTo(24.0f, 0.023f)
                lineTo(1.075f, 1.234f)
                close()
                moveTo(12.0f, 18.0f)
                verticalLineToRelative(-5.56f)
                lineToRelative(-10.365f, -0.486f)
                lineToRelative(10.365f, 6.046f)
                close()
            }
        }
        .build()
        return _banner3!!
    }

private var _banner3: ImageVector? = null
