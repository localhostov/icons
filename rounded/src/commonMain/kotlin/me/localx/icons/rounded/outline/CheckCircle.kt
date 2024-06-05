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

public val Icons.Outline.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(name = "CheckCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.214f, 9.098f)
                curveToRelative(0.387f, 0.394f, 0.381f, 1.027f, -0.014f, 1.414f)
                lineToRelative(-4.426f, 4.345f)
                curveToRelative(-0.783f, 0.768f, -1.791f, 1.151f, -2.8f, 1.151f)
                curveToRelative(-0.998f, 0.0f, -1.996f, -0.376f, -2.776f, -1.129f)
                lineToRelative(-1.899f, -1.867f)
                curveToRelative(-0.394f, -0.387f, -0.399f, -1.02f, -0.012f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.021f, -0.4f, 1.414f, -0.012f)
                lineToRelative(1.893f, 1.861f)
                curveToRelative(0.776f, 0.75f, 2.001f, 0.746f, 2.781f, -0.018f)
                lineToRelative(4.425f, -4.344f)
                curveToRelative(0.393f, -0.388f, 1.024f, -0.381f, 1.414f, 0.013f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
