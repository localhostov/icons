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

public val Icons.Filled.Audit: ImageVector
    get() {
        if (_audit != null) {
            return _audit!!
        }
        _audit = Builder(name = "Audit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 7.0f)
                lineTo(12.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(8.584f, 19.0f)
                horizontalLineToRelative(-3.584f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.07f)
                curveToRelative(-0.041f, -0.328f, -0.07f, -0.66f, -0.07f, -1.0f)
                reflectiveCurveToRelative(0.022f, -0.672f, 0.063f, -1.0f)
                horizontalLineToRelative(-3.063f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.593f)
                curveToRelative(0.296f, -0.728f, 0.699f, -1.398f, 1.185f, -2.0f)
                horizontalLineToRelative(-4.778f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.774f)
                curveToRelative(-0.479f, -0.531f, -0.774f, -1.23f, -0.774f, -2.0f)
                lineTo(10.0f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                horizontalLineToRelative(-4.515f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.114f, 0.0f, 0.221f, -0.026f, 0.333f, -0.034f)
                curveToRelative(-3.066f, -0.254f, -5.641f, -2.234f, -6.749f, -4.966f)
                close()
                moveTo(20.911f, 19.497f)
                curveToRelative(0.939f, -1.319f, 1.365f, -3.028f, 0.96f, -4.843f)
                curveToRelative(-0.494f, -2.211f, -2.277f, -3.996f, -4.49f, -4.481f)
                curveToRelative(-4.365f, -0.956f, -8.163f, 2.843f, -7.208f, 7.208f)
                curveToRelative(0.485f, 2.213f, 2.27f, 3.996f, 4.481f, 4.49f)
                curveToRelative(1.816f, 0.406f, 3.525f, -0.021f, 4.843f, -0.96f)
                lineToRelative(2.796f, 2.796f)
                curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-2.796f, -2.796f)
                close()
                moveTo(16.776f, 18.464f)
                lineToRelative(-0.004f, 0.004f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-1.515f, -1.575f)
                curveToRelative(-0.372f, -0.387f, -0.372f, -0.999f, 0.0f, -1.386f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.393f, -0.409f, 1.047f, -0.409f, 1.44f, 0.0f)
                lineToRelative(1.495f, 1.553f)
                lineToRelative(2.9f, -2.971f)
                curveToRelative(0.392f, -0.402f, 1.038f, -0.402f, 1.43f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.38f, 0.388f, 0.38f, 1.009f, 0.0f, 1.397f)
                lineToRelative(-2.925f, 2.997f)
                close()
            }
        }
        .build()
        return _audit!!
    }

private var _audit: ImageVector? = null
