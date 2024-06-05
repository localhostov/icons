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

public val Icons.Bold.FloppyDisks: ImageVector
    get() {
        if (_floppyDisks != null) {
            return _floppyDisks!!
        }
        _floppyDisks = Builder(name = "FloppyDisks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                verticalLineToRelative(15.949f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 6.606f)
                verticalLineToRelative(12.394f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.895f)
                curveToRelative(0.935f, 0.0f, 1.813f, 0.364f, 2.475f, 1.025f)
                lineToRelative(3.105f, 3.106f)
                curveToRelative(0.661f, 0.661f, 1.025f, 1.54f, 1.025f, 2.475f)
                close()
                moveTo(21.0f, 6.606f)
                curveToRelative(0.0f, -0.131f, -0.054f, -0.26f, -0.146f, -0.354f)
                lineToRelative(-2.854f, -2.854f)
                verticalLineToRelative(2.602f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(13.0f)
                lineTo(21.0f, 6.606f)
                close()
            }
        }
        .build()
        return _floppyDisks!!
    }

private var _floppyDisks: ImageVector? = null
