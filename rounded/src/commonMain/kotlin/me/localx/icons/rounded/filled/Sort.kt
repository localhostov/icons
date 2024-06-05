package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.873f, 11.021f)
                horizontalLineTo(5.127f)
                arcToRelative(2.126f, 2.126f, 0.0f, false, true, -1.568f, -3.56f)
                lineTo(10.046f, 0.872f)
                arcToRelative(2.669f, 2.669f, 0.0f, false, true, 3.939f, 0.034f)
                lineToRelative(6.431f, 6.528f)
                arcToRelative(2.126f, 2.126f, 0.0f, false, true, -1.543f, 3.587f)
                close()
                moveTo(12.0f, 24.011f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -1.985f, -0.887f)
                lineTo(3.584f, 16.6f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, true, 1.543f, -3.586f)
                horizontalLineTo(18.873f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, true, 1.568f, 3.558f)
                lineToRelative(-6.487f, 6.589f)
                arcTo(2.641f, 2.641f, 0.0f, false, true, 12.0f, 24.011f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
