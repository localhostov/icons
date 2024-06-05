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

public val Icons.Outline.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.499f, 8.818f)
                lineToRelative(-3.499f, -2.799f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.02f)
                lineToRelative(-3.499f, 2.799f)
                curveToRelative(-0.954f, 0.764f, -1.501f, 1.901f, -1.501f, 3.123f)
                verticalLineToRelative(12.059f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-12.059f)
                curveToRelative(0.0f, -1.222f, -0.547f, -2.359f, -1.501f, -3.123f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-10.059f)
                curveToRelative(0.0f, -0.61f, 0.273f, -1.18f, 0.751f, -1.561f)
                lineToRelative(4.249f, -3.4f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.98f)
                lineToRelative(4.249f, 3.4f)
                curveToRelative(0.478f, 0.381f, 0.751f, 0.95f, 0.751f, 1.561f)
                verticalLineToRelative(10.059f)
                close()
                moveTo(12.683f, 11.769f)
                lineToRelative(-0.683f, -0.637f)
                lineToRelative(-0.683f, 0.637f)
                curveToRelative(-0.47f, 0.439f, -2.817f, 2.731f, -2.817f, 4.731f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -2.0f, -2.348f, -4.292f, -2.817f, -4.731f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.636f, 0.752f, -1.718f, 1.5f, -2.562f)
                curveToRelative(0.748f, 0.845f, 1.5f, 1.927f, 1.5f, 2.562f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
