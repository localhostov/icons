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

public val Icons.Bold.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.567f, 4.4f)
                arcTo(5.308f, 5.308f, 0.0f, false, false, 16.33f, 0.0f)
                lineTo(7.657f, 0.0f)
                arcTo(5.308f, 5.308f, 0.0f, false, false, 2.419f, 4.4f)
                lineTo(0.081f, 17.765f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 5.319f, 24.0f)
                lineTo(18.681f, 24.0f)
                arcToRelative(5.319f, 5.319f, 0.0f, false, false, 5.238f, -6.239f)
                close()
                moveTo(20.456f, 20.172f)
                arcTo(2.313f, 2.313f, 0.0f, false, true, 18.681f, 21.0f)
                lineTo(5.319f, 21.0f)
                arcToRelative(2.317f, 2.317f, 0.0f, false, true, -2.283f, -2.718f)
                lineTo(5.374f, 4.918f)
                arcTo(2.314f, 2.314f, 0.0f, false, true, 7.657f, 3.0f)
                lineTo(16.33f, 3.0f)
                arcToRelative(2.312f, 2.312f, 0.0f, false, true, 2.282f, 1.917f)
                lineTo(20.964f, 18.28f)
                arcTo(2.312f, 2.312f, 0.0f, false, true, 20.456f, 20.172f)
                close()
                moveTo(13.5f, 5.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(13.5f, 11.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(13.5f, 17.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
