package me.localx.icons.rounded.filled

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

public val Icons.Filled.FileMedicalAlt: ImageVector
    get() {
        if (_fileMedicalAlt != null) {
            return _fileMedicalAlt!!
        }
        _fileMedicalAlt = Builder(name = "FileMedicalAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(21.976f, 10.0f)
                horizontalLineToRelative(-6.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.0f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                horizontalLineToRelative(-4.515f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.965f)
                lineToRelative(1.703f, -2.555f)
                curveToRelative(0.197f, -0.296f, 0.542f, -0.473f, 0.894f, -0.443f)
                curveToRelative(0.356f, 0.022f, 0.673f, 0.232f, 0.833f, 0.551f)
                lineToRelative(2.229f, 4.459f)
                lineToRelative(1.044f, -1.566f)
                curveToRelative(0.186f, -0.278f, 0.498f, -0.445f, 0.832f, -0.445f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.965f)
                lineToRelative(-1.703f, 2.555f)
                curveToRelative(-0.186f, 0.279f, -0.499f, 0.445f, -0.832f, 0.445f)
                curveToRelative(-0.021f, 0.0f, -0.042f, 0.0f, -0.062f, -0.002f)
                curveToRelative(-0.356f, -0.022f, -0.673f, -0.232f, -0.833f, -0.551f)
                lineToRelative(-2.229f, -4.459f)
                lineToRelative(-1.044f, 1.566f)
                curveToRelative(-0.186f, 0.278f, -0.498f, 0.445f, -0.832f, 0.445f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -0.163f, -0.013f, -0.324f, -0.024f, -0.485f)
                close()
            }
        }
        .build()
        return _fileMedicalAlt!!
    }

private var _fileMedicalAlt: ImageVector? = null
