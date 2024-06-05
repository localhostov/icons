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

public val Icons.Outline.Dinner: ImageVector
    get() {
        if (_dinner != null) {
            return _dinner!!
        }
        _dinner = Builder(name = "Dinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                curveToRelative(0.0f, -2.375f, -1.971f, -8.0f, -5.078f, -8.0f)
                curveToRelative(-3.062f, 0.0f, -4.922f, 5.557f, -4.922f, 8.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(11.101f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.101f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.484f, 4.0f, -4.899f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -2.172f, 1.689f, -6.0f, 2.922f, -6.0f)
                curveToRelative(1.269f, 0.0f, 3.078f, 3.881f, 3.078f, 6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.414f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.707f, -2.707f)
                verticalLineToRelative(-4.586f)
                close()
                moveTo(16.0f, 17.274f)
                verticalLineToRelative(2.707f)
                curveToRelative(-1.674f, 1.262f, -3.748f, 2.019f, -6.0f, 2.019f)
                curveTo(4.486f, 22.0f, 0.0f, 17.514f, 0.0f, 12.0f)
                reflectiveCurveTo(4.486f, 2.0f, 10.0f, 2.0f)
                curveToRelative(1.167f, 0.0f, 2.284f, 0.211f, 3.326f, 0.581f)
                curveToRelative(-0.281f, 0.617f, -0.519f, 1.249f, -0.708f, 1.868f)
                curveToRelative(-0.822f, -0.286f, -1.7f, -0.449f, -2.618f, -0.449f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(2.39f, 0.0f, 4.533f, -1.059f, 6.0f, -2.726f)
                close()
            }
        }
        .build()
        return _dinner!!
    }

private var _dinner: ImageVector? = null
