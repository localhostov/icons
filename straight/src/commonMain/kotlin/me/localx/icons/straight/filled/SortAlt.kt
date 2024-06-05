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

public val Icons.Filled.SortAlt: ImageVector
    get() {
        if (_sortAlt != null) {
            return _sortAlt!!
        }
        _sortAlt = Builder(name = "SortAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.597f, 5.597f)
                lineToRelative(-2.597f, -2.597f)
                lineTo(18.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 3.0f)
                lineToRelative(-2.569f, 2.569f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(15.586f, 0.586f)
                curveToRelative(0.779f, -0.779f, 2.049f, -0.779f, 2.828f, 0.0f)
                lineToRelative(3.597f, 3.597f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 21.0f)
                lineToRelative(-2.593f, -2.593f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.593f, 3.593f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(3.574f, -3.573f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.574f, 2.573f)
                close()
            }
        }
        .build()
        return _sortAlt!!
    }

private var _sortAlt: ImageVector? = null
