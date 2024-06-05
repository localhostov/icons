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

public val Icons.Bold.PaintbrushPencil: ImageVector
    get() {
        if (_paintbrushPencil != null) {
            return _paintbrushPencil!!
        }
        _paintbrushPencil = Builder(name = "PaintbrushPencil", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.834f, 6.801f)
                curveToRelative(1.552f, -1.555f, 1.552f, -4.081f, 0.0f, -5.634f)
                curveToRelative(-1.553f, -1.552f, -4.079f, -1.554f, -5.634f, 0.0f)
                lineTo(6.327f, 12.04f)
                curveToRelative(-1.444f, 0.024f, -2.797f, 0.598f, -3.82f, 1.621f)
                curveTo(0.673f, 15.494f, 0.193f, 20.748f, 0.09f, 22.314f)
                lineToRelative(-0.112f, 1.708f)
                lineToRelative(1.708f, -0.112f)
                curveToRelative(1.566f, -0.104f, 6.82f, -0.583f, 8.653f, -2.417f)
                curveToRelative(1.023f, -1.023f, 1.597f, -2.377f, 1.621f, -3.82f)
                lineToRelative(10.874f, -10.872f)
                close()
                moveTo(19.32f, 3.289f)
                curveToRelative(0.383f, -0.385f, 1.009f, -0.384f, 1.392f, 0.0f)
                curveToRelative(0.383f, 0.384f, 0.383f, 1.008f, 0.0f, 1.392f)
                lineToRelative(-9.739f, 9.738f)
                curveToRelative(-0.187f, -0.268f, -0.398f, -0.521f, -0.634f, -0.757f)
                reflectiveCurveToRelative(-0.489f, -0.447f, -0.757f, -0.634f)
                lineTo(19.32f, 3.289f)
                close()
                moveTo(8.217f, 19.372f)
                curveToRelative(-0.553f, 0.553f, -2.743f, 1.082f, -4.958f, 1.368f)
                curveToRelative(0.286f, -2.215f, 0.815f, -4.405f, 1.368f, -4.958f)
                curveToRelative(0.495f, -0.495f, 1.145f, -0.742f, 1.795f, -0.742f)
                reflectiveCurveToRelative(1.3f, 0.247f, 1.795f, 0.742f)
                curveToRelative(0.989f, 0.99f, 0.989f, 2.6f, 0.0f, 3.59f)
                close()
                moveTo(1.186f, 6.91f)
                curveTo(-0.393f, 5.332f, -0.393f, 2.764f, 1.186f, 1.186f)
                reflectiveCurveTo(5.332f, -0.393f, 6.91f, 1.186f)
                lineToRelative(3.754f, 3.754f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.754f, -3.754f)
                curveToRelative(-0.408f, -0.408f, -1.074f, -0.408f, -1.482f, 0.0f)
                curveToRelative(-0.408f, 0.409f, -0.408f, 1.073f, 0.0f, 1.482f)
                lineToRelative(3.754f, 3.754f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.754f, -3.754f)
                close()
                moveTo(24.0f, 18.275f)
                verticalLineToRelative(5.725f)
                horizontalLineToRelative(-5.725f)
                lineToRelative(-4.946f, -4.946f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(4.067f, 4.067f)
                horizontalLineToRelative(1.482f)
                verticalLineToRelative(-1.482f)
                lineToRelative(-4.068f, -4.067f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(4.947f, 4.946f)
                close()
            }
        }
        .build()
        return _paintbrushPencil!!
    }

private var _paintbrushPencil: ImageVector? = null
