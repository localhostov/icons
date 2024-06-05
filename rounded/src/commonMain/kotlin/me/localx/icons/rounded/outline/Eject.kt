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

public val Icons.Outline.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(0.432f, 15.809f)
                curveTo(0.14f, 15.232f, -0.008f, 14.621f, -0.008f, 13.991f)
                curveToRelative(0.0f, -0.843f, 0.271f, -1.657f, 0.783f, -2.355f)
                lineTo(8.834f, 2.562f)
                curveToRelative(0.702f, -0.965f, 1.877f, -1.562f, 3.166f, -1.562f)
                curveToRelative(1.272f, 0.0f, 2.434f, 0.581f, 3.195f, 1.595f)
                lineToRelative(7.963f, 8.969f)
                curveToRelative(0.968f, 1.312f, 1.096f, 2.871f, 0.401f, 4.245f)
                curveToRelative(-0.695f, 1.373f, -2.029f, 2.191f, -3.567f, 2.191f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-1.538f, 0.0f, -2.872f, -0.819f, -3.567f, -2.191f)
                close()
                moveTo(1.992f, 13.991f)
                curveToRelative(0.0f, 0.312f, 0.076f, 0.62f, 0.225f, 0.914f)
                curveToRelative(0.353f, 0.696f, 1.002f, 1.095f, 1.783f, 1.095f)
                horizontalLineToRelative(15.993f)
                curveToRelative(0.78f, 0.0f, 1.43f, -0.399f, 1.783f, -1.095f)
                curveToRelative(0.353f, -0.696f, 0.29f, -1.457f, -0.171f, -2.085f)
                lineTo(13.611f, 3.817f)
                curveToRelative(-0.38f, -0.519f, -0.967f, -0.817f, -1.611f, -0.817f)
                reflectiveCurveToRelative(-1.231f, 0.298f, -1.611f, 0.817f)
                lineTo(2.329f, 12.893f)
                curveToRelative(-0.2f, 0.28f, -0.337f, 0.685f, -0.337f, 1.099f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
