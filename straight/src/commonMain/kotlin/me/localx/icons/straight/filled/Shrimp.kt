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

public val Icons.Filled.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.006f, 15.7f)
                curveToRelative(-3.621f, -0.15f, -5.917f, -1.4f, -6.934f, -2.557f)
                arcToRelative(12.175f, 12.175f, 0.0f, false, true, -0.057f, -1.367f)
                arcToRelative(11.543f, 11.543f, 0.0f, false, true, 1.5f, -5.461f)
                arcToRelative(11.281f, 11.281f, 0.0f, false, false, 5.9f, 7.007f)
                arcTo(4.706f, 4.706f, 0.0f, false, false, 11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                arcTo(6.691f, 6.691f, 0.0f, false, true, 7.006f, 15.7f)
                close()
                moveTo(24.013f, 0.02f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.084f, 0.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -7.008f, 6.924f)
                arcTo(4.487f, 4.487f, 0.0f, false, true, 15.435f, 0.0f)
                close()
                moveTo(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 4.0f)
                close()
                moveTo(8.168f, 11.442f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 12.0f, 13.0f)
                lineTo(12.0f, 11.0f)
                arcToRelative(2.871f, 2.871f, 0.0f, false, true, -2.2f, -0.718f)
                arcToRelative(6.826f, 6.826f, 0.0f, false, true, 1.512f, -0.818f)
                arcToRelative(6.479f, 6.479f, 0.0f, false, true, -0.6f, -9.345f)
                arcToRelative(12.518f, 12.518f, 0.0f, false, false, -7.622f, 4.0f)
                arcTo(9.332f, 9.332f, 0.0f, false, false, 8.168f, 11.442f)
                close()
                moveTo(22.368f, 16.583f)
                lineTo(13.5f, 22.0f)
                arcToRelative(6.489f, 6.489f, 0.0f, false, true, -6.1f, -4.272f)
                arcTo(14.307f, 14.307f, 0.0f, false, true, 0.769f, 16.186f)
                arcTo(11.976f, 11.976f, 0.0f, false, false, 12.0f, 24.0f)
                horizontalLineToRelative(8.991f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, false, -1.114f, -3.467f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
