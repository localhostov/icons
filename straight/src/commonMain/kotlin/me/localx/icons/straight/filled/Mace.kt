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

public val Icons.Filled.Mace: ImageVector
    get() {
        if (_mace != null) {
            return _mace!!
        }
        _mace = Builder(name = "Mace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.5f)
                lineToRelative(-2.126f, -1.276f)
                curveToRelative(-0.131f, -0.655f, -0.36f, -1.274f, -0.672f, -1.843f)
                lineToRelative(2.798f, -5.382f)
                lineToRelative(-5.382f, 2.798f)
                curveToRelative(-0.568f, -0.312f, -1.188f, -0.542f, -1.843f, -0.672f)
                lineToRelative(-1.276f, -2.126f)
                lineToRelative(-1.276f, 2.126f)
                curveToRelative(-0.463f, 0.092f, -0.907f, 0.234f, -1.329f, 0.419f)
                lineTo(8.0f, 0.0f)
                lineToRelative(2.356f, 4.531f)
                curveToRelative(-0.601f, 0.778f, -1.031f, 1.694f, -1.23f, 2.693f)
                lineToRelative(-2.126f, 1.276f)
                lineToRelative(2.126f, 1.276f)
                curveToRelative(0.188f, 0.941f, 0.58f, 1.809f, 1.128f, 2.557f)
                lineTo(0.038f, 22.548f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(10.215f, -10.215f)
                curveToRelative(0.748f, 0.548f, 1.616f, 0.94f, 2.557f, 1.128f)
                lineToRelative(1.276f, 2.126f)
                lineToRelative(1.276f, -2.126f)
                curveToRelative(0.999f, -0.2f, 1.916f, -0.629f, 2.693f, -1.23f)
                lineToRelative(4.531f, 2.356f)
                lineToRelative(-2.545f, -4.895f)
                curveToRelative(0.185f, -0.422f, 0.327f, -0.867f, 0.419f, -1.329f)
                lineToRelative(2.126f, -1.276f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mace!!
    }

private var _mace: ImageVector? = null
