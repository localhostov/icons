package me.localx.icons.straight.outline

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

public val Icons.Outline.CirclePhoneFlip: ImageVector
    get() {
        if (_circlePhoneFlip != null) {
            return _circlePhoneFlip!!
        }
        _circlePhoneFlip = Builder(name = "CirclePhoneFlip", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.0f, 15.827f)
                lineToRelative(1.378f, 1.378f)
                curveToRelative(0.539f, 0.54f, 1.249f, 0.795f, 1.957f, 0.795f)
                curveToRelative(3.634f, 0.0f, 8.666f, -4.752f, 8.666f, -8.666f)
                curveToRelative(0.0f, -0.708f, -0.256f, -1.418f, -0.795f, -1.957f)
                lineToRelative(-1.378f, -1.378f)
                lineToRelative(-2.712f, 2.712f)
                lineToRelative(1.775f, 1.775f)
                curveToRelative(-0.882f, 2.195f, -2.376f, 3.629f, -4.403f, 4.403f)
                lineToRelative(-1.775f, -1.775f)
                lineToRelative(-2.712f, 2.712f)
                close()
            }
        }
        .build()
        return _circlePhoneFlip!!
    }

private var _circlePhoneFlip: ImageVector? = null
