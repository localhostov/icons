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

public val Icons.Filled.Meeting: ImageVector
    get() {
        if (_meeting != null) {
            return _meeting!!
        }
        _meeting = Builder(name = "Meeting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.928f, 9.0f)
                horizontalLineToRelative(0.072f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(0.202f)
                lineToRelative(1.834f, 1.617f)
                curveToRelative(0.29f, 0.256f, 0.653f, 0.384f, 1.016f, 0.384f)
                curveToRelative(0.358f, 0.0f, 0.716f, -0.126f, 0.998f, -0.376f)
                lineToRelative(1.878f, -1.624f)
                close()
                moveTo(5.5f, 18.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(15.0f, 14.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(5.5f, 19.0f)
                curveToRelative(-2.434f, 0.0f, -4.618f, 1.466f, -5.437f, 3.649f)
                curveToRelative(-0.115f, 0.307f, -0.072f, 0.651f, 0.114f, 0.921f)
                curveToRelative(0.188f, 0.27f, 0.494f, 0.43f, 0.822f, 0.43f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.328f, 0.0f, 0.635f, -0.161f, 0.822f, -0.43f)
                curveToRelative(0.187f, -0.27f, 0.229f, -0.614f, 0.114f, -0.921f)
                curveToRelative(-0.818f, -2.183f, -3.003f, -3.649f, -5.437f, -3.649f)
                close()
                moveTo(23.937f, 22.649f)
                curveToRelative(-0.818f, -2.183f, -3.003f, -3.649f, -5.437f, -3.649f)
                reflectiveCurveToRelative(-4.618f, 1.466f, -5.437f, 3.649f)
                curveToRelative(-0.115f, 0.307f, -0.072f, 0.651f, 0.114f, 0.921f)
                curveToRelative(0.188f, 0.27f, 0.494f, 0.43f, 0.822f, 0.43f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.328f, 0.0f, 0.635f, -0.161f, 0.822f, -0.43f)
                curveToRelative(0.187f, -0.27f, 0.229f, -0.614f, 0.114f, -0.921f)
                close()
            }
        }
        .build()
        return _meeting!!
    }

private var _meeting: ImageVector? = null
