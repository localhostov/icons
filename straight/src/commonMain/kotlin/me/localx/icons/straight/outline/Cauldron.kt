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

public val Icons.Outline.Cauldron: ImageVector
    get() {
        if (_cauldron != null) {
            return _cauldron!!
        }
        _cauldron = Builder(name = "Cauldron", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.143f)
                curveToRelative(0.0f, -3.012f, -1.558f, -5.615f, -2.724f, -7.142f)
                horizontalLineToRelative(1.725f)
                reflectiveCurveToRelative(0.0f, -2.001f, 0.0f, -2.001f)
                lineToRelative(-22.0f, 0.009f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(1.719f, 0.0f, 1.719f, 0.0f)
                curveToRelative(-1.166f, 1.528f, -2.718f, 4.128f, -2.718f, 7.135f)
                curveToRelative(0.0f, 2.107f, 1.003f, 4.044f, 2.673f, 5.566f)
                lineToRelative(-1.745f, 1.95f)
                lineToRelative(1.49f, 1.334f)
                lineToRelative(1.859f, -2.077f)
                curveToRelative(2.089f, 1.299f, 4.784f, 2.084f, 7.723f, 2.084f)
                reflectiveCurveToRelative(5.634f, -0.784f, 7.723f, -2.084f)
                lineToRelative(1.867f, 2.086f)
                lineToRelative(1.49f, -1.334f)
                lineToRelative(-1.753f, -1.959f)
                curveToRelative(1.671f, -1.522f, 2.673f, -3.459f, 2.673f, -5.566f)
                close()
                moveTo(2.0f, 15.143f)
                curveToRelative(0.0f, -3.831f, 3.296f, -7.075f, 3.359f, -7.136f)
                lineToRelative(13.286f, -0.006f)
                lineToRelative(-0.004f, 0.005f)
                curveToRelative(0.034f, 0.032f, 3.36f, 3.289f, 3.36f, 7.137f)
                curveToRelative(0.0f, 3.781f, -4.486f, 6.857f, -10.0f, 6.857f)
                reflectiveCurveToRelative(-10.0f, -3.076f, -10.0f, -6.857f)
                close()
                moveTo(7.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cauldron!!
    }

private var _cauldron: ImageVector? = null
