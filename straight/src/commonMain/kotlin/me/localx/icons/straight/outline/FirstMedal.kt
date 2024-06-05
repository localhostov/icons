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

public val Icons.Outline.FirstMedal: ImageVector
    get() {
        if (_firstMedal != null) {
            return _firstMedal!!
        }
        _firstMedal = Builder(name = "FirstMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.614f)
                lineToRelative(-0.78f, 0.809f)
                lineToRelative(-1.439f, -1.389f)
                lineToRelative(2.708f, -2.806f)
                horizontalLineToRelative(1.512f)
                close()
                moveTo(19.217f, 9.628f)
                curveToRelative(1.12f, 1.5f, 1.783f, 3.36f, 1.783f, 5.372f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                curveToRelative(0.0f, -2.011f, 0.663f, -3.87f, 1.782f, -5.37f)
                lineTo(0.031f, 0.0f)
                horizontalLineToRelative(9.102f)
                lineToRelative(2.874f, 5.826f)
                lineTo(14.89f, 0.0f)
                horizontalLineToRelative(9.09f)
                lineToRelative(-4.764f, 9.628f)
                close()
                moveTo(14.038f, 6.232f)
                curveToRelative(1.387f, 0.322f, 2.653f, 0.967f, 3.713f, 1.849f)
                lineToRelative(3.009f, -6.082f)
                horizontalLineToRelative(-4.627f)
                lineToRelative(-2.095f, 4.233f)
                close()
                moveTo(3.248f, 2.0f)
                lineToRelative(3.001f, 6.083f)
                curveToRelative(1.064f, -0.886f, 2.334f, -1.532f, 3.727f, -1.853f)
                lineToRelative(-2.086f, -4.23f)
                lineTo(3.248f, 2.0f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(0.0f, -3.859f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _firstMedal!!
    }

private var _firstMedal: ImageVector? = null
