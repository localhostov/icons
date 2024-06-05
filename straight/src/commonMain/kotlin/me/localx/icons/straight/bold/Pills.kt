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

public val Icons.Bold.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveToRelative(0.554f, 0.0f, 1.082f, 0.113f, 1.562f, 0.317f)
                lineToRelative(-5.244f, 5.244f)
                curveToRelative(-0.204f, -0.48f, -0.317f, -1.008f, -0.317f, -1.562f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(17.0f, 21.0f)
                curveToRelative(-0.554f, 0.0f, -1.082f, -0.113f, -1.562f, -0.317f)
                lineToRelative(5.244f, -5.244f)
                curveToRelative(0.204f, 0.48f, 0.317f, 1.008f, 0.317f, 1.562f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(6.5f, 21.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.708f)
                curveToRelative(0.84f, -1.982f, 2.375f, -3.594f, 4.292f, -4.55f)
                verticalLineToRelative(-2.45f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveTo(0.0f, 2.916f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.365f, 0.0f, 2.631f, -0.425f, 3.678f, -1.146f)
                curveToRelative(-0.656f, -0.763f, -1.183f, -1.637f, -1.556f, -2.59f)
                curveToRelative(-0.591f, 0.455f, -1.321f, 0.736f, -2.122f, 0.736f)
                close()
                moveTo(6.5f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 10.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
