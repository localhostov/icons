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

public val Icons.Filled.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(1.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(20.915f, 11.106f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                curveToRelative(-0.009f, 2.337f, -3.281f, 2.648f, -4.057f, 0.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.886f, 0.666f)
                curveTo(17.615f, 20.415f, 23.952f, 19.579f, 24.0f, 15.0f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 20.915f, 11.106f)
                close()
                moveTo(11.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(11.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                curveToRelative(-0.009f, 2.337f, -3.281f, 2.648f, -4.057f, 0.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.886f, 0.666f)
                curveTo(8.615f, 25.415f, 14.952f, 24.579f, 15.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 16.0f)
                close()
                moveTo(1.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                curveTo(10.952f, -0.581f, 4.613f, -1.414f, 3.057f, 2.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.886f, 0.666f)
                curveTo(5.72f, 1.351f, 8.991f, 1.663f, 9.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 6.0f)
                lineTo(1.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 8.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
