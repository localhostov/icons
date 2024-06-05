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

public val Icons.Bold.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-6.946f)
                lineToRelative(0.205f, -1.565f)
                curveToRelative(0.032f, -0.248f, 0.246f, -0.435f, 0.496f, -0.435f)
                horizontalLineToRelative(2.745f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.745f)
                curveToRelative(-1.751f, 0.0f, -3.243f, 1.309f, -3.47f, 3.045f)
                lineToRelative(-0.257f, 1.955f)
                lineTo(3.514f, 5.0f)
                curveToRelative(-0.015f, 0.0f, -0.03f, 0.0f, -0.045f, 0.0f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.167f)
                lineToRelative(1.316f, 11.145f)
                curveToRelative(0.327f, 2.768f, 2.675f, 4.855f, 5.462f, 4.855f)
                horizontalLineToRelative(6.111f)
                curveToRelative(2.787f, 0.0f, 5.135f, -2.087f, 5.462f, -4.855f)
                lineToRelative(1.316f, -11.145f)
                horizontalLineToRelative(0.167f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.056f, 21.0f)
                horizontalLineToRelative(-6.111f)
                curveToRelative(-1.267f, 0.0f, -2.334f, -0.949f, -2.482f, -2.207f)
                lineToRelative(-0.31f, -2.628f)
                curveToRelative(1.109f, -0.724f, 2.179f, -1.165f, 2.848f, -1.165f)
                curveToRelative(0.646f, 0.0f, 1.463f, 0.409f, 2.329f, 0.842f)
                curveToRelative(1.086f, 0.543f, 2.317f, 1.158f, 3.671f, 1.158f)
                curveToRelative(0.963f, 0.0f, 1.96f, -0.321f, 2.836f, -0.726f)
                lineToRelative(-0.297f, 2.519f)
                curveToRelative(-0.148f, 1.258f, -1.216f, 2.207f, -2.482f, 2.207f)
                close()
                moveTo(18.276f, 12.546f)
                curveToRelative(-0.807f, 0.581f, -2.295f, 1.454f, -3.276f, 1.454f)
                curveToRelative(-0.646f, 0.0f, -1.463f, -0.409f, -2.329f, -0.842f)
                curveToRelative(-1.086f, -0.543f, -2.317f, -1.158f, -3.671f, -1.158f)
                curveToRelative(-1.095f, 0.0f, -2.23f, 0.403f, -3.232f, 0.917f)
                lineToRelative(-0.581f, -4.917f)
                horizontalLineToRelative(13.625f)
                lineToRelative(-0.537f, 4.546f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
