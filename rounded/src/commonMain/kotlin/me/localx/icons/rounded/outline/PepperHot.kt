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

public val Icons.Outline.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.172f)
                arcToRelative(1.01f, 1.01f, 0.0f, true, true, 2.0f, -0.006f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.707f, 1.713f)
                arcTo(4.445f, 4.445f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 8.0f)
                arcToRelative(2.434f, 2.434f, 0.0f, false, false, -0.707f, -1.707f)
                arcTo(4.382f, 4.382f, 0.0f, false, true, 3.0f, 3.172f)
                close()
                moveTo(9.0f, 6.692f)
                arcTo(1.019f, 1.019f, 0.0f, true, false, 11.0f, 7.0f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 9.707f, 3.571f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 9.0f, 1.864f)
                lineTo(9.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.0f)
                verticalLineToRelative(0.864f)
                arcTo(4.386f, 4.386f, 0.0f, false, false, 8.293f, 4.986f)
                arcTo(2.394f, 2.394f, 0.0f, false, true, 9.0f, 6.692f)
                close()
                moveTo(24.0f, 11.0f)
                arcTo(12.482f, 12.482f, 0.0f, false, true, 12.0f, 24.0f)
                arcToRelative(11.912f, 11.912f, 0.0f, false, true, -8.4f, -3.437f)
                curveTo(1.038f, 18.525f, -2.665f, 9.481f, 2.649f, 9.0f)
                arcToRelative(2.634f, 2.634f, 0.0f, false, true, 2.569f, 2.064f)
                curveTo(6.123f, 15.0f, 7.923f, 15.0f, 8.515f, 15.0f)
                curveToRelative(2.033f, 0.0f, 3.465f, -1.626f, 3.485f, -3.953f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, true, 4.955f, -5.941f)
                curveTo(16.687f, 2.351f, 15.171f, 2.0f, 14.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(1.752f, 0.0f, 4.618f, 0.687f, 4.965f, 5.085f)
                arcTo(6.018f, 6.018f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(15.633f, 7.8f)
                arcToRelative(2.956f, 2.956f, 0.0f, false, false, 4.733f, 0.0f)
                arcTo(3.926f, 3.926f, 0.0f, false, false, 15.633f, 7.8f)
                close()
                moveTo(22.0f, 11.0f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, -0.348f, -1.622f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, true, -7.281f, 0.028f)
                arcTo(4.157f, 4.157f, 0.0f, false, false, 14.0f, 11.064f)
                curveTo(13.972f, 14.448f, 11.614f, 17.0f, 8.515f, 17.0f)
                curveToRelative(-1.818f, 0.0f, -4.2f, -0.952f, -5.246f, -5.488f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, false, -1.261f, 0.11f)
                curveTo(2.251f, 25.7f, 22.186f, 25.261f, 22.0f, 11.0f)
                close()
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.076f, 0.0f, 0.075f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
