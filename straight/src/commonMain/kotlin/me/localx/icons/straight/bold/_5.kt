package me.localx.icons.straight.bold

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
                horizontalLineTo(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(12.5f)
                curveToRelative(1.228f, 0.0f, 2.375f, -0.485f, 3.23f, -1.367f)
                curveToRelative(0.854f, -0.881f, 1.305f, -2.043f, 1.268f, -3.272f)
                curveToRelative(-0.072f, -2.405f, -2.203f, -4.361f, -4.75f, -4.361f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
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
