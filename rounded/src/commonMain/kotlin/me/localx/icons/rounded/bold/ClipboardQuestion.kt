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

public val Icons.Bold.ClipboardQuestion: ImageVector
    get() {
        if (_clipboardQuestion != null) {
            return _clipboardQuestion!!
        }
        _clipboardQuestion = Builder(name = "ClipboardQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.663f, 2.002f)
                curveToRelative(-0.562f, -1.183f, -1.769f, -2.002f, -3.163f, -2.002f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.395f, 0.0f, -2.601f, 0.819f, -3.163f, 2.002f)
                curveToRelative(-2.958f, 0.086f, -5.337f, 2.52f, -5.337f, 5.498f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0.0f, -2.978f, -2.379f, -5.411f, -5.337f, -5.498f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(13.5f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.867f, 8.959f)
                curveToRelative(0.489f, 1.894f, -0.431f, 3.858f, -2.187f, 4.671f)
                curveToRelative(-0.088f, 0.041f, -0.18f, 0.2f, -0.18f, 0.397f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.355f, 0.753f, -2.58f, 1.919f, -3.12f)
                curveToRelative(0.379f, -0.175f, 0.694f, -0.614f, 0.543f, -1.199f)
                curveToRelative(-0.081f, -0.314f, -0.357f, -0.59f, -0.67f, -0.67f)
                curveToRelative(-0.445f, -0.117f, -0.757f, 0.056f, -0.902f, 0.169f)
                curveToRelative(-0.248f, 0.191f, -0.389f, 0.48f, -0.389f, 0.792f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.247f, 0.566f, -2.4f, 1.553f, -3.164f)
                curveToRelative(0.988f, -0.764f, 2.26f, -1.02f, 3.49f, -0.702f)
                curveToRelative(1.363f, 0.352f, 2.472f, 1.461f, 2.824f, 2.825f)
                close()
            }
        }
        .build()
        return _clipboardQuestion!!
    }

private var _clipboardQuestion: ImageVector? = null
