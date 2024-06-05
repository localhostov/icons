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

public val Icons.Outline.MedicalStar: ImageVector
    get() {
        if (_medicalStar != null) {
            return _medicalStar!!
        }
        _medicalStar = Builder(name = "MedicalStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.192f, 18.267f)
                curveToRelative(-0.188f, 0.308f, -0.517f, 0.478f, -0.854f, 0.478f)
                curveToRelative(-0.178f, 0.0f, -0.358f, -0.048f, -0.521f, -0.147f)
                lineToRelative(-7.858f, -4.812f)
                verticalLineToRelative(9.215f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-9.215f)
                lineToRelative(-7.858f, 4.812f)
                curveToRelative(-0.163f, 0.1f, -0.344f, 0.147f, -0.521f, 0.147f)
                curveToRelative(-0.337f, 0.0f, -0.665f, -0.17f, -0.854f, -0.478f)
                curveToRelative(-0.289f, -0.472f, -0.141f, -1.087f, 0.33f, -1.375f)
                lineToRelative(7.989f, -4.892f)
                lineTo(2.056f, 7.108f)
                curveToRelative(-0.471f, -0.288f, -0.619f, -0.903f, -0.33f, -1.375f)
                curveToRelative(0.288f, -0.47f, 0.902f, -0.619f, 1.375f, -0.33f)
                lineToRelative(7.858f, 4.812f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(9.215f)
                lineToRelative(7.858f, -4.812f)
                curveToRelative(0.473f, -0.289f, 1.087f, -0.14f, 1.375f, 0.33f)
                curveToRelative(0.289f, 0.472f, 0.141f, 1.087f, -0.33f, 1.375f)
                lineToRelative(-7.989f, 4.892f)
                lineToRelative(7.989f, 4.892f)
                curveToRelative(0.471f, 0.288f, 0.619f, 0.903f, 0.33f, 1.375f)
                close()
            }
        }
        .build()
        return _medicalStar!!
    }

private var _medicalStar: ImageVector? = null
