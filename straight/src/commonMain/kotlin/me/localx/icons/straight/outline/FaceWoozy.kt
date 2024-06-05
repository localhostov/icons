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

public val Icons.Outline.FaceWoozy: ImageVector
    get() {
        if (_faceWoozy != null) {
            return _faceWoozy!!
        }
        _faceWoozy = Builder(name = "FaceWoozy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.37f, 9.334f)
                lineToRelative(-0.742f, -1.857f)
                curveToRelative(1.188f, -0.474f, 2.268f, -1.373f, 3.04f, -2.531f)
                lineToRelative(1.664f, 1.109f)
                curveToRelative(-1.01f, 1.514f, -2.38f, 2.647f, -3.962f, 3.279f)
                close()
                moveTo(14.0f, 10.0f)
                curveToRelative(0.0f, -1.657f, 0.672f, -3.0f, 1.5f, -3.0f)
                reflectiveCurveToRelative(1.5f, 1.343f, 1.5f, 3.0f)
                reflectiveCurveToRelative(-0.672f, 3.0f, -1.5f, 3.0f)
                reflectiveCurveToRelative(-1.5f, -1.343f, -1.5f, -3.0f)
                close()
                moveTo(6.553f, 11.105f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(0.895f, 1.789f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(-0.895f, -1.789f)
                close()
                moveTo(17.135f, 14.499f)
                lineToRelative(1.731f, 1.0f)
                curveToRelative(-0.337f, 0.584f, -2.129f, 3.5f, -4.289f, 3.5f)
                curveToRelative(-0.903f, 0.0f, -1.609f, -0.68f, -2.232f, -1.28f)
                curveToRelative(-0.263f, -0.252f, -0.702f, -0.676f, -0.884f, -0.724f)
                curveToRelative(-0.149f, 0.003f, -0.338f, 0.124f, -0.656f, 0.335f)
                curveToRelative(-0.423f, 0.282f, -1.002f, 0.668f, -1.805f, 0.668f)
                curveToRelative(-1.276f, 0.0f, -3.018f, -1.604f, -3.707f, -2.293f)
                lineToRelative(1.414f, -1.415f)
                curveToRelative(0.85f, 0.849f, 1.951f, 1.663f, 2.311f, 1.708f)
                curveToRelative(0.171f, 0.0f, 0.359f, -0.121f, 0.678f, -0.333f)
                curveToRelative(0.423f, -0.282f, 1.002f, -0.668f, 1.805f, -0.668f)
                curveToRelative(0.903f, 0.0f, 1.609f, 0.68f, 2.232f, 1.28f)
                curveToRelative(0.263f, 0.252f, 0.702f, 0.676f, 0.884f, 0.724f)
                curveToRelative(0.684f, -0.003f, 1.91f, -1.456f, 2.519f, -2.504f)
                close()
            }
        }
        .build()
        return _faceWoozy!!
    }

private var _faceWoozy: ImageVector? = null
