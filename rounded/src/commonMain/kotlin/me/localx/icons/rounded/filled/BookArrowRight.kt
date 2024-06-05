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

public val Icons.Filled.BookArrowRight: ImageVector
    get() {
        if (_bookArrowRight != null) {
            return _bookArrowRight!!
        }
        _bookArrowRight = Builder(name = "BookArrowRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.395f, 16.061f)
                curveToRelative(-0.87f, 0.104f, -1.696f, 0.437f, -2.395f, 0.964f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -2.376f, 1.672f, -4.425f, 4.0f, -4.9f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.203f, 0.0f, -0.406f, 0.02f, -0.605f, 0.061f)
                close()
                moveTo(2.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(11.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(19.133f, 6.907f)
                lineToRelative(-1.613f, -1.614f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, 0.39f, -0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                horizontalLineToRelative(-6.398f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.398f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(1.613f, -1.614f)
                curveToRelative(1.154f, -1.154f, 1.154f, -3.032f, 0.0f, -4.187f)
                close()
            }
        }
        .build()
        return _bookArrowRight!!
    }

private var _bookArrowRight: ImageVector? = null
