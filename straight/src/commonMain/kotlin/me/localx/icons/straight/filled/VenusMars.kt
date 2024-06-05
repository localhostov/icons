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

public val Icons.Filled.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.414f)
                lineToRelative(-2.4f, 2.4f)
                arcTo(7.028f, 7.028f, 0.0f, true, true, 18.184f, 4.4f)
                lineToRelative(2.4f, -2.4f)
                horizontalLineTo(18.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 2.0f)
                close()
                moveTo(8.0f, 16.683f)
                arcTo(8.961f, 8.961f, 0.0f, false, true, 8.214f, 3.117f)
                arcTo(7.014f, 7.014f, 0.0f, false, false, 7.0f, 3.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 6.0f, 16.92f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null
