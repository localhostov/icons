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

public val Icons.Filled.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.829f, 6.829f)
                lineTo(12.0f, 17.6f)
                lineToRelative(2.836f, -2.774f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.992f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 12.992f)
                close()
                moveTo(22.849f, 7.68f)
                lineToRelative(-9.0f, -7.043f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.7f, 0.0f)
                lineToRelative(-9.0f, 7.043f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 0.0f, 10.043f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.043f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 22.849f, 7.68f)
                close()
                moveTo(16.243f, 16.243f)
                lineTo(12.0f, 20.393f)
                lineTo(7.765f, 16.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.478f, -8.493f)
                horizontalLineToRelative(0.0f)
                arcTo(6.008f, 6.008f, 0.0f, false, true, 16.243f, 16.243f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
