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

public val Icons.Outline.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.18f)
                lineTo(4.843f, 5.349f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 2.0f, 5.816f)
                lineTo(2.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                lineTo(4.0f, 19.82f)
                lineToRelative(20.0f, -4.0f)
                close()
                moveTo(12.0f, 8.82f)
                lineToRelative(2.0f, 0.4f)
                verticalLineToRelative(6.56f)
                lineToRelative(-2.0f, 0.4f)
                close()
                moveTo(10.0f, 16.58f)
                lineTo(8.0f, 16.98f)
                lineTo(8.0f, 8.02f)
                lineToRelative(2.0f, 0.4f)
                close()
                moveTo(16.0f, 9.62f)
                lineTo(18.0f, 10.02f)
                verticalLineToRelative(4.96f)
                lineToRelative(-2.0f, 0.4f)
                close()
                moveTo(3.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                close()
                moveTo(4.0f, 7.22f)
                lineToRelative(2.0f, 0.4f)
                verticalLineToRelative(9.76f)
                lineToRelative(-2.0f, 0.4f)
                close()
                moveTo(22.0f, 14.18f)
                lineTo(20.0f, 14.58f)
                lineTo(20.0f, 10.42f)
                lineToRelative(2.0f, 0.4f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
