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

public val Icons.Bold.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.889f)
                curveToRelative(-1.174f, -1.126f, -1.889f, -2.707f, -1.889f, -4.404f)
                curveTo(2.0f, 2.734f, 4.734f, 0.0f, 8.095f, 0.0f)
                horizontalLineToRelative(7.81f)
                curveToRelative(3.361f, 0.0f, 6.095f, 2.734f, 6.095f, 6.096f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.904f)
                curveToRelative(0.0f, -1.707f, -1.389f, -3.096f, -3.095f, -3.096f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-1.707f, 0.0f, -3.095f, 1.389f, -3.095f, 3.096f)
                curveToRelative(0.0f, 1.372f, 0.921f, 2.595f, 2.24f, 2.975f)
                lineToRelative(4.879f, 1.43f)
                horizontalLineToRelative(11.881f)
                close()
                moveTo(18.323f, 16.0f)
                curveToRelative(0.422f, 0.532f, 0.677f, 1.194f, 0.677f, 1.904f)
                curveToRelative(0.0f, 1.707f, -1.389f, 3.096f, -3.095f, 3.096f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-1.707f, 0.0f, -3.095f, -1.389f, -3.095f, -3.096f)
                verticalLineToRelative(-0.904f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.904f)
                curveToRelative(0.0f, 3.361f, 2.734f, 6.096f, 6.095f, 6.096f)
                horizontalLineToRelative(7.81f)
                curveToRelative(3.361f, 0.0f, 6.095f, -2.734f, 6.095f, -6.096f)
                curveToRelative(0.0f, -0.661f, -0.121f, -1.299f, -0.324f, -1.904f)
                horizontalLineToRelative(-3.352f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
