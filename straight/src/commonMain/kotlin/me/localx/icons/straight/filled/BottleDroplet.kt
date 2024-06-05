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

public val Icons.Filled.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 13.938f)
                curveToRelative(0.748f, 0.845f, 1.5f, 1.927f, 1.5f, 2.562f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.636f, 0.752f, -1.718f, 1.5f, -2.562f)
                close()
                moveTo(20.0f, 11.942f)
                verticalLineToRelative(12.059f)
                lineTo(4.0f, 24.001f)
                verticalLineToRelative(-12.059f)
                curveToRelative(0.0f, -1.222f, 0.547f, -2.359f, 1.501f, -3.123f)
                lineToRelative(3.499f, -2.799f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.02f)
                lineToRelative(3.499f, 2.799f)
                curveToRelative(0.954f, 0.764f, 1.501f, 1.901f, 1.501f, 3.123f)
                close()
                moveTo(15.5f, 16.501f)
                curveToRelative(0.0f, -2.0f, -2.348f, -4.292f, -2.817f, -4.731f)
                lineToRelative(-0.683f, -0.637f)
                lineToRelative(-0.683f, 0.637f)
                curveToRelative(-0.47f, 0.439f, -2.817f, 2.731f, -2.817f, 4.731f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
