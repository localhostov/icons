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

public val Icons.Bold.Cryptocurrency: ImageVector
    get() {
        if (_cryptocurrency != null) {
            return _cryptocurrency!!
        }
        _cryptocurrency = Builder(name = "Cryptocurrency", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(9.878f, 9.878f)
                curveToRelative(-1.169f, 1.17f, -1.169f, 3.073f, 0.0f, 4.243f)
                curveToRelative(1.17f, 1.17f, 3.073f, 1.17f, 4.243f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(-0.784f, 0.785f, -1.739f, 1.282f, -2.743f, 1.541f)
                verticalLineToRelative(1.217f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.217f)
                curveToRelative(-1.004f, -0.258f, -1.958f, -0.756f, -2.743f, -1.541f)
                curveToRelative(-1.133f, -1.133f, -1.757f, -2.64f, -1.757f, -4.243f)
                reflectiveCurveToRelative(0.624f, -3.109f, 1.757f, -4.243f)
                curveToRelative(0.784f, -0.785f, 1.739f, -1.282f, 2.743f, -1.541f)
                verticalLineToRelative(-1.217f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.217f)
                curveToRelative(1.004f, 0.258f, 1.958f, 0.756f, 2.743f, 1.541f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-1.17f, -1.17f, -3.073f, -1.17f, -4.243f, 0.0f)
                close()
            }
        }
        .build()
        return _cryptocurrency!!
    }

private var _cryptocurrency: ImageVector? = null
