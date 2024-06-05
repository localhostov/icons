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

public val Icons.Outline.SmileyCommentAlt: ImageVector
    get() {
        if (_smileyCommentAlt != null) {
            return _smileyCommentAlt!!
        }
        _smileyCommentAlt = Builder(name = "SmileyCommentAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 23.67f)
                curveToRelative(-0.48f, 0.0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(24.0f, 20.0f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.83f, 0.49f, -1.29f, 0.49f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(7.65f, 18.0f)
                lineToRelative(4.33f, 3.64f)
                lineToRelative(4.45f, -3.64f)
                horizontalLineToRelative(5.57f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(17.67f, 12.75f)
                lineToRelative(-1.33f, -1.49f)
                reflectiveCurveToRelative(-2.0f, 1.75f, -4.34f, 1.75f)
                reflectiveCurveToRelative(-4.32f, -1.73f, -4.33f, -1.75f)
                lineToRelative(-1.33f, 1.49f)
                curveToRelative(0.1f, 0.09f, 2.56f, 2.25f, 5.67f, 2.25f)
                reflectiveCurveToRelative(5.56f, -2.16f, 5.67f, -2.25f)
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
            }
        }
        .build()
        return _smileyCommentAlt!!
    }

private var _smileyCommentAlt: ImageVector? = null
