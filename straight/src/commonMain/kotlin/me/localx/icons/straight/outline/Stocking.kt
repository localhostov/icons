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

public val Icons.Outline.Stocking: ImageVector
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
                lineTo(7.0f, 0.0f)
                reflectiveCurveToRelative(0.0f, 1.999f, 0.0f, 1.999f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.291f)
                lineToRelative(-4.253f, 1.492f)
                curveTo(1.188f, 11.895f, -0.802f, 15.694f, 0.31f, 19.254f)
                curveToRelative(0.887f, 2.839f, 3.479f, 4.746f, 6.451f, 4.746f)
                curveToRelative(0.685f, 0.0f, 1.364f, -0.104f, 2.041f, -0.317f)
                lineToRelative(8.441f, -2.856f)
                curveToRelative(2.846f, -0.962f, 4.757f, -3.626f, 4.757f, -6.63f)
                lineTo(22.0f, 2.001f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveTo(24.0f, 0.0f, 24.0f, 0.0f)
                close()
                moveTo(20.0f, 14.195f)
                curveToRelative(0.0f, 2.146f, -1.365f, 4.049f, -3.397f, 4.736f)
                lineToRelative(-8.42f, 2.85f)
                curveToRelative(-0.462f, 0.145f, -0.94f, 0.218f, -1.422f, 0.218f)
                curveToRelative(-2.092f, 0.0f, -3.918f, -1.343f, -4.543f, -3.342f)
                curveToRelative(-0.782f, -2.507f, 0.619f, -5.183f, 3.158f, -5.976f)
                lineToRelative(5.624f, -1.973f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(12.196f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
