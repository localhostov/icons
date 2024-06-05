package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Kazoo: ImageVector
    get() {
        if (_kazoo != null) {
            return _kazoo!!
        }
        _kazoo = Builder(name = "Kazoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.238f, 1.924f)
                lineToRelative(-1.162f, -1.162f)
                curveToRelative(-0.872f, -0.875f, -2.252f, -1.01f, -3.31f, -0.305f)
                lineToRelative(-8.94f, 6.66f)
                curveToRelative(-2.363f, 0.47f, -4.23f, 2.332f, -4.707f, 4.693f)
                lineTo(-0.021f, 16.95f)
                lineToRelative(7.07f, 7.071f)
                lineToRelative(5.14f, -5.14f)
                curveToRelative(2.361f, -0.477f, 4.222f, -2.344f, 4.693f, -4.707f)
                lineToRelative(6.68f, -8.97f)
                curveToRelative(0.685f, -1.027f, 0.548f, -2.407f, -0.325f, -3.28f)
                close()
                moveTo(2.808f, 16.95f)
                lineToRelative(2.402f, -2.402f)
                curveToRelative(0.553f, 2.065f, 2.178f, 3.69f, 4.242f, 4.243f)
                lineToRelative(-2.402f, 2.402f)
                lineToRelative(-4.242f, -4.243f)
                close()
                moveTo(11.0f, 17.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(21.92f, 4.065f)
                lineToRelative(-5.201f, 7.122f)
                curveToRelative(-0.589f, -1.853f, -2.054f, -3.318f, -3.908f, -3.906f)
                lineToRelative(7.094f, -5.18f)
                curveToRelative(0.236f, -0.158f, 0.556f, -0.126f, 0.757f, 0.075f)
                lineToRelative(1.162f, 1.162f)
                curveToRelative(0.201f, 0.202f, 0.233f, 0.52f, 0.096f, 0.727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _kazoo!!
    }

private var _kazoo: ImageVector? = null
