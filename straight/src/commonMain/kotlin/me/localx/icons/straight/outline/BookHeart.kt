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

public val Icons.Outline.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = Builder(name = "BookHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(17.0f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(11.428f, 14.153f)
                lineToRelative(0.572f, 0.399f)
                lineToRelative(0.572f, -0.399f)
                curveToRelative(0.453f, -0.316f, 4.428f, -3.17f, 4.428f, -5.935f)
                curveToRelative(0.0f, -1.774f, -1.346f, -3.218f, -3.0f, -3.218f)
                curveToRelative(-0.782f, 0.0f, -1.477f, 0.27f, -2.0f, 0.727f)
                curveToRelative(-0.523f, -0.457f, -1.218f, -0.727f, -2.0f, -0.727f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.444f, -3.0f, 3.218f)
                curveToRelative(0.0f, 2.765f, 3.975f, 5.619f, 4.428f, 5.935f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.483f, 0.0f, 1.0f, 0.263f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.737f, 0.517f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.546f, 1.0f, 1.218f)
                curveToRelative(0.0f, 1.085f, -1.604f, 2.77f, -3.0f, 3.868f)
                curveToRelative(-1.396f, -1.099f, -3.0f, -2.783f, -3.0f, -3.868f)
                curveToRelative(0.0f, -0.672f, 0.449f, -1.218f, 1.0f, -1.218f)
                close()
            }
        }
        .build()
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
