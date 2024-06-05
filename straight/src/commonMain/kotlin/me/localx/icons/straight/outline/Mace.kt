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

public val Icons.Outline.Mace: ImageVector
    get() {
        if (_mace != null) {
            return _mace!!
        }
        _mace = Builder(name = "Mace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.874f, 9.776f)
                curveToRelative(-0.092f, 0.463f, -0.234f, 0.907f, -0.419f, 1.329f)
                lineToRelative(2.545f, 4.895f)
                lineToRelative(-4.531f, -2.356f)
                curveToRelative(-0.778f, 0.601f, -1.694f, 1.031f, -2.693f, 1.23f)
                lineToRelative(-1.276f, 2.126f)
                lineToRelative(-1.276f, -2.126f)
                curveToRelative(-0.941f, -0.188f, -1.809f, -0.58f, -2.557f, -1.128f)
                lineTo(1.452f, 23.962f)
                lineTo(0.038f, 22.548f)
                lineToRelative(10.215f, -10.215f)
                curveToRelative(-0.548f, -0.748f, -0.94f, -1.616f, -1.128f, -2.557f)
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
                moveTo(15.5f, 13.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _mace!!
    }

private var _mace: ImageVector? = null
