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
                moveTo(7.636f, 13.971f)
                lineToRelative(-1.302f, 1.0f)
                curveToRelative(-0.446f, 0.446f, -0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(0.522f, 0.6f)
                curveToRelative(0.551f, 0.552f, 1.277f, 0.813f, 2.0f, 0.813f)
                curveToRelative(3.714f, 0.0f, 9.143f, -5.143f, 9.143f, -9.143f)
                curveToRelative(0.0f, -0.723f, -0.261f, -1.449f, -0.813f, -2.0f)
                lineToRelative(-0.6f, -0.522f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                lineToRelative(-1.0f, 1.302f)
                curveToRelative(-0.446f, 0.446f, -0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(0.851f, 1.069f)
                curveToRelative(-0.901f, 2.244f, -2.429f, 3.71f, -4.5f, 4.5f)
                lineToRelative(-1.069f, -0.851f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                close()
            }
        }
        .build()
        return _circlePhoneFlip!!
    }

private var _circlePhoneFlip: ImageVector? = null
