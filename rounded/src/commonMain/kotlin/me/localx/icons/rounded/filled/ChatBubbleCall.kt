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

public val Icons.Filled.ChatBubbleCall: ImageVector
    get() {
        if (_chatBubbleCall != null) {
            return _chatBubbleCall!!
        }
        _chatBubbleCall = Builder(name = "ChatBubbleCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.647f)
                lineToRelative(-2.127f, 1.71f)
                curveToRelative(-0.274f, 0.192f, -0.571f, 0.286f, -0.86f, 0.286f)
                curveToRelative(-0.215f, 0.0f, -0.426f, -0.052f, -0.621f, -0.153f)
                curveToRelative(-0.457f, -0.238f, -0.741f, -0.706f, -0.743f, -1.221f)
                lineTo(14.002f, 3.002f)
                curveTo(14.0f, 1.348f, 15.346f, 0.002f, 17.0f, 0.001f)
                horizontalLineToRelative(3.999f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.802f, 0.0f, 1.555f, 0.312f, 2.121f, 0.878f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.122f)
                close()
                moveTo(20.655f, 14.856f)
                curveToRelative(-1.193f, -1.142f, -3.09f, -1.138f, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.637f, -6.932f, -6.945f)
                lineToRelative(1.6f, -1.897f)
                curveToRelative(0.557f, -0.579f, 0.863f, -1.339f, 0.863f, -2.145f)
                reflectiveCurveToRelative(-0.304f, -1.559f, -0.857f, -2.138f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.207f, -1.207f, -3.17f, -1.206f, -4.327f, -0.047f)
                lineToRelative(-1.15f, 1.004f)
                curveTo(0.633f, 3.012f, 0.0f, 4.565f, 0.0f, 6.238f)
                curveToRelative(0.0f, 7.636f, 10.126f, 17.762f, 17.762f, 17.762f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.634f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.171f, 0.0f, -4.378f)
                curveToRelative(-0.031f, -0.03f, -2.439f, -1.883f, -2.439f, -1.883f)
                close()
            }
        }
        .build()
        return _chatBubbleCall!!
    }

private var _chatBubbleCall: ImageVector? = null
