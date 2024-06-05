package me.localx.icons.rounded.outline

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

public val Icons.Outline.TransformationCircle: ImageVector
    get() {
        if (_transformationCircle != null) {
            return _transformationCircle!!
        }
        _transformationCircle = Builder(name = "TransformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.995f, 5.0f)
                horizontalLineToRelative(-3.262f)
                curveToRelative(-0.652f, 0.0f, -0.978f, 0.788f, -0.517f, 1.249f)
                lineToRelative(1.061f, 1.061f)
                lineToRelative(-1.522f, 1.522f)
                curveToRelative(-1.448f, -1.143f, -3.271f, -1.832f, -5.254f, -1.832f)
                curveTo(3.813f, 7.0f, 0.0f, 10.813f, 0.0f, 15.5f)
                reflectiveCurveToRelative(3.813f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -1.984f, -0.688f, -3.806f, -1.832f, -5.254f)
                lineToRelative(1.522f, -1.522f)
                lineToRelative(1.061f, 1.061f)
                curveToRelative(0.461f, 0.461f, 1.249f, 0.134f, 1.249f, -0.517f)
                verticalLineToRelative(-3.262f)
                curveToRelative(0.0f, -0.555f, -0.45f, -1.005f, -1.005f, -1.005f)
                close()
                moveTo(8.5f, 22.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 2.698f, -1.239f, 5.177f, -3.399f, 6.8f)
                curveToRelative(-0.18f, 0.135f, -0.391f, 0.2f, -0.6f, 0.2f)
                curveToRelative(-0.304f, 0.0f, -0.604f, -0.138f, -0.801f, -0.399f)
                curveToRelative(-0.331f, -0.441f, -0.242f, -1.068f, 0.199f, -1.4f)
                curveToRelative(1.652f, -1.241f, 2.601f, -3.137f, 2.601f, -5.2f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.063f, 0.0f, -3.959f, 0.948f, -5.201f, 2.601f)
                curveToRelative(-0.331f, 0.441f, -0.957f, 0.529f, -1.4f, 0.199f)
                curveToRelative(-0.441f, -0.332f, -0.531f, -0.959f, -0.199f, -1.4f)
                curveToRelative(1.623f, -2.16f, 4.101f, -3.399f, 6.8f, -3.399f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null
