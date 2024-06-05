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

public val Icons.Outline.SealQuestion: ImageVector
    get() {
        if (_sealQuestion != null) {
            return _sealQuestion!!
        }
        _sealQuestion = Builder(name = "SealQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.021f, 12.0f)
                lineToRelative(-3.521f, 3.521f)
                verticalLineToRelative(4.979f)
                horizontalLineToRelative(-4.979f)
                lineToRelative(-3.521f, 3.521f)
                lineToRelative(-3.521f, -3.521f)
                lineTo(3.5f, 20.5f)
                verticalLineToRelative(-4.979f)
                lineTo(-0.021f, 12.0f)
                lineToRelative(3.521f, -3.521f)
                lineTo(3.5f, 3.5f)
                horizontalLineToRelative(4.979f)
                lineTo(12.0f, -0.021f)
                lineToRelative(3.521f, 3.521f)
                horizontalLineToRelative(4.979f)
                verticalLineToRelative(4.979f)
                lineToRelative(3.521f, 3.521f)
                close()
                moveTo(21.193f, 12.0f)
                lineToRelative(-2.692f, -2.692f)
                verticalLineToRelative(-3.808f)
                horizontalLineToRelative(-3.808f)
                lineToRelative(-2.692f, -2.692f)
                lineToRelative(-2.692f, 2.692f)
                horizontalLineToRelative(-3.808f)
                verticalLineToRelative(3.808f)
                lineToRelative(-2.692f, 2.692f)
                lineToRelative(2.692f, 2.692f)
                verticalLineToRelative(3.808f)
                horizontalLineToRelative(3.808f)
                lineToRelative(2.692f, 2.692f)
                lineToRelative(2.692f, -2.692f)
                horizontalLineToRelative(3.808f)
                verticalLineToRelative(-3.808f)
                lineToRelative(2.692f, -2.692f)
                close()
                moveTo(12.536f, 7.048f)
                curveToRelative(-0.885f, -0.161f, -1.783f, 0.081f, -2.463f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.297f, 0.13f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.23f, -0.194f, 0.526f, -0.272f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.725f, 0.401f, 0.793f, 0.793f)
                curveToRelative(0.093f, 0.531f, -0.212f, 0.907f, -0.502f, 1.066f)
                curveToRelative(-0.845f, 0.465f, -1.481f, 1.595f, -1.481f, 2.628f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.0f, -0.312f, 0.26f, -0.773f, 0.447f, -0.876f)
                curveToRelative(1.124f, -0.621f, 1.729f, -1.892f, 1.506f, -3.164f)
                curveToRelative(-0.213f, -1.212f, -1.208f, -2.206f, -2.417f, -2.417f)
                close()
            }
        }
        .build()
        return _sealQuestion!!
    }

private var _sealQuestion: ImageVector? = null
