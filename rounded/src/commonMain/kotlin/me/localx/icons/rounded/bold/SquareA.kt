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

public val Icons.Bold.SquareA: ImageVector
    get() {
        if (_squareA != null) {
            return _squareA!!
        }
        _squareA = Builder(name = "SquareA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(15.583f, 7.613f)
                curveToRelative(-0.545f, -1.537f, -1.952f, -2.53f, -3.583f, -2.53f)
                reflectiveCurveToRelative(-3.038f, 0.993f, -3.583f, 2.531f)
                lineToRelative(-3.33f, 9.385f)
                curveToRelative(-0.277f, 0.781f, 0.131f, 1.638f, 0.912f, 1.915f)
                curveToRelative(0.778f, 0.278f, 1.638f, -0.131f, 1.915f, -0.912f)
                lineToRelative(0.71f, -2.001f)
                horizontalLineToRelative(6.753f)
                lineToRelative(0.71f, 2.001f)
                curveToRelative(0.218f, 0.615f, 0.796f, 0.999f, 1.414f, 0.999f)
                curveToRelative(0.167f, 0.0f, 0.336f, -0.028f, 0.501f, -0.087f)
                curveToRelative(0.781f, -0.277f, 1.189f, -1.134f, 0.912f, -1.915f)
                lineToRelative(-3.33f, -9.386f)
                close()
                moveTo(9.688f, 13.0f)
                lineToRelative(1.555f, -4.383f)
                curveToRelative(0.171f, -0.482f, 0.586f, -0.534f, 0.756f, -0.534f)
                reflectiveCurveToRelative(0.585f, 0.052f, 0.756f, 0.534f)
                lineToRelative(1.555f, 4.384f)
                horizontalLineToRelative(-4.624f)
                close()
            }
        }
        .build()
        return _squareA!!
    }

private var _squareA: ImageVector? = null
