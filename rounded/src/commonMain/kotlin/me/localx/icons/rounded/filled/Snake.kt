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

public val Icons.Filled.Snake: ImageVector
    get() {
        if (_snake != null) {
            return _snake!!
        }
        _snake = Builder(name = "Snake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(23.269f, 6.33f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-1.755f, 1.755f, -4.609f, 1.755f, -6.364f, 0.0f)
                lineToRelative(-1.238f, -1.238f)
                curveToRelative(-0.599f, 0.067f, -1.253f, 0.276f, -1.253f, 0.984f)
                curveToRelative(0.0f, 1.011f, 0.5f, 3.011f, 2.362f, 5.259f)
                curveToRelative(1.192f, 1.439f, 3.016f, 3.324f, 4.638f, 4.252f)
                lineToRelative(-7.493f, -0.008f)
                curveToRelative(-2.11f, -2.061f, -4.507f, -6.151f, -4.507f, -9.503f)
                curveToRelative(0.0f, -2.195f, 0.983f, -3.545f, 1.808f, -4.291f)
                curveToRelative(1.42f, -1.286f, 3.548f, -1.631f, 4.573f, -1.71f)
                curveToRelative(0.725f, -0.046f, 1.028f, -0.489f, 1.028f, -0.489f)
                curveTo(16.205f, 0.308f, 17.196f, -0.015f, 18.184f, 0.023f)
                curveToRelative(1.316f, -0.096f, 2.683f, 0.369f, 3.671f, 1.357f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.975f, 0.975f, 0.975f, 2.56f, 0.0f, 3.536f)
                close()
                moveTo(20.5f, 4.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(2.434f, 15.619f)
                lineToRelative(1.199f, 1.381f)
                horizontalLineToRelative(6.398f)
                lineToRelative(-3.753f, -4.579f)
                curveToRelative(-0.507f, -0.609f, -2.052f, -1.088f, -3.277f, -1.386f)
                curveToRelative(-0.824f, -0.2f, -1.596f, 0.487f, -1.49f, 1.328f)
                curveToRelative(0.149f, 1.183f, 0.428f, 2.66f, 0.924f, 3.256f)
                close()
            }
        }
        .build()
        return _snake!!
    }

private var _snake: ImageVector? = null
