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

public val Icons.Bold.SpeechBubbleStory: ImageVector
    get() {
        if (_speechBubbleStory != null) {
            return _speechBubbleStory!!
        }
        _speechBubbleStory = Builder(name = "SpeechBubbleStory", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 4.998f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.501f)
                curveTo(19.0f, 1.566f, 17.43f, -0.004f, 15.5f, -0.004f)
                lineToRelative(-12.0f, 0.004f)
                curveToRelative(-0.933f, 0.0f, -1.812f, 0.365f, -2.474f, 1.028f)
                reflectiveCurveTo(0.0f, 2.569f, 0.0f, 3.502f)
                lineToRelative(0.005f, 13.622f)
                curveToRelative(0.0f, 1.032f, 0.838f, 1.872f, 1.868f, 1.872f)
                curveToRelative(0.184f, 0.0f, 0.366f, -0.027f, 0.542f, -0.081f)
                lineToRelative(2.585f, -1.079f)
                verticalLineToRelative(4.162f)
                horizontalLineToRelative(12.0f)
                lineToRelative(4.443f, 1.864f)
                lineToRelative(0.16f, 0.057f)
                curveToRelative(0.171f, 0.05f, 0.347f, 0.075f, 0.523f, 0.075f)
                curveToRelative(1.03f, 0.0f, 1.868f, -0.839f, 1.868f, -1.871f)
                lineToRelative(0.005f, -13.625f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 3.501f)
                curveToRelative(0.0f, -0.271f, 0.229f, -0.501f, 0.5f, -0.501f)
                lineToRelative(12.0f, -0.004f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(10.504f)
                lineTo(6.396f, 14.0f)
                lineToRelative(-3.392f, 1.422f)
                lineToRelative(-0.005f, -11.921f)
                close()
                moveTo(20.995f, 20.42f)
                lineToRelative(-3.392f, -1.423f)
                horizontalLineToRelative(-9.604f)
                verticalLineToRelative(-1.998f)
                horizontalLineToRelative(11.0f)
                lineTo(18.999f, 7.998f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.499f)
                lineToRelative(-0.005f, 11.924f)
                close()
                moveTo(9.0f, 12.178f)
                lineToRelative(-4.0f, -1.147f)
                verticalLineToRelative(-4.491f)
                curveToRelative(0.0f, -1.087f, 0.762f, -1.768f, 1.808f, -1.469f)
                lineToRelative(1.005f, 0.251f)
                curveToRelative(0.702f, 0.201f, 1.187f, 0.843f, 1.187f, 1.573f)
                verticalLineToRelative(5.283f)
                close()
                moveTo(14.0f, 11.031f)
                lineToRelative(-4.0f, 1.147f)
                verticalLineToRelative(-5.283f)
                curveToRelative(0.0f, -0.731f, 0.485f, -1.373f, 1.187f, -1.573f)
                lineToRelative(1.005f, -0.251f)
                curveToRelative(1.045f, -0.299f, 1.808f, 0.382f, 1.808f, 1.469f)
                verticalLineToRelative(4.491f)
                close()
            }
        }
        .build()
        return _speechBubbleStory!!
    }

private var _speechBubbleStory: ImageVector? = null
