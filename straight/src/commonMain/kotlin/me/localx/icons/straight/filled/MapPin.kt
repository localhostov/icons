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

public val Icons.Filled.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.967f, 2.167f, 5.431f, 5.0f, 5.91f)
                verticalLineToRelative(12.09f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.91f)
                curveToRelative(2.833f, -0.478f, 5.0f, -2.942f, 5.0f, -5.91f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
