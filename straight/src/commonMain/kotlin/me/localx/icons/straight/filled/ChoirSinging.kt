package me.localx.icons.straight.filled

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

public val Icons.Filled.ChoirSinging: ImageVector
    get() {
        if (_choirSinging != null) {
            return _choirSinging!!
        }
        _choirSinging = Builder(name = "ChoirSinging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15.0f, 12.982f)
                verticalLineToRelative(-4.075f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(4.075f)
                lineToRelative(-2.554f, -1.703f)
                curveToRelative(0.07f, -0.359f, 0.131f, -0.651f, 0.18f, -0.846f)
                curveToRelative(0.704f, -2.817f, 2.663f, -4.434f, 5.375f, -4.434f)
                reflectiveCurveToRelative(4.67f, 1.616f, 5.375f, 4.434f)
                curveToRelative(0.049f, 0.195f, 0.11f, 0.487f, 0.18f, 0.846f)
                lineToRelative(-2.554f, 1.703f)
                close()
                moveTo(4.685f, 9.948f)
                curveToRelative(-0.498f, 1.992f, -2.306f, 14.052f, -2.306f, 14.052f)
                lineTo(-0.036f, 24.0f)
                reflectiveCurveToRelative(1.763f, -11.721f, 2.224f, -13.566f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.001f, 0.0f, -0.001f)
                curveToRelative(0.634f, -2.538f, 2.328f, -4.082f, 4.631f, -4.367f)
                curveToRelative(-0.991f, 0.988f, -1.737f, 2.287f, -2.135f, 3.882f)
                close()
                moveTo(24.036f, 24.0f)
                horizontalLineToRelative(-2.414f)
                reflectiveCurveToRelative(-1.808f, -12.06f, -2.306f, -14.052f)
                curveToRelative(-0.399f, -1.595f, -1.145f, -2.895f, -2.135f, -3.882f)
                curveToRelative(2.304f, 0.285f, 3.997f, 1.829f, 4.631f, 4.367f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.001f, 0.0f, 0.001f)
                curveToRelative(0.461f, 1.846f, 2.224f, 13.566f, 2.224f, 13.566f)
                close()
                moveTo(17.938f, 13.428f)
                curveToRelative(0.621f, 3.659f, 1.661f, 10.572f, 1.661f, 10.572f)
                lineTo(4.401f, 24.0f)
                reflectiveCurveToRelative(1.04f, -6.913f, 1.661f, -10.572f)
                lineToRelative(3.858f, 2.572f)
                horizontalLineToRelative(4.16f)
                lineToRelative(3.858f, -2.572f)
                close()
                moveTo(6.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(7.381f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _choirSinging!!
    }

private var _choirSinging: ImageVector? = null
