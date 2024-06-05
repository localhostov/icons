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

public val Icons.Filled.CloudQuestion: ImageVector
    get() {
        if (_cloudQuestion != null) {
            return _cloudQuestion!!
        }
        _cloudQuestion = Builder(name = "CloudQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.797f, 7.203f)
                curveToRelative(-0.824f, -3.584f, -4.054f, -6.203f, -7.797f, -6.203f)
                curveTo(5.589f, 1.0f, 2.0f, 4.589f, 2.0f, 9.0f)
                curveToRelative(0.0f, 1.29f, 0.303f, 2.535f, 0.884f, 3.66f)
                curveToRelative(-1.746f, 0.943f, -2.884f, 2.786f, -2.884f, 4.84f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -3.743f, -2.62f, -6.973f, -6.203f, -7.797f)
                close()
                moveTo(12.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.679f, 14.631f)
                curveToRelative(-0.406f, 0.188f, -0.679f, 0.672f, -0.679f, 1.203f)
                verticalLineToRelative(0.166f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.166f)
                curveToRelative(0.0f, -1.316f, 0.722f, -2.501f, 1.839f, -3.018f)
                curveToRelative(0.731f, -0.339f, 1.385f, -1.224f, 1.09f, -2.365f)
                curveToRelative(-0.169f, -0.656f, -0.724f, -1.21f, -1.379f, -1.379f)
                curveToRelative(-0.643f, -0.169f, -1.271f, -0.044f, -1.772f, 0.345f)
                curveToRelative(-0.494f, 0.383f, -0.777f, 0.96f, -0.777f, 1.583f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.247f, 0.566f, -2.4f, 1.553f, -3.164f)
                curveToRelative(0.988f, -0.765f, 2.264f, -1.021f, 3.498f, -0.7f)
                curveToRelative(1.358f, 0.351f, 2.464f, 1.456f, 2.815f, 2.815f)
                curveToRelative(0.49f, 1.898f, -0.429f, 3.867f, -2.187f, 4.68f)
                close()
            }
        }
        .build()
        return _cloudQuestion!!
    }

private var _cloudQuestion: ImageVector? = null
