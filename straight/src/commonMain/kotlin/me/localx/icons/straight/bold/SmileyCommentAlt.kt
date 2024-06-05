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

public val Icons.Bold.SmileyCommentAlt: ImageVector
    get() {
        if (_smileyCommentAlt != null) {
            return _smileyCommentAlt!!
        }
        _smileyCommentAlt = Builder(name = "SmileyCommentAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(-2.35f, 0.0f, -4.33f, -1.04f, -5.31f, -1.66f)
                lineToRelative(1.61f, -2.53f)
                curveToRelative(0.7f, 0.45f, 2.11f, 1.19f, 3.7f, 1.19f)
                reflectiveCurveToRelative(3.14f, -0.84f, 3.7f, -1.2f)
                lineToRelative(1.61f, 2.53f)
                curveToRelative(-0.98f, 0.62f, -2.96f, 1.66f, -5.32f, 1.66f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 6.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.62f, 23.07f)
                lineToRelative(3.71f, -3.07f)
                horizontalLineToRelative(6.67f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 20.0f)
                lineTo(6.74f, 20.0f)
                lineToRelative(3.6f, 3.03f)
                curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.67f, 0.64f)
                reflectiveCurveToRelative(1.16f, -0.2f, 1.61f, -0.6f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.25f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                close()
            }
        }
        .build()
        return _smileyCommentAlt!!
    }

private var _smileyCommentAlt: ImageVector? = null
