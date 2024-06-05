package me.localx.icons.rounded.bold

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

public val Icons.Bold.CupTogo: ImageVector
    get() {
        if (_cupTogo != null) {
            return _cupTogo!!
        }
        _cupTogo = Builder(name = "CupTogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-0.27f)
                lineToRelative(-0.276f, -1.383f)
                curveToRelative(-0.419f, -2.096f, -2.275f, -3.617f, -4.413f, -3.617f)
                lineTo(6.959f, 0.0f)
                curveToRelative(-2.137f, 0.0f, -3.993f, 1.521f, -4.413f, 3.618f)
                lineToRelative(-0.276f, 1.382f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.666f)
                lineToRelative(1.316f, 11.145f)
                curveToRelative(0.327f, 2.768f, 2.675f, 4.855f, 5.462f, 4.855f)
                horizontalLineToRelative(6.111f)
                curveToRelative(2.787f, 0.0f, 5.136f, -2.087f, 5.462f, -4.855f)
                lineToRelative(1.315f, -11.145f)
                horizontalLineToRelative(0.168f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.959f, 3.0f)
                horizontalLineToRelative(10.081f)
                curveToRelative(0.712f, 0.0f, 1.331f, 0.507f, 1.471f, 1.206f)
                lineToRelative(0.159f, 0.794f)
                lineTo(5.329f, 5.0f)
                lineToRelative(0.159f, -0.794f)
                curveToRelative(0.14f, -0.699f, 0.759f, -1.206f, 1.471f, -1.206f)
                close()
                moveTo(18.811f, 8.0f)
                lineToRelative(-0.354f, 3.0f)
                lineTo(5.541f, 11.0f)
                lineToRelative(-0.354f, -3.0f)
                horizontalLineToRelative(13.625f)
                close()
                moveTo(15.054f, 21.0f)
                horizontalLineToRelative(-6.111f)
                curveToRelative(-1.267f, 0.0f, -2.334f, -0.949f, -2.483f, -2.207f)
                lineToRelative(-0.094f, -0.793f)
                horizontalLineToRelative(11.264f)
                lineToRelative(-0.094f, 0.793f)
                curveToRelative(-0.148f, 1.258f, -1.216f, 2.207f, -2.483f, 2.207f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
