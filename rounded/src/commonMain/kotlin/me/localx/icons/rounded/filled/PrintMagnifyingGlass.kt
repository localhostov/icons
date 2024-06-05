package me.localx.icons.rounded.filled

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
                moveTo(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(2.54f, 2.54f)
                close()
                moveTo(19.0f, 4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, -0.7f, 0.1f, -1.37f, 0.29f, -2.0f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.11f, 0.0f, 0.22f, -0.02f, 0.33f, -0.03f)
                curveToRelative(-3.55f, -0.34f, -6.33f, -3.33f, -6.33f, -6.97f)
                close()
                moveTo(19.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                curveTo(2.24f, 7.0f, 0.0f, 9.24f, 0.0f, 12.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.05f, 1.24f, 3.8f, 3.0f, 4.58f)
                verticalLineToRelative(-2.58f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(3.26f)
                curveToRelative(1.27f, -1.81f, 3.36f, -3.0f, 5.74f, -3.0f)
                curveToRelative(3.66f, 0.0f, 6.67f, 2.82f, 6.97f, 6.4f)
                curveToRelative(0.01f, -0.13f, 0.03f, -0.27f, 0.03f, -0.4f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _printMagnifyingGlass!!
    }

private var _printMagnifyingGlass: ImageVector? = null
