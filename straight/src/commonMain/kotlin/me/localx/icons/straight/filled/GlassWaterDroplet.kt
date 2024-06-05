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

public val Icons.Filled.GlassWaterDroplet: ImageVector
    get() {
        if (_glassWaterDroplet != null) {
            return _glassWaterDroplet!!
        }
        _glassWaterDroplet = Builder(name = "GlassWaterDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.449f, 16.024f)
                lineToRelative(-0.461f, 5.238f)
                curveToRelative(-0.137f, 1.561f, -1.422f, 2.737f, -2.988f, 2.737f)
                lineTo(5.82f, 23.999f)
                curveToRelative(-1.55f, 0.0f, -2.863f, -1.21f, -2.99f, -2.754f)
                lineToRelative(-0.457f, -5.56f)
                curveToRelative(0.637f, 1.365f, 2.023f, 2.313f, 3.627f, 2.313f)
                curveToRelative(1.193f, 0.0f, 2.267f, -0.525f, 3.0f, -1.357f)
                curveToRelative(0.733f, 0.832f, 1.807f, 1.357f, 3.0f, 1.357f)
                reflectiveCurveToRelative(2.267f, -0.525f, 3.0f, -1.357f)
                curveToRelative(0.733f, 0.832f, 1.807f, 1.357f, 3.0f, 1.357f)
                curveToRelative(1.467f, 0.0f, 2.753f, -0.794f, 3.449f, -1.976f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.635f, -0.752f, -1.717f, -1.5f, -2.562f)
                curveToRelative(-0.748f, 0.845f, -1.5f, 1.927f, -1.5f, 2.562f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(2.235f, 14.0f)
                lineTo(1.083f, 0.0f)
                horizontalLineToRelative(21.774f)
                lineToRelative(-1.231f, 14.0f)
                horizontalLineToRelative(-1.627f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.765f)
                close()
                moveTo(8.5f, 8.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -2.0f, -2.347f, -4.292f, -2.818f, -4.731f)
                lineToRelative(-0.682f, -0.637f)
                lineToRelative(-0.682f, 0.637f)
                curveToRelative(-0.471f, 0.439f, -2.818f, 2.731f, -2.818f, 4.731f)
                close()
            }
        }
        .build()
        return _glassWaterDroplet!!
    }

private var _glassWaterDroplet: ImageVector? = null
