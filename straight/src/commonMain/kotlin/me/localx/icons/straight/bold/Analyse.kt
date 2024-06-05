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

public val Icons.Bold.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.867f, 23.988f)
                lineToRelative(-5.944f, -5.943f)
                curveToRelative(-1.707f, 1.263f, -3.759f, 1.956f, -5.923f, 1.956f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.484f, 0.002f, 9.996f, 0.0f)
                curveToRelative(0.001f, 0.0f, 0.003f, 0.0f, 0.004f, 0.0f)
                curveTo(12.112f, 0.0f, 14.071f, 0.662f, 15.687f, 1.785f)
                lineToRelative(-1.977f, 2.29f)
                curveToRelative(-1.077f, -0.677f, -2.346f, -1.075f, -3.709f, -1.075f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.638f, 0.093f, 1.252f, 0.254f, 1.84f)
                lineToRelative(4.64f, -5.568f)
                lineToRelative(3.521f, 3.521f)
                lineTo(19.859f, 0.014f)
                lineToRelative(2.27f, 1.961f)
                lineToRelative(-10.555f, 12.221f)
                lineToRelative(-3.479f, -3.479f)
                lineToRelative(-3.294f, 3.954f)
                curveToRelative(1.282f, 1.426f, 3.135f, 2.33f, 5.2f, 2.33f)
                curveToRelative(1.876f, 0.0f, 3.638f, -0.732f, 4.961f, -2.062f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.002f, 0.001f, -0.002f)
                curveToRelative(1.056f, -1.061f, 1.723f, -2.405f, 1.947f, -3.858f)
                lineToRelative(2.837f, -3.285f)
                curveToRelative(0.161f, 0.711f, 0.254f, 1.448f, 0.254f, 2.207f)
                curveToRelative(0.0f, 2.163f, -0.692f, 4.216f, -1.955f, 5.924f)
                lineToRelative(5.944f, 5.943f)
                lineToRelative(-2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
