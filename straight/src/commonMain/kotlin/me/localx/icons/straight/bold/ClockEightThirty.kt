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

public val Icons.Bold.ClockEightThirty: ImageVector
    get() {
        if (_clockEightThirty != null) {
            return _clockEightThirty!!
        }
        _clockEightThirty = Builder(name = "ClockEightThirty", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(14.0f, 8.897f)
                lineToRelative(-6.265f, 3.631f)
                lineToRelative(1.505f, 2.596f)
                lineToRelative(1.76f, -1.021f)
                verticalLineToRelative(3.897f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 8.897f)
                close()
            }
        }
        .build()
        return _clockEightThirty!!
    }

private var _clockEightThirty: ImageVector? = null
