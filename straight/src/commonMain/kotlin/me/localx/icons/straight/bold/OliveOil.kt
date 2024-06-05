package me.localx.icons.straight.bold

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

public val Icons.Bold.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                arcToRelative(4.491f, 4.491f, 0.0f, false, false, -6.0f, -4.239f)
                lineTo(16.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 8.0f)
                curveToRelative(0.0f, 0.382f, -1.38f, 1.427f, -2.043f, 1.929f)
                curveTo(4.193f, 11.263f, 2.0f, 12.924f, 2.0f, 15.5f)
                curveToRelative(0.0f, 2.821f, 1.6f, 4.3f, 3.152f, 5.725f)
                lineToRelative(0.5f, 0.463f)
                arcTo(1.116f, 1.116f, 0.0f, false, true, 6.0f, 22.5f)
                lineTo(6.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 22.5f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, true, 0.348f, -0.812f)
                lineToRelative(0.5f, -0.463f)
                curveTo(20.4f, 19.8f, 22.0f, 18.321f, 22.0f, 15.5f)
                arcToRelative(5.159f, 5.159f, 0.0f, false, false, -1.619f, -3.572f)
                arcTo(4.473f, 4.473f, 0.0f, false, false, 22.0f, 8.5f)
                close()
                moveTo(17.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.511f, 2.9f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, -1.957f, -1.75f)
                arcTo(1.485f, 1.485f, 0.0f, false, true, 17.5f, 7.0f)
                close()
                moveTo(7.768f, 12.32f)
                curveTo(9.356f, 11.117f, 11.0f, 9.873f, 11.0f, 8.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(13.0f, 8.0f)
                curveToRelative(0.0f, 1.873f, 1.644f, 3.117f, 3.232f, 4.32f)
                curveToRelative(0.291f, 0.221f, 0.59f, 0.448f, 0.88f, 0.68f)
                lineTo(6.888f, 13.0f)
                curveTo(7.178f, 12.768f, 7.477f, 12.541f, 7.768f, 12.32f)
                close()
                moveTo(16.815f, 19.02f)
                lineTo(16.294f, 19.503f)
                arcTo(4.106f, 4.106f, 0.0f, false, false, 15.283f, 21.0f)
                lineTo(8.717f, 21.0f)
                arcToRelative(4.115f, 4.115f, 0.0f, false, false, -1.01f, -1.5f)
                lineToRelative(-0.522f, -0.483f)
                curveToRelative(-1.295f, -1.193f, -2.0f, -1.892f, -2.152f, -3.018f)
                lineTo(18.967f, 15.999f)
                curveTo(18.814f, 17.126f, 18.11f, 17.825f, 16.815f, 19.018f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
