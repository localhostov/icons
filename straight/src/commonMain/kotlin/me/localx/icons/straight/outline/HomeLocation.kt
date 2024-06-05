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

public val Icons.Outline.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.384f, -0.788f)
                lineToRelative(9.0f, -7.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.384f, 0.788f)
                close()
                moveTo(12.0f, 8.006f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.472f, 16.55f)
                lineTo(12.0f, 20.0f)
                lineToRelative(3.536f, -3.458f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 8.006f)
                close()
                moveTo(14.129f, 15.12f)
                lineTo(12.0f, 17.2f)
                lineTo(9.878f, 15.128f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 4.251f, -0.008f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
