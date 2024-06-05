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

public val Icons.Bold.ReservationTable: ImageVector
    get() {
        if (_reservationTable != null) {
            return _reservationTable!!
        }
        _reservationTable = Builder(name = "ReservationTable", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.976f, 17.305f)
                lineToRelative(-2.044f, -11.587f)
                curveToRelative(-0.381f, -2.154f, -2.245f, -3.717f, -4.432f, -3.717f)
                lineTo(6.5f, 2.001f)
                curveToRelative(-2.187f, 0.0f, -4.051f, 1.563f, -4.432f, 3.718f)
                lineTo(0.024f, 17.305f)
                curveToRelative(-0.384f, 2.175f, 1.052f, 4.27f, 3.202f, 4.67f)
                curveToRelative(0.093f, 0.018f, 0.185f, 0.025f, 0.276f, 0.025f)
                curveToRelative(0.708f, 0.0f, 1.339f, -0.504f, 1.473f, -1.226f)
                curveToRelative(0.152f, -0.814f, -0.386f, -1.598f, -1.2f, -1.749f)
                curveToRelative(-0.529f, -0.099f, -0.894f, -0.647f, -0.796f, -1.199f)
                lineToRelative(1.764f, -9.994f)
                lineToRelative(1.698f, 9.624f)
                curveToRelative(0.464f, 2.633f, 2.742f, 4.544f, 5.416f, 4.544f)
                horizontalLineToRelative(8.181f)
                curveToRelative(1.186f, 0.0f, 2.302f, -0.521f, 3.064f, -1.429f)
                curveToRelative(0.762f, -0.908f, 1.081f, -2.099f, 0.875f, -3.267f)
                close()
                moveTo(20.803f, 18.643f)
                curveToRelative(-0.112f, 0.134f, -0.36f, 0.357f, -0.766f, 0.357f)
                horizontalLineToRelative(-8.181f)
                curveToRelative(-1.215f, 0.0f, -2.251f, -0.868f, -2.462f, -2.065f)
                lineToRelative(-2.106f, -11.935f)
                horizontalLineToRelative(10.212f)
                curveToRelative(0.729f, 0.0f, 1.351f, 0.521f, 1.478f, 1.239f)
                lineToRelative(2.044f, 11.587f)
                curveToRelative(0.07f, 0.399f, -0.107f, 0.684f, -0.219f, 0.816f)
                close()
                moveTo(11.5f, 11.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(18.5f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _reservationTable!!
    }

private var _reservationTable: ImageVector? = null
