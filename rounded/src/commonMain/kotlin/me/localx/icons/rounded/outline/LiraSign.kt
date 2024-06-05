package me.localx.icons.rounded.outline

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

public val Icons.Outline.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-6.613f)
                lineToRelative(7.316f, -2.439f)
                curveToRelative(0.524f, -0.174f, 0.807f, -0.74f, 0.632f, -1.265f)
                curveToRelative(-0.175f, -0.523f, -0.74f, -0.81f, -1.265f, -0.632f)
                lineToRelative(-6.684f, 2.228f)
                verticalLineToRelative(-1.893f)
                lineToRelative(7.316f, -2.439f)
                curveToRelative(0.524f, -0.174f, 0.807f, -0.74f, 0.632f, -1.265f)
                curveToRelative(-0.175f, -0.523f, -0.74f, -0.809f, -1.265f, -0.632f)
                lineToRelative(-6.684f, 2.228f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineTo(7.946f)
                lineToRelative(-3.316f, 1.105f)
                curveToRelative(-0.524f, 0.174f, -0.807f, 0.74f, -0.632f, 1.265f)
                curveToRelative(0.14f, 0.419f, 0.53f, 0.684f, 0.949f, 0.684f)
                curveToRelative(0.104f, 0.0f, 0.211f, -0.017f, 0.316f, -0.052f)
                lineToRelative(2.684f, -0.895f)
                verticalLineToRelative(1.893f)
                lineToRelative(-3.316f, 1.105f)
                curveToRelative(-0.524f, 0.174f, -0.807f, 0.74f, -0.632f, 1.265f)
                curveToRelative(0.14f, 0.419f, 0.53f, 0.684f, 0.949f, 0.684f)
                curveToRelative(0.104f, 0.0f, 0.211f, -0.017f, 0.316f, -0.052f)
                lineToRelative(2.684f, -0.895f)
                verticalLineToRelative(5.946f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
