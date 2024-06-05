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

public val Icons.Bold.Mace: ImageVector
    get() {
        if (_mace != null) {
            return _mace!!
        }
        _mace = Builder(name = "Mace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(21.874f, 9.776f)
                curveToRelative(-0.092f, 0.463f, -0.234f, 0.907f, -0.419f, 1.329f)
                lineToRelative(2.545f, 4.895f)
                lineToRelative(-4.531f, -2.356f)
                curveToRelative(-0.778f, 0.601f, -1.694f, 1.031f, -2.693f, 1.23f)
                lineToRelative(-1.276f, 2.126f)
                lineToRelative(-1.276f, -2.126f)
                curveToRelative(-0.769f, -0.154f, -1.489f, -0.443f, -2.134f, -0.843f)
                lineTo(2.147f, 23.974f)
                lineTo(0.026f, 21.853f)
                lineToRelative(9.942f, -9.943f)
                curveToRelative(-0.399f, -0.646f, -0.689f, -1.366f, -0.843f, -2.135f)
                lineToRelative(-2.126f, -1.276f)
                lineToRelative(2.126f, -1.276f)
                curveToRelative(0.2f, -0.999f, 0.629f, -1.916f, 1.23f, -2.693f)
                lineTo(8.0f, 0.0f)
                lineToRelative(4.895f, 2.545f)
                curveToRelative(0.422f, -0.185f, 0.867f, -0.327f, 1.329f, -0.419f)
                lineToRelative(1.276f, -2.126f)
                lineToRelative(1.276f, 2.126f)
                curveToRelative(0.655f, 0.131f, 1.274f, 0.36f, 1.843f, 0.672f)
                lineToRelative(5.382f, -2.798f)
                lineToRelative(-2.798f, 5.382f)
                curveToRelative(0.312f, 0.568f, 0.542f, 1.188f, 0.672f, 1.843f)
                lineToRelative(2.126f, 1.276f)
                lineToRelative(-2.126f, 1.276f)
                close()
                moveTo(19.0f, 8.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _mace!!
    }

private var _mace: ImageVector? = null
