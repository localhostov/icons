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

public val Icons.Bold.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.003f, -1.64f)
                lineToRelative(-3.734f, -3.466f)
                curveTo(-0.066f, 14.548f, -0.066f, 7.543f, 4.219f, 3.238f)
                curveTo(6.296f, 1.15f, 9.06f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.703f, 1.15f, 7.78f, 3.238f)
                curveToRelative(4.285f, 4.305f, 4.285f, 11.31f, 0.0f, 15.615f)
                lineToRelative(-3.808f, 3.537f)
                curveToRelative(-1.046f, 1.028f, -2.468f, 1.61f, -3.973f, 1.61f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-2.136f, 0.0f, -4.144f, 0.836f, -5.654f, 2.354f)
                curveToRelative(-3.124f, 3.138f, -3.124f, 8.245f, 0.0f, 11.383f)
                lineToRelative(3.723f, 3.455f)
                curveToRelative(1.085f, 1.063f, 2.81f, 1.035f, 3.833f, 0.029f)
                lineToRelative(3.796f, -3.524f)
                curveToRelative(3.081f, -3.097f, 3.081f, -8.204f, -0.042f, -11.342f)
                curveToRelative(-1.511f, -1.518f, -3.519f, -2.354f, -5.654f, -2.354f)
                close()
                moveTo(13.5f, 13.5f)
                verticalLineToRelative(-0.748f)
                curveToRelative(0.0f, -0.596f, 0.245f, -1.122f, 0.64f, -1.372f)
                curveToRelative(1.475f, -0.935f, 2.168f, -2.712f, 1.727f, -4.422f)
                curveToRelative(-0.353f, -1.363f, -1.461f, -2.472f, -2.825f, -2.825f)
                curveToRelative(-1.229f, -0.317f, -2.501f, -0.062f, -3.489f, 0.703f)
                curveToRelative(-0.986f, 0.764f, -1.552f, 1.917f, -1.552f, 3.164f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.312f, 0.142f, -0.6f, 0.389f, -0.792f)
                curveToRelative(0.146f, -0.113f, 0.455f, -0.286f, 0.901f, -0.17f)
                curveToRelative(0.314f, 0.082f, 0.59f, 0.357f, 0.671f, 0.671f)
                curveToRelative(0.142f, 0.549f, -0.128f, 0.947f, -0.428f, 1.137f)
                curveToRelative(-1.273f, 0.807f, -2.034f, 2.267f, -2.034f, 3.906f)
                verticalLineToRelative(0.748f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                close()
                moveTo(13.5f, 17.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
