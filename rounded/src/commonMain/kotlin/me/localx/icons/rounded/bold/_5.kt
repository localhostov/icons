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

public val Icons.Bold._5: ImageVector
    get() {
        if (__5 != null) {
            return __5!!
        }
        __5 = Builder(name = "_5", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 24.0f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.228f, 0.0f, 2.375f, -0.485f, 3.23f, -1.367f)
                curveToRelative(0.854f, -0.881f, 1.305f, -2.043f, 1.268f, -3.272f)
                curveToRelative(-0.072f, -2.405f, -2.203f, -4.361f, -4.75f, -4.361f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 2.019f, 6.019f, 0.0f, 8.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(8.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5.248f)
                curveToRelative(4.152f, 0.0f, 7.628f, 3.262f, 7.748f, 7.271f)
                curveToRelative(0.062f, 2.047f, -0.688f, 3.983f, -2.113f, 5.452f)
                curveToRelative(-1.425f, 1.469f, -3.337f, 2.278f, -5.383f, 2.278f)
                close()
            }
        }
        .build()
        return __5!!
    }

private var __5: ImageVector? = null
