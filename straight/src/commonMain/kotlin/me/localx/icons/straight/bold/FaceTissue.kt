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

public val Icons.Bold.FaceTissue: ImageVector
    get() {
        if (_faceTissue != null) {
            return _faceTissue!!
        }
        _faceTissue = Builder(name = "FaceTissue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                reflectiveCurveToRelative(-2.0f, 2.0f, -2.0f, 3.0f)
                reflectiveCurveToRelative(2.0f, 3.0f, 2.0f, 3.0f)
                curveToRelative(-1.631f, 0.0f, -5.0f, -0.733f, -5.0f, -3.0f)
                reflectiveCurveToRelative(3.369f, -3.0f, 5.0f, -3.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -2.267f, -3.369f, -3.0f, -5.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 2.0f, 2.0f, 3.0f)
                reflectiveCurveToRelative(-2.0f, 3.0f, -2.0f, 3.0f)
                curveToRelative(1.631f, 0.0f, 5.0f, -0.733f, 5.0f, -3.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.657f, 0.067f, 1.297f, 0.169f, 1.926f)
                lineToRelative(2.949f, -0.541f)
                curveToRelative(-0.07f, -0.453f, -0.118f, -0.913f, -0.118f, -1.385f)
                curveTo(3.0f, 7.038f, 7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-0.47f, 0.0f, -0.928f, -0.047f, -1.379f, -0.117f)
                lineToRelative(-0.538f, 2.949f)
                curveToRelative(0.626f, 0.101f, 1.263f, 0.168f, 1.917f, 0.168f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(2.282f, 18.699f)
                lineToRelative(-1.35f, 4.362f)
                lineToRelative(4.361f, -1.307f)
                lineToRelative(2.735f, 2.188f)
                lineToRelative(1.78f, -9.752f)
                lineTo(0.1f, 15.972f)
                lineToRelative(2.182f, 2.727f)
                close()
                moveTo(11.183f, 17.804f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(1.51f, -1.49f)
                lineToRelative(1.497f, 1.497f)
                lineToRelative(3.561f, -3.561f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-1.483f, -1.483f)
                lineToRelative(-1.756f, 1.742f)
                lineToRelative(-0.578f, 3.166f)
                close()
            }
        }
        .build()
        return _faceTissue!!
    }

private var _faceTissue: ImageVector? = null
