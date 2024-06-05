package me.localx.icons.rounded.bold

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

public val Icons.Bold.PersonDress: ImageVector
    get() {
        if (_personDress != null) {
            return _personDress!!
        }
        _personDress = Builder(name = "PersonDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.526f, 14.594f)
                curveToRelative(-0.289f, 0.271f, -0.658f, 0.406f, -1.026f, 0.406f)
                curveToRelative(-0.4f, 0.0f, -0.799f, -0.159f, -1.094f, -0.474f)
                lineToRelative(-0.782f, -0.833f)
                lineToRelative(0.318f, 2.334f)
                curveToRelative(0.136f, 1.002f, -0.167f, 2.013f, -0.832f, 2.774f)
                curveToRelative(-0.312f, 0.358f, -0.693f, 0.636f, -1.111f, 0.839f)
                verticalLineToRelative(2.859f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.859f)
                curveToRelative(-0.417f, -0.203f, -0.799f, -0.481f, -1.111f, -0.839f)
                curveToRelative(-0.665f, -0.761f, -0.968f, -1.772f, -0.832f, -2.774f)
                lineToRelative(0.318f, -2.334f)
                lineToRelative(-0.782f, 0.833f)
                curveToRelative(-0.295f, 0.314f, -0.694f, 0.473f, -1.094f, 0.473f)
                curveToRelative(-0.368f, 0.0f, -0.737f, -0.135f, -1.026f, -0.406f)
                curveToRelative(-0.604f, -0.567f, -0.634f, -1.517f, -0.067f, -2.121f)
                curveToRelative(0.0f, 0.0f, 4.755f, -5.038f, 4.783f, -5.063f)
                curveToRelative(0.854f, -0.865f, 2.025f, -1.41f, 3.311f, -1.41f)
                reflectiveCurveToRelative(2.457f, 0.544f, 3.311f, 1.409f)
                curveToRelative(0.028f, 0.026f, 4.783f, 5.064f, 4.783f, 5.064f)
                curveToRelative(0.567f, 0.604f, 0.537f, 1.553f, -0.067f, 2.12f)
                close()
                moveTo(12.5f, 9.0f)
                curveToRelative(-0.83f, 0.0f, -1.541f, 0.62f, -1.653f, 1.443f)
                lineToRelative(-0.817f, 5.99f)
                curveToRelative(-0.027f, 0.196f, 0.063f, 0.333f, 0.119f, 0.396f)
                curveToRelative(0.056f, 0.064f, 0.179f, 0.171f, 0.377f, 0.171f)
                horizontalLineToRelative(3.948f)
                curveToRelative(0.198f, 0.0f, 0.321f, -0.107f, 0.377f, -0.171f)
                curveToRelative(0.056f, -0.063f, 0.146f, -0.2f, 0.119f, -0.396f)
                lineToRelative(-0.817f, -5.99f)
                curveToRelative(-0.112f, -0.823f, -0.823f, -1.443f, -1.653f, -1.443f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
