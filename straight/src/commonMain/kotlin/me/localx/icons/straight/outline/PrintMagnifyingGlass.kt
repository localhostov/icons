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

public val Icons.Outline.PrintMagnifyingGlass: ImageVector
    get() {
        if (_printMagnifyingGlass != null) {
            return _printMagnifyingGlass!!
        }
        _printMagnifyingGlass = Builder(name = "PrintMagnifyingGlass", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.02f, 0.0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                close()
                moveTo(16.0f, 19.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(13.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.7f, 0.1f, -1.37f, 0.29f, -2.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 2.0f)
                close()
            }
        }
        .build()
        return _printMagnifyingGlass!!
    }

private var _printMagnifyingGlass: ImageVector? = null
