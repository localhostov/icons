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

public val Icons.Outline.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(3.41f, 20.0f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-4.35f)
                curveToRelative(0.0f, -1.71f, 0.73f, -3.34f, 2.01f, -4.48f)
                lineTo(14.17f, 1.1f)
                curveToRelative(1.77f, -1.54f, 4.46f, -1.44f, 6.12f, 0.22f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(1.66f, 1.66f, 1.76f, 4.36f, 0.22f, 6.13f)
                lineToRelative(-8.65f, 10.14f)
                curveToRelative(-1.15f, 1.29f, -2.78f, 2.02f, -4.49f, 2.02f)
                lineTo(3.41f, 20.0f)
                close()
                moveTo(7.76f, 18.0f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.03f, 0.75f, -0.08f)
                lineToRelative(-4.43f, -4.43f)
                curveToRelative(-0.05f, 0.24f, -0.08f, 0.49f, -0.08f, 0.75f)
                verticalLineToRelative(3.76f)
                horizontalLineToRelative(3.76f)
                close()
                moveTo(5.32f, 11.27f)
                curveToRelative(-0.11f, 0.1f, -0.2f, 0.22f, -0.3f, 0.33f)
                lineToRelative(5.38f, 5.38f)
                curveToRelative(0.12f, -0.1f, 0.24f, -0.2f, 0.35f, -0.32f)
                lineTo(19.38f, 6.53f)
                curveToRelative(0.86f, -0.99f, 0.81f, -2.49f, -0.11f, -3.41f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.92f, -0.92f, -2.42f, -0.98f, -3.41f, -0.12f)
                lineTo(5.32f, 11.27f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
