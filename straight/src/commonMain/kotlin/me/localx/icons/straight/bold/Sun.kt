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

public val Icons.Bold.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(19.854f)
                arcToRelative(7.941f, 7.941f, 0.0f, false, false, -1.24f, -2.993f)
                lineToRelative(2.932f, -2.932f)
                lineTo(19.425f, 2.454f)
                lineTo(16.493f, 5.386f)
                arcTo(7.934f, 7.934f, 0.0f, false, false, 13.5f, 4.146f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(4.146f)
                arcToRelative(7.934f, 7.934f, 0.0f, false, false, -2.993f, 1.24f)
                lineTo(4.575f, 2.454f)
                lineTo(2.454f, 4.575f)
                lineTo(5.386f, 7.507f)
                arcTo(7.941f, 7.941f, 0.0f, false, false, 4.146f, 10.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.146f)
                arcToRelative(7.941f, 7.941f, 0.0f, false, false, 1.24f, 2.993f)
                lineTo(2.454f, 19.425f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.932f, -2.932f)
                arcToRelative(7.934f, 7.934f, 0.0f, false, false, 2.993f, 1.24f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(19.854f)
                arcToRelative(7.934f, 7.934f, 0.0f, false, false, 2.993f, -1.24f)
                lineToRelative(2.932f, 2.932f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.932f, -2.932f)
                arcToRelative(7.941f, 7.941f, 0.0f, false, false, 1.24f, -2.993f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-6.608f, -0.21f, -6.606f, -9.791f, 0.0f, -10.0f)
                curveTo(18.608f, 7.21f, 18.606f, 16.791f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
