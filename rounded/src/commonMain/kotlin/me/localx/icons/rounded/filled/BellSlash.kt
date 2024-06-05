package me.localx.icons.rounded.filled

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

public val Icons.Filled.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.93f, 2.93f)
                curveToRelative(1.716f, -1.99f, 4.234f, -3.223f, 7.038f, -3.223f)
                curveToRelative(4.171f, 0.0f, 7.865f, 2.807f, 8.981f, 6.826f)
                lineToRelative(1.736f, 5.723f)
                curveToRelative(0.464f, 1.531f, 0.184f, 3.146f, -0.77f, 4.43f)
                curveToRelative(-0.472f, 0.637f, -1.07f, 1.138f, -1.748f, 1.482f)
                lineToRelative(3.832f, 3.832f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(12.0f, 24.0f)
                curveToRelative(2.045f, 0.0f, 3.802f, -1.237f, 4.576f, -3.0f)
                lineTo(7.424f, 21.0f)
                curveToRelative(0.774f, 1.763f, 2.531f, 3.0f, 4.576f, 3.0f)
                close()
                moveTo(2.689f, 6.872f)
                curveToRelative(-0.037f, 0.136f, -0.078f, 0.269f, -0.109f, 0.408f)
                lineToRelative(-1.348f, 5.537f)
                curveToRelative(-0.365f, 1.5f, -0.028f, 3.058f, 0.927f, 4.271f)
                curveToRelative(0.954f, 1.215f, 2.387f, 1.911f, 3.931f, 1.911f)
                horizontalLineToRelative(8.726f)
                lineTo(2.689f, 6.872f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
