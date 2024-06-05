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

public val Icons.Bold.Stocking: ImageVector
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
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.354f)
                lineToRelative(-3.088f, 0.965f)
                curveTo(1.229f, 11.469f, -0.832f, 15.403f, 0.318f, 19.088f)
                curveToRelative(0.918f, 2.939f, 3.603f, 4.914f, 6.68f, 4.914f)
                curveToRelative(0.708f, 0.0f, 1.411f, -0.108f, 2.09f, -0.32f)
                lineToRelative(8.0f, -2.5f)
                curveToRelative(2.938f, -0.918f, 4.912f, -3.603f, 4.912f, -6.681f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(19.0f, 14.5f)
                curveToRelative(0.0f, 1.759f, -1.128f, 3.293f, -2.807f, 3.818f)
                lineToRelative(-8.001f, 2.5f)
                curveToRelative(-0.389f, 0.122f, -0.791f, 0.184f, -1.194f, 0.184f)
                curveToRelative(-1.758f, 0.0f, -3.291f, -1.128f, -3.816f, -2.808f)
                curveToRelative(-0.657f, -2.105f, 0.521f, -4.354f, 2.625f, -5.011f)
                lineToRelative(5.193f, -1.623f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(11.5f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
