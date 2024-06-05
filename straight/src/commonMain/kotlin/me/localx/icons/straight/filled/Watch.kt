package me.localx.icons.straight.filled

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

public val Icons.Filled.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(14.293f, 15.707f)
                lineToRelative(-3.293f, -3.293f)
                verticalLineToRelative(-5.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(2.707f, 2.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(6.0f, 2.785f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.785f)
                curveToRelative(-1.727f, -1.128f, -3.788f, -1.785f, -6.0f, -1.785f)
                reflectiveCurveToRelative(-4.273f, 0.657f, -6.0f, 1.785f)
                close()
                moveTo(18.0f, 21.215f)
                verticalLineToRelative(2.785f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.785f)
                curveToRelative(1.727f, 1.128f, 3.788f, 1.785f, 6.0f, 1.785f)
                reflectiveCurveToRelative(4.273f, -0.657f, 6.0f, -1.785f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
