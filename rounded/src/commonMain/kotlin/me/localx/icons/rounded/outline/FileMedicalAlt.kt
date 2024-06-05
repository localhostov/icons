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

public val Icons.Outline.FileMedicalAlt: ImageVector
    get() {
        if (_fileMedicalAlt != null) {
            return _fileMedicalAlt!!
        }
        _fileMedicalAlt = Builder(name = "FileMedicalAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 16.0f)
                lineTo(1.0f, 16.0f)
                curveTo(0.448f, 16.0f, 0.0f, 15.552f, 0.0f, 15.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.965f)
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
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -0.163f, -0.008f, -0.325f, -0.023f, -0.485f)
                horizontalLineToRelative(-4.977f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.0f, 2.023f)
                curveToRelative(-0.16f, -0.015f, -0.322f, -0.023f, -0.485f, -0.023f)
                horizontalLineToRelative(-4.515f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(1.87f, 0.0f, 3.627f, 0.728f, 4.95f, 2.05f)
                lineToRelative(3.485f, 3.485f)
                curveToRelative(1.322f, 1.322f, 2.05f, 3.08f, 2.05f, 4.95f)
                close()
                moveTo(19.341f, 8.0f)
                curveToRelative(-0.218f, -0.379f, -0.487f, -0.733f, -0.805f, -1.05f)
                lineToRelative(-3.485f, -3.485f)
                curveToRelative(-0.318f, -0.318f, -0.671f, -0.587f, -1.05f, -0.805f)
                verticalLineToRelative(4.341f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.341f)
                close()
            }
        }
        .build()
        return _fileMedicalAlt!!
    }

private var _fileMedicalAlt: ImageVector? = null
