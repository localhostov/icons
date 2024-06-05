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

public val Icons.Filled.PrintMagnifyingGlass: ImageVector
    get() {
        if (_printMagnifyingGlass != null) {
            return _printMagnifyingGlass!!
        }
        _printMagnifyingGlass = Builder(name = "PrintMagnifyingGlass", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(24.0f, 22.59f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(0.44f, -0.69f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.69f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                lineTo(12.82f, 13.0f)
                curveToRelative(1.18f, -1.23f, 2.84f, -2.0f, 4.68f, -2.0f)
                curveToRelative(3.59f, 0.0f, 6.5f, 2.91f, 6.5f, 6.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -0.89f, 0.18f, -1.73f, 0.5f, -2.5f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(-3.59f, 0.0f, -6.5f, -2.91f, -6.5f, -6.5f)
                close()
            }
        }
        .build()
        return _printMagnifyingGlass!!
    }

private var _printMagnifyingGlass: ImageVector? = null
