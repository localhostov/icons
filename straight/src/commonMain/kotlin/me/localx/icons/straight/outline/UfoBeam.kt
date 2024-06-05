package me.localx.icons.straight.outline

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

public val Icons.Outline.UfoBeam: ImageVector
    get() {
        if (_ufoBeam != null) {
            return _ufoBeam!!
        }
        _ufoBeam = Builder(name = "UfoBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.842f, 15.203f)
                curveToRelative(0.658f, 0.165f, 1.349f, 0.292f, 2.051f, 0.403f)
                lineToRelative(-3.393f, 8.394f)
                lineTo(1.286f, 24.0f)
                lineToRelative(3.556f, -8.797f)
                close()
                moveTo(17.0f, 15.606f)
                lineToRelative(3.393f, 8.394f)
                horizontalLineToRelative(2.214f)
                lineToRelative(-3.556f, -8.797f)
                curveToRelative(-0.658f, 0.165f, -1.349f, 0.292f, -2.051f, 0.403f)
                close()
                moveTo(24.0f, 9.333f)
                curveToRelative(0.0f, 3.063f, -6.037f, 4.667f, -12.0f, 4.667f)
                reflectiveCurveTo(0.0f, 12.396f, 0.0f, 9.333f)
                curveToRelative(0.0f, -1.85f, 2.189f, -3.322f, 6.05f, -4.106f)
                curveToRelative(0.38f, -2.945f, 2.904f, -5.227f, 5.95f, -5.227f)
                reflectiveCurveToRelative(5.57f, 2.282f, 5.95f, 5.227f)
                curveToRelative(3.861f, 0.785f, 6.05f, 2.257f, 6.05f, 4.106f)
                close()
                moveTo(8.0f, 6.347f)
                curveToRelative(0.5f, 0.239f, 1.694f, 0.653f, 4.0f, 0.653f)
                curveToRelative(2.29f, 0.0f, 3.484f, -0.408f, 4.0f, -0.658f)
                verticalLineToRelative(-0.342f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(0.347f)
                close()
                moveTo(22.0f, 9.333f)
                curveToRelative(0.0f, -0.399f, -1.04f, -1.378f, -4.0f, -2.051f)
                verticalLineToRelative(0.02f)
                lineToRelative(-0.293f, 0.293f)
                curveToRelative(-0.234f, 0.234f, -1.612f, 1.404f, -5.707f, 1.404f)
                reflectiveCurveToRelative(-5.473f, -1.17f, -5.707f, -1.404f)
                lineToRelative(-0.293f, -0.293f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-2.96f, 0.673f, -4.0f, 1.652f, -4.0f, 2.051f)
                curveToRelative(0.0f, 0.94f, 3.796f, 2.667f, 10.0f, 2.667f)
                reflectiveCurveToRelative(10.0f, -1.727f, 10.0f, -2.667f)
                close()
            }
        }
        .build()
        return _ufoBeam!!
    }

private var _ufoBeam: ImageVector? = null
