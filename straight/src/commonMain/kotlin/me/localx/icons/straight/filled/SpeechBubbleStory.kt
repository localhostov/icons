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

public val Icons.Filled.SpeechBubbleStory: ImageVector
    get() {
        if (_speechBubbleStory != null) {
            return _speechBubbleStory!!
        }
        _speechBubbleStory = Builder(name = "SpeechBubbleStory", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                verticalLineToRelative(15.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.697f)
                lineToRelative(3.963f, 2.642f)
                curveToRelative(0.36f, 0.24f, 0.775f, 0.361f, 1.192f, 0.361f)
                curveToRelative(0.347f, 0.0f, 0.695f, -0.084f, 1.013f, -0.254f)
                curveToRelative(0.7f, -0.375f, 1.135f, -1.1f, 1.135f, -1.894f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(13.772f, 5.116f)
                curveToRelative(0.085f, 0.064f, 0.228f, 0.208f, 0.228f, 0.456f)
                verticalLineToRelative(5.102f)
                lineToRelative(-3.5f, 1.0f)
                verticalLineToRelative(-5.428f)
                curveToRelative(0.0f, -0.254f, 0.17f, -0.48f, 0.414f, -0.55f)
                lineToRelative(2.358f, -0.673f)
                curveToRelative(0.058f, -0.017f, 0.111f, -0.023f, 0.161f, -0.023f)
                curveToRelative(0.157f, 0.0f, 0.275f, 0.067f, 0.339f, 0.116f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(14.855f)
                curveToRelative(0.0f, 0.794f, 0.435f, 1.52f, 1.135f, 1.894f)
                curveToRelative(0.318f, 0.17f, 0.666f, 0.254f, 1.013f, 0.254f)
                curveToRelative(0.417f, 0.0f, 0.832f, -0.121f, 1.191f, -0.361f)
                lineToRelative(3.963f, -2.642f)
                horizontalLineToRelative(11.697f)
                lineTo(18.999f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 12.183f)
                lineToRelative(-6.5f, 1.857f)
                lineToRelative(-6.5f, -1.857f)
                verticalLineToRelative(-6.611f)
                curveToRelative(0.0f, -0.814f, 0.373f, -1.563f, 1.023f, -2.053f)
                curveToRelative(0.65f, -0.49f, 1.472f, -0.644f, 2.254f, -0.419f)
                lineToRelative(2.357f, 0.673f)
                curveToRelative(0.32f, 0.091f, 0.612f, 0.243f, 0.865f, 0.439f)
                curveToRelative(0.253f, -0.197f, 0.545f, -0.348f, 0.865f, -0.439f)
                lineToRelative(2.358f, -0.673f)
                curveToRelative(0.781f, -0.225f, 1.604f, -0.071f, 2.254f, 0.419f)
                curveToRelative(0.65f, 0.49f, 1.023f, 1.239f, 1.023f, 2.053f)
                verticalLineToRelative(6.611f)
                close()
                moveTo(8.5f, 6.246f)
                verticalLineToRelative(5.428f)
                lineToRelative(-3.5f, -1.0f)
                verticalLineToRelative(-5.102f)
                curveToRelative(0.0f, -0.248f, 0.143f, -0.392f, 0.228f, -0.456f)
                curveToRelative(0.085f, -0.064f, 0.263f, -0.16f, 0.501f, -0.093f)
                lineToRelative(2.357f, 0.673f)
                curveToRelative(0.244f, 0.07f, 0.415f, 0.296f, 0.415f, 0.55f)
                close()
            }
        }
        .build()
        return _speechBubbleStory!!
    }

private var _speechBubbleStory: ImageVector? = null
