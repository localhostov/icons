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

public val Icons.Bold.SurveillanceCamera: ImageVector
    get() {
        if (_surveillanceCamera != null) {
            return _surveillanceCamera!!
        }
        _surveillanceCamera = Builder(name = "SurveillanceCamera", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.073f)
                lineToRelative(0.415f, -0.829f)
                curveToRelative(0.232f, -0.465f, 0.208f, -1.018f, -0.066f, -1.46f)
                curveToRelative(-0.273f, -0.441f, -0.756f, -0.711f, -1.276f, -0.711f)
                lineTo(6.5f, -0.0f)
                curveTo(4.019f, 0.0f, 2.0f, 2.019f, 2.0f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.836f)
                lineToRelative(-1.267f, 3.378f)
                curveToRelative(-0.364f, 0.97f, -1.305f, 1.622f, -2.341f, 1.622f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.728f)
                curveToRelative(2.28f, 0.0f, 4.349f, -1.435f, 5.149f, -3.569f)
                lineToRelative(1.662f, -4.431f)
                horizontalLineToRelative(5.961f)
                close()
                moveTo(5.0f, 6.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(12.073f)
                lineToRelative(-0.415f, 0.829f)
                curveToRelative(-0.104f, 0.208f, -0.158f, 0.438f, -0.158f, 0.671f)
                verticalLineToRelative(3.5f)
                lineTo(6.5f, 8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(23.713f, 18.546f)
                curveToRelative(-0.954f, -1.449f, -2.903f, -3.546f, -6.2f, -3.546f)
                reflectiveCurveToRelative(-5.246f, 2.096f, -6.2f, 3.546f)
                curveToRelative(-0.383f, 0.582f, -0.383f, 1.327f, 0.0f, 1.909f)
                curveToRelative(0.954f, 1.448f, 2.904f, 3.546f, 6.2f, 3.546f)
                reflectiveCurveToRelative(5.247f, -2.097f, 6.2f, -3.546f)
                curveToRelative(0.383f, -0.582f, 0.383f, -1.326f, 0.0f, -1.909f)
                close()
                moveTo(17.513f, 21.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _surveillanceCamera!!
    }

private var _surveillanceCamera: ImageVector? = null
