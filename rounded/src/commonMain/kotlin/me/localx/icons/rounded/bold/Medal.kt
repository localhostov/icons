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

public val Icons.Bold.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.157f, 14.41f)
                curveToRelative(0.0f, 0.361f, -0.251f, 0.665f, -0.539f, 0.825f)
                lineToRelative(-1.49f, 0.828f)
                lineToRelative(0.661f, 1.803f)
                curveToRelative(0.128f, 0.349f, 0.012f, 0.741f, -0.285f, 0.965f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.304f, 0.229f, -0.723f, 0.226f, -1.023f, -0.007f)
                lineToRelative(-1.482f, -1.146f)
                lineToRelative(-1.482f, 1.146f)
                curveToRelative(-0.301f, 0.232f, -0.72f, 0.235f, -1.023f, 0.007f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.297f, -0.224f, -0.413f, -0.615f, -0.285f, -0.965f)
                lineToRelative(0.661f, -1.803f)
                lineToRelative(-1.49f, -0.828f)
                curveToRelative(-0.288f, -0.16f, -0.539f, -0.464f, -0.539f, -0.825f)
                curveToRelative(0.0f, -0.306f, 0.266f, -0.644f, 0.696f, -0.644f)
                horizontalLineToRelative(2.14f)
                lineToRelative(0.567f, -2.175f)
                curveToRelative(0.09f, -0.345f, 0.399f, -0.585f, 0.755f, -0.591f)
                curveToRelative(0.355f, 0.007f, 0.665f, 0.246f, 0.755f, 0.591f)
                lineToRelative(0.567f, 2.175f)
                horizontalLineToRelative(2.14f)
                curveToRelative(0.43f, 0.0f, 0.696f, 0.337f, 0.696f, 0.644f)
                close()
                moveTo(22.24f, 3.594f)
                lineToRelative(-3.001f, 6.066f)
                curveToRelative(1.106f, 1.495f, 1.761f, 3.343f, 1.761f, 5.341f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.962f, 3.0f, 15.0f)
                curveToRelative(0.0f, -1.992f, 0.651f, -3.834f, 1.751f, -5.327f)
                lineTo(1.75f, 3.591f)
                curveToRelative(-0.383f, -0.776f, -0.339f, -1.68f, 0.118f, -2.416f)
                curveToRelative(0.457f, -0.736f, 1.248f, -1.175f, 2.114f, -1.175f)
                horizontalLineToRelative(2.479f)
                curveToRelative(1.726f, 0.0f, 3.272f, 0.961f, 4.036f, 2.509f)
                lineToRelative(1.496f, 3.033f)
                lineToRelative(1.503f, -3.037f)
                curveToRelative(0.764f, -1.545f, 2.31f, -2.504f, 4.033f, -2.504f)
                horizontalLineToRelative(2.479f)
                curveToRelative(0.867f, 0.0f, 1.658f, 0.44f, 2.115f, 1.177f)
                curveToRelative(0.457f, 0.736f, 0.5f, 1.64f, 0.116f, 2.417f)
                close()
                moveTo(16.185f, 3.835f)
                lineToRelative(-1.305f, 2.638f)
                curveToRelative(0.742f, 0.251f, 1.441f, 0.598f, 2.083f, 1.024f)
                lineToRelative(2.224f, -4.496f)
                horizontalLineToRelative(-1.657f)
                curveToRelative(-0.575f, 0.0f, -1.09f, 0.32f, -1.345f, 0.834f)
                close()
                moveTo(4.804f, 3.001f)
                lineToRelative(2.221f, 4.504f)
                curveToRelative(0.642f, -0.427f, 1.341f, -0.775f, 2.084f, -1.027f)
                lineToRelative(-1.302f, -2.64f)
                curveToRelative(-0.254f, -0.516f, -0.77f, -0.836f, -1.345f, -0.836f)
                horizontalLineToRelative(-1.658f)
                close()
                moveTo(18.0f, 15.001f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
