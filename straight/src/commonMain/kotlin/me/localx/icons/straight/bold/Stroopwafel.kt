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

public val Icons.Bold.Stroopwafel: ImageVector
    get() {
        if (_stroopwafel != null) {
            return _stroopwafel!!
        }
        _stroopwafel = Builder(name = "Stroopwafel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(17.583f, 7.796f)
                lineToRelative(-2.083f, 2.083f)
                lineToRelative(-1.379f, -1.379f)
                lineToRelative(2.083f, -2.083f)
                curveToRelative(-0.853f, -0.644f, -1.854f, -1.098f, -2.945f, -1.297f)
                lineToRelative(-1.259f, 1.259f)
                lineToRelative(-1.259f, -1.259f)
                curveToRelative(-1.091f, 0.199f, -2.092f, 0.654f, -2.945f, 1.297f)
                lineToRelative(2.083f, 2.083f)
                lineToRelative(-1.379f, 1.379f)
                lineToRelative(-2.083f, -2.083f)
                curveToRelative(-0.644f, 0.853f, -1.098f, 1.854f, -1.297f, 2.945f)
                lineToRelative(1.259f, 1.259f)
                lineToRelative(-1.259f, 1.259f)
                curveToRelative(0.199f, 1.091f, 0.653f, 2.092f, 1.297f, 2.945f)
                lineToRelative(2.083f, -2.083f)
                lineToRelative(1.379f, 1.379f)
                lineToRelative(-2.083f, 2.083f)
                curveToRelative(0.853f, 0.644f, 1.854f, 1.098f, 2.945f, 1.297f)
                lineToRelative(1.259f, -1.259f)
                lineToRelative(1.259f, 1.259f)
                curveToRelative(1.091f, -0.199f, 2.092f, -0.653f, 2.945f, -1.297f)
                lineToRelative(-2.083f, -2.083f)
                lineToRelative(1.379f, -1.379f)
                lineToRelative(2.083f, 2.083f)
                curveToRelative(0.644f, -0.853f, 1.098f, -1.854f, 1.297f, -2.945f)
                lineToRelative(-1.259f, -1.259f)
                lineToRelative(1.259f, -1.259f)
                curveToRelative(-0.199f, -1.091f, -0.653f, -2.092f, -1.297f, -2.945f)
                close()
                moveTo(12.0f, 13.379f)
                lineToRelative(-1.379f, -1.379f)
                lineToRelative(1.379f, -1.379f)
                lineToRelative(1.379f, 1.379f)
                lineToRelative(-1.379f, 1.379f)
                close()
            }
        }
        .build()
        return _stroopwafel!!
    }

private var _stroopwafel: ImageVector? = null
