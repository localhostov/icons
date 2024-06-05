package me.localx.icons.straight.filled

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

public val Icons.Filled.ScrollDocumentStory: ImageVector
    get() {
        if (_scrollDocumentStory != null) {
            return _scrollDocumentStory!!
        }
        _scrollDocumentStory = Builder(name = "ScrollDocumentStory", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 1.5f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(20.0f, 10.693f)
                curveToRelative(-1.416f, 1.06f, -2.991f, 1.849f, -4.707f, 2.317f)
                lineToRelative(-1.425f, 0.389f)
                curveToRelative(-0.092f, 0.314f, -0.183f, 0.654f, -0.275f, 1.033f)
                lineToRelative(-0.14f, 0.568f)
                horizontalLineToRelative(-6.154f)
                lineToRelative(0.339f, -1.489f)
                curveToRelative(0.284f, -1.247f, 0.594f, -2.297f, 0.969f, -3.282f)
                curveToRelative(0.272f, -1.939f, 1.273f, -6.183f, 4.902f, -9.113f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.532f, -0.43f, 1.077f, -0.794f, 1.625f, -1.115f)
                lineTo(4.662f, 0.001f)
                curveToRelative(0.217f, 0.455f, 0.338f, 0.964f, 0.338f, 1.5f)
                verticalLineToRelative(19.857f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.499f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.307f)
                close()
                moveTo(12.0f, 21.5f)
                curveToRelative(0.0f, 0.924f, -0.28f, 1.784f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(10.559f, 10.728f)
                curveToRelative(-0.303f, 0.769f, -0.526f, 1.526f, -0.723f, 2.272f)
                horizontalLineToRelative(2.072f)
                curveToRelative(0.144f, -0.505f, 0.301f, -1.01f, 0.499f, -1.514f)
                curveToRelative(1.124f, -3.018f, 3.967f, -6.643f, 7.588f, -8.647f)
                curveToRelative(-2.139f, 2.351f, -4.615f, 6.115f, -5.228f, 8.241f)
                curveToRelative(1.364f, -0.372f, 2.906f, -1.044f, 4.4f, -2.251f)
                curveTo(23.304f, 5.488f, 24.0f, 0.07f, 24.0f, 0.07f)
                curveToRelative(0.0f, 0.0f, -5.096f, -0.74f, -9.233f, 2.601f)
                curveToRelative(-3.223f, 2.603f, -4.015f, 6.469f, -4.208f, 8.057f)
                close()
            }
        }
        .build()
        return _scrollDocumentStory!!
    }

private var _scrollDocumentStory: ImageVector? = null
