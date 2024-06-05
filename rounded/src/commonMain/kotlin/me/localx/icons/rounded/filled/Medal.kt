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

public val Icons.Filled.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.305f, 2.87f)
                lineToRelative(-2.281f, 4.622f)
                curveToRelative(-1.639f, -1.751f, -3.84f, -2.96f, -6.319f, -3.347f)
                lineToRelative(0.945f, -1.915f)
                curveToRelative(0.679f, -1.376f, 2.053f, -2.23f, 3.587f, -2.23f)
                horizontalLineToRelative(2.283f)
                curveToRelative(0.692f, 0.0f, 1.324f, 0.351f, 1.689f, 0.939f)
                curveToRelative(0.366f, 0.588f, 0.401f, 1.31f, 0.095f, 1.931f)
                close()
                moveTo(10.295f, 4.145f)
                lineToRelative(-0.945f, -1.915f)
                curveToRelative(-0.679f, -1.376f, -2.053f, -2.23f, -3.587f, -2.23f)
                horizontalLineToRelative(-2.26f)
                curveToRelative(-0.692f, 0.0f, -1.324f, 0.351f, -1.689f, 0.938f)
                curveToRelative(-0.366f, 0.589f, -0.401f, 1.311f, -0.095f, 1.932f)
                lineToRelative(2.272f, 4.607f)
                curveToRelative(1.637f, -1.743f, 3.833f, -2.945f, 6.304f, -3.331f)
                close()
                moveTo(21.001f, 15.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(16.158f, 14.41f)
                curveToRelative(0.0f, -0.306f, -0.266f, -0.644f, -0.696f, -0.644f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-0.567f, -2.175f)
                curveToRelative(-0.09f, -0.345f, -0.399f, -0.585f, -0.755f, -0.591f)
                curveToRelative(-0.355f, 0.007f, -0.665f, 0.246f, -0.755f, 0.591f)
                lineToRelative(-0.567f, 2.175f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.43f, 0.0f, -0.696f, 0.337f, -0.696f, 0.644f)
                curveToRelative(0.0f, 0.361f, 0.251f, 0.665f, 0.539f, 0.825f)
                lineToRelative(1.49f, 0.828f)
                lineToRelative(-0.661f, 1.803f)
                curveToRelative(-0.128f, 0.349f, -0.012f, 0.741f, 0.285f, 0.965f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.304f, 0.229f, 0.723f, 0.226f, 1.023f, -0.007f)
                lineToRelative(1.482f, -1.146f)
                lineToRelative(1.482f, 1.146f)
                curveToRelative(0.301f, 0.232f, 0.72f, 0.235f, 1.023f, 0.007f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.297f, -0.224f, 0.413f, -0.615f, 0.285f, -0.965f)
                lineToRelative(-0.661f, -1.803f)
                lineToRelative(1.49f, -0.828f)
                curveToRelative(0.288f, -0.16f, 0.539f, -0.464f, 0.539f, -0.825f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
