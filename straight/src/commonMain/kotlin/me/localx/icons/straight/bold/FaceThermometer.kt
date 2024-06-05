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

public val Icons.Bold.FaceThermometer: ImageVector
    get() {
        if (_faceThermometer != null) {
            return _faceThermometer!!
        }
        _faceThermometer = Builder(name = "FaceThermometer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.998f, 11.0f)
                curveToRelative(-1.104f, 0.0f, -1.998f, -0.895f, -1.998f, -1.998f)
                reflectiveCurveToRelative(0.895f, -1.998f, 1.998f, -1.998f)
                reflectiveCurveToRelative(1.998f, 0.895f, 1.998f, 1.998f)
                reflectiveCurveToRelative(-0.895f, 1.998f, -1.998f, 1.998f)
                close()
                moveTo(17.996f, 9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(20.677f, 8.506f)
                lineToRelative(-5.752f, 5.065f)
                curveToRelative(-0.861f, -0.329f, -1.856f, -0.571f, -2.926f, -0.571f)
                curveToRelative(-3.296f, 0.0f, -5.891f, 2.284f, -5.999f, 2.381f)
                lineToRelative(1.994f, 2.241f)
                curveToRelative(0.019f, -0.016f, 1.871f, -1.623f, 4.005f, -1.623f)
                curveToRelative(2.385f, 0.0f, 4.243f, 1.861f, 4.261f, 1.877f)
                lineToRelative(1.901f, -1.826f)
                lineToRelative(-1.262f, -1.433f)
                lineToRelative(1.5f, -1.322f)
                lineToRelative(1.263f, 1.434f)
                lineToRelative(1.646f, -1.45f)
                lineToRelative(-1.277f, -1.45f)
                lineToRelative(1.5f, -1.322f)
                lineToRelative(1.277f, 1.451f)
                lineToRelative(0.512f, -0.451f)
                curveToRelative(0.828f, -0.73f, 0.909f, -1.994f, 0.179f, -2.823f)
                curveToRelative(-0.731f, -0.83f, -1.993f, -0.91f, -2.823f, -0.179f)
                close()
                moveTo(11.999f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(3.09f, 0.0f, 5.819f, 1.566f, 7.441f, 3.945f)
                curveToRelative(0.855f, -0.715f, 1.924f, -1.009f, 2.96f, -0.905f)
                curveTo(20.328f, 2.437f, 16.447f, 0.0f, 12.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.003f, 0.0f)
                curveTo(5.381f, 0.002f, 0.0f, 5.384f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.381f, 11.998f, 11.997f, 12.0f)
                curveToRelative(0.002f, 0.0f, 0.003f, 0.0f, 0.003f, 0.0f)
                curveToRelative(6.142f, 0.0f, 11.213f, -4.64f, 11.911f, -10.597f)
                curveToRelative(-0.254f, 0.247f, -6.081f, 5.441f, -6.081f, 5.441f)
                curveToRelative(-1.572f, 1.341f, -3.606f, 2.156f, -5.83f, 2.156f)
                close()
            }
        }
        .build()
        return _faceThermometer!!
    }

private var _faceThermometer: ImageVector? = null
