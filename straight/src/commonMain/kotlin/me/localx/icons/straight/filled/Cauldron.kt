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

public val Icons.Filled.Cauldron: ImageVector
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
                curveToRelative(0.0f, -3.016f, -1.56f, -5.616f, -2.726f, -7.142f)
                horizontalLineToRelative(1.727f)
                reflectiveCurveToRelative(0.0f, -2.001f, 0.0f, -2.001f)
                lineToRelative(-22.0f, 0.009f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(1.721f, 0.0f, 1.721f, 0.0f)
                curveToRelative(-1.166f, 1.527f, -2.72f, 4.124f, -2.72f, 7.135f)
                curveToRelative(0.0f, 2.107f, 1.005f, 4.042f, 2.676f, 5.564f)
                lineToRelative(-1.747f, 1.953f)
                lineToRelative(1.49f, 1.334f)
                lineToRelative(1.861f, -2.08f)
                curveToRelative(2.089f, 1.3f, 4.781f, 2.086f, 7.72f, 2.086f)
                reflectiveCurveToRelative(5.632f, -0.787f, 7.721f, -2.087f)
                lineToRelative(1.869f, 2.089f)
                lineToRelative(1.49f, -1.334f)
                lineToRelative(-1.756f, -1.961f)
                curveToRelative(1.67f, -1.522f, 2.676f, -3.457f, 2.676f, -5.563f)
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
