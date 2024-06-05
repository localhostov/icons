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

public val Icons.Bold.SortCircle: ImageVector
    get() {
        if (_sortCircle != null) {
            return _sortCircle!!
        }
        _sortCircle = Builder(name = "SortCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.894f, 13.946f)
                curveToRelative(0.228f, 0.571f, 0.083f, 1.223f, -0.364f, 1.645f)
                lineToRelative(-2.928f, 2.763f)
                curveToRelative(-0.405f, 0.406f, -0.985f, 0.646f, -1.602f, 0.646f)
                reflectiveCurveToRelative(-1.197f, -0.24f, -1.633f, -0.677f)
                lineToRelative(-2.896f, -2.732f)
                curveToRelative(-0.447f, -0.422f, -0.592f, -1.073f, -0.365f, -1.645f)
                reflectiveCurveToRelative(0.779f, -0.946f, 1.394f, -0.946f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.614f, 0.0f, 1.167f, 0.375f, 1.394f, 0.946f)
                close()
                moveTo(16.53f, 8.409f)
                curveToRelative(0.447f, 0.422f, 0.592f, 1.073f, 0.364f, 1.645f)
                curveToRelative(-0.227f, 0.571f, -0.779f, 0.946f, -1.394f, 0.946f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.615f, 0.0f, -1.167f, -0.375f, -1.394f, -0.946f)
                reflectiveCurveToRelative(-0.083f, -1.223f, 0.365f, -1.645f)
                lineToRelative(2.928f, -2.763f)
                curveToRelative(0.81f, -0.812f, 2.361f, -0.843f, 3.234f, 0.03f)
                lineToRelative(2.896f, 2.732f)
                close()
            }
        }
        .build()
        return _sortCircle!!
    }

private var _sortCircle: ImageVector? = null
