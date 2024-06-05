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

public val Icons.Outline.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(14.0f, 20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(15.0f, 11.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.88f, 8.993f)
                curveToRelative(-0.691f, -0.345f, -1.506f, -0.274f, -2.125f, 0.191f)
                lineToRelative(-1.802f, 1.352f)
                curveToRelative(-0.238f, -2.537f, -2.355f, -4.536f, -4.953f, -4.536f)
                horizontalLineToRelative(-0.073f)
                lineTo(9.806f, 1.879f)
                curveToRelative(-0.566f, -0.567f, -1.32f, -0.879f, -2.121f, -0.879f)
                lineTo(1.0f, 1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(7.685f, 3.0f)
                curveToRelative(0.263f, 0.0f, 0.521f, 0.107f, 0.707f, 0.293f)
                lineToRelative(2.707f, 2.707f)
                lineTo(5.0f, 6.0f)
                curveTo(2.243f, 6.0f, 0.0f, 8.243f, 0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(14.0f, 24.0f)
                curveToRelative(2.598f, 0.0f, 4.714f, -1.999f, 4.953f, -4.535f)
                lineToRelative(1.802f, 1.352f)
                curveToRelative(0.359f, 0.27f, 0.786f, 0.407f, 1.215f, 0.407f)
                curveToRelative(0.31f, 0.0f, 0.62f, -0.071f, 0.909f, -0.216f)
                curveToRelative(0.691f, -0.346f, 1.121f, -1.041f, 1.121f, -1.814f)
                lineTo(24.0f, 10.807f)
                curveToRelative(0.0f, -0.773f, -0.43f, -1.468f, -1.12f, -1.814f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(14.0f, 8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(21.954f, 19.216f)
                lineToRelative(-2.954f, -2.216f)
                verticalLineToRelative(-3.995f)
                lineToRelative(2.999f, -2.213f)
                verticalLineToRelative(0.015f)
                lineToRelative(-0.045f, 8.41f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
