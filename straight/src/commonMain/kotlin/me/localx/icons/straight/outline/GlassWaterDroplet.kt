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

public val Icons.Outline.GlassWaterDroplet: ImageVector
    get() {
        if (_glassWaterDroplet != null) {
            return _glassWaterDroplet!!
        }
        _glassWaterDroplet = Builder(name = "GlassWaterDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.857f, 0.0f)
                lineTo(1.083f, 0.0f)
                lineToRelative(1.747f, 21.246f)
                curveToRelative(0.126f, 1.544f, 1.44f, 2.754f, 2.99f, 2.754f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.566f, 0.0f, 2.851f, -1.177f, 2.988f, -2.737f)
                lineTo(22.857f, 0.0f)
                close()
                moveTo(20.673f, 2.0f)
                lineToRelative(-1.171f, 13.319f)
                curveToRelative(-0.376f, 0.427f, -0.924f, 0.681f, -1.503f, 0.681f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.671f, 0.0f, -1.295f, -0.335f, -1.667f, -0.896f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(3.254f, 2.0f, 3.254f, 2.0f)
                horizontalLineToRelative(17.419f)
                close()
                moveTo(17.999f, 22.0f)
                lineTo(5.82f, 22.0f)
                curveToRelative(-0.517f, 0.0f, -0.955f, -0.403f, -0.997f, -0.918f)
                lineToRelative(-0.276f, -3.354f)
                curveToRelative(0.456f, 0.177f, 0.947f, 0.272f, 1.452f, 0.272f)
                curveToRelative(1.193f, 0.0f, 2.267f, -0.525f, 3.0f, -1.357f)
                curveToRelative(0.733f, 0.832f, 1.807f, 1.357f, 3.0f, 1.357f)
                reflectiveCurveToRelative(2.267f, -0.525f, 3.0f, -1.357f)
                curveToRelative(0.733f, 0.832f, 1.807f, 1.357f, 3.0f, 1.357f)
                curveToRelative(0.443f, 0.0f, 0.877f, -0.074f, 1.286f, -0.214f)
                lineToRelative(-0.29f, 3.301f)
                curveToRelative(-0.046f, 0.521f, -0.474f, 0.913f, -0.996f, 0.913f)
                close()
                moveTo(11.999f, 12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -2.0f, -2.347f, -4.292f, -2.818f, -4.731f)
                lineToRelative(-0.682f, -0.637f)
                lineToRelative(-0.682f, 0.637f)
                curveToRelative(-0.471f, 0.439f, -2.818f, 2.731f, -2.818f, 4.731f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(11.999f, 5.938f)
                curveToRelative(0.748f, 0.845f, 1.5f, 1.927f, 1.5f, 2.562f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.635f, 0.752f, -1.717f, 1.5f, -2.562f)
                close()
            }
        }
        .build()
        return _glassWaterDroplet!!
    }

private var _glassWaterDroplet: ImageVector? = null
