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

public val Icons.Filled.Stocking: ImageVector
    get() {
        if (_stocking != null) {
            return _stocking!!
        }
        _stocking = Builder(name = "Stocking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                horizontalLineTo(7.0f)
                reflectiveCurveToRelative(0.0f, 1.999f, 0.0f, 1.999f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.291f)
                lineToRelative(-4.253f, 1.492f)
                curveTo(1.188f, 11.895f, -0.802f, 15.694f, 0.31f, 19.254f)
                curveToRelative(0.887f, 2.839f, 3.479f, 4.746f, 6.451f, 4.746f)
                curveToRelative(0.685f, 0.0f, 1.364f, -0.104f, 2.041f, -0.317f)
                lineToRelative(8.441f, -2.856f)
                curveToRelative(2.846f, -0.962f, 4.757f, -3.626f, 4.757f, -6.63f)
                verticalLineTo(2.001f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveTo(24.0f, 0.0f, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
