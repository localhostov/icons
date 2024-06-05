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

public val Icons.Bold.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.392f)
                verticalLineToRelative(19.608f)
                horizontalLineToRelative(-9.172f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(3.172f)
                lineTo(21.0f, 6.608f)
                lineToRelative(-2.612f, -0.804f)
                lineToRelative(-3.388f, 3.696f)
                lineToRelative(-3.0f, -3.5f)
                lineToRelative(2.493f, -3.0f)
                horizontalLineToRelative(-4.999f)
                lineToRelative(2.506f, 3.0f)
                lineToRelative(-3.0f, 3.5f)
                lineToRelative(-3.388f, -3.696f)
                lineToRelative(-2.612f, 0.804f)
                verticalLineToRelative(14.392f)
                horizontalLineToRelative(3.172f)
                lineToRelative(3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 4.392f)
                lineToRelative(3.766f, -1.159f)
                lineTo(6.988f, 0.0f)
                lineToRelative(0.012f, 0.015f)
                verticalLineToRelative(-0.015f)
                horizontalLineToRelative(9.986f)
                lineToRelative(0.006f, -0.008f)
                lineToRelative(3.241f, 3.241f)
                lineToRelative(3.767f, 1.159f)
                close()
                moveTo(13.5f, 10.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, 10.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-2.0f, -10.5f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
