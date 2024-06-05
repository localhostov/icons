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

public val Icons.Filled.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.294f)
                lineToRelative(3.0f, 0.571f)
                lineTo(9.0f, 17.219f)
                lineToRelative(-3.0f, 0.572f)
                close()
                moveTo(14.0f, 5.818f)
                lineTo(11.0f, 5.246f)
                lineTo(11.0f, 16.838f)
                lineToRelative(3.0f, -0.571f)
                close()
                moveTo(19.0f, 6.77f)
                lineTo(16.0f, 6.2f)
                verticalLineToRelative(9.687f)
                lineToRelative(3.0f, -0.572f)
                close()
                moveTo(4.0f, 3.913f)
                lineToRelative(-1.0f, -0.19f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 3.723f)
                lineTo(1.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 18.362f)
                lineToRelative(1.0f, -0.19f)
                close()
                moveTo(21.0f, 7.151f)
                verticalLineToRelative(7.783f)
                lineToRelative(3.0f, -0.572f)
                lineTo(24.0f, 7.722f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
