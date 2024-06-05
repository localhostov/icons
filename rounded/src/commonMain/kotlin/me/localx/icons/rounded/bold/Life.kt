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

public val Icons.Bold.Life: ImageVector
    get() {
        if (_life != null) {
            return _life!!
        }
        _life = Builder(name = "Life", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 2.75f)
                curveToRelative(0.0f, -1.519f, 1.119f, -2.75f, 2.5f, -2.75f)
                reflectiveCurveToRelative(2.5f, 1.231f, 2.5f, 2.75f)
                curveToRelative(0.0f, -1.519f, 1.119f, -2.75f, 2.5f, -2.75f)
                reflectiveCurveToRelative(2.5f, 1.231f, 2.5f, 2.75f)
                curveToRelative(0.0f, 2.048f, -2.572f, 4.681f, -4.032f, 5.885f)
                curveToRelative(-0.59f, 0.486f, -1.432f, 0.486f, -2.022f, 0.0f)
                curveToRelative(-1.461f, -1.204f, -3.946f, -3.837f, -3.946f, -5.885f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22.603f, 11.482f)
                curveToRelative(-0.563f, -0.61f, -1.514f, -0.646f, -2.12f, -0.084f)
                lineToRelative(-6.069f, 5.602f)
                horizontalLineToRelative(-4.826f)
                lineToRelative(-6.069f, -5.602f)
                curveToRelative(-0.608f, -0.561f, -1.557f, -0.525f, -2.12f, 0.084f)
                curveToRelative(-0.562f, 0.609f, -0.523f, 1.558f, 0.085f, 2.12f)
                lineToRelative(6.5f, 6.0f)
                curveToRelative(0.005f, 0.005f, 0.012f, 0.006f, 0.018f, 0.011f)
                verticalLineToRelative(2.887f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.887f)
                curveToRelative(0.005f, -0.005f, 0.012f, -0.006f, 0.018f, -0.011f)
                lineToRelative(6.5f, -6.0f)
                curveToRelative(0.608f, -0.562f, 0.646f, -1.511f, 0.085f, -2.12f)
                close()
            }
        }
        .build()
        return _life!!
    }

private var _life: ImageVector? = null
