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

public val Icons.Bold.Cauldron: ImageVector
    get() {
        if (_cauldron != null) {
            return _cauldron!!
        }
        _cauldron = Builder(name = "Cauldron", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.084f, 9.001f)
                horizontalLineToRelative(1.916f)
                reflectiveCurveToRelative(0.0f, -3.001f, 0.0f, -3.001f)
                lineTo(0.0f, 6.009f)
                verticalLineToRelative(3.0f)
                reflectiveCurveToRelative(1.912f, 0.0f, 1.912f, 0.0f)
                curveToRelative(-0.967f, 1.534f, -1.911f, 3.635f, -1.911f, 5.991f)
                curveToRelative(0.0f, 1.969f, 0.848f, 3.792f, 2.284f, 5.276f)
                lineToRelative(-1.549f, 1.721f)
                lineToRelative(2.229f, 2.007f)
                lineToRelative(1.698f, -1.887f)
                curveToRelative(2.03f, 1.18f, 4.576f, 1.883f, 7.337f, 1.883f)
                reflectiveCurveToRelative(5.307f, -0.703f, 7.337f, -1.883f)
                lineToRelative(1.698f, 1.887f)
                lineToRelative(2.229f, -2.007f)
                lineToRelative(-1.549f, -1.721f)
                curveToRelative(1.436f, -1.483f, 2.284f, -3.306f, 2.284f, -5.276f)
                curveToRelative(0.0f, -2.36f, -0.947f, -4.465f, -1.916f, -5.999f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, -2.671f, 1.822f, -5.054f, 2.644f, -5.993f)
                lineToRelative(12.705f, -0.005f)
                curveToRelative(0.819f, 0.94f, 2.651f, 3.339f, 2.651f, 5.998f)
                curveToRelative(0.0f, 3.252f, -4.122f, 6.0f, -9.0f, 6.0f)
                reflectiveCurveToRelative(-9.0f, -2.748f, -9.0f, -6.0f)
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
