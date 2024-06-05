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

public val Icons.Bold.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 12.0f)
                curveToRelative(0.0f, -3.783f, 2.42f, -7.178f, 6.021f, -8.45f)
                lineToRelative(3.547f, -1.252f)
                lineToRelative(-3.435f, -1.532f)
                curveToRelative(-1.155f, -0.516f, -2.507f, -0.766f, -4.134f, -0.766f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.621f, 0.0f, 2.848f, -0.226f, 4.101f, -0.756f)
                lineToRelative(3.562f, -1.506f)
                lineToRelative(-3.646f, -1.29f)
                curveToRelative(-3.599f, -1.273f, -6.017f, -4.668f, -6.017f, -8.448f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.354f, 6.537f, 3.52f, 11.061f, 3.049f)
                curveToRelative(-2.526f, 2.229f, -4.061f, 5.466f, -4.061f, 8.951f)
                reflectiveCurveToRelative(1.534f, 6.722f, 4.061f, 8.951f)
                curveToRelative(-4.523f, -0.471f, -8.061f, -4.306f, -8.061f, -8.951f)
                close()
                moveTo(24.0f, 10.833f)
                lineToRelative(-2.545f, 1.736f)
                lineToRelative(1.059f, 3.319f)
                lineToRelative(-0.682f, 0.476f)
                lineToRelative(-2.819f, -1.948f)
                lineToRelative(-2.776f, 1.948f)
                lineToRelative(-0.656f, -0.494f)
                lineToRelative(0.984f, -3.351f)
                lineToRelative(-2.566f, -1.68f)
                verticalLineToRelative(-0.839f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.07f, -3.636f)
                horizontalLineToRelative(0.882f)
                lineToRelative(1.069f, 3.636f)
                horizontalLineToRelative(3.478f)
                verticalLineToRelative(0.833f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
