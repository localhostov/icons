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

public val Icons.Bold.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(21.0f, 6.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-1.258f)
                curveToRelative(-0.243f, -0.363f, -0.541f, -0.694f, -0.889f, -0.979f)
                curveTo(13.307f, 0.163f, 11.946f, -0.179f, 10.617f, 0.089f)
                lineToRelative(-3.598f, 0.72f)
                curveToRelative(-2.329f, 0.466f, -4.02f, 2.527f, -4.02f, 4.902f)
                verticalLineToRelative(15.289f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                lineTo(22.5f, 24.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.0f, 6.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 5.711f)
                curveToRelative(0.0f, -0.95f, 0.676f, -1.774f, 1.608f, -1.961f)
                lineToRelative(3.598f, -0.72f)
                curveToRelative(0.444f, -0.087f, 0.897f, 0.025f, 1.246f, 0.312f)
                curveToRelative(0.349f, 0.285f, 0.549f, 0.708f, 0.549f, 1.159f)
                lineTo(13.001f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 5.711f)
                close()
                moveTo(12.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
