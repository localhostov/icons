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

public val Icons.Outline.Dinner: ImageVector
    get() {
        if (_dinner != null) {
            return _dinner!!
        }
        _dinner = Builder(name = "Dinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                curveToRelative(0.0f, -2.375f, -1.971f, -8.0f, -5.078f, -8.0f)
                curveToRelative(-3.062f, 0.0f, -4.922f, 5.557f, -4.922f, 8.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(10.101f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-10.101f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.484f, 4.0f, -4.899f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -2.172f, 1.689f, -6.0f, 2.922f, -6.0f)
                curveToRelative(1.269f, 0.0f, 3.078f, 3.881f, 3.078f, 6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.265f, -0.105f, 0.52f, -0.293f, 0.707f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.707f, -1.707f)
                verticalLineToRelative(-3.586f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(15.831f, 18.928f)
                curveToRelative(0.308f, 0.459f, 0.185f, 1.08f, -0.274f, 1.388f)
                curveToRelative(-1.646f, 1.102f, -3.567f, 1.685f, -5.557f, 1.685f)
                curveTo(4.486f, 22.0f, 0.0f, 17.514f, 0.0f, 12.0f)
                reflectiveCurveTo(4.486f, 2.0f, 10.0f, 2.0f)
                curveToRelative(0.75f, 0.0f, 1.497f, 0.083f, 2.221f, 0.248f)
                curveToRelative(0.539f, 0.122f, 0.876f, 0.658f, 0.754f, 1.196f)
                curveToRelative(-0.123f, 0.539f, -0.659f, 0.879f, -1.196f, 0.754f)
                curveToRelative(-0.58f, -0.131f, -1.178f, -0.198f, -1.779f, -0.198f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.592f, 0.0f, 3.128f, -0.466f, 4.443f, -1.347f)
                curveToRelative(0.457f, -0.307f, 1.079f, -0.185f, 1.388f, 0.274f)
                close()
            }
        }
        .build()
        return _dinner!!
    }

private var _dinner: ImageVector? = null
