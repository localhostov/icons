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

public val Icons.Filled.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = Builder(name = "BookHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveToRelative(-0.483f, 0.0f, -1.0f, 0.263f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.737f, -0.517f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.546f, -1.0f, 1.218f)
                curveToRelative(0.0f, 1.085f, 1.604f, 2.77f, 3.0f, 3.868f)
                curveToRelative(1.396f, -1.099f, 3.0f, -2.783f, 3.0f, -3.868f)
                curveToRelative(0.0f, -0.672f, -0.449f, -1.218f, -1.0f, -1.218f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 8.218f)
                curveToRelative(0.0f, -1.774f, -1.346f, -3.218f, -3.0f, -3.218f)
                curveToRelative(-0.782f, 0.0f, -1.477f, 0.27f, -2.0f, 0.727f)
                curveToRelative(-0.523f, -0.457f, -1.218f, -0.727f, -2.0f, -0.727f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.444f, -3.0f, 3.218f)
                curveToRelative(0.0f, 2.765f, 3.975f, 5.619f, 4.428f, 5.935f)
                lineToRelative(0.572f, 0.399f)
                lineToRelative(0.572f, -0.399f)
                curveToRelative(0.453f, -0.316f, 4.428f, -3.17f, 4.428f, -5.935f)
                close()
            }
        }
        .build()
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
