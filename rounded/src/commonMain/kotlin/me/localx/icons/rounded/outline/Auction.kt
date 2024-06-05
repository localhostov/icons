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

public val Icons.Outline.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = Builder(name = "Auction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.696f, 15.381f)
                lineToRelative(-0.81f, 0.809f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(7.402f, -7.401f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-0.722f, 0.722f)
                lineToRelative(-7.082f, -7.082f)
                lineToRelative(0.722f, -0.722f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-7.402f, 7.402f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.81f, -0.81f)
                lineToRelative(2.836f, 2.836f)
                lineTo(0.293f, 21.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(10.158f, -10.158f)
                lineToRelative(2.832f, 2.831f)
                close()
                moveTo(19.153f, 10.925f)
                lineToRelative(-3.043f, 3.042f)
                lineToRelative(-1.245f, -1.245f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.245f, 1.245f)
                close()
                moveTo(10.364f, 8.222f)
                lineToRelative(-1.336f, -1.336f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.336f, 1.336f)
                lineToRelative(-3.043f, 3.043f)
                close()
                moveTo(14.821f, 6.593f)
                lineToRelative(1.672f, 1.672f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(-1.672f, -1.672f)
                lineToRelative(3.043f, -3.043f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.449f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.208f, 0.0f, 2.217f, 0.86f, 2.449f, 2.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _auction!!
    }

private var _auction: ImageVector? = null
