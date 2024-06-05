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

public val Icons.Outline.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.956f, 19.408f)
                lineToRelative(-1.956f, -11.492f)
                verticalLineToRelative(-1.915f)
                curveTo(20.0f, 0.0f, 14.394f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 0.0f, 4.0f, 6.0f)
                verticalLineToRelative(1.915f)
                lineToRelative(-1.959f, 11.519f)
                curveToRelative(-0.165f, 1.148f, 0.177f, 2.31f, 0.938f, 3.187f)
                reflectiveCurveToRelative(1.862f, 1.379f, 3.022f, 1.379f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.16f, 0.0f, 2.262f, -0.503f, 3.022f, -1.379f)
                reflectiveCurveToRelative(1.102f, -2.038f, 0.934f, -3.213f)
                close()
                moveTo(9.0f, 2.249f)
                verticalLineToRelative(1.751f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0.316f, -0.014f, 0.649f, -0.02f, 1.0f, -0.02f)
                reflectiveCurveToRelative(0.684f, 0.007f, 1.0f, 0.02f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.751f)
                curveToRelative(2.166f, 0.46f, 3.0f, 1.6f, 3.0f, 3.751f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.152f, 0.834f, -3.291f, 3.0f, -3.751f)
                close()
                moveTo(19.511f, 21.311f)
                curveToRelative(-0.38f, 0.438f, -0.931f, 0.689f, -1.511f, 0.689f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-0.58f, 0.0f, -1.131f, -0.251f, -1.511f, -0.689f)
                curveToRelative(-0.38f, -0.438f, -0.551f, -1.019f, -0.473f, -1.567f)
                lineToRelative(1.828f, -10.744f)
                horizontalLineToRelative(12.312f)
                lineToRelative(1.824f, 10.717f)
                curveToRelative(0.082f, 0.574f, -0.089f, 1.155f, -0.469f, 1.593f)
                close()
                moveTo(14.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
