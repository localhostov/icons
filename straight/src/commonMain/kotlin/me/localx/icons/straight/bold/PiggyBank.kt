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

public val Icons.Bold.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                curveTo(7.0f, 1.794f, 8.794f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(24.0f, 17.0f)
                horizontalLineToRelative(-1.584f)
                curveToRelative(-0.672f, 1.656f, -1.884f, 3.038f, -3.416f, 3.926f)
                verticalLineToRelative(3.074f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.074f)
                curveToRelative(-2.389f, -1.385f, -4.0f, -3.971f, -4.0f, -6.926f)
                curveToRelative(0.0f, -1.301f, 0.313f, -2.531f, 0.866f, -3.618f)
                curveToRelative(-1.121f, -0.709f, -1.866f, -1.96f, -1.866f, -3.382f)
                curveTo(0.0f, 4.794f, 1.794f, 3.0f, 4.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.466f, 0.319f, 0.857f, 0.75f, 0.969f)
                curveToRelative(1.406f, -1.225f, 3.243f, -1.969f, 5.25f, -1.969f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.113f, 0.0f, 0.224f, 0.003f, 0.336f, 0.008f)
                curveToRelative(1.113f, -3.001f, 4.664f, -3.008f, 4.664f, -3.008f)
                lineTo(20.0f, 7.76f)
                curveToRelative(1.059f, 0.85f, 1.897f, 1.963f, 2.416f, 3.24f)
                horizontalLineToRelative(1.584f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(4.0f, 14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
