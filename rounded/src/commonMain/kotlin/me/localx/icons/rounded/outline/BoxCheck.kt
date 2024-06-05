package me.localx.icons.rounded.outline

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

public val Icons.Outline.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.886f, 0.387f, 1.684f, 1.0f, 2.234f)
                verticalLineToRelative(10.766f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(23.0f, 8.234f)
                curveToRelative(0.613f, -0.55f, 1.0f, -1.347f, 1.0f, -2.234f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(3.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(6.295f, 15.71f)
                curveToRelative(-0.392f, -0.39f, -0.394f, -1.022f, -0.005f, -1.414f)
                curveToRelative(0.39f, -0.393f, 1.021f, -0.395f, 1.415f, -0.006f)
                lineToRelative(2.432f, 2.414f)
                curveToRelative(0.383f, 0.385f, 1.039f, 0.382f, 1.416f, 0.003f)
                lineToRelative(4.766f, -4.438f)
                curveToRelative(0.403f, -0.376f, 1.038f, -0.354f, 1.413f, 0.05f)
                curveToRelative(0.377f, 0.404f, 0.354f, 1.037f, -0.05f, 1.413f)
                lineToRelative(-4.74f, 4.414f)
                curveToRelative(-0.541f, 0.542f, -1.294f, 0.854f, -2.096f, 0.854f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                lineToRelative(-2.429f, -2.411f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
